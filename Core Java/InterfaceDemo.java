interface Myinterface{
    public abstract int add(int a, int b);
    public abstract int sub(int a, int b);
}

public class InterfaceDemo implements Myinterface{

    @Override
    public int add(int a, int b){
        return a+b;
    }

    @Override
    public int sub(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        InterfaceDemo poll = new InterfaceDemo();
        poll.add(2, 3);
    }
}