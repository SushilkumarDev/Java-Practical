
// Problem Statement
// Now, you are aware with the concept of array. It's time to write a program that will sort the elements of the array in ascending order.

class SortedArray {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void sortArray(int[] array) {
        int temporary = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
        System.out.println("Elements of array sorted in ascending order: ");
        printArray(array);
    }

    public static void main(String[] args) {
        int[] array = new int[] { -5, -9, 8, 12, 1, 3, 0, -23};
        printArray(array);
        sortArray(array);
    }
}
