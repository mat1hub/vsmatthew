package edu.disease.asn5;

import java.util.Arrays;
import java.util.List;

public class Container<T> {
	List<T> a;


	public Container(T... a) {
           if(a.length==0) {
        	   throw new IllegalArgumentException("null values are not allowed...!");
           }
           this.a =Arrays.asList(a);
	}
	

	public Integer size() {
		return a.size();
	}
	public T get(int i) {
		if(0<i && i>=a.size()) {
			throw new IllegalArgumentException("");
		}
		return a.get(i);
	}

	public static void main(String[] args) {
		
		
	}
	class Laptop<T>{
		Laptop(){
			
		}
	}
//public T get(int a) throws IllegalArgumentException{
	// return a;

//}
}
