import java.util.Scanner;

public class addmatrices {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number rows of matrix: ");
        int row = keyboard.nextInt();
        System.out.print("Enter number columns of matrix: ");
        int col = keyboard.nextInt();
        int mt1[][] = new int[row][col];
        int mt2[][] = new int[row][col];

        System.out.println("Enter first matrix:");
        for( int i = 0; i < row; i++){
            for( int j = 0; j < col; j++){
                mt1[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("Enter second matrix:");
        for( int i = 0; i < row; i++){
            for( int j = 0; j < col; j++){
                mt2[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("Sum of two matrices:");
        for( int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print((mt1[i][j] + mt2[i][j]) + " ");
            }
            System.out.println();
        }
        keyboard.close();
    }
}
