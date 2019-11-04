package com.hotsse.vuetorial.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hotsse.vuetorial.board.vo.BoardVO;
import com.hotsse.vuetorial.common.manage.SqlSessionManager;

@Repository
public class BoardDao extends SqlSessionManager {
	
	public List<BoardVO> getList(){
		return this.vueSqlSession.selectList("board.getList") ;
	}
	
	public BoardVO getContent(int boardIdx) {		
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("boardIdx", boardIdx);		
		return this.vueSqlSession.selectOne("board.getContent", param);
	}
	
}
