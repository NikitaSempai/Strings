public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1(){
        System.out.println("------1------");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        task2(fullName);
        task3(fullName);
    }
    public static void task2(String fullName){
        System.out.println("------2------");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }
    public static void task3(String fullName){
        System.out.println("------3------");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё','е');
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}