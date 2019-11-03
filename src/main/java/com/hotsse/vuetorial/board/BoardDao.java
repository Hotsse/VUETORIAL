package com.hotsse.vuetorial.board;

import org.springframework.stereotype.Repository;

import com.hotsse.vuetorial.common.manage.SqlSessionManager;

@Repository
public class BoardDao extends SqlSessionManager {
	
	public int test() {
		return this.vueSqlSession.selectOne("board.test");
	}
	
}
