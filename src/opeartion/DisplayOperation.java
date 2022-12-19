package opeartion;

import record.RecordList;
import record.Record;

public class DisplayOperation implements IOPeration{
    @Override
    public void work(RecordList recordList) {
        System.out.println("打印唱片列表……");
        int size= recordList.getSize();
        for (int i = 0; i < size; i++) {
            Record record=recordList.getRecord(i);
            System.out.println(record);
        }
    }
}
