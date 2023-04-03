package employees;

import warehouse.Warehouse;
import worker.Worker;

public class Courier implements Worker {

    private int salary;

    private Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance() + 1000);
    }

    @Override
    public void bonus() {
        if(warehouse.getBalance() >= 1000000) salary = getSalary() * 2;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
}
