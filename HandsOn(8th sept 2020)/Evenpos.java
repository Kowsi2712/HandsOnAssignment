import java.util.ArrayList;
import java.util.Scanner;

public class Evenpos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int even=0;
		Integer[] a=new Integer[n];
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			l.add(a[i]);
		}
		for(int i=0;i<n;i++)
		{
			if(i%2!=0)
				even=even+l.get(i);
		}
		System.out.println(even);

	}

}
