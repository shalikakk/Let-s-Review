package let.s.review;

import java.util.Scanner;

/**
 *
 * @author Shalika
 */
public class LetSReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
      scan.nextLine();
        int lenth;
        for(int i=1;i<=n;i++){
            
            String input= scan.nextLine(); 
            
            char arr[] = input.toCharArray();
            lenth=input.length();
           for(int y=0;y<lenth;y=y+2){
                System.out.print(arr[y]);
            }
            System.out.print(" ");
           for(int y=1;y<lenth;y=y+2){
               System.out.print(arr[y]);
           }
            System.out.println();
        }
    }

}
