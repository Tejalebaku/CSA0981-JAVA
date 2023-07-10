class tax
{
public static void main(String[]args)
{
int income=800000;
float tax;
if(income<=150000)
{
System.out.println("no Tax");
}
else if(income>=150001 && income<=300000)
{
System.out.println("Tax ="+income*0.10);
}
else if(income>=300001 && income<=500000)
{
System.out.println("Tax ="+income*0.20);
}
else if(income>=500001)
{
System.out.println("Tax ="+income*0.30);
}
else
{
System.out.println("invalid");
}
}
}


