import java.io.*;

public class MainTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungrySingleton instance = HungrySingleton.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\file"));
        oos.writeObject(instance);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\file"));
        HungrySingleton instance2 = (HungrySingleton)ois.readObject();

        System.out.println(instance);
        System.out.println(instance2);

        System.out.println(instance == instance2);

        System.out.println(Runtime.getRuntime());


    }

}
