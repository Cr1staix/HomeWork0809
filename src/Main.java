import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1\n");

        int humanAge = 15;
        String message;
        if (humanAge >= 2 && humanAge <= 6) {
            message = "в детский сад";
        } else if (humanAge >= 7 && humanAge <= 18) {
            message = "в школу";
        } else if (humanAge > 18 && humanAge <= 24) {
            message = "в университет";
        } else if (humanAge > 24) {
            message = "на работу";
        }else {
            message = "можно сидеть дома";
        }
        System.out.println("Если возраст человека равен " + humanAge + ", то ему " + message);

        System.out.println("\nЗадача №2\n");

        String employeeDiana = "Диана";
        String employeeAndrey = "Андрей";
        String employeeMaria = "Мария";
        int dianaSalary = 66660;
        int andreySalary = 77770;
        int mariaSalary = 88880;
        double salaryCoefficent = 0.15;
        double newDianaSalary = (dianaSalary * salaryCoefficent + dianaSalary);
        double newAndreySalary = (andreySalary * salaryCoefficent + andreySalary);
        double newMariaSalary = (mariaSalary * salaryCoefficent + mariaSalary);
        double dianaAnnualProfitDifference = (newDianaSalary * 12) - (dianaSalary * 12);
        double andreyAnnualProfitDifference = (newAndreySalary * 12) - (andreySalary * 12);
        double mariaAnnualProfitDifference = (newMariaSalary * 12) - (mariaSalary * 12);
        System.out.println(employeeDiana + " теперь получает " + newDianaSalary + "рублей. Годовой доход вырос на " + dianaAnnualProfitDifference + "рублей.");
        System.out.println(employeeAndrey + " теперь получает " + newAndreySalary + "рублей. Годовой доход вырос на " + andreyAnnualProfitDifference + "рублей.");
        System.out.println(employeeMaria + " теперь получает " + newMariaSalary + "рублей. Годовой доход вырос на " + mariaAnnualProfitDifference + "рублей.");

        System.out.println("\nЗадача №3\n");

        int monthNumber = 12;
        String season = switch (monthNumber){
            case 1, 2, 12 -> "На улице зима";
            case 3, 4, 5 -> "На улице весна";
            case 6, 7, 8 -> "На улице лето";
            case 9, 10 , 11 -> "На улице осень";
            default -> "В году 12 месяцев, начиная с 1";
        };
        System.out.println(season);

    }

}