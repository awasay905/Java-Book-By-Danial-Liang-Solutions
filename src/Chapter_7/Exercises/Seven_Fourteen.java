package Chapter_7.Exercises;

public class Seven_Fourteen {

    public static void main(String[] args) {
        System.out.println("GCD of 48 and 18 and 30 and 40 is " + gcd(48,18,30,40));
    }
    public static int gcd(int ...numbers){
        int previousGcd = gcd(numbers[0], numbers[1]);

        for (int i = 2; i < numbers.length; i++) {
            previousGcd = gcd(previousGcd, numbers[i]);
        }
        return previousGcd;
    }

    public static int gcd(int num1, int num2){
        if (num2 < num1){
            int temp = num2;
            num2 = num1;
            num1 = temp;
        }

        if (num1 == 0) return num2;

        return gcd(num1, num2%num1);
    }
}
