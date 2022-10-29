package salaryCalculation;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {

        Employee employee=new Employee("merve",20000,41,2020);
        System.out.println("isim: "+ employee.name);
        System.out.println("maaş: "+ employee.salary);
        System.out.println("ödenecek vergi: "+ employee.tax()+ "Tl");

        System.out.println(" ödenecek bonus: "+ employee.bonus()+ "Tl");

        System.out.println("maaş artışı: "+employee.raiseSalary()+ "Tl");
        System.out.println("toplam ödenecek maaş: "+ ((employee.salary) +(employee.raiseSalary())));
        System.out.println(employee.toString());

    }
}
