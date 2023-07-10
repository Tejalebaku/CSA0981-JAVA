import java.util.*;
class bankdetails
{
public static void main(String[]args)
{
Scanner input=new Scanner(System.in);
System.out.println("enter the bank name =");
String str=input.nextLine();//int n=input.nextInt();//float n=input.nextFloat
if(str.equals("sbi") || str.equals("SBI"))
{
double intrest=7.88;
System.out.println("rate of intrest ="+intrest);
}
else if(str.equals("hdfc") || str.equals("HDFC"))
{
double intrest=8.11;
System.out.println("rate of intrest ="+intrest);
}
else if(str.equals("axsis") || str.equals("AXSIS"))
{
double intrest=6.11;
System.out.println("rate of intrest ="+intrest);
}
else
{
System.out.println("invalid input");
}
}
}




