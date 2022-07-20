import java.util.Scanner;

/** CS61B HW0
 *  Description: https://sp18.datastructur.es/materials/hw/hw0/hw0
 */
public class hw0{
    /** 1. Print a triangle */
    public static void triangle(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++){
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }

    /**
     * Exercise 1b: draw triangle with given parameters
     * @param n: #lines of the triangle
     */
    public static void drawTriangle(int n){
        for (int i = 1; i <= n; i++ ){
            for (int j = 1; j <= i ; j++){
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.print("Please input a number n:");
        
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        drawTriangle(n);
    }
}