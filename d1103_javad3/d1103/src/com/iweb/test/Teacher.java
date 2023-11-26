package com.iweb.test;

/**
 * @author Wzh
 * @date 2023/11/3 22:00
 */
public class Teacher {
    String name;
    public String teach(Student student,String knowledge){
        System.out.printf("%s教了%s%s%n",name,student.name,knowledge);
        return knowledge;
    }

    public static void main(String[] args) {

    }
}
