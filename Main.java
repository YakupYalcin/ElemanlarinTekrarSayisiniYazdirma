import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        boolean[] visited = new boolean[arr.length];

        System.out.println("Dizi : "+""+Arrays.toString(arr));
        System.out.println("Tekrar Sayıları");

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }


            System.out.println(arr[i]+ " " +"Sayısı"+" "+count +" "+ "kere tekrar edildi.");
        }
    }
}
