package com.bridgeLabz.workShop_2;

public class Lion extends Animal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        animal.totalParts(2,1);
        animal.totalParts(2,1,4);
       // Lion lion = new Lion();
        //lion.sound();
        }
//       public void sound(){
//           System.out.println("Lion is roaring");
//        }
    }
class Animal{

   public void sound(){
        System.out.println("Animal have sounds");
    }
    int totalParts(int eyes,int head){
        System.out.println(eyes+head);
       return eyes+head;
    }
    int totalParts(int eyes,int head,int legs){
        System.out.println(eyes+head+legs);
        return eyes+head+legs;
    }

}