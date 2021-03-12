package org.ict.di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext(
"file:src/main/webapp/WEB-INF/spring/root-context.xml");
		
		// 첫 번째 파라미터는 클래스명의 
		// 맨 앞글자를 소문자로 바꾸고(소문자면 그대로)
		// 두 번째 파라미터는 클래스명.class 를 적습니다.
		Broadcast broadcast = context.getBean(
				 "mbc", Broadcast.class);
		
		broadcast.broad();
		context.close();
	}

}
