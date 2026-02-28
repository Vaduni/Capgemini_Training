package com.dk;

import java.util.ArrayList;

public class String1 {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String s="this is Line Line contains few words. Line is in java";
		String word[]=s.split(" ");
		ArrayList<Integer>ans=new ArrayList<>();
		for(int i=0;i<word.length;i++) {
			if(word[i].equals("Line")) {
				ans.add(i+1);
			}
		}
		System.out.println(ans);
	}
}
