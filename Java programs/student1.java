class student{
int rollno;
int mark1;
int mark2;
int mark3;
}
class student1{
public static void main(String args[]){
student newstudent=new student();
double total;
newstudent.mark1 = 16;
newstudent.mark2 = 18;
newstudent.mark3 = 19;
total=newstudent.mark1+newstudent.mark2+newstudent.mark3;
System.out.println("Total is"+total);
}
}
