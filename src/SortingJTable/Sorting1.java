package SortingJTable;

public class Sorting1 {
    public static int[] getascen(String text, int jumlah){
        int n, i, j, temp;
        n = jumlah;
        int array[] = new int[n];
        String[] pnj = text.split(",");
        int a = 0;
        for (String s : pnj){
            array[a] = Integer.parseInt(s.trim());
            a++;
        }
        for (i = 0; i < ( n - 1 ); i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] getdescen(String text, int amount){
        int num, i, j, temp;
        num = amount;
        int arr[] = new int[num];
        String[] stmp = text.split(",");
        int a = 0;
        for (String s : stmp){
            arr[a] = Integer.parseInt(s.trim());
            a++;
        }
        for (i = 0; i < ( num - 1 ); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (arr[j] < arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
