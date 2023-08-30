package structural_patterns;

import structural_patterns.Composite_pattern.Employee;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee ceo = new Employee("Tharindu", "CEO", 25000);
        Employee hedSeal = new Employee("Robet", "Head seal", 25000);
        Employee hedMarketing = new Employee("Dakshina", "Head marketing", 50000);

        Employee clerk1 = new Employee("Lahiru", "marketing", 10000);
        Employee clerk2 = new Employee("Sampath", "marketing", 10000);

        Employee salesExecutive1 = new Employee("Gayan", "Sales", 20000);
        Employee salesExecutive2 = new Employee("Sampath", "Sales", 20000);

        ceo.add(hedSeal);
        ceo.add(hedMarketing);

        hedSeal.add(salesExecutive1);
        hedSeal.add(salesExecutive2);

        hedMarketing.add(clerk1);
        hedMarketing.add(clerk2);

        System.out.println(ceo);

        for (Employee temp : ceo.getSubordinates()) {
            System.out.println(temp);

            for (Employee temp2:temp.getSubordinates()) {
                System.out.println(temp2);
            }
        }


    }
}
