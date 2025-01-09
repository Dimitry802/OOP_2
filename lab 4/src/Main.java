


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;

class MathApiSolver {

    private static final String API_URL = "https://api.mathjs.org/v4/";

    private static String sendApiRequest(String expression) throws Exception {
        URL url = new URL(API_URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        connection.setDoOutput(true);

        try (OutputStream os = connection.getOutputStream()) {
            os.write(("{\"expr\":\"" + expression + "\"}").getBytes(StandardCharsets.UTF_8));
        }

        if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
            throw new RuntimeException("Mistake: HTTP " + connection.getResponseCode());
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
            StringBuilder response = new StringBuilder();
            String responseLine;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            return response.toString();
        }
    }


    public static void solveQuadraticEquation(String task) throws Exception {
        String[] parts = task.replaceAll("[^0-9*x^=+-]", "").split("=");
        if (parts.length < 1) {
            throw new IllegalArgumentException("Incorrect quadratic equation.");
        }

        String expression = parts[0].replace("^", "^2");
        System.out.println("Solving the quadratic equation: " + expression + " = 0");
        System.out.println("Decision: " + sendApiRequest("solve(" + expression + ", x)"));
    }


    public static void evaluateExpression(String task) throws Exception {
        String expression = task.replaceAll("[^0-9+\\-*/().]", "");
        if (expression.isEmpty()) {
            throw new IllegalArgumentException("\nAn empty expression. Enter the correct expression.");
        }
        System.out.println("\nCalculating the value of the expression: " + expression);
        System.out.println("result: " + sendApiRequest(expression));
    }


    public static void solveEquation(String task) throws Exception {
        String expression = task.replaceAll("[^0-9a-zA-Z=+\\-*/()]+", "");
        if (!expression.contains("=")) {
            throw new IllegalArgumentException("Incorrect equation. The sign is missing '='.");
        }

        String[] sides = expression.split("=");
        if (sides.length != 2) {
            throw new IllegalArgumentException("Incorrect equation");
        }
        String rearrangedExpression = sides[0] + "- (" + sides[1] + ")";
        System.out.println("Solving the equation: " + expression);
        System.out.println("Decision: " + sendApiRequest("solve(" + rearrangedExpression + ", x)"));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a math assignment:");
        String task = scanner.nextLine();

        try {
            if (task.contains("the quadratic equation")) {
                MathApiSolver.solveQuadraticEquation(task);
            } else if (task.contains("meaning of the expression")) {
                MathApiSolver.evaluateExpression(task);
            } else if (task.contains("the equation")) {
                MathApiSolver.solveEquation(task);
            } else {
                System.out.println("\n" +
                        "Unknown task type");
            }
        } catch (Exception e) {
            System.out.println("Issue processing error: " + e.getMessage());
        }
    }
}