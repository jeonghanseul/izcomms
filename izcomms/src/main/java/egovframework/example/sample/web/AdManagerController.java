package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import egovframework.example.sample.service.AdManagerService;
import egovframework.example.sample.service.AdManagerVO;
import egovframework.example.sample.util.LoginUtil;
import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

@Controller
public class AdManagerController {
	
	/** EgovPropertyService */
	@Resource(name = "propertiesService")
	protected EgovPropertyService propertiesService;
	
	/** EgovSampleService */
	@Resource(name = "adManagerService")
	private AdManagerService adManagerService;
	
	
	@RequestMapping("/admin/adManagerList.do")
	public String adManagerList(@ModelAttribute("adManagerVO") AdManagerVO adManagerVO, HttpServletRequest request, ModelMap model)throws Exception{
		System.out.println("==============================================");
		System.out.println("\t ddddd");
		System.out.println("==============================================");
		boolean isAdmin = LoginUtil.isAdminTeam(request.getSession());
		
		if(isAdmin){

			/** EgovPropertyService.sample */
			adManagerVO.setPageUnit(propertiesService.getInt("pageUnit"));
			adManagerVO.setPageSize(propertiesService.getInt("pageSize"));

			/** pageing setting */
			PaginationInfo paginationInfo = new PaginationInfo();
			paginationInfo.setCurrentPageNo(adManagerVO.getPageIndex());
			paginationInfo.setRecordCountPerPage(adManagerVO.getPageUnit());
			paginationInfo.setPageSize(adManagerVO.getPageSize());

			adManagerVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
			adManagerVO.setLastIndex(paginationInfo.getLastRecordIndex());
			adManagerVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());

			
			List<AdManagerVO> selectAdManagerList = adManagerService.selectAdManagerList(adManagerVO);
			model.addAttribute("selectAdManagerList", selectAdManagerList);
			
			int total = adManagerService.selectAdManagerListCount(adManagerVO);
			
			paginationInfo.setTotalRecordCount(total);
			model.addAttribute("paginationInfo", paginationInfo);
			return "admin/adManagerList";
			
		}else{
			
			model.addAttribute("msg", "관리자 또는 팀장 만 접근이 가능합니다.");
			model.addAttribute("url", "../scdulList.do");
			
			return "common/error";
		}
		
	}
	
	@RequestMapping(value="/admin/adManagerView.do", method= RequestMethod.GET)
	public String adManagerView(@ModelAttribute("adManagerVO") AdManagerVO adManagerVO,HttpServletRequest request, ModelMap model)throws Exception{
		
		boolean isAdmin = LoginUtil.isAdminTeam(request.getSession());
				
		if(isAdmin){
			
			try{
				
				adManagerVO = adManagerService.selectAdManagerView(adManagerVO);
				
			}catch(Exception e){
				
				model.addAttribute("msg", "잘못된 접근 입니다.");
				model.addAttribute("url", "../adManagerList.do");
				
				return "common/error";
			}
			
			model.addAttribute("adManagerVO", adManagerVO);
			
			return "admin/adManagerView";
		}else{
			
			model.addAttribute("msg", "관리자 또는 팀장 만 접근이 가능합니다.");
			model.addAttribute("url", "../scdulList.do");
			
			return "common/error";
		}
	}
	
	@RequestMapping(value="/admin/deleteAdManager.do", method= RequestMethod.GET)
	public String deleteAdManager(@ModelAttribute("adManagerVO") AdManagerVO adManagerVO, ModelMap model)throws Exception{
		
		try{
			adManagerService.deleteAdManager(adManagerVO);
		}catch(Exception e){
			model.addAttribute("msg", "잘못된 접근 입니다.");
			model.addAttribute("url", "../adManagerList.do");
			
			return "common/error";
		}
		
		return "redirect:/admin/adManagerList.do";
	}
	
	@RequestMapping(value="/admin/insertAdManager.do", method= RequestMethod.GET)
	public String insertAdManager(@ModelAttribute("adManagerVO") AdManagerVO adManagerVO,HttpServletRequest request, ModelMap model)throws Exception{
		
		boolean isAdmin = LoginUtil.isAdminTeam(request.getSession());
		
		if(isAdmin){

			return "admin/adManagerAdd";
		}else{
			
			model.addAttribute("msg", "관리자 또는 팀장 만 접근이 가능합니다.");
			model.addAttribute("url", "../scdulList.do");
			
			return "common/error";
		}
	}
	
	@RequestMapping(value="/admin/insertAdManagerDo.do", method= RequestMethod.POST)
	public String insertAdManagerDo(@ModelAttribute("adManagerVO") AdManagerVO adManagerVO, ModelMap model)throws Exception{
		
		adManagerService.insertAdManager(adManagerVO);
		return "redirect:/admin/adManagerList.do";
	}
}
