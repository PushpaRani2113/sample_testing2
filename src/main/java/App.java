public class App {

    // Method to return a welcome message
    public String getGreeting() {
        return "Hello World from Azure Pipelines!";
    }

    // Method to perform a simple math calculation
    public int add(int a, int b) {
        return a + b;
    }

    // Application entry point
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getGreeting());
        System.out.println("2 + 3 = " + app.add(2, 3));
    }
}