package org.test;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CopyValue {
	public static void main(String[] args) {
		List <Integer> li = new LinkedList<Integer>();
		li.add(3);
		li.add(8);
		li.add(5);
		li.add(10);
		li.add(4);
		li.add(6);
 
		System.out.println("List \n" + li);
		Set<Integer> si = new HashSet<Integer>(li);
		System.out.println("Set \n" + si);
		
		
		
		
		
		
		
		
		
		
		
		


}
}