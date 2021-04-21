public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[15];
        System.out.println("Mảng ban đầu:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int) (Math.random()*10 + 1);
            System.out.print(arr[i] + "  ");
        }
        insertSort(arr);
        System.out.println("\nMảng sau khi sắp xếp:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    public static void insertSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i-1;
            for (;j >= 0 && list[j] > key;) {
                list[j + 1] = list[j];
                j--;
            }
            list[j+1] = key;
        }
    }
}
