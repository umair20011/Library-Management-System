
import java.util.*;
public class Library {
	
	Book b=new Book();
	User u=new User();
	
	public void issueBook(String bookName, String userName) {
		int c=1;
		for(User user: u.userList) {
			if(user.userName.equals(userName)) {
				c=0;
				int a=1;
				for(Book book: b.bookList) {
					if(book.bookName.equals(bookName)) {
						a=0;
						if(book.bookStatus=="available") {
							user.books.add(bookName);
							b.bookList.remove(book);
							b.bookList.add(new Book(book.bookId,book.bookName,"issued"));
							break;
						}
						else {
							System.out.println("book is not available at the moment");
							break;
						}
					}
				}
				if(a==1) {
					System.out.println("Book does not exist in the library");
				}
			}
		}
		if(c==1) {
			System.out.println("User is not belongs to this library");
		}
		
	}
	
	public void returBook(String bookName, String userName) {
		for(User user: u.userList) {
			if(user.userName.equals(userName)) {
				user.books.remove(bookName);
				for(Book book: b.bookList) {
					if(book.bookName.equals(bookName)) {
						b.bookList.remove(book);
						b.bookList.add(new Book(book.bookId,book.bookName,"available"));
						break;
					}
				}
			}
		}
	}
	
     public static void main(String[] args) {
		 Library l=new Library();
		
    	 Book b1=new Book(1,"abc","available");
    	 Book b2=new Book(2,"xyz","available");
    	 Book b3=new Book(3,"pqr","available");
    	 
    	 l.b.addBook(b1);
    	 l.b.addBook(b2);
    	 l.b.addBook(b3);
    	 
    	 User u1=new User(101,"sahil","abc@gmail.com",new ArrayList<>());
    	 User u2=new User(102,"sohel","xyz@gmail.com",new ArrayList<>());
    	 User u3=new User(103,"sameer","pqr@gmail.com",new ArrayList<>());
    	 
    	 l.u.addUser(u1);
    	 l.u.addUser(u2);
    	 l.u.addUser(u3);
    	 
    	 System.out.println(l.u.userList.get(0));
    	 
    	 l.issueBook("abc","sahil");
    	 
    	 System.out.println(l.u.userList.get(0).books.get(0));
    	 
    	 l.issueBook("xyz", "rahul");
    	 
    	 l.issueBook("xyz", "sameer");
    	 
    	 l.returBook("xyz", "sameer");
    	 
    	 
     }
}
