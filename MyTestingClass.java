import java.util.Random;

public class MyTestingClass {
    private int id;
    private String name;

    public MyTestingClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + (name == null ? 0 : name.length());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyTestingClass that = (MyTestingClass) obj;
        return id == that.id && name.equals(that.name);
    }

    @Override
    public String toString() {
        return "MyTestingClass{id=" + id + ", name='" + name + "'}";
    }

    public static MyTestingClass random() {
        Random random = new Random();
        int id = random.nextInt(10000);
        String name = "Name" + random.nextInt(10000);
        return new MyTestingClass(id, name);
    }
}
