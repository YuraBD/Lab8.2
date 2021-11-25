package mail;


import lombok.Cleanup;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Client {
    private static int nextId = 0;
    private String name;
    public int age;
    public Gender sex;
    private  int id;

    public Client() {
        this.id = Client.nextId;
        Client.nextId++;
    }

    public Client(String name, int age, Gender sex) {
        this.id = Client.nextId;
        Client.nextId++;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
