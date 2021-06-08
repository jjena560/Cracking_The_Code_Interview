public class Book {
    private int ID;
    private String details;

    public Book(int id, String det) {
        ID = id;
        details = det;
    }

    public int getId() {
        return ID;
    }

    public void setId(int id) {
        ID = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}
