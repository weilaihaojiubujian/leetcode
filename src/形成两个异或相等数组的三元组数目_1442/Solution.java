package 形成两个异或相等数组的三元组数目_1442;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 21:58 2021/5/18
 */
public class Solution {

    public int countTriplets(int[] arr) {
       int a[]=new int[arr.length+1];
       for(int i=0;i<arr.length;i++){
           a[i+1]=a[i]^arr[i];
       }
       int sum=0;
       for(int i=0;i<arr.length;i++){
           for(int k=i+1;k<arr.length;k++){
               if(a[i]==a[k+1]){
                   sum+=k-i;
               }
           }
       }
       return sum;
    }
}
