public class Main {
    public static void main(String[] args) {
/*        String phone = "+927-111-11 11";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний");
        }

        System.out.println("phone = " + phone);
        String expectedPhone = "79271111111";
        if (phone.equals(expectedPhone)) {
            System.out.println("Удача");
        } else {
            System.out.println("Неудача");
        }
 */
        //task1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        //task2
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName.toUpperCase());
        //task3
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника "+ fullName);


    }
}