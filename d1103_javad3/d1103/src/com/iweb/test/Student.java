package com.iweb.test;
/**
 * @author Wzh
 * @date 2023/11/3 22:00
 */
public class Student {
    String name;
    public void learn(String knowledge){
        if(knowledge == "java"){
            System.out.printf("%s学会了java%n",name);
        }else{
            System.out.printf("%s没有学会java,但学会了%s%n",name,knowledge);
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        student.name = "张同学";
        teacher.name = "张老师";
        String knowledge = teacher.teach(student,"c++");
        student.learn(knowledge);
    }
}
