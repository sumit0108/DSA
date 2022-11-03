public class fabnaSer {

    public static void main(String[] args) {
        
        int a = 0;
        int b = 1;

        System.out.print(a+" ");
        System.out.print(b +" ");
        int n = 9;
        fabnaser(a,b,n-2);
        
    }

    public static void fabnaser(int a, int b, int n){

        if(n==0){
            return;
        }
        int c= a+b;
        System.out.print(c +" ");
        fabnaser(b, c, n-1);

    }
    
}
