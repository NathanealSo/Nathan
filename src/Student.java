import java.util.ArrayList;

public class Student {
    private String NIP,Name;
    private Enum<Main.MajorSelection> Major;
    private Date Age;
    private final ArrayList<Subject> Sub = new ArrayList<>();

    public Student(String NIP, String name, Enum<Main.MajorSelection> major, Date age) {
        this.NIP = NIP;
        Name = name;
        Major = major;
        Age = age;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public Enum<Main.MajorSelection> getMajor() {
        return Major;
    }

    public void setMajor(Enum<Main.MajorSelection> major) {
        Major = major;
    }

    public Date getAge() {
        return Age;
    }

    public void setAge(Date age) {
        Age = age;
    }

    public ArrayList<Subject> getSub() {
        return Sub;
    }

    public void setSub(Subject sub) {
        Sub.add(sub);
    }
}