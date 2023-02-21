import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class moveallZeroinend2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int count=0;
        List<Integer> list=new ArrayList<>();
        for(Integer data:a){
            if(data!=0) {
                list.add(data);
            }
            else {
                count++;
            }
        }
        for(int i=0;i<count;i++){
            list.add(0);
        }
        Integer array[]=list.toArray(new Integer[list.size()]);
        for(Integer data:array){
            System.out.print(data+" ");
        }

    }
}
