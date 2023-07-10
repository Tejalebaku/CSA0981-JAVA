class studentdetails
{
void info()
{
int regno=3255;
int phno=996656;
String name="TEJA";
System.out.println("regno is :"+regno);
System.out.println("phno is :"+phno);
System.out.println("name is :"+name);
}
}
class marksheet
{
void marks()
{
String sub1="maths";
String sub2="social";
String sub3="science";
int sub1marks=88;
int sub2marks=75;
int sub3marks=92;
System.out.println(sub1+"="+sub1marks);
System.out.println(sub2+"="+sub2marks);
System.out.println(sub3+"="+sub3marks);
}
}
class placement
{
void placementdetails()
{
int attendeddrives=5;
int gotplaced=1;
int notgotplaced=4;
System.out.println("attendeddrives="+attendeddrives);
System.out.println("gotplaced="+gotplaced);
System.out.println("notgotplaced="+notgotplaced);
}
}
class studentbio
{
public static void main(String[]arg)
{
studentdetails p=new studentdetails();
p.info();
marksheet m=new marksheet();
m.marks();
placement q=new placement();
q.placementdetails();
}
}






