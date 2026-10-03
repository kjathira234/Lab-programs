import java.util.Scanner;
class box{
int width;
int heigth;
int depth;
}
class boxdemo8{
public static void main(String args[]){
box mybox=new box();
int vol;
Scanner in=new Scanner(System.in);
System.out.println("enter width(whole number):");
mybox.width=in.nextInt();
System.out.println("enter heigth(whole number):");
mybox.heigth=in.nextInt();
System.out.println("enter depth(whole number):");
mybox.depth=in.nextInt();
vol=mybox.width*mybox.heigth*mybox.depth;
System.out.println("volume is"+vol);
in.close();
}
}

