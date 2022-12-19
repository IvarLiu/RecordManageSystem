package opeartion;

import java.util.Scanner;

import record.RecordList;
import record.Record;

public class BuyOperation implements IOPeration{
    @Override
    public void work(RecordList recordList) {
        System.out.println("购买唱片……");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入想要购买唱片的名字：");
        String name=scanner.nextLine();
        int size=recordList.getSize();
        for (int i = 0; i < size; i++) {
            Record record1=recordList.getRecord(i);
            if(record1.getName().equals(name) && record1.isSold() == false){
                record1.setSold(true);
                System.out.println("购买成功！");
                return;
            }
        }
        System.out.println("购买失败！");
    }
}
