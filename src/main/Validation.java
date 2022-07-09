package main;

import java.time.LocalDate;

public class Validation {
     public static boolean validatePublicationYear(String publicationYear) {
       LocalDate YEAR =  LocalDate.of(Integer.parseInt(publicationYear), 1,1);
       return YEAR.isBefore(LocalDate.now());
    }
     
    public static boolean validateIsbn(String isbn, Library lib){
        if(!isNumeric(isbn)){
            return false;
        }
        for(int i = 0; i < lib.getCollection().size(); i++){
            if(lib.getBook(i).getIsbn() == null ? isbn == null : lib.getBook(i).getIsbn().equals(isbn)){
                
                return false;
            }
        }
        return true;
    }
    
    public static boolean validateAuthor(String author){
        return author.length() < 31;
    }
    public static boolean validateTitle(String title){
        return title.length() < 51;
    }
    public static boolean areFieldsEmpty(String isbn, String title, String author, String publicationYear){    
        return isbn.isEmpty() || title.isEmpty() || author.isEmpty() || publicationYear.isEmpty();
    }
    
    public static boolean isNumeric(String str){
        try{
            int a = Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
