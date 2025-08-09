class FourLargest 
{
	public static void main(String[] args) 
	{
		int a=20,b=100,c=30,d=40;
		if(a>b)
		{
		  if(a>c)
			{
			 if(a>d)
				{
				 System.out.println(a+" a is largest");
				}
			else
				{
				  System.out.println(d+" d is largest");
				}
			}
			else
			{
			  if(c>d)
				{
				  System.out.println(c+" c is largest"); 
				}
			   else
				{
				  System.out.println(d+" d is largest");  
				}
			}
		}
			else
			{
			  if(b>c)
				{
				 if(b>d)
					{
					   System.out.println(b +" b is largest");
					}
				  else
					{
					  System.out.println(d +" d is  largest"); 
					}
					 
				}
				else
				{
				  if(c>d)
					{
					  System.out.println(c +" c is largest"); 
					}
					else
					{
					  System.out.println(d +" d  is largest");	
					}
				}
			}
		
	}
}
