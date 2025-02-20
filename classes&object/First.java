public class First {

    public static void main(String[] args) {
        // Create an object of Home
        Home h1 = new Home(10, 20);
        
        // Print the height of the home
        System.out.println(h1.height);
    }

    public static class Home {
        int height;
        int width;

        // Constructor to initialize height and width
        Home(int v1, int v2) {
            height = v1;
            width = v2;
        }
    }
}
