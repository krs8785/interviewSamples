package karan.xgeneral;
import karan.Node.*;

public class passByValue {

	public static void main(String[] args) {
		int a =5;
		int b=10;
		karan.Node.Node n = new karan.Node.Node(22);
		
		System.out.println(a);
		System.out.println(b);
		
		swap(a, b);
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("node");
		System.out.println(n.getValue());
		changeValue(n);
		System.out.println(n.getValue());
		
		
	}
	
	public static void changeValue(karan.Node.Node obj){
		System.out.println("obj");
		System.out.println(obj.getValue());
		obj.setValue(11);
		System.out.println(obj.getValue());
		System.out.println("done");
	}
	
	public static void  swap(int a, int b) {
		System.out.println("inside swap");
		System.out.println(a);
		System.out.println(b);
		int temp =a;
		a=b;
		b= temp;
		System.out.println("swap");
		System.out.println(a);
		System.out.println(b);
		System.out.println("done swap");
	}
}
