package IO;

import main.*;
import java.io.Serializable;

/**
 * This class extends Thread and saves the data in the file.
 */
public class SaveThread extends Thread{
    private final Library library;
    private final String filename;

    public SaveThread(Library library, String filename){
        this.library = library;
        this.filename = filename;
    }

    @Override
    public void run() {
        try{
            synchronized (library){
                    IOmanager.save((Serializable) library.getCollection(), filename);
            }
        }
        catch (Exception e){
            System.out.println("Failed to save the data!");
        }
    }
}
