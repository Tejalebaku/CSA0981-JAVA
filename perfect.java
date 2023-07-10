class perfectnum
{
public static void main(String[]arg)
{
int n=6;
int i,sum=0;
for(i=1;i<n;i++)
{
if(n%i==0)
{
sum=sum+i;
}
}
if(sum==n)
{
System.out.ptintln("perfect no.");
}
else
{
System.out.println("notperfect no.");
}
}
}

