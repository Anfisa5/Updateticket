public class BonusMilesService {

    // метод calculate, который:
    // 1. принимает на вход один параметр: цену билета, типа int;
    // 2.анализируя значение переданного параметра, возвращает рассчитанное количество миль.
    int miles;

    public int calculate(int price) {

        miles = price / 20;

        return miles;
    }
}
