package karan.stack;

import java.util.EmptyStackException;

import karan.LinkedList.*;

public class Stack {

	SinglyLinkedList myStack;
	
	public Stack() {
		// TODO Auto-generated constructor stub
		myStack = new SinglyLinkedList();
	}
	
	public void push(int value){
		if(myStack != null){
			myStack.addFirst(value);
		}
	}
	
	public int pop(){
		if(!myStack.isEmpty()){
			return myStack.removeFirst().getValue();
		}else{
			EmptyStackException e = new EmptyStackException();
			throw e;
		}
	}
	
	public int peek(){
		if(!myStack.isEmpty()){
			return myStack.getHead().getValue();
		}else{
			EmptyStackException e = new EmptyStackException();
			throw e;
		}
	}
	
}
