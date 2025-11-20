import java.util.Scanner;

public class BasicChatBot {

    // Function to generate response based on user input
    public static String getResponse(String input) {
        input = input.toLowerCase();

        if (input.contains("hello") || input.contains("hi") || input.contains("hey")) {
            return "Hello! How can I help you today?";
        }
        else if (input.contains("your name")) {
            return "I'm a simple Java ChatBot, created using if-else logic!";
        }
        else if (input.contains("how are you")) {
            return "I'm functioning perfectly! Thanks for asking.";
        }
        else if (input.contains("time")) {
            return "I don't have a clock yet, but I can still chat with you!";
        }
        else if (input.contains("bye")) {
            return "Goodbye! Have a great day!";
        }
        else {
            return "I'm not sure how to respond to that, but I'm learning!";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("===== Simple Rule-Based ChatBot =====");

        while (true) {
            System.out.print("You: ");
            String userInput = sc.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("ChatBot: Goodbye! Type 'exit' to close.");
                break;
            }

            String botReply = getResponse(userInput);
            System.out.println("ChatBot: " + botReply);
        }

        sc.close();
    }
}
