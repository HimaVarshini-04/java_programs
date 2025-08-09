class Triangle 
{
	public static void main(String[] args) 
	{
		int a=10,b=10,c=0;
		if(a==b && a==c && b==c)
		{
			System.out.println("Equilateral Triangle");	
		}
		else if(a==b || b==c || a==c)
		{
			System.out.println("Isoseles Triangle");
		}
		else
		{
			System.out.println("Scalean Triangle");
		}
	}
}
