import java.util.Scanner;
class pattern
{
public static void main(String []args)
{
Scanner scan=new Scanner(System.in);
int n,i,j,k;
System.out.println("Enter the value of n:");
n=scan.nextInt();
for(i=0;i<n;i++)                        //code for P
{
for(j=0;j<n;j++)
{
if((i>0 && i<(n-1)/2 && j==n-1) || j==0 || (i==0 && j<(n-1)) || (i==(n-1)/2 && j<(n-1)))
System.out.print("* ");
else
System.out.print("  ");
}
System.out.print(" ");  
for(j=0;j<n;j++)
{
if((i==0 && j>0) || (i==n-1 && j>0) || (j==0 && i>0 && i<n-1))
System.out.print("* ");
else
System.out.print("  ");
}
System.out.println();                        //last line shoul be ln(next line) for control to go to next row
}
}
}
