public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[15];
        System.out.println("Mảng ban đầu:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int) (Math.random()*10 + 1);
            System.out.print(arr[i] + "  ");
        }
        selectSort(arr);
        System.out.println("\nMảng sau khi sắp xếp:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    public static void selectSort(int[] list) {
        for (int i = 0; i < list.length-1; i++) {
            int minId = i;
            for (int j = i+1; j < list.length; j++) {
                if (list[j] < list[minId]) {
                    minId = j;
                }
            }
            if (minId != i);
            int temp = list[i];
            list[i] = list[minId];
            list[minId] = temp;
        }
    }
}
