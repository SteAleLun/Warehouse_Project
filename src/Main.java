import employees.Courier;
import employees.Picker;
import warehouse.Warehouse;

public class Main {
    public static void main(String[] args) {

        Warehouse warehouse1 = new Warehouse();
        Warehouse warehouse2 = new Warehouse();

        // нанимаем персонал на Склад 1:
        Picker picker1 = new Picker();
        Courier courier1 = new Courier();
        picker1.setWarehouse(warehouse1);
        courier1.setWarehouse(warehouse1);

        // нанимаем персонал на Склад 2:
        Picker picker2 = new Picker();
        Courier courier2 = new Courier();
        picker2.setWarehouse(warehouse2);
        courier2.setWarehouse(warehouse2);

        //####################### работает Склад 1: ##################################

        // впахивает сборщик 1
        for (int i = 0; i < 1500; i++) {
            picker1.doWork();
        }
        picker1.bonus();

        // впахивает курьер 1
        for (int i = 0; i < 1000; i++) {
            courier1.doWork();
        }
        courier1.bonus();

        // ############################################################################

        // проверяем данные после окончания работы Склада 1

        System.out.println("Поработал только Склад 1: \n");

        System.out.println(warehouse1.toString());
        System.out.println(warehouse2.toString());

        System.out.println("\nЗП сборщика 1: " + picker1.getSalary());
        System.out.println("ЗП курьера 1: " + courier1.getSalary());

        System.out.println("\nЗП сборщика 2: " + picker2.getSalary());
        System.out.println("ЗП курьера 2: " + courier2.getSalary());

        //####################### работает Склад 2: ##################################

        // сборщик 2 собрал один заказ
        picker2.doWork();
        // и попробовал получить бонус
        picker2.bonus();

        // курьер 2 сделал одну доставку
        courier2.doWork();
        // и попробовал получить бонус
        courier2.bonus();

        // ############################################################################

        // проверяем данные после окончания работы Склада 2
        System.out.println("\nСклад 1 отдыхает. Поработал Склад 2: \n");

        System.out.println(warehouse1.toString());
        System.out.println(warehouse2.toString());

        System.out.println("\nЗП сборщика 1: " + picker1.getSalary());
        System.out.println("ЗП курьера 1: " + courier1.getSalary());

        System.out.println("\nЗП сборщика 2: " + picker2.getSalary());
        System.out.println("ЗП курьера 2: " + courier2.getSalary());

    }
}
