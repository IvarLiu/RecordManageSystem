package opeartion;

import java.util.Scanner;

import record.RecordList;
import record.Record;

public class AddOperation implements IOPeration{

    @Override
    public void work(RecordList recordList) {
        System.out.println("添加唱片……");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入唱片的名字：");
        String name=scanner.nextLine();
        System.out.println("请输入唱片的作者：");
        String author=scanner.nextLine();
        System.out.println("请输入唱片的流派：");
        String type=scanner.nextLine();
        System.out.println("请输入唱片的价格：");
        int price=scanner.nextInt();

        Record record=new Record(name,author,price,type);
        int size=recordList.getSize();
        for (int i = 0; i < size; i++) {
            Record record1=recordList.getRecord(i);
            if(record1.getName().equals(name)){
                System.out.println("已经存在这张唱片了！");
                return;
            }
        }
        recordList.setRecords(size,record);
        recordList.setSize(size+1);
        System.out.println("添加唱片成功！");
    }
}
