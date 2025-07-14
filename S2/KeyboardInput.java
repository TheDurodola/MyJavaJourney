import java.util.Scanner;

class KeyboardInput implements Input {
    @Override
    public String fetch() {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();

         return inputText;
    }
}
