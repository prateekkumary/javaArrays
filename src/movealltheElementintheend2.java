import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class movealltheElementintheend2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        List<Integer>allNumber=new ArrayList<>();
        List<Integer>negativeNumber=new ArrayList<>();
        for(Integer data:a){
            if(data>0){
                allNumber.add(data);
            }
            else {
                negativeNumber.add(data);
            }
        }
        allNumber.addAll(negativeNumber);

            System.out.println(allNumber);

    }
}
