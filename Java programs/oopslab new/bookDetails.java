import java.util.Scanner;
class publisher
{
String publisher;
publisher(String pub){
this.publisher=pub;
}
}
class Book extends publisher{
String book;
Book(String pub,String boo){
super(pub);
book=boo;
}
}
class Literature extends Book{
String category;
Literature(String pub,String boo){
super(pub,boo);
}
void display(){
System.out.println("publisher:"+publisher);
System.out.println("book:"+book);
}
}
class Fiction extends Book{
Fiction(String pub,String boo){
super(pub,boo);
}
void display(){
System.out.println("Publisher:"+publisher);
System.out.println("Book:"+book);
}
}
public class bookDetails{
public static void main(String[] ards){
System.out.println("\n Enter the no.of Literature Books");
Scanner sc1=new Scanner(System.in);
int num=sc1.nextInt();
Literature arr[]=new Literature[num];
System.out.println("\n Enter the Literature Book Details\n");
int x=0,j=0;
Scanner sc=new Scanner(System.in);
for(int i=0;i<num;i++)
{
x=i+1;
System.out.println("\n"+x+").");
System.out.println("\n Book:");
String boo=sc.next();
System.out.println("\n Publisher:");
String pub=sc.next();
arr[i]=new Literature(boo,pub);
}
System.out.println("\n Enter the no.of Fiction Books");
int num1=sc1.nextInt();
Fiction arr1[]=new Fiction[num];
System.out.println("\n Enter the Fiction Book Details\n");
int x1=0,j1=0;
for(int i=0;i<num;i++)
{
x1=i+1;
System.out.println("\n"+x1+").");
System.out.println("\n Book : ");
String boo =sc.next();
System.out.println("\n Publisher: ");
String pub =sc.next();
arr1[i]=new Fiction(boo,pub);
 }
sc.close();
System.out.println("\n********Informations of all the Literature Books************");
for(int i=0;i<num;i++){
j=i+1;
System.out.println("\n"+j+").");
arr[i].display();      
        }
System.out.println("\n********Informations of all the Fiction Books************");
for(int i=0;i<num1;i++){
j1=i+1;
System.out.println("\n"+j1+").");
arr1[i].display();
 }
 sc1.close();
 }
    }
