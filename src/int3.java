import java.util.Scanner;

public class int3 {
    public static void main(String[] args) {
        int n=5;
        int count =0;

        for(int i=2;count<=n;i++){
           int c=0;
           for(int j=1;j<=i;j++){
               if(i%j==0)
                   c++;
           }
            if(c==2) {
                System.out.print(i + " ");
                count++;
            }


        }

    }
}
