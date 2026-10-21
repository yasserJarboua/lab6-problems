package problem3;

public class Document {
    public static int counter=1;
    protected int numRec;
    protected String title;
    public Document(String title){
        this.numRec=Document.counter;
        Document.counter++;
        this.title=title;
    }

    @Override
    public String toString() {
        return "title: "+this.title+", Number of record: "+this.numRec;
    }
}
