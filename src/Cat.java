public class Cat extends Animal {
    int age;
    String eyesColor;
    int weight;
    String woolColor;

    public  Cat(){ // непараметризованный конструктор
        age = 0;
        eyesColor = "";
        weight=0;
        woolColor = "";
    }

    public Cat (int age, String eyesColor, int weight, String woolColor){ // параметризованный конструктор
        this.age=age;
        this.eyesColor = eyesColor;
        this.weight=weight;
        this.woolColor = woolColor;
    }
    @Override
    public String toString (){
        String s = age+ eyesColor +weight+ woolColor;
        return s;
    }
}
