//How to find the sum of the digits of a positive integer number using recursion


public class example1 {

    public static void main(String[] args) {

        example1 m = new example1(); // if Not using static keyword in  sumOfDigits() method then we have 
                                        // to crate reference of that class and then call the method

        int sum = m.sumOfDigits(-546);
        System.out.println(sum);
       
    }
    
    public int sumOfDigits(int n){

        if(n == 0 || n < 0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
}
