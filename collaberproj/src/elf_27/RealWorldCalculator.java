package elf_27;

public class RealWorldCalculator {

	public static void main(String[] args) {
	Calculator cl=new RemoteCalculator();
	System.out.println(cl.add(20));
	System.out.println(cl.add(10,20,50));
	System.out.println(cl.sub(11, 88));
	System.out.println(cl.multiply(55, 88));

	}

}
