package IO;

import main.*;
import java.util.List;

/**
 * This class extends Thread and loads the data from the file.
 */
public class LoadThread extends Thread{

    private final Library library;
    private final String filename;

    public LoadThread(Library library, String filename){
        this.library= library;
        this.filename = filename;
    }

    @Override
    public void run() {
        try{
            synchronized (library) {
                library.setCollection((List<Book>) IOmanager.load(filename));
            }
        }catch (Exception e){
            System.out.println("Failed to load the data!");
        }
    }
}
