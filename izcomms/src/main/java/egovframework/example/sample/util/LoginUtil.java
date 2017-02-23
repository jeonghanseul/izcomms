package egovframework.example.sample.util;

import javax.servlet.http.HttpSession;

import egovframework.example.sample.service.LoginVO;

public class LoginUtil {
	
	public static LoginVO getLoginVO(HttpSession session)throws Exception{
	    LoginVO loginVO = (LoginVO)SessionUtil.getSessionValue(session, "loginVO");
	    return loginVO;
	  }
	  
	public static Boolean isAdminTeam(HttpSession session){
		boolean result = false;
		LoginVO loginVO = (LoginVO)SessionUtil.getSessionValue(session, "loginVO");
		
		int grade = Integer.parseInt(loginVO.getGrade()); 
		//사원일 경우 flase;
		if(1 == grade){
			result = false;
		}
		else if(3 <= grade){
			result = true;
		}
		return result;
	}
	
	public static Boolean isAdmin(HttpSession session){
		boolean result = false;
		LoginVO loginVO = (LoginVO)SessionUtil.getSessionValue(session, "loginVO");
		
		int grade = Integer.parseInt(loginVO.getGrade()); 
		if(999 == grade){
			result = true;
		}
		return result;
	}
	
	public static Boolean isTeam(HttpSession session){
		boolean result = false;
		LoginVO loginVO = (LoginVO)SessionUtil.getSessionValue(session, "loginVO");
		
		int grade = Integer.parseInt(loginVO.getGrade()); 
		if(3 == grade){
			result = true;
		}
		return result;
	}
}
