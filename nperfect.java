class nper
{
public static void main(String[]args)
{
int sum=0,temp=0;
int n=3;
for(int i=2;i<=1000;i++)
{
if(n>temp)
{
sum=1;
}

for(int j=2;j<i;j++)
{
if(i%j==0)
{
sum=sum+j;
}
}
if(sum==i)
{
System.out.println(i+" ");
temp=temp+1;
}
}
}
}
