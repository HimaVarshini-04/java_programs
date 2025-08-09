class Calc 
{
	public static void main(String[] args) 
	{
		int a=12,b=6;
		char operator='-';
		switch(operator)
		{
		   case '+': System.out.println(a+b);
		   break;
		   case '-': System.out.println(a-b);
		   break;
		   case '*': System.out.println(a*b);
		   break;
		   case '/': System.out.println(a/b);
		   break;
		   case '%': System.out.println(a%b);
		   break;
		   default:System.out.println("Invaild operator");
		}
	}
}
