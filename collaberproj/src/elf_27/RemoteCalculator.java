package elf_27;

public class RemoteCalculator implements Calculator {


	public int add(int... a) {
	   int sum=0;
	for(int arr :a) {
		sum=sum +arr;   
	   }
		return sum;
	}

	
	public int sub(int a, int b) {
		
		
		return a-b;
	}

	
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	
	
}
