package com.company;

public class Main {

    public static void main(String[] args) {
        cat cat = new cat("Рыба", "Россия","Чел");
        dog dog = new dog("Мясо", "Китай","Висячие");
        horse horse = new horse("Сено", "США",64);
        cat.eat();
        horse.MakeNoise();
        dog.sleep();
        Vet.treatAnimal(cat);
        Vet.treatAnimal(dog);
        Vet.treatAnimal(horse);
    }
}
class Animal{
    private String food;
    public String location;

    public Animal(String food, String location){
        this.food = food;
        this.location = location;
    }
    public String Getfood(){
        return food;
    }

    public void MakeNoise(){
        System.out.println("Шум");
    }

    public void eat(){
        System.out.println("Кушоет");
    }

    public void sleep(){
        System.out.println("Спит");
    }
    public String GetAnimalType(){
        return "Animal";
    }
}
class cat extends Animal {
    private String name;

    public cat(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.printf("Кот %s кушает %s \n", name, Getfood());
    }

    @Override
    public void MakeNoise() {
        System.out.println("Мяу");
    }

    @Override
    public String GetAnimalType() {
        return "Кот";
    }
}
class dog extends Animal{
    public String earstype;
    public dog(String food, String location, String earstype) {
        super(food, location);
        this.earstype = earstype;
    }
    @Override
    public void eat(){
        System.out.printf("Песик с %s ушами ест %s\n",earstype,Getfood());
    }
    @Override
    public void MakeNoise(){
        System.out.println("Гав");
    }

    @Override
    public String GetAnimalType() {
        return "Собака";
    }
}
class horse extends Animal{
    public int speed;

    public horse(String food, String location, int speed) {
        super(food, location);
        this.speed = speed;
    }

    @Override
    public void eat(){
        System.out.printf("Конь кушает %s на скорости %d\n",Getfood(),speed);
    }

    @Override
    public void MakeNoise() {
        System.out.println("Игого");
    }

    @Override
    public String GetAnimalType() {
        return "Конь";
    }
}
class Vet{
    static void treatAnimal(Animal animal){
        System.out.printf("На приёме %s, которое ест %s и находится в %s \n",animal.GetAnimalType(), animal.Getfood(), animal.location);
    }
}
