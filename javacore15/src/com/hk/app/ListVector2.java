package com.hk.app;

import java.util.*;

public class ListVector2 {

	public static void main(String[] args) {
		
		// 벡터를 선언하고
		Vector listFood = new Vector(3);
		// 좋아하는 음식 3개를 문자열로 동적배열 Vector에 대입
		listFood.add("짬뽕"); // 문자열
		listFood.add("초밥");
		listFood.add("비빔밥");
		// 반복문으로 출력하시오
		for(int i=0; i<listFood.size(); i++) {
			System.out.println(i+"번째값:"+listFood.get(i));
		}

	}

}
