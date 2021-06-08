public class Display {
    private User activeUser;
    private Book activeBook;
    private int page_num = 0;

    public void displayUser(User user) {
        activeUser = user;
        refreshUsername();
    }

    public void displayBood(Book book) {
        page_num = 0;
        activeBook = book;
        refreshTitle();
        refreshDetails();
        refreshPage();
    }

    public void refreshUsername() {
        /* updates username display */
    }

    public void refreshTitle() {
        /* updates title display */
    }

    public void refreshDetails() {
        /* updates details display */
    }

    public void refreshPage() {
        /* updated page display */
    }

    public void turnPageForward() {
        page_num++;
        refreshPage();
    }

    public void turnPageBackward() {
        page_num--;
        refreshPage();
    }

}
