package 剑指Offer_64;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 22:16 2021/5/19
 */
public class Solution {

    public int sumNums(int n) {
        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
