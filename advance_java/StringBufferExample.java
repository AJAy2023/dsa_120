public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");

        // Append
        sb.append("ajay");
        System.out.println("After append: " + sb);

        // Insert
        sb.insert(6, "jadhva");
        System.out.println("After insert: " + sb);

        // Replace
        sb.replace(6, 12, "patil");
        System.out.println("After replacing: " + sb);
    }
}
