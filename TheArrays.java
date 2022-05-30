import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);

        int[] numbers = {100, 200};
        System.out.println(Arrays.toString(numbers));

        for (int i=colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        for (String color : colors) {
            System.out.println(color);
        }

        Arrays.stream(colors).forEach(System.out::println);
    }
}
