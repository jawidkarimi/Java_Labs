package lab11_inheritance_abstraction;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person = new Person("Hasan", 33, 'M');
        person.eat("rice");
        System.out.println(person);

        Tester tester = new Tester("Jan", 45, 'M', "A33", "Tester", 120000);
        tester.work();
    }
}
