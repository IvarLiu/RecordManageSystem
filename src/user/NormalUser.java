package user;

import opeartion.*;

import java.util.Scanner;

public class NormalUser extends User {

    public NormalUser(String name) {
        super(name);
        this.ioPerations = new IOPeration[] {
                new ExitOperation(),
                new FindOperation(),
                new BuyOperation(),
                new RemoveOperation()
        };
    }

    public int menu(){
        System.out.println("========普通菜单========");
        System.out.println("欢迎来到普通用户菜单：");
        System.out.println("1. 查找唱片");
        System.out.println("2. 购买唱片");
        System.out.println("3. 退回唱片");
        System.out.println("0. 退出系统");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
