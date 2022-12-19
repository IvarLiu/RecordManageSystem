package opeartion;

import java.util.Scanner;

import record.RecordList;
import record.Record;

public class RemoveOperation implements IOPeration{
    @Override
    public void work(RecordList recordList) {
        System.out.println("退回唱片……");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入想要退回唱片的名字：");
        String name=scanner.nextLine();
        int size=recordList.getSize();
        for (int i = 0; i < size; i++) {
            Record record1=recordList.getRecord(i);
            if(record1.getName().equals(name) && record1.isSold() == true){
                record1.setSold(false);
                System.out.println("退回成功！");
                return;
            }
        }
        System.out.println("退回失败！");
    }
}
