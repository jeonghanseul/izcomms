package egovframework.example.sample.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.LoginService;
import egovframework.example.sample.service.LoginVO;

@Controller
public class LoginController {
	
	/** EgovLoginService */
	@Resource(name = "loginService")
	private LoginService loginService;
	
	@RequestMapping(value = "/loginUsr.do")
	public String loginUsr(@ModelAttribute("loginVO") LoginVO loginVO, ModelMap model) throws Exception {
		
		model.addAttribute("subMsg", "로그인이 필요합니다.");
		return "sample/loginUsr";
	}
	
	@RequestMapping(value = "/actionLoginUsr.do")
	public String actionLoginUsr(@ModelAttribute("loginVO") LoginVO loginVO, HttpServletRequest request, HttpServletResponse response, ModelMap model) throws Exception {
		
		//id check
		LoginVO resultVO1 = loginService.loginCheckId(loginVO);
		
		if(resultVO1 != null && resultVO1.getId() != null && !resultVO1.getId().equals("")){
			// 1. 일반 로그인 처리
			LoginVO resultVO = loginService.actionLogin(loginVO);
			
			if (resultVO != null && resultVO.getId() != null && !resultVO.getId().equals("")) {
				
				// 2-1. 로그인 정보를 세션에 저장
				request.getSession().setAttribute("loginVO", resultVO);
				request.getSession().setAttribute("name", resultVO.getName());
				return "redirect:/scdulList.do";
				
			} else {
				resultVO.setMessage("fail.PWD.inexact");
				model.addAttribute("message", resultVO.getMessage());
				return "redirect:/loginUsr.do";
			}
		}else{
			resultVO1.setMessage("fail.ID.not.exist");
			model.addAttribute("message", resultVO1.getMessage());
			return "redirect:/loginUsr.do";
		}
	}
	
	/**
	 * 로그아웃한다.
	 * @return String
	 * @exception Exception
	 */
	@RequestMapping(value = "/actionLogout.do")
	public String actionLogout(HttpServletRequest request, ModelMap model) throws Exception {

		/*String userIp = EgovClntInfo.getClntIP(request);

		// 1. Security 연동
		return "redirect:/j_spring_security_logout";*/

		request.getSession().setAttribute("loginVO", null);

		//return "redirect:/egovDevIndex.jsp";
		return "redirect:/loginUsr.do";
	}

}
