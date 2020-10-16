package Solutions;

import java.util.*;

public class Solution2 {
    public static int sortDesc(final int num) {
        String[] numbers = (Integer.toString(Integer.valueOf(num))).split("");
        Arrays.sort(numbers);

        String result = "";

        for(String s : numbers)
        {
            result = s + result;
        }

        return Integer.parseInt(result);
    }
}

