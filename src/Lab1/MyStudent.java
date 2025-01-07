package Lab1;

class StudentPCU
{
    String Name;
    int roll;
    String prn;
    String dob;
    char gen;


}
public class MyStudent {

    public static void main(String[] args) {
        System.out.println("Hi");
        StudentPCU studentPCU = new StudentPCU();
        studentPCU.Name = "Omkar";
        studentPCU.roll = 29;
        studentPCU.gen = 'F';
        System.out.println("Name :"+studentPCU.Name+" Gender :"+studentPCU.gen);

    }

}
