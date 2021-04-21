public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("Mảng ban đầu:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int) (Math.random()*10 + 1);
            System.out.print(arr[i] + "  ");
        }
        bubberSort(arr);
        System.out.println("\nMảng sau khi sắp xếp:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    public static void bubberSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < list.length -i; j++) {
                if (list[j] > list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }
}
