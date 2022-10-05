package ra.entily;

import java.util.Arrays;
import java.util.Comparator;

public class soSanhString {
    public static void main(String[] args) {
        Student[] arrStudents = new Student[3];
        arrStudents[0] = new Student("SV001", "Nguyen Van A", 22);
        arrStudents[1] = new Student("SV002", "Nguyen Vna B", 18);
        arrStudents[2] = new Student("Sv003", "nguyen Van C", 25);
        Arrays.sort(arrStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                xap xep theo thu tu tu be toi lon
                return o1.getStudentAge() - o2.getStudentAge();
//                xap xep thu tu tu lon den be 0-o1.getStudentAge() - o2.getStudentAge();
            }
        });
        for (int i = 0; i < arrStudents.length; i++) {
            System.out.printf("Ma sv: %s -- Ten Sv: %s---tuoi:%d \n", arrStudents[i].getStudentID(), arrStudents[i].getStudentName(), arrStudents[i].getStudentAge());


        }
    }
}