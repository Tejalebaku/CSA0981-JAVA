class armstrongp
{
public static void main(String[]args)
{
int i,rem,sum=0;
int num=153;
int num1=num;
while(num>0)
{
rem=num%10;
sum=sum+(rem*rem*rem);
num=num/10;
}
if(sum==num1)
{
System.out.println("arms no.");
}
else
{
System.out.println("notarms no.");
}
}
}
