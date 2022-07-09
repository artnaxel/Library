package main;
import exception.*;
import interfaces.*;

import java.io.Serializable;
import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

/**
 * This class represents Book.
 * It has fields to store the information about the book and the methods for library functionality.
 */
public class Book implements Returnable, Cloneable, Serializable{

    //PRIVATE FIELDS
    private String author;
    private String title;
    private String publicationYear;
    private String isbn;
    private Status status;

    private LocalDate borrowDate;
    private LocalDate returnedDate;
    private LocalDate deadline;

    private long bookFine;

    //PARAMETRIZED CONSTRUCTOR
    public Book(String title, String author, String year, String isbn){
        this.title = title;
        this.author = author;
        this.publicationYear = year;
        this.isbn = isbn;
        this.status = Status.AVAILABLE;
        
    }

    //DEFAULT CONSTRUCTOR
    public Book() throws BookException {
     this(null, null, null, null);
    }

    //SETTERS
    public void setAuthor(String author) throws BookException{
        if (author.length() > 30){
            throw new BookException("Name of your author is too long!");
        }
        this.author = author;
    }

    public void setTitle(String title) throws BookException{
        if (title.length() > 50){
            throw new BookException("Title of your book is too long!");
        }
        this.title = title;
    }

    public void setStatus(Status newStatus) {
            this.status = newStatus;
    }

    public void setPublicationYear(String year) throws BookException{
        if(!isNumeric(year)){
            throw new BookException("You have entered a wrong date! Please enter a number!");
        }
        int yearInt = Integer.parseInt(year);
        LocalDate YEAR =  LocalDate.of(yearInt, 1,1);
        if (YEAR.isAfter(LocalDate.now())){
            throw new BookExceptionPublicationYear("You've entered a future date!", YEAR);
        }
        this.publicationYear = year;
    }
    
    public void setIsbn(String isbn) throws BookException{
        if(!isNumeric(isbn)){
            throw new BookException("ISBN must be a number!");
        }
        this.isbn = isbn;
    }

    @Override
    public void setBorrowDate(LocalDate date){
        this.borrowDate = date;
    }

    @Override
    public void setReturnedDate(LocalDate date){
        this.returnedDate = date;
    }

    public void setDeadline(LocalDate deadline){
        this.deadline = deadline;
    }

    public void setBookFine(long fine){
        this.bookFine = fine;
    }


    //GETTERS
    public String getAuthor(){
        return author;
    }
    
    public String getTitle(){
        return title;
    }

    public Status getStatus(){
        return status;
    }

    public String getPublicationYear(){
        return publicationYear;
    }
    public String getIsbn(){
        return isbn;
    }

    @Override
    public LocalDate getBorrowDate(){
        return borrowDate;
    }

    @Override
    public LocalDate getReturnedDate(){
        return returnedDate;
    }

    public LocalDate getDeadline(){
        return deadline;
    }

    public long getBookFine(){
        return bookFine;
    }

    /**
     * Method to check if string is numeric.
     * @param str The string to check.
     * @return Returns boolean, true - the string is numeric, false - the string isn't numeric.
     */
    public static boolean isNumeric(String str){
        try{
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
   
    @Override
   public  void borrowBook() throws BookException{
       if (getStatus() == Status.UNAVAILABLE){
           throw new BookException("The book has been borrowed!");
       }
       setBorrowDate(LocalDate.now());
       setDeadline(LocalDate.now().plusDays(14));
       setStatus(Status.UNAVAILABLE);
   }

    @Override
    public void returnBook() throws BookException {
        if (getStatus() == Status.AVAILABLE){
            throw new BookException("The book hasn't been borrowed!");
        }
        setReturnedDate(LocalDate.now());
        setStatus(Status.AVAILABLE);
        long daysLate = DAYS.between(getDeadline(), getReturnedDate());
        if (daysLate > 0){
            setBookFine(calculateFine(daysLate));
        }
    }

    public final long calculateFine(long daysLate){
        return (long) (daysLate * 2.5);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Book cloned = (Book) super.clone();
        return cloned;
    }

    @Override
    public String toString(){
        return "\nTitle: " + title + "\nAuthor: " + author + " \nPublication Date: " + publicationYear + "\nStatus: " + status;
    }

}
