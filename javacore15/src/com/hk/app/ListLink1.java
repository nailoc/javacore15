package com.hk.app;

import java.util.LinkedList; // jdk제공 라이브러리
import java.util.List;

public class ListLink1 {

	public static void main(String[] args) {
		
		List myLink = new LinkedList();
		myLink.add(23);
		myLink.add(34);
		myLink.add(19);		
		// 맨앞에 추가
		myLink.add(0, 15);
		// 맨마지막 추가
		myLink.add(4,25);
		// 중간데이터 삭제
		myLink.remove(2); // 장점
		// 중간데이터 추가
		myLink.add(2, 45);
		
		// 사이즈 가져오기
		int size = myLink.size();
		
		for(int i=0; i<size; i++) {
			System.out.println(myLink.get(i));			
		}
		
		// 함수를 사용하는 개발자 입장에서는 비슷하게 보인다
		

	}

}
