abstract class MyAbstract{ // Abstract Class


    public abstract int add(int x, int y); // abstract method
    public int sub(int x, int y){ // implemented method
        return x-y;
    }
        
}

public class AbstractDemo extends MyAbstract{ // inherited absract methods

    @Override
    public int add(int x, int y){ // override and implement abstract methods 
        return x+y;
    }

    public static void main(String[] args){
        AbstractDemo AD = new AbstractDemo();
        System.out.println(AD.sub(1,2));
        System.out.println(AD.add(1,2));
    }

}
