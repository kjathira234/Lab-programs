import java.util.Scanner;
class Employee
{
public String eno;
public String ename;
public int esalary;
public Employee(String eno,String ename,int esalary)
{
this.eno=eno;
this.ename=ename;
this.esalary=esalary;
}
}
public class main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("enter count of employee list:");
int count=Integer.parseInt(scan.nextLine());
Employee[] employees=new Employee[count];
for(int i=0;i<count;i++)
{
System.out.println("enter number of employee:");
String eno=scan.nextLine();
System.out.println("enter name of employee:");
String ename=scan.nextLine();
System.out.println("enter salary of employee:");
int esalary=Integer.parseInt(scan.nextLine());
employees[i]=new Employee(eno,ename,esalary);
}
System.out.println("enter the number of employee to be filtered out:");
String search=scan.nextLine();
for(int i=0;i<count;i++)
{
if(employees[i].eno.equals(search))
{
System.out.println("employee number:"+employees[i].eno);
System.out.println("employee name:"+employees[i].ename);
System.out.println("employee salary:"+employees[i].esalary);
}
}
}
}

