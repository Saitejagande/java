package Collections;
class Student{
	String name;
	int age;

Student(String n,int a){
	name=n;
	age=a;
}
}
public class ArrayObjects {
public static void main(String ar[]) {
	//Creating student objects
	Student s1=new Student("sai",25);
	Student s2=new Student("Shree",23);
	Student s3=new Student("Teja",24);
	Student s4=new Student("dev",26);
	Student s5=new Student("raj",25);
	Student s6=new Student("manu",27);
	
	//storing objects into students array
	Student students[]=new Student[6];
	students [0]=s1;
	students [1]=s2;
	students [2]=s3;
	students [3]=s4;
	students [4]=s5;
    students [5]=s6;
	
    //retrieve objects from array and access its members
    for(int i=0;i<students.length;i++) {
		Student s=students[i];
		System.out.print(s.name+",");
		System.out.println(s.age);
	}
}
}
/**To deal with the set of objects we can also use arrays
but in arrays we can only use similar data types  but in collections 
we can use any kind of data types**/ 