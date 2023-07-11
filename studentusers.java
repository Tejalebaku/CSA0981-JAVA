import java.util.*;
class su
{
public static void main(String[]args)
{
Scanner input=new Scanner(System.in);
System.out.println("enter total users :");
int total_users=input.nextInt();
System.out.println("enter staff users :");
int staff_users=input.nextInt();
int non_tech=staff_users/3;
int student_users=total_users-(staff_users+non_tech);
System.out.println(" studentusers :"+student_users);
}
}
