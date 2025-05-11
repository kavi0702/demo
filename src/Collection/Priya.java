package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Priya {

	public static void main(String[] args) {
		
		Vector<Object> cc = new Vector<Object>();
		
		cc.add(50);
		cc.add(5.5f);
		cc.add(50);
		cc.add(null);
		cc.add(60);
		cc.add("Python");
		cc.add(null);
		cc.add(50);
		cc.add(400.0);
		cc.add('T');
		cc.add(null);
		
		System.out.println(cc);
		System.out.println(cc.size());
		System.out.println(cc.get(5));
		
		
        System.out.println("------forloop-------");
		
		for(int i=0;i<=cc.size()-1;i++)
		{
			System.out.println(cc.get(i));
		}
		
		
        System.out.println("------foreach-------");
		
		for(Object ip:cc)
		{
			System.out.println(ip);
		}
		
		
        System.out.println("------iterator-------");
		
		Iterator<Object>pt =cc.iterator();
         while(pt.hasNext())
         {
        	 System.out.println(pt.next());
         }
         
         
         System.out.println("------List iterator-------");
         
         ListIterator<Object> vb = cc.listIterator();
         while(vb.hasNext())
         {
        	 System.out.println(vb.next());
         }
         
         
         System.out.println("------backward------");
         
         while(vb.hasPrevious())
         {
        	 System.out.println(vb.previous());
         }    
         
         System.out.println("------------enumeration-----------");
         
         Enumeration<Object> gh = cc.elements();
         
         while(gh.hasMoreElements())
         {
         	System.out.println(gh.nextElement());
         }




		


		
		

		

	}

}
