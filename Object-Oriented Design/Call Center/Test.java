public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        CallHandler ch = new CallHandler();
        Caller caller = new Caller(1, "jp");
        ch.dispatchCall(caller);
    }

}