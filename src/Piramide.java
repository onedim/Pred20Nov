
public class Piramide {

	/**  Ispisuje piramidu
	 * 1
	 * 12
	 * 123
	 * 1234
	 * ......
	 * 123.......n
	 * n - prirodan broj
	 */
	
	/**public static void piramida1 (int n){
		for (int i = 1; i<=n; i++){
			for (int j = 1; j <=i; j++ )	{
		    System.out.printf("%-3d", j);
			}
			System.out.println();
		}
	}
	*/
	/**za n ispisuje
	 * 						1
	 * 					1	2
	 * 				1	2	3
	 * 
	 */
	public static void piramida2 (int h) {
		for (int index2 = 1; index2<=h; index2++) {
		for (int index1 = 1; index1<=h-index2; index1++){
			 System.out.printf("% 3s" , " ");
			   	for (int index3 = 1; index3 <=index2; index3++ )	{
			    System.out.printf("% 3d" , index3);
			    		}
			System.out.println();
		}
	}
	}	
		
	public static void main(String[] args) {
		piramida2(6);
	}
}
