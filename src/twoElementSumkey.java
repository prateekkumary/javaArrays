import java.util.Scanner;

public class twoElementSumkey {
    static boolean chkPair(int a[],int n,int k){
        for(int i=0;i<(n-1);i++){
            for(int j=(i+1);j<n;j++){
                if(a[i]+a[j]==k){
                    System.out.println(a[i]+","+a[j]);

                    return true;

                }

            }
        }
        return false;

    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int k=sc.nextInt();
//        int[]a=new int[n];
//        for(int i=0;i<n;i++){
//            a[i]=sc.nextInt();
//        }
        int a[]={1, 2, 3, 4, 5, 6};
                int n=a.length;
        int k=11;

        if(chkPair(a,n,k)){
            System.out.println("Valid pair exist");

        }
        else{
            System.out.println("valid pair not exist");
        }
    }
}
//class GFG{
//
//    // Function to find and print pair
//    static boolean chkPair(int A[], int size, int x) {
//        for (int i = 0; i < (size - 1); i++) {
//            for (int j = (i + 1); j < size; j++) {
//                if (A[i] + A[j] == x) {
//                    System.out.println("Pair with a given sum " + x +
//                            " is (" + A[i] + ", " + A[j] + ")");
//
//                    return true;
//                }
//            }
//        }
//
//        return false;
//    }
//
//    public static void main(String [] args) {
//
//        int A[] = {0, -1, 2, -3, 1};
//        int x = -2;
//        int size = A.length;
//
//        if (chkPair(A, size, x)) {
//            System.out.println("Valid pair exists");
//        }
//        else {
//            System.out.println("No valid pair exists for " + x );
//        }
//    }
//}

// This code is contributed by umadevi9616