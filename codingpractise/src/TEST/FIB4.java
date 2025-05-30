package TEST;

public class FIB4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first=0,second=1;
		
		int n=20;
		for(int i=0;i<=20;i++) {
			
				System.out.print(" "+first);
				
			int nxt=first+second;
			first=second;
			second=nxt;
			
		}
		
		
	}

}
