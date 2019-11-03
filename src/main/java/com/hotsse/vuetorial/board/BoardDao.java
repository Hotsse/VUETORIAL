package com.hotsse.vuetorial.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hotsse.vuetorial.board.vo.BoardVO;
import com.hotsse.vuetorial.common.manage.SqlSessionManager;

@Repository
public class BoardDao extends SqlSessionManager {
	
	public int test() {
		return this.vueSqlSession.selectOne("board.test");
	}
	
	public List<BoardVO> getList(){
		
		List<BoardVO> tmpList = new ArrayList<BoardVO>();
		
		BoardVO tmpData =  null;
		
		tmpData = new BoardVO();
		tmpData.setBoardIdx(1);
		tmpData.setTitle("첫글입니다첫글입니다");
		tmpData.setUserIdx(1);
		tmpData.setViewCnt(3);		
		tmpList.add(tmpData);
		
		tmpData = new BoardVO();
		tmpData.setBoardIdx(2);
		tmpData.setTitle("두번째글입니다두번째글입니다두번째글입니다두번째글입니다");
		tmpData.setUserIdx(1);
		tmpData.setViewCnt(2);		
		tmpList.add(tmpData);
		
		tmpData = new BoardVO();
		tmpData.setBoardIdx(3);
		tmpData.setTitle("333333333333333");
		tmpData.setUserIdx(1);
		tmpData.setViewCnt(10);		
		tmpList.add(tmpData);		
		
		return tmpList;
	}
	
}
