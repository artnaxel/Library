package interfaces;

import exception.BookException;

import java.time.LocalDate;

/**
 * Interface for a book that can be returned, extends another interface Borrowable.
 */
public interface Returnable extends Borrowable{
    void returnBook() throws BookException;

    void setReturnedDate(LocalDate date);

    LocalDate getReturnedDate();

}

