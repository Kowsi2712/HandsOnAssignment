import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Teams{ 
	String name;
	long match;
	public Teams(String name, long match) {
		super();
		this.name = name;
		this.match = match;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMatch() {
		return match;
	}
	public void setMatch(long match) {
		this.match = match;
	}
	@Override
	public String toString() {
		return "Teams [name=" + name + ", match=" + match + "]";
	}
	
	
}	
class NoofmatchesComparator implements Comparator{  
public int compare(Object o1,Object o2){  
Teams t1=(Teams)o1;  
Teams t2=(Teams)o2;  
  
if(t1.match==t2.match)  
return 0;  
else if(t1.match>t2.match)  
return 1;  
else  
return -1;  
}  
}  
public class Main1 {

public static void main(String args[]){  
  Scanner sc=new Scanner(System.in);
ArrayList<Teams> al=new ArrayList<Teams>();
int n=sc.nextInt();

for(int i=0;i<n;i++)
{
	
	System.out.println("Enter name");
	String name=sc.nextLine();
	System.out.println("Enter the number of matches");
	long match=sc.nextLong();
	al.add(new Teams(name,match));
}

System.out.println("Team list after sort by number of matches");   
Collections.sort(al,new NoofmatchesComparator());  
for(Teams t: al){  
  System.out.println(t.name+"-"+t.match);  
  }  

}  
}