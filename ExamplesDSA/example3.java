
//How to find the GCD of any number

public class example3 {

    public static void main(String[] args) {

        var val = gcd(8, 12);
        System.out.println(val);

        
    }

    public static int gcd(int a, int b){
        if(a < 0 || b <0){
            return -1;
        }
        if(b==0){
            return a;
        }

        return gcd(b, a%b );
    }
}
