package egovframework.example.cmmn.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.view.RedirectView;

import egovframework.example.sample.service.LoginVO;
import egovframework.example.sample.util.LoginUtil;

public class AuthenticInterceptor extends HandlerInterceptorAdapter {
	
	/**
	 * 세션에 계정정보(LoginVO)가 있는지 여부로 인증 여부를 체크한다.
	 * 계정정보(LoginVO)가 없다면, 로그인 페이지로 이동한다.
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		boolean isPermittedURL = false;

		LoginVO loginVO = (LoginVO) LoginUtil.getLoginVO(request.getSession());

		if(loginVO != null){
			return true;
		} else if(!isPermittedURL){
				ModelAndView modelAndView = new ModelAndView("redirect:/loginUsr.do");
				throw new ModelAndViewDefiningException(modelAndView);
			}else{
				return true;
			}
	}

}
