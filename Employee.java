import java.util.Scanner;

public class Employee {

    /////// home work 14.7.2022/////
    //DATA//
    String firstname;
    String lastname;
    double salary;
    int floor;
    int id;

    //const///

    public Employee(String firstname, String lastname, double salary, int floor, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.floor = floor;
        this.id = id;
    }


    ///func///

    void raiseUpSalary(){
        this.salary= this.salary +100;
    }

    void changeFloor(int newfloor){
        this.floor= newfloor;
    }


    ////TOSTRING


    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                ", floor=" + floor +
                ", id=" + id +
                '}';
    }
}
