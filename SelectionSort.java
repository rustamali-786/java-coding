public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {5,-2,6,7,2,8,7,2};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min = Integer.MAX_VALUE;
            int index = -1;
            for (int j = i; j < n; j++) {
                if(arr[j] < min){
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index]= temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
