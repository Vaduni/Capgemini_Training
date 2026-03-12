package com.gal;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.gal.algo.Calc;
import com.gal.algo.MyCalc;
import com.mysql.cj.jdbc.MysqlDataSource;

@Configuration
public class MyBeansConfig {
@Scope("prototype")//every time create a new object
//@Scope("request") //every time a request create a new object
//@Scope("session")// 
//@Scope("application")
//will create beans and provide to spring context the onwards context will  manage
	@Bean
	StringBuilder getStringBuilder(){
		return new StringBuilder("bean from config");
	}
		@Bean
		@Primary
		Calc getCalc() {
			return new MyCalc();
		}
		@Bean(name ="calcNamesBean")
		Calc getCalc2() {
			return new MyCalc();
	    }
		@Bean 
		DataSource mysqlDataSource() {
			MysqlDataSource ds=new MysqlDataSource();
					ds.setUrl("jdbc:mysql://localhost:3306/company_db");
			ds.setUser("root");
			ds.setPassword("Sql2026");
			return ds;
			
		}
}
