package karan.xgeneral;

import java.util.HashMap;

class Node{
	public Node(int _val, int _key) {
		this.value = _val;
		this.key = _key;
	}
	
	int value;
	int key;
	Node pre;
	Node next;
}

public class LRUCache {

	int cap;
	HashMap<Integer, Node> map = new HashMap<Integer, Node>();
	Node head = null;
	Node tail = null;
	
	public LRUCache(int _cap) {
		// TODO Auto-generated constructor stub
		this.cap = _cap;
	}
	
	public int get(int key){
		if(map.containsKey(key)){
			Node old = map.get(key);
			//rem
			//set
			return old.value;
		}
		return -1;
	}
	
	public  void set(int _val, int _key){
		if(map.containsKey(_key)){
			Node old = map.get(_key);
			old.value = _val;
			//remove
			//setHead
			
		}else{
			Node temp = new Node(_val,_key);
			if(map.size() >= cap){
				map.remove(tail.key);
				//remove
				//sethead
			}else{
				//sethead
			}
			map.put(_key, temp);
		}
	}
	
	
	
	
	
	private void main() {
		// TODO Auto-generated method stub

	}
	
}
