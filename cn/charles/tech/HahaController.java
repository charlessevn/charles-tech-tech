package cn.charles.tech;

public class HahaController {
    public static void main(String[] args){
        String first_str = "Welcome to dddsMicrosoft";
        String second_str = "I work with sdmicrosoft";
        boolean match1 = first_str.
                regionMatches(11, second_str, 12, 9);
        boolean match2 = first_str.
                regionMatches(true, 11, second_str, 12, 9); //第一个参数 true 表示忽略大小写区别
        System.out.println("区分大小写返回值：" + match1);
        System.out.println("不区分大小写返回值：" + match2);
    }
}
