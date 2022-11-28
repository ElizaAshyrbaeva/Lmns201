import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                Parallelepiped p = new Parallelepiped(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                if (p.getLength() < 0 || p.getHeight() < 0 || p.getWidth() < 0) {
                    throw new RuntimeException();
                }
                if (p.getWidth() >= 20 || p.getHeight() >= 20 || p.getLength() >= 20) {
                    throw new RuntimeException();
                }
                p.getArea();
                p.getVolume();
            } catch (InputMismatchException e) {
                System.err.println("Exception.");
            } catch (RuntimeException e) {
                System.err.println("Wrong input!");
            }
        }
    }
}