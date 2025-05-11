package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Sample {



	public static void main(String[] args) 
	{
	ArrayList<Character> hl=new ArrayList<Character>();
	hl.add('A');
	hl.add('B');
	//hl.add(null);
	//hl.add(null);
	hl.add('A');
	//hl.add(null);
	hl.add('A');
	hl.add('C');
	hl.add('D');
	hl.add('E');
	  
	System.out.println(hl);
	System.out.println(hl.size());
	System.out.println(hl.get(6));
	Collections.sort(hl);
	System.out.println(hl);

	
	//for loop
	System.out.println("-------for loop------");
	for(int i=0;i<=hl.size()-1;i++)
	{
		System.out.println(hl.get(i));
	}
	
	System.out.println("----------for each---------");
    
    for(Character kl:hl)
    {
   	 System.out.println(kl);
    }
    
    System.out.println("----------iterator---------");
    
    Iterator<Character> ti = hl.iterator();
    
    while(ti.hasNext())
    {
   	 System.out.println(ti.next());
    }
   	 
   	System.out.println("---------Listiterator---------");
    
    ListIterator<Character> ff = hl.listIterator();
    
    while(ff.hasNext())
    {
   	 System.out.println(ff.next());
    }
    
    System.out.println("---------backward---------");
    
    while(ff.hasPrevious())
    {
   	 System.out.println(ff.previous());
    }

    }



	}


