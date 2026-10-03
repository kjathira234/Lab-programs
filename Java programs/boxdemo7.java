class box{
double width;
double heigth;
double depth;
box(double w,double h,double d){
width=w;
heigth=h;
depth=d;
}
double volume(){
return width*heigth*depth;
}
}
class boxdemo7{
public static void main(String args[]){
box mybox1=new box(10,20,15);
box mybox2=new box(3,6,9);
double vol;
vol=mybox1.volume();
System.out.println("volume is"+vol);
vol=mybox2.volume();
System.out.println("voume is"+vol);
}
}
