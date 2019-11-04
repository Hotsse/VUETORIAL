package com.hotsse.vuetorial.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotsse.vuetorial.board.vo.BoardVO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDao boardDao;
	
	public List<BoardVO> getList(){
		return boardDao.getList();
	}
	
	public BoardVO getContent(int boardIdx) {
		return boardDao.getContent(boardIdx);
	}

}
