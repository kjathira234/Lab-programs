import java.util.Scanner;
class person
{
String name;
String gender;
String address;
int age;
person(String name,String gender,String address,int age){
this.name=name;
this.gender=gender;
this.address=address;
this.age=age;
}
}
class Employee extends person
{
int Empid;
String company_name;
String qualification;
long salary;
Employee(String name,String gender,String address,int age,int empid,String company_name,String qualification,long salary)
{
super(name,gender,address,age);
this.Empid=empid;
this.company_name=company_name;
this.qualification=qualification;
this.salary=salary;
}
}
public class Teacher2 extends Employee{
String subject;
String department;
String teacherid;
Teacher2(String name,String gender,String address,int age,int empid,String company_name,String qualification,long salary,String subject,String department,String teacherid){ super(name,gender,address,age,empid,company_name,qualification,salary);
this.subject=subject;
this.department=department;
this.teacherid=teacherid;
}
void display()
{
System.out.println("Name:"+name);
System.out.println("Gender:"+gender);
System.out.println("Address:"+address);
System.out.println("Age"+age);
System.out.println("Employee id:"+Empid);
System.out.println("Company_name:"+company_name);
System.out.println("Qualification:"+qualification);
System.out.println("Salary:"+salary);
System.out.println("Subject:"+subject);
System.out.println("Department:"+department);
System.out.println("Teacherid:"+teacherid);
}
public static void main(String [] args){
System.out.println("\n Enter the no of teacher's");
Scanner sc1=new Scanner(System.in);
int num=sc1.nextInt();
Teacher2 arr[]=new Teacher2[num];
System.out.println("\n Enter the teacher details\n");
int x=0,j=0;
Scanner sc=new Scanner(System.in);
for(int i=0;i<num;i++)
{
x=i+1;
System.out.println("\n"+x+".)");
System.out.println("\nName: ");
String a=sc.next();
System.out.println("\nGender: ");
String b=sc.next();
System.out.println("\nAddress: ");
String c=sc.next();
System.out.println("\nAge: ");
int d=sc.nextInt();
System.out.println("\nEmployee id: ");
int e=sc.nextInt();
System.out.println("\nCompany name: ");
String f=sc.next();
System.out.println("\nQualifiaction: ");
String g=sc.next();
System.out.println("\nSalary: ");
long h=sc.nextLong();
System.out.println("\nSubject: ");
String k=sc.next();
System.out.println("\nDepartment: ");
String l=sc.next();
System.out.println("\nTeacher Id: ");
String n=sc.next();
arr[i]=new Teacher2(a,b,c,d,e,f,g,h,k,l,n);
}
sc.close();
System.out.println("\n*****Informations of all the teacher*****");
for(int i=0;i<num;i++)
{
j=i+1;
System.out.println("\n"+j+").");
arr[i].display();
}
sc1.close();
}
}


