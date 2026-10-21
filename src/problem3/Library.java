package problem3;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private int capacity;
    private List<Document> documents;
    public Library(int capacity){
        this.capacity=capacity;
        this.documents=new ArrayList<>();
    }
    void displayDocuments(){
        for(Document doc:this.documents){
            System.out.println(doc);
        }
    }
    boolean add(Document doc){
        if(!this.documents.contains(doc)){
            this.documents.add(doc);
            return true;
        }
        return false;
    }
    boolean delete(Document doc){
        if(this.documents.contains(doc)){
            documents.remove(doc);
            return true;
        }
        return false;
    }
    Document document(int numEnrg){
        for(Document doc:documents){
            if(doc.numRec==numEnrg){
                return doc;
            }
        }
        return null;
    }
    void displayAuthors(){
        for(Document doc:documents){
            if(doc instanceof Book){
                System.out.println("The author of "+doc.title+" is: "+((Book) doc).author);
            }
        }
    }

}
