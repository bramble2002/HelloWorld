package com.iweb.test;

/**
 * @author Wzh
 * @date 2023/11/3 20:26
 */
public class Test {
    //参数传递的区别 在java中 方法的参数进行传递的时候
    //基本数据类型和String做的是值传递
    //引用数据类型进行参数传递的时候 做的是内存地址传递(引用传递)
    public void change(int[] arr,int number,String str){
        arr[0] = 4;
        int[] arr1 = {5,6,7};
        arr = arr1;
        number = 10;
        str = "zyn likes tea";
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String str = "lyh likes java";
        int number = 1;
        Test t = new Test();
        t.change(arr,number,str);
        System.out.println(arr[0]);
        System.out.println(arr);
        System.out.println(str);
        System.out.println(number);
        //stackOverFlow
        
    }
}
