
public class Professor {
    private String NIP,Name;
    private Date Age;

    public Professor(String NIP, String name, Date age) {
        this.NIP = NIP;
        Name = name;
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

    public Date getAge() {
        return Age;
    }

    public void setAge(Date age) {
        Age = age;
    }
}
