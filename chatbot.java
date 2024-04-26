
import java.util.Scanner;

public class chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to University Chat Bot. Type in your queries to get answers!");
        while (true) {
            String query = scanner.nextLine();
            String response = getResponse(query);
            System.out.println(response);
            if (response.equals("Exiting...")) {
                break;
            }
        }
    }

    public static String getResponse(String query) {
        // Process the query and generate a response
        if (query.equalsIgnoreCase("hi") || query.equalsIgnoreCase("hello") || query.equalsIgnoreCase("greetings")) {
            return "Hello! How can I assist you today?";
        } else if (query.equalsIgnoreCase("goodbye")) {
            return "Goodbye! Have a great day.";
        } else if (query.contains("admission")) {
            return "For admission queries, please visit our admissions page on the university website.";
        } else if (query.contains("courses")) {
            return "To know about the courses offered, please visit the courses section on our website.";
        } else if (query.contains("campus")) {
            return "For information about the campus and facilities, please visit the campus life section on our website.";
        } else if (query.contains("contact")) {
            return "You can contact us at contact@example.com or +1-234-567-890.";
        } else if (query.contains("library")) {
            return "For library information, please visit the library section on our website.";
        } else if (query.contains("events")) {
            return "To know about upcoming events, please visit the events section on our website.";
        } else if (query.contains("academic calendar")) {
            return "For the academic calendar, please visit the academic calendar section on our website.";
        } else if (query.contains("student portal")) {
            return "To access the student portal, please visit the student portal section on our website.";
        } else if (query.contains("exit")) {
            return "Exiting...";
        } else {
            return "I'm sorry, I didn't understand your query. Please try again.";
        }
    }
}