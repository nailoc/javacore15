package com.hk.app;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Exam4 {

	public static void main(String[] args) {
		
		List num = new LinkedList();
		
		// 1부터 100까지의 랜덤하게 값을 저장한다 (20번)
		for(int i=0; i<20; i++) {
			int number = (int)(Math.random()*100+1);
			num.add(number);
		}
		
		// 반복자 Iterator 사용해서 짝수만 찾아서 출력하시오 
		Iterator itr = num.iterator();
		int sum = 0;
		while(itr.hasNext()) {
			int temp = (int)itr.next();
			if(temp%2==0) {
				sum+=temp;
			}
		}
		// 짝수의 합을 출력하시오
		System.out.println("짝수들의 합은:"+sum);

	}

}
