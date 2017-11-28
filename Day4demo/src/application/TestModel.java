package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

import com.sun.xml.internal.ws.message.saaj.SAAJMessage;


public class TestModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student(3,"zhang","fang");
Student s2=new Student(2,"ge","dong");
Student s3=new Student(1,"xuan","nan");
Student s4=new Student(3,"xuan","nan");

if(s3.equals((s4))) 
{
	System.out.println("same person");
}else 
{
	System.out.println("digital same");
}
System.out.println("comparable");
ArrayList<Student>sList=new ArrayList<Student>();
sList.add(s1);
sList.add(s2);
sList.add(s3);
System.out.println("***************before sorting");
for (Iterator iterator = sList.iterator(); iterator.hasNext();) {
	Student student = (Student) iterator.next();
	System.out.println(student.toString());
}
Collections.sort(sList);
System.out.println("***************after sorting");
for (Iterator iterator = sList.iterator(); iterator.hasNext();) {
	Student student = (Student) iterator.next();
	System.out.println(student.toString());
}
System.out.println("comparator");
Collections.sort(sList,new StudentNameComparator());


	}
	
	
	
	

	
}
