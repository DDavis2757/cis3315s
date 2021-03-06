package week2;



/**
 *
 * @author ddavi
 */
public class C7N12 {
     public static int[] reverse(int[] list) {
        int left = 0;
        int right = list.length - 1;
        while (left < right) {
            int temp = list[left];
            list[left] = list[right];
            list[right] = temp;
            left++;
            right--;
        }
        return list;
    }

    public static void display(int[] list) {
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        display(nums);
        reverse(nums);
        display(nums);
    }
}
