import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class removeDuplicates {
	
		public static void main (String[] args) {
			Scanner sc = new Scanner(System.in); 
			int values = sc.nextInt();
			
			Set<Character> c = new HashSet<Character>();
			String result;
			
			for(int i=0; i <= values; i++){
			   result = ""; 
			   String current = sc.nextLine(); 
			   
			   for(int j=0; j< current.length(); j++){
			       
			       if(c.contains(current.charAt(j)))
			       {
			           continue;
			       }
			       else {
			           c.add(current.charAt(j));
			           result = result+ Character.toString(current.charAt(j));
			       }
			       
			       
			   }
			   System.out.println(result);
			   c.clear();
			   
			}
		
		
	}

}
