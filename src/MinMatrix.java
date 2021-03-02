import java.util.Scanner;
public class MinMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rows");
        int rows = input.nextInt();
        System.out.println("Enter cols");
        int cols = input.nextInt();
        int min = 0;
        int[][] matrix = new int[rows][cols];
        for (int i =0; i<rows; i++) {
            System.out.printf("Enter row %d %n",i+1);
            for (int j=0; j<cols; j++) {
                System.out.printf("Enter number %d %n", j+1);
                matrix[i][j] = input.nextInt();
                if (i==0 && j==0) {
                    min = matrix[i][j];
                }
                if (min>matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("The matrix is:");
        for (int i=0; i<rows; i++) {
            for (int j =0; j<cols; j++) {
                System.out.printf("%3d",matrix[i][j]);
            }
            System.out.printf("%n");
        }
        System.out.printf("Min is: %d", min);
    }
}
