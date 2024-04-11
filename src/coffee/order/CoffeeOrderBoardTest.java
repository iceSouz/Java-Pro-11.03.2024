package coffee.order;

public class CoffeeOrderBoardTest {
    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("John");
        board.add("Emily");
        board.add("Benjamin");
        board.add("Michael");
        board.add("Sophia");

        board.draw();

        System.out.println();

        System.out.println("board.deliver(4) = " + board.deliver(4));
        board.draw();

        System.out.println();

        board.add("Olivia");
        board.draw();

        System.out.println();

        System.out.println("board.deliver() = " + board.deliver());
        board.draw();

        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        System.out.println();
        coffeeOrderBoard.add("Benjamin");
        coffeeOrderBoard.add("Michael");
        coffeeOrderBoard.add("Sophia");

        coffeeOrderBoard.draw();
    }
}
