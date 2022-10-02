package code;
/*
一个三位数的个位、十位和百位的立方和是该数据本身，则称该数是水仙花数
编程输出所有的水仙花数。
 */
public class Demo2_2 {
    public static void main(String[] args) {
        int a,b,c;
        for (int i = 100; i < 1000; i++) {
            a=i%10;
            b=i/10%10;
            c=i/100%10;
            if(i==Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)){
                System.out.print(i+" ");
            }
        }
    }
}
