import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public  static void main (String[] args){
        Student student1 = new Student("Andrei", "Andreev", "Andreevich", LocalDate.of(2000, 2, 17), 1L);
        Student student2 = new Student("Ivan", "Ivanov", "Ivanovich", LocalDate.of(2001, 5, 11), 2L);
        Student student3 = new Student("Petr", "Petrov", "Petrovich", LocalDate.of(1999, 12, 20), 3L);
        Student student4 = new Student("Andrei", "Petrov", "Ivanovich", LocalDate.of(2000, 2, 9), 4L);
        Student student5 = new Student("Petr", "Ivanov", "Andreevich", LocalDate.of(2000, 11, 25), 5L);
        Student student6 = new Student("Ivan", "Andreev", "Petrovich", LocalDate.of(2002, 9, 17), 6L);
        Student student7 = new Student("Petr", "Ivanov", "Petrovich", LocalDate.of(2003, 2, 1), 7L);
        Teacher teacher1 = new Teacher("Alex", "Alexeev", "Alexeevich", LocalDate.of(1968,7,16));
        Teacher teacher2 = new Teacher("Alex", "Alexeev", "Petrovich", LocalDate.of(1968,3,18));
        List<Student> studentList1 = new ArrayList<>();
        List<Student> studentList2 = new ArrayList<>();
        List<Student> studentList3 = new ArrayList<>();
        studentList1.add(student1);
        studentList1.add(student2);
        studentList1.add(student3);
        studentList1.add(student4);
        studentList2.add(student5);
        studentList2.add(student6);
        studentList2.add(student7);
        studentList3.add(student1);
        studentList3.add(student5);
        studentList3.add(student4);
        StudentGroup studentGroup1 = new StudentGroup(teacher1,studentList1);
        StudentGroup studentGroup2 = new StudentGroup(teacher2,studentList2);
        StudentGroup studentGroup3 = new StudentGroup(teacher1,studentList3);
        List<StudentGroup> flow1 = new ArrayList<>();
        List<StudentGroup> flow2 = new ArrayList<>();
        flow1.add(studentGroup1);
        flow1.add(studentGroup2);
        flow2.add(studentGroup1);
        flow2.add(studentGroup2);
        flow2.add(studentGroup3);
        Flow flowGroup2 = new Flow(flow2);
        Flow flowGroup1 = new Flow(flow1);
        for (StudentGroup studentGroup: flowGroup1.getStudentGroupList()){
            System.out.println(studentGroup);
        }
        List<Flow> flowGroupList = new ArrayList<>();
        flowGroupList.add(flowGroup2);
        flowGroupList.add(flowGroup1);

        System.out.println("--------------");
        for (Flow studentGroup: flowGroupList){
            System.out.println(studentGroup);
        }
        flowGroupList.sort(new StreamComparator());
        System.out.println("--------------");
        for (Flow studentGroup: flowGroupList){
            System.out.println(studentGroup);
        }

    }
}
