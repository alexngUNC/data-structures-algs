import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {

    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<>(); // implementation of queue interface
        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Mariam", 18 ));
        linkedList.addLast(new Person("Ali", 18 ));
        linkedList.addFirst(new Person("Eldar", 18 ));

        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }

        System.out.println();

        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }

    }

    private static void queses() {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Mariam", 18));
        supermarket.add(new Person("Ali", 40));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age){}
}
