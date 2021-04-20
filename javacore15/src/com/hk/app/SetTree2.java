package com.hk.app;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTree2 {

	public static void main(String[] args) {

		Set tree = new TreeSet();
		
		tree.add("tiger");
		tree.add("wolf");
		tree.add("hippo");
		tree.add("rabbit"); // 정렬기능있음
		
		Iterator itr = tree.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
