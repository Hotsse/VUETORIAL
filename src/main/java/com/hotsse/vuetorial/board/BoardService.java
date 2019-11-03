package com.hotsse.vuetorial.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	@Autowired
	private BoardDao boardDao;
	
	public int test() {
		return boardDao.test();
	}

}
