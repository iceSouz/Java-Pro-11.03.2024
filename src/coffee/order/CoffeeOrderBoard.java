package coffee.order;

import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {
    private Queue<Order> orders;
    private int number;

    public CoffeeOrderBoard() {
        this.orders = new LinkedList<>();
    }

    public void add(String name) {
        number++;
        orders.add(new Order(number, name));
    }

    public Order deliver() {
        if (orders.isEmpty()) {
            System.out.println("Currently, there are no orders.");
            return null;
        }

        return orders.poll();
    }

    public Order deliver(int number) {
        Order foundOrder = null;

        for (Order order : orders) {
            if (order.getNumber() == number) {
                foundOrder = order;
                break;
            }
        }

        if (foundOrder != null) {
            orders.remove(foundOrder);
        }

        return foundOrder;
    }

    public void draw() {
        if (orders.isEmpty()) {
            System.out.println("Currently, there are no orders.");
            return;
        }

        System.out.println("=============\nNum | Name");
        for (Order order : orders) {
            System.out.println(order.getNumber() + " | " + order.getName());
        }
    }
}
