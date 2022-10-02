package code;

import java.util.Scanner;

public class Demo2_5 {
    public static void main(String[] args) {
        /*
       输出一个整数数组中最大和最小的元素、平均值以及所有元素的和
         */
        //1.定义数组长度，从键盘录入元素
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int length=sc.nextInt();
        int[] arr=new int[length];
        System.out.println("请输入数组元素：");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        //2.遍历数组，得到最大值
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        //3.遍历数组，得到最小值
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<=min){
                min=arr[i];
            }
        }
        //4.求和，平均数
        int sum=0;
        int avg=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        avg=sum/arr.length;
        //5.打印结果
        System.out.println("最大值是："+max);
        System.out.println("最小值是："+min);
        System.out.println("求和是："+sum);
        System.out.println("平均数是："+avg);
    }
}
