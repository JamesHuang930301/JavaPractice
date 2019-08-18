import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入首：");
        int a = scanner.nextInt();
        System.out.println("请输入末项：");
        int b = scanner.nextInt();
        String sum = Calculator.sum(a, b);
        System.out.println("求和结果：" + sum);
    }
}
