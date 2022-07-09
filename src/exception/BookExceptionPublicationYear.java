package exception;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.YEARS;

public class BookExceptionPublicationYear extends BookException{

    LocalDate year;

    public BookExceptionPublicationYear() {
    }

    public int getYear(){
        return year.getYear();
    }

    /**
     * Calculates difference between now and entered date.
     * @param yearInput Publication year.
     * @return Returns the difference.
     */
    public long difference(LocalDate yearInput){
        return YEARS.between(yearInput, year) + 1;
    }

    public BookExceptionPublicationYear(String msg, LocalDate year){
        super(msg);
        this.year = year;
    }
}
