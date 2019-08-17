public class Calculator {
    public static String sum(int a, int b) {
        String result = null;
        try {
            if (a <= b) {
                result = "首项不可大于等于末项";
            }
            int sum = (a + b) * (b - a + 1) / 2;
            result = String.valueOf(sum);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return result;
    }
}
