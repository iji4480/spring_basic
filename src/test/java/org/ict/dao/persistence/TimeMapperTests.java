package org.ict.dao.persistence;

import org.ict.mapper.TimeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TimeMapperTests {

	@Autowired
	private TimeMapper mapper;
	
	@Test
	public void testGetTime2() {
		log.info("getTime2가 가져온 시간");
		log.info(mapper.getTime());
	}
	
	
	//@Test
	public void testGetTime() {
		log.info("현재 시간 조회중...");
		log.info(mapper.getTime());
	}
	
}
