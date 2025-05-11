package Collection;

//import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Kavitha {

	public static void main(String[] args) {
		LinkedList<Integer> gg=new LinkedList<Integer>();
		
		gg.add(20);
		gg.add(40);
		gg.add(null);
		gg.add(30);
	    gg.add(null);
		gg.add(40);
		gg.add(60);
		gg.add(45);
		gg.add(40);
		gg.add(null);
		
		System.out.println(gg);
		System.out.println(gg.size());
		System.out.println(gg.get(3));
		
		
		//Collections.sort(gg);
		//System.out.println(gg);
		
		System.out.println("-----for loop-----");
		for(int i=0;i<=gg.size()-1;i++)
		{
			System.out.println(gg.get(i));
		}
		
		
		System.out.println("-----for each-----");
		for(Integer hh:gg)
		{
			System.out.println(hh);
		}
		
		
        System.out.println("------iterator-------");
		
		ListIterator<Integer>ll =gg.listIterator();
         while(ll.hasNext())
         {
        	 System.out.println(ll.next());
         }

        System.out.println("------List iterator-------");
         
         ListIterator<Integer> vv = gg.listIterator();
         while(vv.hasNext())
         {
        	 System.out.println(vv.next());
         }
         
         System.out.println("------backward------");
         
         while(vv.hasPrevious())
         {
        	 System.out.println(vv.previous());
         }  



	}

}
