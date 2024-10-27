import java.util.Scanner;

public class HollowSquare{
    public static void main(String[] args) {
        //Creating the object of scanner to take user input (rows)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        //taking number of rows from user
        int rows = sc.nextInt();

        //outer loop for holding rows
        for(int i=1;i<=rows;i++){
            //inner loop for handling columns
            for(int j=1;j<=rows;j++){
                if(i==1||i==rows||j==1||j==rows){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}