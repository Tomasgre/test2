import java.util.Objects;

public class Account {

    private String name;
    private int age;
    private final int id;

    public Account(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return getAge() == account.getAge() && getId() == account.getId() && Objects.equals(getName(), account.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getId());
    }
}
