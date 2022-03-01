public class Lab04 {
    
    // Task 01
    static void countDown(int num) {
        if (num == 0)
            System.out.println("Blastoff!");
        else {
            System.out.println("...");
            countDown(num-1);
        } 
    }
    
    static void countDownEven(int num) {
        if (num == 0)
            System.out.println("Blastoff!");
        else {
            if (num % 2 == 0)
                System.out.println("...");
            
            countDownEven(num-1);
        }
    }
    
    // End task 01
    
    // Task 02
    
    static int gcd(int x, int y) {
        if (x % y == 0) //base case
            return y;
        else
            return gcd(y, x % y);
    }
    
    static int gcdSub(int x, int y) {
        if (x == y) //base case
            return x;
        if (x > y)
            return gcdSub(x - y, y);
        else
            return gcdSub(x, y - x);
    }
    
    // end task 02
    
    // Task 03
    int fib(int n) {
        if (n <= 0) // base case
            return 0;
        else if (n == 1) // base case
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }
    
    // The time complexity of this algorithm is O(2^n) because by following the recursion tree, we see that each level is 2 to some power. As the recursion progresses, we see that the steps increase by 2^n
    
    // end task 03
    
    public static void main(String[] args) {
        // Task 01
        countDown(5);
        // Outputs ... 10 times and then prints blastoff!!!
        countDownEven(5);
        // The time complexity of the countDown algorithm is O(n) because we are starting with n (num) and are counting down until num is 0.
        // End task 01
        
        // Task 02
        System.out.println(gcd(81, 72));
        // Outputs the greatest common denominator for x and y parameters. 
        System.out.println(gcdSub(81, 72));
        // End task 02

        
        
    }
}
