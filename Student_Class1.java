public class Student_Class1 {

    String name;
    String dept;
    String birthdate;
    String address;

    public Student_Class1(String name,String dept,String birthdate,String address){

        this.name=name;
        this.dept=dept;
        this.birthdate=birthdate;
        this.address=address;

    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getAddress() {
        return address;
    }
}
