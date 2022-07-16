import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ////////////////////////////sior 14.7.2022//////////////////

               //////targil 1//////

        // Triangle t1 = new Triangle(3,4,5,4);
        // Triangle t2 = new Triangle(1,2,3,3);
        //
        // t1.calcarea();
        // t1.calcHekef();
        //
        // t2.calcHekef();
        // t2.calcHekef();
        //
        // System.out.println(t1.area);
       //  System.out.println(t2);



        //////targil 3//////

     //   Circle c1 = new Circle(18);
     //   System.out.println(c1);
     //   c1.updatradios(5);
     //   System.out.println(c1);

        //////// home work 14.7.2022 employee//////

        Scanner scanner=new Scanner(System.in);

       // System.out.println("please enter a firstname");
       // String firstname= scanner.next();
       // System.out.println("pleae enter a lastname");
       // String lastname= scanner.next();
       // System.out.println("please enter a salary");
       // double salay= scanner.nextDouble();
       // System.out.println("please enter a floor");
       // int floor= scanner.nextInt();
       // System.out.println("please enter a id");
       // int id= scanner.nextInt();

        Employee idan = new Employee("idan", "sakat",100,2,2);
        Employee liron = new Employee("liron", "abcd",500,2,3);
        Employee aviv = new Employee("aviv", "eit",1000,4,4);
        idan.raiseUpSalary();
        idan.changeFloor(3);
        System.out.println(idan);
        System.out.println(liron);
        System.out.println(aviv);

    }
}
