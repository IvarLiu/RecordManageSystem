package record;

public class RecordList {
    private Record[] records = new Record[10];
    private int usedSize;

    public RecordList() {
        records[0] = new Record("Random Access Memory", "Daft Punk", 150, "Electro");
        records[1] = new Record("Different Class", "Pulp", 100, "Alternative Rock");
        records[2] = new Record("The Hunting Party", "Linkin Park", 200, "Alternative Metal");
        this.usedSize = 3;
    }

    public Record[] getRecords() {
        return records;
    }

    public void setRecords(Record[] records) {
        this.records = records;
    }

    public int getSize() {
        return usedSize;
    }

    public void setSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public Record getRecord(int i) {
        return records[i];
    }

    public void setRecords(int pos, Record record) {
        records[pos] = record;
    }
}
