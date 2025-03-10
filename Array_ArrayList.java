import java.util.ArrayList;

// Simple contact List

public class Array_ArrayList {
    String name;
    Long number;

    public Array_ArrayList(String name, long number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public Long getNumber() {
        return number;
    }

    public static void main(String[] args) {

        Array_ArrayList contact1 = new Array_ArrayList("Ben", 2134565676);
        Array_ArrayList contact2 = new Array_ArrayList("Abdul", 634634673);
        Array_ArrayList contact3 = new Array_ArrayList("Chant", 758394657);

        ArrayList<Array_ArrayList> contactList = new ArrayList<>();

        contactList.add(contact1);
        contactList.add(contact2);
        contactList.add(contact3);

        for(Array_ArrayList e:contactList){
            System.out.println("Name: "+e.getName());
            System.out.println("Number: "+e.getNumber());
        }
    }
}
