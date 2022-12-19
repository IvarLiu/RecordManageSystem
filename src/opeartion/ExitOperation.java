package opeartion;

import record.RecordList;

public class ExitOperation implements IOPeration{
    @Override
    public void work(RecordList recordList) {
        System.exit(0);
        System.out.println("退出系统……");
    }
}
