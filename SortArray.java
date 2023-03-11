package com.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SortArray {
	public static void main(String[] args) {
		int[] num= {22,10,10,10,20,30,40,10,22};
		String s=Arrays.toString(num);
		System.out.println("before sort"+s);
		Map map=new HashMap<>();
		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < num.length; j++) {
				if(num[i]<num[j])
				{
					int temp=num[i]; 
					num[i]=num[j];
					num[j]=temp;

				}

			}

		}

		Set  set=map.entrySet();
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());


		}

		String s1=Arrays.toString(num);
		System.out.println("before sort"+s1);
	}

}
