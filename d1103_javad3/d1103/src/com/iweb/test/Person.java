package com.iweb.test;

/**
 * @author Wzh
 * @date 2023/11/3 19:47
 */
public class Person {
    String name;
    int age;
    char gender;
    boolean marry;
    double height;
    //void代表方法没有返回值 ()可以定义方法所需要的参数
    //方法和成员变量都是属于类的 需要定义在class所包裹的大括号中
    //java中 方法的参数的数量 顺序 和类型不同 方法名可以相同
    public void eat(){
        //this 在方法中使用this this代表的是当前对象
        //this.name 表示访问当前对象的成员变量的name属性
        //如果访问的属性的名称在方法中唯一 可以省略this
        System.out.println(name+"吃!");
    }
    public void eat(String food){
        System.out.println(name+"吃了"+food);
    }
    public void eat(int number,String food){
        System.out.println(name+"吃了"+number+"份"+food);
    }
    public void eat(String food,int number){
        System.out.println(name+"开心地吃了"+number+"份"+food);
    }
    public void display(){
        System.out.printf("人名为%s,年龄为%d,性别为%c,婚姻状况为%s,身高为%f",
                name,age,gender,marry?"已婚":"未婚",height);
    }
    public void drink(String thing){
        System.out.printf("%s喝了%s%n",name,thing);
        if("崂山圣水".equals(thing)){
            System.out.println(name+"倒下了");
            //如果在没有返回值的方法中使用return 方法并不会返回任何结果 而是直接种植方法的调用
            return;
        }
        System.out.println(name+"喝了"+thing+",感觉不渴了");
    }
    public String learn(String knowledge){
        if(knowledge.equals("java")){
            return "Hello World";
        }else{
            return "学会个**";
        }
    }



    public static void main(String[] args) {
        Person p = new Person();
        p.name = "向日葵";
        p.age = 22;
        p.gender = '男';
        p.marry = true;
        p.height = 160;
//        p.eat();
//        p.drink("崂山圣水");
//        p.display();
//        String learnResult = p.learn("java");
//        System.out.println(learnResult);
//
  /**调用方法的时候 根据调用时提供的参数不同 调用不同的方法
    *这个现象叫做方法重载(编译时多态)
    *方法的不同调用在代码编译的时候就已经确定了
    */
        p.eat();
        p.eat("汉堡");
        p.eat(5,"hamburg");
        p.eat("hamburg",6);

    }
}
