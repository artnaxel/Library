package IO;

import java.io.*;

/**
 * This class has methods to control the serialization.
 */
public class IOmanager {

    public static void save(Serializable data, String filename) throws Exception{
        ObjectOutputStream objectOutputStream;
        try (FileOutputStream outStream = new FileOutputStream(filename)) {
            objectOutputStream = new ObjectOutputStream(outStream);
            objectOutputStream.writeObject(data);
        }
            objectOutputStream.close();
    }

    public static Object load(String filename) throws Exception{
        ObjectInputStream objectInputStream;
        try (FileInputStream inStream = new FileInputStream(filename)) {
            objectInputStream = new ObjectInputStream(inStream);
            Object obj = objectInputStream.readObject();
            objectInputStream.close();
            return obj;
        }
    }
}
