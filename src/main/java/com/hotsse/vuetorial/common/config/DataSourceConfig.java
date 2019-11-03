package com.hotsse.vuetorial.common.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
	
	/**
	 * DataSource 객체 생성
	 *
	 * @methodName	vueDataSource
	 * @author			hsyoon
	 * @return
	 */
	@Bean(name = "vueDataSource")
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource vueDataSource() {
		return DataSourceBuilder.create().build();
	}
	
	/**
	 * SqlSessionFactory 객체 생성
	 * 
	 * @methodName	vueSqlSessionFactory
	 * @author			hsyoon
	 * @param				dataSource
	 * @param				applicationContext
	 * @return
	 * @throws			Exception
	 */
	@Bean(name = "vueSqlSessionFactory")
	public SqlSessionFactory vueSqlSessionFactory(@Qualifier("vueDataSource") DataSource dataSource, ApplicationContext applicationContext) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:mybatis/mapper/vue/*.xml"));
		return sqlSessionFactoryBean.getObject();
	}
	
	/**
	 * SqlSessionTemplate 객체 생성
	 * @methodName	vueSqlSessionTemplate
	 * @author			hsyoon
	 * @param				sqlSessionFactory
	 * @return
	 * @throws			Exception
	 */
	@Bean(name = "vueSqlSessionTemplate")
	public SqlSessionTemplate vueSqlSessionTemplate(SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}
