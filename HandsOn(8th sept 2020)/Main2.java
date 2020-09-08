import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Player
{
	String capnumber,name,team,skill;
}
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of players ");
	    int n = sc.nextInt();
	    System.out.println("Enter the details of the player");
	    TreeMap<Player> h = new TreeMap<Player>();
	    for (int i = 0; i < n; i++)
	    {
	    	
	      h.put((sc.nextLine()), sc.nextLine(),sc.nextLine(),sc.nextLine());
	    }
	    for(Map.Entry<Integer, Player> entry:h.entrySet()){    
	        int key=entry.getKey();  
	        Player b=entry.getValue();  
	        System.out.println(key+" Player Details:");  
	        System.out.println(b.capnumber+" "+b.name+" "+b.team+" "+b.skill);   
	    }    
	}

}
