package com.hk.app;

import java.util.HashSet; // jdk 제공 라이브러리
import java.util.Iterator;

public class SetHash1 {

	public static void main(String[] args) {
		
		// 부모클래스 Set
		HashSet myset = new HashSet();
		myset.add("사과");
		myset.add("바나나");
		myset.add("딸기");
		myset.add("사과");
		
		int size = myset.size();  // 크기
		System.out.println(size);
		Iterator itr = myset.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
