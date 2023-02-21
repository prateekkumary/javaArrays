import java.util.*;

public class int2 {
       public static int MissNumber(int[] a){

        //Scanner sc=new Scanner(System.in);
        int n=a.length+1;
       // int a[]=new int[n-1];
        int s=((n)*(n+1))/2;
        int s2=0;
        for(int i=0;i<n-1;i++)
           s2=s2+a[i];


        return s-s2;

    }
    public static void main(String[] args) {
    int []a={ 4,6,10,5,3,1,8,7,9};
    System.out.println(MissNumber(a));
    }

}
