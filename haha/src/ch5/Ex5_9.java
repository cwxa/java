package ch5;

class Animal{
    void cry(){}
}
class Dog extends Animal{
    void cry(){
        System.out.println("Wang!Wang!......"); 
    }  
}
class Cat extends Animal{
    void cry(){
        System.out.println("miao~~miao~~..."); 
    }  
}
public class Ex5_9{
    public static void main(String args[]){
        Animal animal;
        animal=new Dog(); //animal��Dog�������ת�Ͷ���
        animal.cry(); 
        animal=new Cat(); //animal��Cat�������ת�Ͷ���
        animal.cry(); 
    }
}
