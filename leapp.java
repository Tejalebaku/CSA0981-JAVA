class leapp
{
public static void main(String[]arg)
{
String year="04/11/2000";
String a[]=year.split("/");
String d=a[2];
int num=Integer.parseInt(d);
if((num%4==0 && num%100!=0) || num%400==0)
System.out.println("leap year");
else
System.out.println("not leap year");
}
}

