package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.MemberVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("memberDAO")
public class MemberDAO extends EgovAbstractDAO {
	
	@SuppressWarnings("unchecked")
	public List<MemberVO> selectMemberList(MemberVO memberVO) throws Exception {
		return (List<MemberVO>) list("memberDAO.selectMemberList", memberVO);
	}
	
	@SuppressWarnings("unchecked")
	public List<MemberVO> selectMemberListByWhere(MemberVO memberVO) throws Exception {
		return (List<MemberVO>) list("memberDAO.selectMemberListByWhere", memberVO);
	}
	
	public int selectMemberListCount(MemberVO memberVO) throws Exception {
		return (Integer)select("memberDAO.selectMemberListCount", memberVO);
	}
	
	public int checkId(MemberVO memberVO) throws Exception {
		return (Integer)select("memberDAO.checkId", memberVO);
	}
	
	public String insertMember(MemberVO memberVO) throws Exception {
		return (String)insert("memberDAO.insertMember", memberVO);
	}
	
	public MemberVO selectMemberById(MemberVO memberVO) throws Exception {
		return (MemberVO)select("memberDAO.selectMemberById", memberVO);
	}
	
	public int updateMember(MemberVO memberVO) throws Exception {
		return update("memberDAO.updateMember", memberVO);
	}
}
