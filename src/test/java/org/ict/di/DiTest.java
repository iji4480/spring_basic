package org.ict.di;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
"file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DiTest {

	// 생성하고 싶은 객체를 선언하고
	// 어노테이션을 이용해 주입합니다.
	@Setter(onMethod_ = @Autowired)
	private Broadcast broad;
	
	// @Test를 받은 메서드가 main메서드처럼 작동합니다.
	//@Test
	public void testExist() {
		//assertNotNull은 ctrl+space로 임포트 시켜야 쓸 수 있습니다.
		assertNotNull(broad);
		log.info(broad);
		log.info("----------------");
	}
	
	// 위 메서드와 완전히 같은 동작을 하는 testExist2()를 만들어주세요.
	@Test
	public void testExist2() {
		//assertNotNull은 ctrl+space로 임포트 시켜야 쓸 수 있습니다.
		assertNotNull(broad);
		log.info(broad);
		log.info("-------2---------");
	}
}
