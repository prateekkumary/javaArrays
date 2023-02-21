import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Acciolite {
    public static int weirdArray(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        int maxCount = 0;
        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            maxCount = Math.max(maxCount, count.get(num));
        }
        int weirdNumber = -1;
        for (int key : count.keySet()) {
            if (count.get(key) == maxCount) {
                weirdNumber = key;
                break;
            }
        }
        if (weirdNumber == -1) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int minSize = arr.length;
        int currentCount = 0;
        while (right < arr.length) {
            if (arr[right] == weirdNumber) {
                currentCount++;
            }
            while (currentCount > (right - left + 1) / 2) {
                if (arr[left] == weirdNumber) {
                    currentCount--;
                }
                left++;
            }
            minSize = Math.min(minSize, right - left + 1);
            right++;
        }
        return minSize;
    }

    public static void main(String[] args) {
//        System.out.println(weirdArray(new int[] {3, 3, 1, 3, 3}));  // Output: 2
//        System.out.println(weirdArray(new int[] {5}));  // Output: 0
//        System.out.println(weirdArray(new int[] {1,2,1,3,3,4,1,2}));
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(weirdArray(a));
    }
}
