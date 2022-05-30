import java.util.Set;
import java.util.HashSet;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue")); // duplicates aren't allowed
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));

        balls.remove(new Ball("red"));

        System.out.println(balls.size());
        balls.forEach(System.out::println);
    }

    // need to overide equals and hash code to have a set with a class

    record Ball(String color){}
}
