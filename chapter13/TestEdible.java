package chapter13;

public class TestEdible {
    public static void main(String[] args){
        Chicken tasty = new Chicken();
        System.out.println((tasty.howToEat()));
        Lion Roomie = new Lion();
        System.out.println((Roomie.sound()));

    }
}

abstract class Animal{
    /** return animal sound **/
    public abstract String sound();
}

class Chicken extends Animal implements Edible {
    public String sound(){
        return "Chicken: pock! ";
    }
    public String howToEat(){
        return "Chicken: Fry it Sha! ";
    }
}

abstract class Fruit implements Edible {

}
//public interface Edible{
//    public String howToEat();
//}

class Lion extends Animal {
    public String sound(){
        return "Lion: Rawry! ";
    }
}