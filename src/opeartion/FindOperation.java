package opeartion;

import java.util.Scanner;

import record.RecordList;
import record.Record;

public class FindOperation implements IOPeration{
    @Override
    public void work(RecordList recordList) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入唱片的名字：");
        String name=scanner.nextLine();
        int size=recordList.getSize();
        for (int i = 0; i < size; i++) {
            Record record1=recordList.getRecord(i);
            if(record1.getName().equals(name)){
                System.out.println("找到记录！");
                System.out.println(record1);
                return;
            }
        }
        System.out.println("查找失败！");
    }
}
