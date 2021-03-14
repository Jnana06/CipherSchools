package que1;
import java.util.*;
import java.lang.String;
public class grocery {
public static void main(String[] args)
{
    String name;
	int price,budget,op;
	float quantity;
	int ii=0,jj=0,kk=0,index = 0,count=0;
	
    String[] names = new String[20];
	 float[] qt = new float[20];
	 int[] pp = new int[20];
	 System.out.print("Enter your budget:");
	Scanner sc=new Scanner(System.in);
	budget=sc.nextInt();
	while(true)
	{
	System.out.println("1.ADD AN ITEM\n2.EXIT");
	System.out.print("ENTER THE CHOICE:");
	op=sc.nextInt();
if(op==1) {
			System.out.print("Enter the product:");
			name=sc.next();
			
			System.out.print("Enter the quantity:");
			quantity=sc.nextFloat();
			System.out.print("Enter the price:");
			price=sc.nextInt();
			if(price>budget)
			{
				System.out.println("Can't Buy the product because budget left is "+budget);
			}
			else
			{int flag=0;
				
			for (int i=0;i<count;i++) {
			    if (names[i].equals(name)) {
			        index = i;flag=1;
			        break;
			        
				}
			}
				if(flag==1)
				{
					int temp=pp[index];
					pp[index]=price;
					qt[index]=quantity;	
					budget=budget+temp;
					budget=budget-price;
				}
				else
				{
					names[ii++]=name;
					pp[jj++]=price;
					qt[kk++]=quantity;
					budget=budget-price;
					count++;
				}
			}
			System.out.println("Amount left: "+budget);
	}

else if(op==2)
{
	break;
}
else
{
	System.out.println("Enter valid operation");
}
	}
	
 if(budget>0)
	{
		for(int i=0;i<count;i++)
		{
			if(budget>=pp[i])
			{
				System.out.println("Amount left can buy you "+names[i]);
				break;
			}
		}
	}
		
		System.out.println("GROCERY LIST is:");
		System.out.println("NAME          QUANTITY       PRICE");
		for(int i=0;i<count;i++)
		{
			System.out.print(names[i]);
			int sp=14-names[i].length();
			while(sp>0)
			{
				System.out.print(" ");
				sp--;
			}
			System.out.print(qt[i]+"KG           "+pp[i]);
			System.out.print("\n");
			
		}
	}
}




			
			
			
			
	
	


