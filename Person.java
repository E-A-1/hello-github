public class Person {
    int height;
    int weight;
    String color;
    int add(int a){
        System.out.println(a);
        return a;
    }
    int add(){
        System.out.println("NOn param method");
        return 1;
    }
    
}
class Man extends Person{
  
    
    public static void main(String[] args) {
Man man1=new Man();
man1.add();
    }
}
