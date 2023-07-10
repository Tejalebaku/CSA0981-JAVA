class studentdetails
{
void information()
{
String studentname="teja";
int regno=192011355;
long mobileno=3255;
System.out.println("studentname is :"+studentname);
System.out.println("regno is :"+regno);
System.out.println("mobileno is :"+mobileno);
}
}
class marksheet
{
void information()
{
String sub1="Maths";
String sub2="Science";
String sub1="Social";
int sub1marks=85;
int sub2marks=78;
int sub3marks=67;
System.out.println(sub1+"="+sub1marks);
System.out.println(sub2+"="+sub2marks);
System.out.println(sub3+"="+sub3marks);
}
}
class placement
{
void information()
{
int numofattendeddrives=5;
int numofofferlettersreceived=1;
int numofcompaniesgotrejected=4;
System.out.println("numof attendeddrives is :"+attendeddrives);
System.out.println("numf offer lettersreceived is :"+offerlettersreceived);
System.out.println("numof companies gotrejected is :"+companiesgotrejected);
}
}
class studentinformation
{
public static void main(String[]arg)
{
studentdetails p=new studentdetails();
p.information();
marksheet m=new marksheet();
m.information();
placement a=new marksheet();
a.information();
}
}

















