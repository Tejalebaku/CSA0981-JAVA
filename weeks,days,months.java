
class wyd
{
public static void main(String[]args)
{

int num=input.nextInt();
int years=num/365;
System.out.println("years ="+years);
int weeks=(num%365)/7;
System.out.println("weeks ="+weeks);
int days=(num%365)%7;
System.out.println("days ="+days);
}
}
