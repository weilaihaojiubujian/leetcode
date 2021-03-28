package 排列序列_60;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 16:47 2021/3/28
 */
public class Solution {
    public String getPermutation(int n, int k) {

        StringBuffer s = new StringBuffer();

        List<Integer> m = new ArrayList<>();
//        Map<Integer, Integer> m=new HashMap<>();
        for (int i = 1; i <= n; i++) {
            m.add(i);
        }
        int sum = 1;
        for (int i = 1; i < n; i++) {
            sum = sum * i;
        }
        if (n == 1) {
            return String.valueOf(1);
        }
        int x = 0;
        int y = 0;
        x = k % sum;
        y = k / sum;
        if (x != 0) {
            y++;

        }
        s.append(y);
        m.remove(y - 1);
        if (y != 0 && x == 0) {

            for (int i = m.size() - 1; i >= 0; i--) {
                s.append(m.get(i));
            }
            return String.valueOf(s);
        }
        int q = n - 1;
        while (q > 0) {
            sum = sum / q;
            y = x / sum;
            x = x % sum;

            if (x != 0) {
                y++;
            }
            if (x == 0 && y == 0) {
                s.append(m.get(y));
                m.remove(y);
            } else if (y != 0 && x == 0) {
                s.append(m.get(y - 1));
                m.remove(y - 1);
                for (int i = m.size() - 1; i >= 0; i--) {
                    s.append(m.get(i));
                }
                break;
            } else {
                s.append(m.get(y - 1));
                m.remove(y - 1);
            }


            q--;
        }
        return String.valueOf(s);
    }
}