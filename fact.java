class fact
{
public static void main(String[]arg)
{
int n=-4;
int fact=1,i;
if (n>0)
{
for(i=1;i<=n;i++)
{
fact=fact*i;
}
}
if(n<0)
{
for(i=0;i<=n;i++)
{
fact=fact*i;
}
}
System.out.println(fact);
}
}

