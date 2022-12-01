public class Main {
    public static void main(String[] args) {
        String[] tlist = {"Math teacher", "IT teacher", "Science teacher"};
        String[] slist = {"Student 1", "Student 2"};
        University test = new University(slist, tlist, "University name");
        DomoService domoService = new DomoService();
        domoService.demo(test);

    }
}