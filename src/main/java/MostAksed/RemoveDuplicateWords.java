package MostAksed;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String str = "This is This is a Test Test";
		
		String[] strArr = str.split(" ");
		Set<String> hashSet = new HashSet<>();
		for( String word : strArr) {
			
			hashSet.add(word);
		}
		
		System.out.println(hashSet);
		
		Set<String> linkedHashSet = new LinkedHashSet<>();
		for( String word : strArr) {
			
			linkedHashSet.add(word);
		}
		
		//System.out.println(linkedHashSet.toString());
		
		Iterator itr = linkedHashSet.iterator();
		
		while(itr.hasNext())
			System.out.print(itr.next() + " ");	
	}
}
