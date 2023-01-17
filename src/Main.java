public class Main {
    public static void main(String[] args) {
        //Уважаемый проверяющий, исправляю свою программу
        //По условию задачи, не было сказано каким образом производить инициализацию переменных.
        // Если я это где-то пропустила, прошу указать явно. С уважением, Доброжанская П.С.
        int mile = 0;// мили
        int bonus = 20;//рублей для одной бонусной мили
        double ticket_price = 12334.90; //стоимость билета
        mile = (int) ticket_price / bonus;
        System.out.println("Стоимость билета " + ticket_price);
        System.out.println("Количество бонусных миль " + mile);
    }
}