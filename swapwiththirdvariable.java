public class swapwiththirdvariable {
    public static void main(String[] args) {
        // Initialize two variables with values
        int first = 10;
        int second = 20;

        // Display values before swapping
        System.out.println("Before swapping: First = " + first + ", Second = " + second);

        // Swap using a third variable
        int temp = first;
        first = second;
        second = temp;

        // Display values after swapping
        System.out.println("After swapping: First = " + first + ", Second = " + second);
    }
}

