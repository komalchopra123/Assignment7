public interface interfaceAnimals{
 void speak();
 void eat();

public static void main(String[] args){
Cat n=new Cat();
Dog m=new Dog();
n.speak();
n.eat();
m.speak();
m.eat();	}
}
   class Cat implements interfaceAnimals{
    public void speak()
   {
     System.out.println("Cat eat");
    }
   public void eat(){
   System.out.println("Cat eat");
      }
       	}
              class Dog implements interfaceAnimals{
     public void speak()
   {
   System.out.println("Dog speak");
   }
   public void eat()
   {
   System.out.println("Dog eat");
    }
    }

