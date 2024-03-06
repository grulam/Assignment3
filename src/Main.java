//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Honda", 2024);
        System.out.println(c1.make + " " + c1.year);

        Car c2 = new Car("BMW", 2017);
        System.out.println(c2.make + " " + c2.year);

        Car c3 = new Car("Toyota", 2021);
        System.out.println(c3.make + " " + c3.year);

        Car c4 = new Car("Lexus",2017);
        System.out.print(c4.toString());
        }

}