package com.hotsse.vuetorial.common.manage;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SqlSessionManager {
	
	@Autowired
	@Qualifier("vueSqlSessionTemplate")
	protected SqlSession vueSqlSession;

}
