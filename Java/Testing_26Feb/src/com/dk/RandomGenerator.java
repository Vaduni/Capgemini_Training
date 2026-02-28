package com.dk;

import java.util.Arrays;

public class RandomGenerator {

    public int[] random() {
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int)((Math.random() * 10)+1); 
        }
        return arr;
    }
    public static void main(String[] args) {
        RandomGenerator obj = new RandomGenerator();
        int[] ans = obj.random();
        System.out.println(Arrays.toString(ans));
    }
	
	//Stream API
	/*void random() {
	 int[] arr;
	 boolean allMatch=Arrays.stream(arr).allMatch(x->x>=1&&x<=10);
	 assertTrue(allMatch);
	 boolean anyMatch=Arrays.stream(arr).anyMatch(x->x<1&&x>10);
	 assertTrue(anyMatch);
    }

   private void assertTrue(boolean anyMatch) {
	// TODO Auto-generated method stub
	
   }
	 }*/
	/*public int[] random() {
		int arr[]=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=i+1;
		}
		return arr;
	}*/
}