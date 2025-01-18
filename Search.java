import java.util.Arrays;
public class Search {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static  int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        if(e == 0) return arr[0];
        while(e >= s){
            int m = s + (e-s)/2;
            if(arr[m] > arr[m+1]) e = m - 1;
            if(arr[m] < arr[m+1]) s = m + 1;
        }
        return s;
    }
}






























