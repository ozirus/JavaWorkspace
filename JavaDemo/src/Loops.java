
public class Loops {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j > 0; j--) {
				if(j == 2)
				{
					continue;
				}
				System.out.println("i:"+i+" j:"+j);
			}
		}
			
		}
	


}
