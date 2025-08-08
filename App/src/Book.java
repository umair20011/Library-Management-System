
import java.util.*;
public class Book {
     int bookId;
     String bookName;
     String bookStatus;
     
     ArrayList<Book> bookList=new ArrayList<>();
     
     public void addBook(Book b) {
    	 bookList.add(b);
     }
     
     Book(int bookId, String bookName, String bookStatus){
    	 this.bookId=bookId;
    	 this.bookName=bookName;
    	 this.bookStatus=bookStatus;
     }
     
     Book(){
    	 
     }
     
}
