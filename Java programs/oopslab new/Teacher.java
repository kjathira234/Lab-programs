import java.util.Scanner;
class employee{
int empid;
String name;
double salary;
String address;
employee(int no,String na,double sal,String add)
{
this.empid=no;
this.name=na;
this.salary=sal;
this.address=add;
}}
class Teacher extends employee{
String dept;
String subject;
Teacher(int no,String na,double sal,String add,String dep,String sub){
super(no,na,sal,add);
this.dept=dep;
this.subject=sub;
}
void display(){
System.out.println("employee id:"+empid);
System.out.println("name:"+name);
System.out.println("salary:"+salary);
System.out.println("address:"+address);
System.out.println("department:"+dept);
System.out.println("subject:"+subject);
}
public static void main(String[] args){
System.out.println("\n Enter the no of employee");
Scanner sc1=new Scanner (System.in);
int num=sc1.nextInt();
Teacher arr[]=new Teacher[num];
for(int i=0;i<num;i++)
{
Scanner sc=new Scanner(System.in);
System.out.println("\n Enter employee id:");
int empid=sc.nextInt();
System.out.println("\n Enter employee name:");
String name=sc.next();
System.out.println("\n Enter salary:");
double salary=sc.nextDouble();
System.out.println("\n Enter addresss:");
String address=sc.next();
System.out.println("\n Enter department:");
String dept=sc.next();
System.out.println("\n Enter subject:");
String subject=sc.next();
arr[i]=new Teacher(empid,name,salary,address,dept,subject);
}
System.out.println("\n **INformations all the employee's **");
for(int i=0;i<num;i++)
{
int j=i+1;
System.out.println("\n"+j+").");
arr[i].display();
}
sc1.close();
}}

