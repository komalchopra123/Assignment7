abstract class Animals{
 String breed,color,name;
  abstract void eat();
   void speak(){
  System.out.println("speak method is called");
}
}

 class Dog extends Animals{
 Dog(String breed, String color, String name){
 this.breed=breed;
 this.color=color;
 this.name=name;
 }
 
void eat(){
 System.out.println("eat method called");
 System.out.println("name is:"+name+", breed is: "+breed+", color is: "+color); 
}
}

 public class AnimalsA{
public static void main(String[] args){
Animals a=new Dog("zabra", "white", "hero");
Dog d=new Dog("alpha", "brown","alax");
a.eat();
a.speak();
}
}