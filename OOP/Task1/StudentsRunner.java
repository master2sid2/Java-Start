import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Master on 8.1.2015.
 */
public class StudentsRunner {
    public static void main(String[] args){

       Students[] students = new Students[4];
        students[0] = new Students(0,"Вася","Пупкин","Пупкинович",formatDate(1989,2,21),
                "Украниа, г. Киев, Улица Пупкина 1","0967412563","Информатика",2,"фбв-21");
        students[1] = new Students(1,"Лена","Пупкина","Петровна",formatDate(1991,6,12),
                "Украниа, г. Харьков, Улица Индустриальная 45","0961234567", "Кибернетика",3,"кфа-32");
        students[2] = new Students(2,"Игорь","Васькин","Викторочич",formatDate(1993,4,8),
                "Украниа, г. Одесса, Улица Портовая 12","0965867394","Информатика",2,"фбв-21");
        students[3] = new Students(3,"Вася","Пупкин","Грегоревич",formatDate(1990,9,29),
                "Украниа, г. Киев, проспект Московский 9","0962969375","Социология",2,"су-21");

        System.out.println("Список студентов по факультетам");
        listOfDepartament(students);
        System.out.println("Список студентов по кажому факультетам и курсу");
        listOfDepAndCourse(students);
        System.out.println("Список студентов по году рождения после 1990 года");
        listOfDateAfter(students);
        System.out.println("Список студентов по групам");
        listOfGroup(students);
    }

    private static void listOfDepartament(Students[] students){
        for(Students student : students){
            if(student.getDepartment().equals("Социология"))
                System.out.println(student);
        }
    }
    private static void listOfDepAndCourse(Students[] students){
        System.out.println("Факультет Информатика");
        for(Students student : students){
            if (student.getDepartment().equals("Информатика")) {
                System.out.println(student);
            }
        }
        System.out.println("Факультет Кибернетика");
        for(Students student : students){
            if (student.getDepartment().equals("Кибернетика")) {
                System.out.println(student);
            }
        }
        System.out.println("Факультет Социология");
        for(Students student : students){
            if (student.getDepartment().equals("Социология")) {
                System.out.println(student);
            }
        }
        System.out.println("По первому курсу");
        for(Students student : students){
            if(student.getCourse()==1) {
                System.out.println(student);
            }
        }
        System.out.println("По второу курсу");
        for(Students student : students){
            if(student.getCourse()==2) {
                System.out.println(student);
            }
        }
        System.out.println("По третему курсу");
        for(Students student : students){
            if(student.getCourse()==3) {
                System.out.println(student);
            }
        }
    }
    private static void listOfDateAfter(Students[] students){
        Calendar cal = new GregorianCalendar(1990, 11, 31);
        Date date = cal.getTime();
        for (Students student : students) {
            if (student.getBirthDate().after(date))
                System.out.println(student);
        }
    }
    private static void listOfGroup(Students[] students){
        for ( Students student : students){
            if(student.getGroup().equals("фбв-21"))
            System.out.println(student);
        }
    }

    private static Date formatDate(int yy, int MM, int dd){
        GregorianCalendar gc = new GregorianCalendar(yy,MM-1,dd);
        return gc.getTime();
    }
}
