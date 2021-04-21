package com.hk.app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exam5 {

	public static void main(String[] args) {
		
		// 전화번호를 저장한다
		Map phone = new HashMap(); // 키, 값으로 저장
		Scanner reader = new Scanner(System.in);
		String start = null;
		while(true) {
			System.out.print("전화번호를 입력하겠습니까(y/n)?");			
			start = reader.nextLine();
			
			if(start.equalsIgnoreCase("y")) {
			
				System.out.print("이름입력>>");
				String name = reader.nextLine();
			
				System.out.print("전화번호입력>>");
				String phnum = reader.nextLine();
			
				phone.put(phnum, name);
			}else {
				break;
			}
			
		}
		// 정렬(key기준) 
		TreeMap tm = new TreeMap(phone);
		
		System.out.println("저장된 정보를 출력합니다");
		/*
		Iterator key = phone.keySet().iterator();
		while(key.hasNext()) {
			String keyVal = (String)key.next();
			System.out.println("전화번호:"+keyVal+" 이름:"+phone.get(keyVal));			
		}
		*/
		//Iterator key2 = tm.keySet().iterator(); 	// 오름차순
		Iterator key2 = tm.descendingKeySet().iterator(); // 내림차순
		
		while(key2.hasNext()) {
			String keyVal2 = (String)key2.next();
			System.out.println("전화번호:"+keyVal2+" 이름:"+tm.get(keyVal2));
		}

	}

}
