//How to convert a number from Decimal to Binary using recursion

public class example4 {
 
    public static void main(String[] args) {
        
        System.out.println(DecimalToBinary(10));
    }

    public static int DecimalToBinary(int n){

        // if(n<0){
        //     return 0;
        // }
        if(n==0){
            return 0;
        }

        return n % 2 + 10 * DecimalToBinary(n/2);

    }
}
