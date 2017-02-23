package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.MemberService;
import egovframework.example.sample.service.MemberVO;
import egovframework.example.sample.util.LoginUtil;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("memberService")
public class MemberServiceImpl extends EgovAbstractServiceImpl implements MemberService {
	
	@Resource(name = "memberDAO")
	private MemberDAO memberDAO;
	
	
	public List<MemberVO> selectMemberList(MemberVO memberVO) throws Exception{
		
		
		List<MemberVO> selectMemberList = memberDAO.selectMemberList(memberVO);
		return selectMemberList;
	}
	
	public List<MemberVO> selectMemberListByWhere(HttpServletRequest request, MemberVO memberVO) throws Exception{
		boolean isAdmin = LoginUtil.isAdmin(request.getSession());
		boolean isTeam = LoginUtil.isTeam(request.getSession());
		
		//팀장 일때에는 자기 팀원만,
		if(isTeam){
			memberVO.setMemberGroup(LoginUtil.getLoginVO(request.getSession()).getMemberGroup());
		}else if(isAdmin){
			//관리자 일때에는 모두다.
		}
		
		List<MemberVO> selectMemberList = memberDAO.selectMemberListByWhere(memberVO);
		return selectMemberList;
	}
	
	public int selectMemberListCount(MemberVO memberVO) throws Exception{
		
		return memberDAO.selectMemberListCount(memberVO);
	}
	
	public int checkId(MemberVO memberVO) throws Exception{
		
		return memberDAO.checkId(memberVO);
	}
	
	public void insertMember(MemberVO memberVO) throws Exception{
		
		memberDAO.insertMember(memberVO);
	}
	
	public MemberVO selectMemberById(MemberVO memberVO)throws Exception{
		
		return memberDAO.selectMemberById(memberVO);
	}
	
	public void updateMember(MemberVO memberVO) throws Exception{
		
		memberDAO.updateMember(memberVO);
	}
}
