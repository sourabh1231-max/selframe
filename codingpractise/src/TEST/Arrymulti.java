package TEST;

public class Arrymulti {

    public static void main(String[] args) {
        
    	int abc[][] = {{2, 4, 5}, {3, 2, 10}, {1, 2, 0}};


        int min = abc[0][0];
        int minColumn = 0;

        // Find the minimum element and its column index
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (abc[i][j] < min) {
                    min = abc[i][j];
                    minColumn = j;
                }
            }
        }

        // Find the maximum element in that minColumn
        int max = abc[0][minColumn];
        int k = 0;
        while (k < 3) {
            if (abc[k][minColumn] > max) {
                max = abc[k][minColumn];
            }
            k++;
        }

        System.out.println("Maximum element in the column containing the minimum value: " + max);
    }}
