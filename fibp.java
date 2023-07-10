class fibp
{
public static void main(String[]arg)
{
int a=0,b=1,c=0;
int n=5;
for(int i=0;i<=n;i++)
{
System.out.println(a);
c=a+b;
a=b;
b=c;
}
}
}