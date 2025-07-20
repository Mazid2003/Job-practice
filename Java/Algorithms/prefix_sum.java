public class prefix_sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefix = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
        // Sum from index 1 to 3
        System.out.println(prefix[4] - prefix[1]); // 9
    }
}