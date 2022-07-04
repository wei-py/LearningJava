import static java.lang.Double.NEGATIVE_INFINITY;

public class CommandLine {

    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double result = NEGATIVE_INFINITY;
        for (double n: numbers) {
            result = Math.max(n, result);
        }

        System.out.println("The max value is " + result);
    }

    public static void main(String[] args) {
        // 调用可变参数的方法
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});
    }

}