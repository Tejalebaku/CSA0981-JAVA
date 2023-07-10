class fib
{
public static void main(String[]arg)
{
int a=0,b=1,c,i,n=10;
for(i=1;i<n;i++)
{
System.out.println(a);
c=a+b;
a=b;
b=c;
}
}
}


