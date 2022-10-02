package code;

import java.util.Scanner;

/*
求a+aa+aaa+….+a…a(n个，n<=6)，a和n通过键盘输入，其中a为1~9之间的整数，
如a=3，n=4时，求3+33+333+3333的和。
 */
public class Demo2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入a和n（a取值1-9；n取值小于等于6）：");
        int a = sc.nextInt();
        int n = sc.nextInt();
        int ans = a;
        int sum = a;
        if (a >= 1 && a <= 9 && n <= 6) {
            for (int i = 0; i < n - 1; i++) {
                ans = ans * 10 + a;
                sum = sum + ans;
            }
            System.out.println(sum);
        } else {
            System.out.println("请重新输入！");
        }
    }
}
