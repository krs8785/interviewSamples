package karan.stack;

public class testStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		st.push(5);
		st.push(2);
		st.push(3);
		st.push(4);
		
		System.out.println(st.pop());

		System.out.println(st.peek());
	}

}
