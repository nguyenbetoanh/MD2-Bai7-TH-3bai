package ra.entily;

public class Student implements Comparable<Student> {
    private String studentID;
    private String studentName;
    private int studentAge;

    public Student() {
    }

    public Student(String studentID, String studentName, int studentAge) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    @Override
    public int compareTo(Student o) {
//        if (this.studentAge>o.getStudentAge()){
//            return 1;
//        } else if (this.studentAge==o.getStudentAge()) {
//            return 0;
//        }else
//        return -1;
//        sap xep theo thu tu tu lon xuong be
        return 0-(this.studentAge -o.getStudentAge());
        //        sap xep theo thu tu tu be xuong lon
//        return this.studentAge -o.getStudentAge();


    }
}
