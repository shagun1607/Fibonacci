import java.util.Scanner;
public class fibonacci
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number of terms you want to print ");
		int num=s.nextInt();
		int a=0, b=1, c;
		System.out.print(a+" "+b);
		for(int i=1;i<=num;i++)
		{	c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}
