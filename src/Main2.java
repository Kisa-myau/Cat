public class Main2 {
    public static void main(String[] args) {
        Summa first = new Summa();
        System.out.println("суммa int от 2х переменных int = " + first.sum(4,5));

        Summa second = new Summa();
        System.out.println("суммa double от 3х переменных int = " + second.sum(1,4,7));

        Summa third = new Summa();
        System.out.println("суммa double от 2х переменных double = " + third.sum(5.8, 11.9));

        Summa fourth = new Summa();
        System.out.println("суммa double от 3х переменных double = " + fourth.sum(2.2, 3.3, 8.8));

        Summa fiveth = new Summa();
        System.out.println("суммa double от 1 int и от 2х переменных double = " + fiveth.sum(15,17.65,25.68));

        System.out.println("создание метода, возвращающего double из 2х переменных int, выдает ошибку");

        Summa sixth = new Summa();
        System.out.println("сумма double из 2х переменных Integer = " + sixth.sum(65,98));
    }
}
