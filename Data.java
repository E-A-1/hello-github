public class Data {
    public static void main(String[] args) {
        
      AccessData ac=new AccessData();
     int value= ac.getNum();
    ac.setNum(10);
    int value2=ac.getNum();
    
     System.out.println(value);
     System.out.println(value2);
    }
  
}
class AccessData{
  private int num=78;
   public int getNum() {
       if(num<10){

       }else{
           
       }
    return num;
}
public void setNum(int num) {
    if(num<10){

    }
    this.num = num;
}
public int getNum2() {
    return num2;
}
public void setNum2(int num2) {
    this.num2 = num2;
}
private int num2=90;
}
