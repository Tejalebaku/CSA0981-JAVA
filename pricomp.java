class pricomp
{
public static void main(String[]arg)
{
int arr[]={4,54,29,71,7,59,98,23};
int com=0;
int pri=0;
for(int i=0;i<arr.length;i++)
{
int c=0;
for(int j=1;j<arr[i];j++)
{
if(arr[i]%j==0)
{
c++;
}
if(c>1)
{
com++;
}
else
{
pri++;
}
}
}
System.out.println("composite num are :"+com);
System.out.println("\nprime num are :"+pri);
System.out.println("\ncount of num are :"+c);

}
}
