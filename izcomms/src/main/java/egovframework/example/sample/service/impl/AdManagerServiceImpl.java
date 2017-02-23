package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.AdManagerService;
import egovframework.example.sample.service.AdManagerVO;
import egovframework.example.sample.service.ScdulVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("adManagerService")
public class AdManagerServiceImpl extends EgovAbstractServiceImpl implements AdManagerService {
	
	@Resource(name = "adManagerDAO")
	private AdManagerDAO adManagerDAO;
	
	
	public List<AdManagerVO> selectAdManagerList(AdManagerVO adManagerVO) throws Exception{
		
		List<AdManagerVO> selectAdManagerList = adManagerDAO.selectAdManagerList(adManagerVO);
		return selectAdManagerList;
	}
	
	public int selectAdManagerListCount(AdManagerVO adManagerVO) throws Exception{
		
		return adManagerDAO.selectAdManagerListCount(adManagerVO);
	}
	
	public AdManagerVO selectAdManagerView(AdManagerVO adManagerVO) throws Exception{
		
		if(null == adManagerVO.getNo()){
			throw new Exception("fail");
		}
		
		return adManagerDAO.selectAdManagerView(adManagerVO);
	}
	
	public void updateAdManagerAllot(AdManagerVO adManagerVO) throws Exception {
		
		adManagerDAO.updateAdManagerAllot(adManagerVO);
	}
	
	public void deleteAdManager(AdManagerVO adManagerVO) throws Exception {
		
		if(null == adManagerVO.getNo()){
			throw new Exception("fail");
		}
		
		adManagerDAO.deleteAdManager(adManagerVO);
	}
	
	public void insertAdManager(AdManagerVO adManagerVO) throws Exception{
		
		adManagerDAO.insertAdManager(adManagerVO);
	}
}
