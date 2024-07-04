import java.util.List;

public class User {
    String name;
    int age;
    List<String> interests;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getInterests() {
        return interests;
    }

    public User(String name, int age, List<String> interests) {
        this.name = name;
        this.age = age;
        this.interests = interests;
    }

    @Override
    public String toString() {

        return name + " " + age;
    }

}
