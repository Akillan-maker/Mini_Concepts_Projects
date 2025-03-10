import java.util.Scanner;

// Converting from one type to another

public class TypeConversion {

    private String a;
    private Scanner scanner=new Scanner(System.in);

    public void userOptions(){
        boolean exit=true;

        while(true){

            System.out.println("1.String\n2.Integer\n3.Float\n4.Double\n5.Exit\nEnter the value to convert: ");
            a=scanner.nextLine();
            System.out.println("Enter the type to convert: ");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.print("String: ");
                    System.out.println(a);
                    break;
                case 2:
                    int result=Integer.parseInt(a);
                    System.out.println(a+" is been convert to Integer: "+result);
                    break;
                case 3:
                    float resultF=Float.parseFloat(a);
                    System.out.println(a+" is been convert to Float: "+resultF);
                    break;
                case 4:
                    double resultD=Double.parseDouble(a);
                    System.out.println(a+" is been convert to Double: "+resultD);
                    break;
                case 5:
                    exit=false;
                    break;
            }
            if(!exit){
                break;
            }
        }
    }

    public static void main(String[] args) {

        TypeConversion obj=new TypeConversion();
        obj.userOptions();

    }
}