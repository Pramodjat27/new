public class Pattern7 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) 
		{ char m='A';
			for (int j = 0; j < i-1; j++) 
			{
				System.out.print(" ");
			}
				for(int k=1; k<=n+1-i; k++)
				{
					System.out.print(m++);
				}
			System.out.println();
		}
	}
}/*
ABCDE
 ABCD
  ABC
   AB
    A
*/
