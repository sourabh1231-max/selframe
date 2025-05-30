package TEST;

public class Fibonaaciseries2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=0,j=1;
        int n=20;
        
        for(int k=0;k<=n;k++) {
        	
        	System.out.print(i+" ");
        	int nxt= i+j;
        	i=j;
        	j=nxt;
        	
        }
		
		
		
	}

}



