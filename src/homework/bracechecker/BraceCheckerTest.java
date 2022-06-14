package homework.bracechecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "Hello (from} [Java] ({[";
        BraceChechker bc = new BraceChechker(text);
        bc.check();
    }
}
