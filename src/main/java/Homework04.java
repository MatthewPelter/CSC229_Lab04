public class Homework04 {
    // Question 1
    static void printHello(int num) {
        if (num == 0)
            System.out.println("Done!");
        else {
            System.out.println("Hello World");
            printHello(num-1);
        }
    }
    
    // Question 2
    static int sumOfNums(int n1, int n2) {
        if (n2 != n1) {
            if (n2 % 7 == 0) {
                return n2 + sumOfNums(n1, n2-1);
            } else {
                return sumOfNums(n1, n2-1);
            }
        } else {
            if (n2 % 7 == 0) {
                return n2;
            }
            return 0;
        }
    }
    
    // Question 3
    static int binarySearch(int[] arr, int lower, int upper, int findMe) {

        if (upper < lower)
        {
            return -1;
        }
            
        int mid = (lower + upper) / 2;

        if (arr[mid] == findMe) {
            return mid;
        }

        if (findMe > arr[mid]) {
            return binarySearch(arr, mid + 1, upper, findMe);
        }
        if (findMe < arr[mid]) {
            return binarySearch(arr, lower, mid - 1, findMe);    
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        // Question 1
        printHello(5);
        
        // Question 2
        System.out.println(sumOfNums(5, 14));
        
        // Question 3
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int size = arr.length - 1;
        int findMe = 10;
        
        System.out.println(binarySearch(arr, 0, size, findMe));
    }
}
