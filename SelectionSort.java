public class SelectionSort {
    public static void sort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int temp = i;
            System.out.println("the value of temp is" + i);
            for (int j = i + 1; j < a.length; j++) {
                if (a[temp] > a[j]) {
                    temp = j;
                }

            }
            int smallNumber = a[temp];
            a[temp] = a[i];
            a[i] = smallNumber;

        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 8, 9, 6, 8, 5, 2, 1, 6, 9, 3, 1 };
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}