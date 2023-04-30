public class CompositePatternDemo {
    public static void main(String[] args) {

        Employee CEO = new Employee("Jaivik","CEO", 30000);

        Employee headSales = new Employee("lone wolf","HO", 20000);

        Employee headMarketing = new Employee("White Wolf","HR", 20000);

        Employee clerk1 = new Employee("Lekha","bf", 10000);
        Employee clerk2 = new Employee("jatan","bf", 10000);

        Employee salesExecutive1 = new Employee("jay","Sales", 10000);
        Employee salesExecutive2 = new Employee("bob","Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //print all employees of the organization
        System.out.println(CEO);

        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}