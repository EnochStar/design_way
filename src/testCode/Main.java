package testCode;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Package:testCode
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class Main {
    public static final String DEFAULT_DATE_TIME_FORMAT_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH,2);
        c.set(Calendar.DATE,1);
        c.roll(Calendar.DATE,-1);
        SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_DATE_TIME_FORMAT_PATTERN);
        String ans = sdf.format(c.getTime());
        System.out.println(ans);
    }
}
