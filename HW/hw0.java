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

    /*
     * Exercise 2: find the maximum number of the given array m
     * assume all numbers are greater or equal than 0
     */
    public static int max(int[] m){
        int result = 0;
        for (int i = 0; i< m.length; i++){
            if (m[i] > result){
                result = m[i];
            }
        }
        return result;
    }   


    /*
     * Exercise 3: exercise 2 already satisfy the requirments
     */

    /*
    * Exercise 4: windowPosSum
    */
    public static void windowPosSum(int[] a, int n){
        for (int i = 0; i < a.length; i++){
            if (a[i] > 0){
                // calculate the subsum
                int subsum = 0;
                for (int j = 0; j <= n; j++){
                    if (i+j < a.length){
                        subsum += a[i+j];
                    }
                    else{
                        break;
                    }
                }
                // replace 
                a[i] = subsum;
            }
            else{
                continue;
            }
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.print("Please input a number n:");
        
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        drawTriangle(n);

        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));

        System.out.println("Exercise 4");
        int[] a = {1, 2, -3, 4, 5, 4};
        n = 3;
        windowPosSum(a, n);
        for (int i = 0; i < a.length; i++ ){
            System.out.println(a[i]);
        }
    }
}