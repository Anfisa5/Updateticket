public class BonusMilesService {

    // метод calculate, который:
    // 1. принимает на вход один параметр: цену билета, типа int;
    // 2.анализируя значение переданного параметра, возвращает рассчитанное количество миль.

    //int miles; не нужно создавать ячейку, т.к. это не локальная переменная, тк они создаются только внутри методов
    public int calculate(int price) {

        // int miles = price / 20; можно сразу сделать return price / 20;

        return price / 20;

        //return miles;
    }
}
