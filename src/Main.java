public class Main {
    public static void main(String[] args) {
        Cat murzik = new Cat(3,"Зеленый",2,"Полосатый");
        System.out.println("Имя Возраст цвет глаз вес цвет шерсти");
        System.out.println("Мурзик "+murzik.toString());

        Cat pushok = new Cat();
        pushok.age = 17;
        pushok.eyesColor = "Голубой";
        pushok.weight = 3;
        pushok.woolColor = "Рыжий";
        System.out.println("Пушок "+ pushok.age+pushok.eyesColor+pushok.weight+pushok.woolColor);
    }
}