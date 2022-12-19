package opeartion;

import java.util.Scanner;

import record.RecordList;
import record.Record;

public class DelOperation implements IOPeration{
    @Override
    public void work(RecordList recordList) {
        System.out.println("移除唱片……");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要移除的唱片的名字：");
        String name=scanner.nextLine();
        int size=recordList.getSize();
        int pos=-1;
        for (int i = 0; i < size; i++) {
            Record record1=recordList.getRecord(i);
            if(record1.getName().equals(name)){
                pos=i;
                break;
            }
        }
        if(pos!=-1){
            for (int i = pos; i < size-1; i++) {
                Record record= recordList.getRecord(i+1);
                recordList.setRecords(i,record);
            }
            recordList.setSize(size-1);
            System.out.println("移除成功！");
            return;
        }
        System.out.println("移除失败！");
    }
}
