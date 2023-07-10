class fibsum
{
public static void main(String[]arg)
{
int i,sum=0,a=0,b=1,c=0,n=5;
for(i=1;i<=n;i++)
{
a=b;
b=c;
c=a+b;
sum=sum+c;
}
System.out.println(sum);
}
}