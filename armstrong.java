class armstrong
{
public static void main(String[]arg)
{
int n=150;
int n1=n;
int sum=0;
int rem;
while(n>0)
{
rem=n%10;
sum=sum+(rem*rem*rem);
n=n/10;
}
if(sum==n1)
{
System.out.println("arms no.");
}
else
{
System.out.println("not arms no.");
}
}
}






