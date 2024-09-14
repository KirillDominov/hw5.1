public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        int[] coast = {30, 40, 50, 60, 70};
        int sum = 0;
        for (int index = 0; index < coast.length; index++) {
            sum += coast[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
        System.out.println("Задача № 2");
        int maxCoast = 0;
        for (int i = 0; i < coast.length; i++) {
            if (coast[i] > maxCoast) {
                maxCoast = coast[i];
            }
        }
        int minCoast = 1000000000;
        for (int i = 0; i < coast.length; i++) {
            if (coast[i] < minCoast) {
                minCoast = coast[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minCoast + " рублей. Максимальная сумма за день составила " + maxCoast + " рублей.");
        System.out.println();
        System.out.println("Задача № 3");
        int sumCoast = 0;
        double expense = 0;
        int expenseCoastLength = coast.length;
        for (int i : coast) {
            sumCoast += i;
        }
        expense = (double) sumCoast / expenseCoastLength;
        System.out.println("Средняя сумма трат за месяц составила " + expense + " рублей");
        System.out.println();
        System.out.println("Задача № 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }
}