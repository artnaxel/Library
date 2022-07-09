package interfaces;

import exception.*;
import java.time.LocalDate;

/**
 * Interface for a book that can be borrowed.
 */
public interface Borrowable {
    void borrowBook() throws BookException;

    /**
     * Setter for the borrow date of the book.
     * @param date Reference type of the date is LocalDate.
     */
    void setBorrowDate(LocalDate date);

    LocalDate getBorrowDate();
}
