package warehouse;

public class Warehouse {

    private int countOrder;
    private int balance;
    private static int warehousesAmount;
    private final int numberOfWarehouse;

    public Warehouse() {
        warehousesAmount ++;
        numberOfWarehouse = warehousesAmount;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Склад " + numberOfWarehouse + ": "
                + "Собрано заказов: " + countOrder
                + ", Доход от доставленных заказов: " + balance;
    }
}
