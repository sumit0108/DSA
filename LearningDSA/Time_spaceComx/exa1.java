package LearningDSA.Time_spaceComx;

public class exa1 {

    public static void main(String[] args) {
        
        int array [] = {1,4,6,3};

        exa1 main = new exa1();

        main.sum_prod(array);

    }
    
    public void sum_prod(int arr[]){
        
        int sum = 0 ;      // ---------------->O(1) complexity
        int prod = 1;      // ---------------->O(1) complexity

        for(int i = 0; i<arr.length; i++){      //---------------->O(n) complexity
            sum +=arr[i];
        }
        
        for(int i = 0; i<arr.length; i++){      //---------------->O(n) complexity
            prod *=arr[i];
        }

        System.out.println(sum +","+ prod);
    }
}

//If add all complexcity then the time&space Complexcity above program is--->>O(N)