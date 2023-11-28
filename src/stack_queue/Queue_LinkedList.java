package stack_queue;

import linkedList.LinkedList;

enum AnimalType{
    DOG, CAT
}

abstract  class Animal{
    AnimalType type;
    String name;
    int order;
    Animal(AnimalType type, String name){
        this.type = type;
        this.name = name;
    }

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String info(){
        return order +"type: "+type+", name: " +name;
    }
}

class Dog extends Animal{
    Dog(String name){
        super(AnimalType.DOG,name);
    }
}

class Cat extends Animal{
    Cat(String name){
        super(AnimalType.CAT,name);
    }
}

class AnimalShelter{
    java.util.LinkedList<Dog> dogs = new java.util.LinkedList<>();
    java.util.LinkedList<Cat> cats = new java.util.LinkedList<>();
    int order;
    AnimalShelter(){
        order = 1;
    }
    void enqueue(Animal animal){
        // cat, dog 통합 몇번째로 들어갔는지 설정 하고 order ++
        animal.setOrder(order);
        order++;
        if(animal.type == AnimalType.DOG){
            dogs.addLast((Dog)animal);
        }else if (animal.type == AnimalType.CAT){
            cats.addLast((Cat) animal);
        }
    }

    Animal dequeueDog(){
        return dogs.poll();
    }
    Animal dequeueCat(){
        return cats.poll();
    }

    Animal randomDequeue(){
        if(dogs.size() == 0 && cats.size() ==0){
            return null;
        }else if (dogs.size()== 0 ){
            return cats.poll();
        }else if (cats.size()== 0){
            return dogs.poll();
        }

        //둘다 있는 경우
        Animal dog  = dogs.peek();
        Animal cat = cats.peek();
        if(cat.order<dog.order){
            return cats.poll();
        }else{
            return dogs.poll();
        }
    }
}

public class Queue_LinkedList {
    public static void main(String[] args) {
        Dog d1 = new Dog("d1");
        Dog d2 = new Dog("d2");
        Dog d3 = new Dog("d3");
        Cat c1 = new Cat("c1");
        Cat c2 = new Cat("c2");
        Cat c3 = new Cat("c3");

        AnimalShelter as= new AnimalShelter();
        as.enqueue(d1);
        as.enqueue(c1);
        as.enqueue(d2);
        as.enqueue(c2);
        as.enqueue(d3);
        as.enqueue(c3);

        System.out.println(as.dequeueCat().info());
        System.out.println(as.dequeueDog().info());
        System.out.println(as.randomDequeue().info());
        System.out.println(as.randomDequeue().info());
        System.out.println(as.randomDequeue().info());
        System.out.println(as.randomDequeue().info());
    }


}
