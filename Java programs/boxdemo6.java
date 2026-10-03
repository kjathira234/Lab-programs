class box{
double width; 
double heigth;
double depth;
box(){
	System.out.println("constructing are");
		width=10;
		heigth=10;
		depth=10;
	}
	double volume(){
	return width*heigth*depth;
}
}
class boxdemo6{
public static void main(String args[]){
box mybox1=new box();
box mybox2=new box();
double vol;
vol=mybox1.volume();
System.out.println("volume is"+vol);
vol=mybox2.volume();
System.out.println("volume is"+vol);
}
}
