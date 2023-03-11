package com.example;

public class MaxNumberFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {10,20,30,40,50,22};

		int max=num[0];
		int min=num[0];

		for (int i = 0; i < num.length; i++) {
			if(max<num[i])
			{
				max=num[i];
			}

			if(min>num[i])
			{
				min=num[i];
			}

		}
		
		System.out.println("max"+max);
		System.out.println("min"+min);



	}

}
