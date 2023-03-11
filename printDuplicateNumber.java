package com.example;

import java.util.Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class printDuplicateNumber {
	public static void main(String[] args) {
		int[] num= {22,10,10,10,20,30,40,10,22};
		String s=Arrays.toString(num);

		Map map=new HashMap<>();
		for (int i = 0; i < num.length; i++) {
			int count=0;
			for (int j = 0; j < num.length; j++) {
				if(num[i]==num[j])
				{
					count++;
					map.put(num[i], count);


				}

			}

		}

		Set  set=map.entrySet();
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());


		}


	}


}
