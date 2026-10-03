public class person{
String name;
int age;
person(String name,int age)
{
this.name=name;
this.age=age;
}
public void printdetails(){
System.out.println("name:"+this.name);
System.out.println("age:"+this.age);
System.out.println();
}
public static void main(String args[])
{
person first=new person("abc",18);
person second=new person("xyz",22);
first.printdetails();
second.printdetails();
}
}



