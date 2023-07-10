class mandn
{
public static void main(String[]arg)
{
int arr[]={14,16,87,36,25,89,34};
int temp,i,j;
int len=arr.length;
for(i=0;i<len;i++)
{
for(j=i+1;j<len;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
int m=1;
int n=3;
int max=arr[len-m];
int min=arr[n-1];
System.out.println(m+" max num= "+max);
System.out.println("\n"+n+" min num= "+min);
int sum=min+max;
int Diff=max-min;
System.out.println("\n sum = "+sum);
System.out.println("\n Diff = "+Diff);
}
}
