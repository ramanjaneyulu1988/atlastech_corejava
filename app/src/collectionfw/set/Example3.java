package collectionfw.set;

// Ctrl + shift + o -> To remove all unused imports
import java.util.LinkedHashSet;
import java.util.Set;

public class Example3 {

public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("abc");
		set.add("xyz");
		set.add("aaa");
		set.add("Alex");
		set.add("abc");
		set.add("abc");
		set.add("abc");
		set.add("abc");
		set.add("abc");
		set.add("Alex");
		set.add("Alex");
		set.add("Blr");
		
		System.out.println(set);
		
	}
}
