package com.tsuki.apitest2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //验证用户名和密码，三次机会输入，登陆成功后，提示登陆成功，否则提示登陆失败
        String username = "admin";
        String password = "123456";
        //输入
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String inputUsername = input.nextLine();
            System.out.println("请输入密码");
            String inputPassword = input.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("用户名或密码错误");
            }
        }
        System.out.println("用户名或密码错误");
    }}
