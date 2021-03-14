package que1;

public class que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int i,j,k=1;
		for(i=0;i<n;i++)
		{
			while(k<n-i)
			{
				System.out.print(" ");
				k++;
			}
			for(j=0;j<i+1;j++)
			{
				System.out.print("* ");
			}
			k=1;
			System.out.print("\n");
		}
			}

}
