import org.jetbrains.annotations.Contract;

public class Utils {
    public static boolean isBlank(String x){
        boolean result = true;
        if (null == x || x.length() <=0){
            result = false;
        }
        return result;
    }
}
