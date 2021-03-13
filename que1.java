package que1;
import java.util.*;
public class que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
int i,j,asc=65,k=1,temp;
for(i=0;i<n;i++)
{
	while(k<n-i)
	{
		System.out.print("  ");
		k++;
	}
	for(j=0;j<i+1;j++)
	{
		temp=asc;
		char ele=(char)temp;
		System.out.print(ele+" ");
		asc++;
	}
	k=1;
	System.out.print("\n");
}
	}

}
