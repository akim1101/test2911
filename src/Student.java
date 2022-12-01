public class Student extends User implements Printer{
    private String name;
    private String surname;
    private String fathersName;
    private String phoneNumber;

    @Override
    public void sayHello() {
        System.out.println("Привет! Я студентб меня зовут " + this.name);

    }

    public Student(String name, String surname, String fathersName, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.fathersName = fathersName;
        this.phoneNumber = phoneNumber;
    }

    public Student(String name, String surname, String fathersName) {
        this.name = name;
        this.surname = surname;
        this.fathersName = fathersName;

    }
    public  Student(Student student){
        this.name = student.name;
        this.surname = student.surname;
        this.fathersName = student.fathersName;
        this.phoneNumber = student.phoneNumber;

    }

    @Override
    public void printInfoToConsoleSuperKpacuBo() {
        System.out.println("I'm really disappointed in myself");
    }
}
