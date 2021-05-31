package dudiSagitTaboola.unitTest;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import dudiSagitTaboola.q2.MyClass;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dateBefore = new Date(2021,5,30);
		Date dateNext = new Date(2021,6,1);
		List<Long> numbers = new ArrayList<>(Arrays.asList(new Long(200005), new Long(400005)));
		List<String> strings = new ArrayList<>(Arrays.asList("Hello", "test"));
		MyClass myClass = new MyClass(dateBefore, "test",  numbers,  strings);
		MyClass myClass2 = new MyClass(dateNext, "test",  null,  null);
		//check same object type & name
		System.out.println("equals myClass2 - "+myClass.equals(myClass2));
		//check other object
		System.out.println("equals myClass2 - "+myClass.equals(true));
		//check toString
		System.out.println("toString - "+myClass.toString());
		//check removeString
		myClass.removeString("test");
		System.out.println("removeString test - "+myClass.toString());
		//check number exist
		System.out.println("containsNumber 400005 - "+myClass.containsNumber(400005));
		//check number not exist
		System.out.println("containsNumber 600005 - "+myClass.containsNumber(600005));	
		//check isHistoric with yesterday
		System.out.println("isHistoric(Yesterday) - "+myClass.isHistoric());
		//check isHistoric with tomorrow
		System.out.println("isHistoric(tomorrow) - "+myClass2.isHistoric());		

	}

}
