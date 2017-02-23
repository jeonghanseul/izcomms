package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.ScdulVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("scdulDAO")
public class ScdulDAO extends EgovAbstractDAO {
	
	@SuppressWarnings("unchecked")
	public List<ScdulVO> selectScdulList(ScdulVO scdulVO) throws Exception {
		return (List<ScdulVO>) list("scdulDAO.selectSculList", scdulVO);
	}
	
	//달력리스트(자기자신만
	@SuppressWarnings("unchecked")
	public List<ScdulVO> selectScdulListMine(ScdulVO scdulVO) throws Exception {
		return (List<ScdulVO>) list("scdulDAO.selectScdulListMine", scdulVO);
	}
	
	//달력리스트(자기자신만
	@SuppressWarnings("unchecked")
	public List<ScdulVO> selectScdulListTeam(ScdulVO scdulVO) throws Exception {
		return (List<ScdulVO>) list("scdulDAO.selectScdulListTeam", scdulVO);
	}
	
	@SuppressWarnings("unchecked")
	public List<ScdulVO> selectSearchScdulList(ScdulVO scdulVO) throws Exception {
		return (List<ScdulVO>) list("scdulDAO.selectSearchScdulList", scdulVO);
	}
	
	@SuppressWarnings("unchecked")
	public List<ScdulVO> selectDailyScdulList(ScdulVO scdulVO) throws Exception {
		return (List<ScdulVO>) list("scdulDAO.selectDailyScdulList", scdulVO);
	}
	
	@SuppressWarnings("unchecked")
	public List<ScdulVO> selectSculToDoList(ScdulVO scdulVO) throws Exception {
		return (List<ScdulVO>) list("scdulDAO.selectSculToDoList", scdulVO);
	}
	
	@SuppressWarnings("unchecked")
	public List<ScdulVO> selectSculToDoListMine(ScdulVO scdulVO) throws Exception {
		return (List<ScdulVO>) list("scdulDAO.selectSculToDoListMine", scdulVO);
	}
	
	@SuppressWarnings("unchecked")
	public List<ScdulVO> selectCountDayList(ScdulVO scdulVO) throws Exception {
		return (List<ScdulVO>) list("scdulDAO.selectCountDayList", scdulVO);
	}
	
	@SuppressWarnings("unchecked")
	public List<ScdulVO> selectCountDayListMine(ScdulVO scdulVO) throws Exception {
		return (List<ScdulVO>) list("scdulDAO.selectCountDayListMine", scdulVO);
	}
	
	@SuppressWarnings("unchecked")
	public List<ScdulVO> selectScdulDayList(ScdulVO scdulVO) throws Exception {
		return (List<ScdulVO>) list("scdulDAO.selectScdulDayList", scdulVO);
	}
	
	@SuppressWarnings("unchecked")
	public List<ScdulVO> selectScdulDayListMine(ScdulVO scdulVO) throws Exception {
		return (List<ScdulVO>) list("scdulDAO.selectScdulDayListMine", scdulVO);
	}
	
	@SuppressWarnings("unchecked")
	public List<ScdulVO> selectScdulDayListTeam(ScdulVO scdulVO) throws Exception {
		return (List<ScdulVO>) list("scdulDAO.selectScdulDayListTeam", scdulVO);
	}
	
	@SuppressWarnings("unchecked")
	public List<ScdulVO> selectScdulDayListByOwn(ScdulVO scdulVO) throws Exception {
		return (List<ScdulVO>) list("scdulDAO.selectScdulDayListByOwn", scdulVO);
	}
	
	public String insertScdul(ScdulVO scdulVO) throws Exception {
		return (String)insert("scdulDAO.insertScdul", scdulVO);
	}
	
	public int updateScdul(ScdulVO scdulVO) throws Exception {
		return update("scdulDAO.updateScdul", scdulVO);
	}
	
	public ScdulVO selectScdulView(ScdulVO scdulVO) throws Exception{
		return (ScdulVO) select("scdulDAO.selectScdulView", scdulVO);	
	}
	
	public int totalSelctSearchScdul(ScdulVO scdulVO) throws Exception {
		return (Integer)select("scdulDAO.totalSelctSearchScdul", scdulVO);
	}
	
	public int totalSelctDailyScdulCount(ScdulVO scdulVO) throws Exception {
		return (Integer)select("scdulDAO.totalSelctDailyScdulCount", scdulVO);
	}
}
