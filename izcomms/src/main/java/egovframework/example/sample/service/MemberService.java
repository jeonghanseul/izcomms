package egovframework.example.sample.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public interface MemberService {
	
	
	/**
	 * 회원관리 리스트
	 * @param scdulVO
	 * @return
	 * @throws Exception
	 */
	List<MemberVO> selectMemberList(MemberVO memberVO) throws Exception;
	
	
	/**
	 * 페이징X, 검색 조회가 되는 쿼리
	 * @param memberVO
	 * @return
	 * @throws Exception
	 */
	List<MemberVO> selectMemberListByWhere(HttpServletRequest request, MemberVO memberVO) throws Exception;
	
	/**
	 * 아이디 체크
	 * @param scdulVO
	 * @return
	 * @throws Exception
	 */
	int checkId(MemberVO memberVO) throws Exception;
	
	/**
	 * 회원 총 갯수
	 * @param scdulVO
	 * @return
	 * @throws Exception
	 */
	int selectMemberListCount(MemberVO memberVO) throws Exception;
	
	/**
	 * 회원 등록
	 * @param memberVO
	 * @throws Exception
	 */
	void insertMember(MemberVO memberVO) throws Exception;
	
	/**
	 * 회원 아이디를 갖고 회원 정보 검색
	 * @param memberVO
	 * @return
	 * @throws Exception
	 */
	MemberVO selectMemberById(MemberVO memberVO)throws Exception;
	
	/**
	 * 회원 정보 수정
	 * @param memberVO
	 * @throws Exception
	 */
	void updateMember(MemberVO memberVO) throws Exception;

}
