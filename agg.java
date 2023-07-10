class agg
{
public static void main(String[]arg)
{
int a1=90;
int a2=54;
int a3=76;
int a4=88;
int total=(a1+a2+a3+a4);
float agg=total/4f;
System.out.println(total);
System.out.println(agg);
if(agg>=75)
{
System.out.println("DISTINCTION");
}
else if(agg>=60 && agg<75)
{
System.out.println("1 DIVISION");
}
else if(agg>=50 && agg<60)
{
System.out.println("2 DIVISION");
}
else if(agg>=40 && agg<50)
{
System.out.println("3 DIVISION");
}
else
{
System.out.println("fail");
}
}
}

