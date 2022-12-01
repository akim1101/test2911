
public class DomoService implements Printer {
    public DomoService() {
    }
    public void demo(University university){

        System.out.println(university.getUniversityName());
        String[] studentsList = university.getUniversityListOfStudents().clone();
        String[] teachersList = university.getUniversityListOfTeachers().clone();
        for (int i = 0; i < university.getUniversityListOfStudents().length; i++) {
            System.out.println(studentsList[i]);
        }
        for (int i = 0; i < university.getUniversityListOfTeachers().length; i++) {
            System.out.println(teachersList[i]);
        }

    }


    @Override
    public void printInfoToConsoleSuperKpacuBo() {
        System.out.println("I'm really disappointed in myself");
    }
}
