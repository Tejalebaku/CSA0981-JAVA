class avgposneg
{
public static void main(String[]args)
{
int arr[]={7,-2,9,-8,-6,-4,10,-1};
int i=0,j=0,n=0;
int possum=0,negsum=0;
int s1=0,s2=0;
while(n!=-1)
{
if(n==-1)
{
break;
}
if(n>0)
{
i++;
s1=s1+n;
}
else
{
j++;
s2=s2+n;
}
}
System.out.println(i);
System.out.println(j);
double pos=s1/i;
double neg=s2/j;
System.out.println("avg of pos is :"+pos);
System.out.println("avg of neg is:"+neg);
}
}
