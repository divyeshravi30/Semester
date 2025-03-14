public class Fibonacci
{
public static void main (String []args)
{
int n = 10;
int a=0;
int b=1;
System.out.print("The Fibonacci Series of the number till " +n+ " are :");
for (int i = 1; i <= n; ++i) 
{
int c = a+b;
a=b;
b=c;
System.out.print(+a+ " ");
}
}
}



