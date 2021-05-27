import java.util.Scanner;
class bank {
int accno;
String name;
int bal;
bank(String s1,int i, int j)
{
name=s1;
accno=i;
bal=j;
}
}
class bankinfo
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter name");
String nm=sc.nextLine();
System.out.println("Enter acc no");
int acnno=sc.nextInt();
System.out.println("Enter bal");
int balan=sc.nextInt();
bank obj=new bank(nm,acnno,balan);
int i=1,ch;
while(i==1)
{
System.out.println("Enter 0 to deposit and 1 to withdraw");
ch=sc.nextInt();
switch (ch)
{
case 0:
System.out.println("Enter amount to deposit");
int dep=sc.nextInt();
obj.bal=obj.bal+dep;
break;
case 1:
System.out.println("Enter amount to withdraw");
int with=sc.nextInt();
obj.bal=obj.bal-with;
break;
}
System.out.println("Updated info-");
System.out.println(obj.name);
System.out.println(obj.accno);
System.out.println(obj.bal);
System.out.println("Do you want to continue? Yes:1 No:0");
i=sc.nextInt();
}

}

}