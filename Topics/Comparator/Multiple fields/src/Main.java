import java.util.Comparator;
import java.util.List;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "=" + age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Utils {

    public static void sortUsers(List<User> users) {
        users.sort(Comparator.comparingInt(User::getAge).reversed());
        users.sort((i1, i2) -> i1.getName().equals(i2.getName()) ? 0 : i1.getName().compareTo(i2.getName()));
    }
}
