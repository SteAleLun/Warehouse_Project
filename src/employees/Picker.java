package employees;

import warehouse.Warehouse;
import worker.Worker;

public class Picker implements Worker {

    private int salary;

    Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
    }


    @Override
    public void bonus() {
        if(warehouse.getCountOrder() >= 1500) salary = getSalary() * 3;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
}
