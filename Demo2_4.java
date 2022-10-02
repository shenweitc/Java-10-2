package code;
/*
打印输出所有和为1000的连续整数（eg。198，199，200，201，202是一组满足条件的数据），
每组满足条件的数据在一行输出。
 */
public class Demo2_4 {
    public static void main(String[] args) {
        int j=0;
        int sum=0;
        for (int i = 0; i <= 1000; i++) {
            sum+=i;
            while (sum>1000)
                sum-=j++;
            if(sum==1000) {
                for (int k = j; k <= i; k++) {
                    System.out.print(k);
                    System.out.print(",");
                }
                System.out.println();
            }
        }
    }
}
