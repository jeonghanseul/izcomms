package egovframework.example.sample.service.impl;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.LoginVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("loginDAO")
public class LoginDAO extends EgovAbstractDAO {
	
	public LoginVO actionLogin(LoginVO vo) throws Exception {
    	return (LoginVO)select("loginDAO.actionLogin", vo);
    }
	
	public LoginVO loginCheckId(LoginVO vo) throws Exception {
		return (LoginVO)select("loginDAO.loginCheckId", vo);
	}
}
