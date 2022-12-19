package user;

import opeartion.IOPeration;
import record.RecordList;

public abstract class User {
    private String name;

    protected IOPeration[] ioPerations;

    public User(String name){
        this.name=name;
    }
    public abstract int menu();

    public void doOperation(int choice, RecordList recordList){
        this.ioPerations[choice].work(recordList);
    }
}
