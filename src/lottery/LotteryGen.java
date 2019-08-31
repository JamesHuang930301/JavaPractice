package lottery;

import java.util.*;

public class LotteryGen {
    private static final int TOTAL_COUNT = 7;
    private static final int MAX_RED_VALUE = 33;
    private static final int MAX_BLUE_VALUE = 16;

    public static List<int[]> randomLottery(int count) {
        List<int[]> resultList = new ArrayList<>();
        if (count > 0) {
            for (int i = 0; i < count; i++) {           //共投注count注
                int[] balls = new int[TOTAL_COUNT];
                for (int j = 0; j < TOTAL_COUNT - 1; j++) {//组成随机一注
                    Random redRd = new Random();
                    int redNum = redRd.nextInt(MAX_RED_VALUE) + 1;
                    balls[j] = redNum;
                }
                Random blueRd = new Random();
                int blueNum = blueRd.nextInt(MAX_BLUE_VALUE) + 1;
                balls[TOTAL_COUNT - 1] = blueNum;

                resultList.add(balls);
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入投注数量：");
        int count = scanner.nextInt();
        if (count <= 0) {
            System.out.print("投注数量不能为0或负数！");
            return;
        }
        List<int[]> resultList = randomLottery(count);
        System.out.println("================================");
        if (resultList.size() > 0) {
            for (int i = 0; i < resultList.size(); i++) {
                int[] result = resultList.get(i);
                int[] redBalls = new int[result.length - 1];
                int blueBall = 0;
                if (result.length - 1 > 0) {
                    for (int j = 0; j < result.length - 1; j++) {//红球为数组0-5位
                        redBalls[j] = result[j];//提取红球
                    }
                    blueBall = result[result.length - 1];//提取蓝球，蓝球为数组最后一位
                }
                Arrays.sort(redBalls);//为红球排序

                System.out.print("红球：");
                for (int k = 0; k < redBalls.length; k++) {
                    if (String.valueOf(redBalls[k]).length() == 2) {
                        System.out.print(redBalls[k] + " ");
                    } else {
                        System.out.print(redBalls[k] + "  ");
                    }
                }
                System.out.print("蓝球：" + blueBall + "\n");
            }
        }
        System.out.println("================================");
    }
}
