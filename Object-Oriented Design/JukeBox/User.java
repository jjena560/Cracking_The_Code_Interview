public class User {
    private String name;
    private long id;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(long ID) {
        id = ID;
    }

    public long getId() {
        reutrn id;
    }

    public User(String name, long Id) {
        this.name = name;
        this.id = Id;
    }

    public User getUser() {
        return this;
    }

    public static User addUser(String name, long Id) {
        return new User(name, Id);
    }
}
