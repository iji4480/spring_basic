package org.ict.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Stage {
	
	//@Autowired
	private Singer singer;
	
	// 생성자 주입 막음
	//public Stage(Singer singer) {
	//	this.singer = singer;
	//}
	
	// 세터 주입 설정
	public void setSinger(Singer singer) {
		this.singer = singer;
	}
	
	public void perform() {
		System.out.print("무대에서 ");
		singer.sing();
	}
}
