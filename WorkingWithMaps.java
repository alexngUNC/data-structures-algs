import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Jamila"), new Diamond("African"));

        System.out.println(new Person("Jamila").hashCode());
        System.out.println(new Person("Jamila").hashCode());

        System.out.println(map.get(new Person("Jamila")));
    }

    private static void maps() {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alexa"));
        map.put(3, new Person("Mariam")); // Keys must be unique otherwise they override
        map.put(4, new Person("Mariam"));
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.containsKey(5));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());

        map.remove(3);

        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
        map.forEach((key, person) -> {
            System.out.println(key + " - " + person);
        });

        System.out.println(map.getOrDefault(3, new Person("default")));

        System.out.println(map.values());
    }

    static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override // Always override equals and hashcode unless you use a record,
        public String toString() { // same hash code has to return for any given object
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    record Diamond(String name){}
}
