

//How to calculate power of a number using recursion?

public class example2 {

    public static void main(String[] args) {

        var val = powerOfNum(2, 2);
        System.out.println(val);

        
    }

    public static int powerOfNum(int base , int p){

        if(p<0){
            return -1;
        }

        if(p==0){
            return 1;        
        }

        return base * powerOfNum(base, p-1);
    }
    
}
