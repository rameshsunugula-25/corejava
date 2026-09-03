package com.array;

public class Testdemo4 {

	public static void main(String[] args) {
		int[] arr=new int[5];
		arr[0]=10;
		arr[1]=25;
		arr[2]=35;
		arr[3]=45;
		arr[4]=50;
int max=arr[0];
int min=arr[0];
for(int i=0;i<arr.length;i++) {
	if (arr[i]>max){
		max=arr[i];
	}
	if (arr[i]<min){
		min=arr[i];
	}
	
}
System.out.println(max);
System.out.println(min);
	}

}
