package com.hk.app;

// 학생 점수 관리 정의하는 클래스
public class StudentVo {

	String name;
	int eng;     // 영어
	int chn;	 // 중국어
	
	//생성자 - 초기화
	public StudentVo(String nm, int e, int c) { 
		name = nm;
		eng = e;
		chn = c;
	}
	
}
