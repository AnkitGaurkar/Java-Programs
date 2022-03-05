package userObjects;

import java.util.Iterator;
import java.util.LinkedList;

public class EmpList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Employee>emplist=new LinkedList<Employee>();
		Employee e1=new Employee();
		e1.setEid(1);
		e1.setEname("Ankit");
		e1.setEsal(3333);
		
		Employee e2=new Employee(2,"Saurabh",4566);
		Employee e3=new Employee(3,"Ansh",5666);
		
		emplist.add(e1);
		emplist.add(e3);
		emplist.add(e2);
		
		System.out.println(emplist);
		
		Iterator<Employee>i1=emplist.iterator();
		
		while(i1.hasNext())
		{
			Employee e=i1.next();
			{
		System.out.println(e.getEid()+"\t"+e.getEname()+"\t"+e.getEsal());
		
	}

}
	}
}
