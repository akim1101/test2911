public class University implements Printer {
    private String universityName;
    private String[] universityListOfStudents;
    private String[] universityListOfTeachers;

    @Override
    public void printInfoToConsoleSuperKpacuBo() {
        System.out.println("I'm really disappointed in myself");
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String[] getUniversityListOfStudents() {
        return universityListOfStudents;
    }

    public void setUniversityListOfStudents(String[] universityListOfStudents) {
        this.universityListOfStudents = universityListOfStudents;
    }

    public String[] getUniversityListOfTeachers() {
        return universityListOfTeachers;
    }

    public void setUniversityListOfTeachers(String[] universityListOfTeachers) {
        this.universityListOfTeachers = universityListOfTeachers;
    }

    public University(String[] sList, String[] tList, String name){
        this.universityName = name;
        this.universityListOfStudents = sList;
        this.universityListOfTeachers = tList;
    }
}
