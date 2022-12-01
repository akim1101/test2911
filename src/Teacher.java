

public class Teacher extends User implements Printer {
    private String name;
    private String surname;
    private String fathersName;
    private String phoneNumber;
    private String subject;

    @Override
    public void sayHello() {
        System.out.println("Здравствуйте! Я преподаватель, моё имя " + name + " " + fathersName);

    }
    public Teacher(String name, String surname, String fathersName, String phoneNumber, String subject) {
        this.name = name;
        this.surname = surname;
        this.fathersName = fathersName;
        this.phoneNumber = phoneNumber;
        this.subject = subject;
    }

    public Teacher(String name, String surname, String fathersName, String subject) {
        this.name = name;
        this.surname = surname;
        this.fathersName = fathersName;
        this.subject = subject;

    }
    public Teacher(Teacher teacher){
        this.name = teacher.name;
        this.surname = teacher.surname;
        this.fathersName = teacher.fathersName;
        this.phoneNumber = teacher.phoneNumber;

    }


    @Override
    public void printInfoToConsoleSuperKpacuBo() {
        System.out.println("I'm really disappointed in myself");
    }
}
