public class linear {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 11};
        int target = 7;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index " + i);
                break;
            }
        }
    }
}