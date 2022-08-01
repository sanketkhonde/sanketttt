package logicProgram;

public class logic {
	public static void main(String[] args) {
for (int i=1;i<=5;i++)
{
	for (int j=0;j<=3;j++)
	{
		if((i==2&&j==2)||(j==3&&i==2)||(j==2&&i==4)||(i==4&&j==1)||(j==0&&i==4)||(i==2&&j==1)) 
		{
			System.out.print(" ");
			
		}
		else 
		{
			System.out.print("O");
		
	
	}
	for(int k=1;k<=8;k++) 
	{
		if((k==5&&i==1)||(k==4&&i==2)||(k==3&&i==3)||(k==2&&i==4)||(k==2&&i==5)
			||	(k==6&&i==2)||(k==7&&i==3)||(k==8&&i==4)||(k==8&&i==5)||(k==4&&i==3)||(k==5&&i==3)||(k==6&&i==3)	)
		{
			System.out.print("O");
		}
		else
		{
			System.out.print(" ");
		}
		
	}
	for(int l=1;l<=6;l++)
	{
	if((l==2&&i==1)||(l==2&&i==2)||(l==2&&i==3)||(l==2&&i==4)||(l==2&&i==5)||
			(l==6&&i==1)||(l==6&&i==2)||(l==6&&i==3)||(l==6&&i==4)||(l==6&&i==5)||
			(l==3&&i==2)||(l==4&&i==3)||(l==5&&i==4))
	{
		System.out.print("O");
	}
	else 
	{
		System.out.print(" ");
	}
		
	}
	for(int m=1;m<=6;m++)
	{
	if((m==2&&i==1)||(m==2&&i==2)||(m==2&&i==3)||(m==2&&i==4)||(m==2&&i==5)||
		(m==6&&i==1)||(m==5&&i==1)||(m==4&&i==2)||(m==3&&i==3)||
		(m==6&&i==5)||(m==5&&i==5)||(m==4&&i==4)||(m==3&&i==3)
			)
	{
		System.out.print("O");
	}
	else
	{
		System.out.print(" ");
	}
	}
	for(int n=1;n<=5;n++) 
	{
		if((n==2&&i==1)||(n==2&&i==2)||(n==2&&i==3)||(n==2&&i==4)||(n==2&&i==5)||
				(n==2&&i==1)||(n==3&&i==1)||(n==4&&i==1)||(n==5&&i==1)||
				(n==2&&i==3)||(n==3&&i==3)||(n==4&&i==3)||(n==5&&i==3)	||
				(n==2&&i==5)||(n==3&&i==5)||(n==4&&i==5)||(n==5&&i==5))
		{
		System.out.print("O");	
		}
		else 
		{
			System.out.print(" ");
		}}
	for(int o=1;o<=6;o++)
	{
		if((o==2&&i==1)||(o==3&&i==1)||(o==4&&i==1)||(o==5&&i==1)||(o==6&&i==1)||
				(o==4&&i==1)||(o==4&&i==2)||(o==4&&i==3)||(o==4&&i==4)||(o==4&&i==5)) 
		{
			System.out.print("O");
		}	
		else
		{
			System.out.print(" ");
		}
			
	}
		
	

	System.out.println();
	
	
	
	
}
	






}

	
for (int k=1;k<=4;k++) {
	
	
	for(int j=1;j<=k;j++) {
		
		System.out.print(" "+(char)(j+64));
	}
	System.out.println();
}
}}




	


