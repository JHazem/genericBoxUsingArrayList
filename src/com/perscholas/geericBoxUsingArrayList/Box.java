package com.perscholas.geericBoxUsingArrayList;

import java.util.ArrayList;
import java.util.List;



// Create GenericBox by using Generic and Arraylist
// and utilize generic and Collection together.

public class Box <T>{

	List<T> values;
	
	public Box() {
		values = new ArrayList<T>();
	}
	
	public void add(T value) {
		values.add(value);
	}
	
	public List<T> get(){
		return values;
	}
}

// Create class named myMain, write below code

class MyMain{
	public static void main(String[] args) {
		// Creating Generic Instance for box
		Box<Integer> intBox = new Box<Integer>();
		 intBox.add(12);
		 intBox.add(24);
		 intBox.add(42);
		 intBox.add(45);
		 System.out.println(intBox.get());
		 
		// Creating Generic Instance for box
		 Box<Float> floatBox = new Box<Float>();
		 floatBox.add(12.3f);
		 floatBox.add(18.5f);
		 floatBox.add(120.45f);
		 floatBox.add(85.4f);
		 System.out.println(floatBox.get());
		
	}
}










