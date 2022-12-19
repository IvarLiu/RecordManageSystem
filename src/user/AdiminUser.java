package user;

import opeartion.*;

import java.util.Scanner;

public class AdiminUser extends User{
    public AdiminUser(String name) {
        super(name);
        this.ioPerations=new IOPeration[]{
            new ExitOperation(),
            new FindOperation(),
            new AddOperation(),
            new DelOperation(),
            new DisplayOperation(),
        };
    }

    public int menu(){
        System.out.println("========管理员菜单========");
        System.out.println("欢迎来到管理员用户菜单：");
        System.out.println("1. 查找唱片");
        System.out.println("2. 添加唱片");
        System.out.println("3. 删除唱片");
        System.out.println("4. 显示唱片列表");
        System.out.println("0. 退出系统");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
