import java.util.HashMap;
import java.util.Scanner;

public class Student_Class2 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        HashMap<String,Student_Class1> studentClass1HashMap=new HashMap<>();
        System.out.println("Enter roll_no: ");
        String roll_no=scan.nextLine();
        System.out.println("Enter student: ");
        String name=scan.nextLine();
        System.out.println("Enter dept: ");
        String dept=scan.nextLine();
        System.out.println("Enter birthdate: ");
        String birthdate=scan.nextLine();
        System.out.println("Enter address: ");
        String address= scan.nextLine();

        Student_Class1 obj=new Student_Class1(name,dept,birthdate,address);

        studentClass1HashMap.put(roll_no,obj);

        for(String e:studentClass1HashMap.keySet()){
            Student_Class1 ele=studentClass1HashMap.get(e);

            System.out.println(e+" "+ele.toString());
        }
    }
}
