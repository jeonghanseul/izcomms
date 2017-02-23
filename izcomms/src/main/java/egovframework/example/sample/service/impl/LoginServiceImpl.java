package egovframework.example.sample.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.LoginService;
import egovframework.example.sample.service.LoginVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("loginService")
public class LoginServiceImpl extends EgovAbstractServiceImpl implements LoginService {
	
	@Resource(name = "loginDAO")
	private LoginDAO loginDAO;
	
	public LoginVO actionLogin(LoginVO vo) throws Exception {
    	LoginVO loginVO = loginDAO.actionLogin(vo);

    	// 3. 결과를 리턴한다.
    	if (loginVO != null && !loginVO.getId().equals("") && !loginVO.getPwd().equals("")) {
    		return loginVO;
    	} else {
    		loginVO = new LoginVO();
    	}

    	return loginVO;
	}
	 
	public LoginVO loginCheckId(LoginVO vo) throws Exception {
		
		LoginVO loginVO = loginDAO.loginCheckId(vo);
		
		// 3. 결과를 리턴한다.
		if (loginVO != null && !loginVO.getId().equals("") && !loginVO.getPwd().equals("")) {
			return loginVO;
		} else {
			loginVO = new LoginVO();
		}
		
		return loginVO;
	}
}
