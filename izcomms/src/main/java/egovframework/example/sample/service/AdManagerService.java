package egovframework.example.sample.service;

import java.util.List;

public interface AdManagerService {
	
	/**
	 * 광고관리 리스트
	 * @param scdulVO
	 * @return
	 * @throws Exception
	 */
	List<AdManagerVO> selectAdManagerList(AdManagerVO adManagerVO) throws Exception;
	
	
	/**
	 * 광고 총 갯수
	 * @param scdulVO
	 * @return
	 * @throws Exception
	 */
	int selectAdManagerListCount(AdManagerVO adManagerVO) throws Exception;
	
	
	/**
	 * 광고 상세보기
	 * @param adManagerVO
	 * @return
	 * @throws Exception
	 */
	AdManagerVO selectAdManagerView(AdManagerVO adManagerVO) throws Exception;
	
	/**
	 * 해당 광고의 배정 처리
	 * @param adManagerVO
	 * @throws Exception
	 */
	void updateAdManagerAllot(AdManagerVO adManagerVO) throws Exception;
	
	/**
	 * 해당 광고를 삭제한다.
	 * @param adManagerVO
	 * @throws Exception
	 */
	void deleteAdManager(AdManagerVO adManagerVO) throws Exception;
	
	/**
	 * 해당 광고를 등록한다.
	 * MD가 전화로 온 광고문의를 등록.
	 * @param adManagerVO
	 * @throws Exception
	 */
	void insertAdManager(AdManagerVO adManagerVO) throws Exception;
}
