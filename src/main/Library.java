package main;

import java.io.Serializable;
import java.util.*;

/**
 * This class represents the collection of the books.
 */
public class Library implements Serializable {
    private static Library lib = null;
    private List<Book> collection;

    private Library(){
        collection = new LinkedList<>();
    }

    public void addBook(Book book){
        collection.add(book);
    }
    
    public void removeBook(Book book){
        collection.remove(book);
    }

    public List<Book> getCollection() {
        return collection;
    }

    public void setCollection(List<Book> collection){
        this.collection = collection;
    }

    public static Library getInstance(){
        if(lib == null)
            lib = new Library();
        return lib;

    }
    public Book getBook(int index){
       return collection.get(index);
    }
   
    
    public String[][] toStringVector(){
        String[][] books = new String[collection.size()][4];
        for (int i = 0; i < collection.size(); i++ ){
                books[i][0] = collection.get(i).getIsbn();
                books[i][1] = collection.get(i).getAuthor();
                books[i][2] = collection.get(i).getTitle();
                books[i][3] = collection.get(i).getPublicationYear();
                
            }
        return books;
    
    }
  

    @Override
    public String toString(){
        String total = "\nBook";
        if(!collection.isEmpty()) {
            for (Book b : collection) {
                total = total + b.toString() + "\n";
            }
            return total;
        }
        return "The collection is empty!";
    }
}
