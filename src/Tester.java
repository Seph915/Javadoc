 public class Tester {

        public static void main(String[] args) {
            WordGames wordGames = new WordGames();

            String resultHello = wordGames.addHelloWord("World");
            System.out.println(resultHello); // Output: Hello World

            String resultFullName = wordGames.getFullName("John", "Doe");
            System.out.println(resultFullName); // Output: John Doe
        }
    }

