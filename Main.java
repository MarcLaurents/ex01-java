public class Main {
    public static void main(String args[]) {
        var person = new Person();
        var employee = new Employee();
        var professor = new Professor();
        
        person.setName("Marcelo");
        person.setLastName("Melo");
        employee.setName("John");
        employee.setLastName("Due");
        employee.setId(1);
        employee.setSalary(3000);
        professor.setName("João");
        professor.setLastName("Zinho");
        professor.setId(2);
        professor.setSalary(1500);
        
        System.out.println("Person's name: " + person.getName());
        System.out.println("Person's last name: " + person.getLastName());
        System.out.println("Person's full name: " + person.getFullName());
        System.out.println("Employee's name: " + employee.getName());
        System.out.println("Employee's last name: " + employee.getLastName());
        System.out.println("Employee's full name: " + employee.getFullName());
        System.out.println("Employee's id: " + employee.getId());
        System.out.println("Employee's salary: " + employee.getSalary());
        System.out.println("Employee's first pay salary: " + employee.getFirstPaySalary());
        System.out.println("Employee's second pay salary: " + employee.getSecondPaySalary());
        System.out.println("Professor's name: " + professor.getName());
        System.out.println("Professor's last name: " + professor.getLastName());
        System.out.println("Professor's full name: " + professor.getFullName());
        System.out.println("Professor's id: " + professor.getId());
        System.out.println("Professor's salary: " + professor.getSalary());
        System.out.println("Professor's first pay salary: " + professor.getFirstPaySalary());
        System.out.println("Professor's second pay salary: " + professor.getSecondPaySalary());
    }
}
