import java.io.File;

public class Main {
    public static void main(String[] args){
        File f = new File("src/main/java/number.txt");
        Reader r = new Reader(f,"+");
        r.exec();
    }
}
