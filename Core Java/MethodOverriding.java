class GrandMaster { // parent class
    public int area(int x, int y){
        return x*y;
    }
}

public class MethodOverriding extends GrandMaster { // child class + inheretance 
    @Override // overriding
    public int area(int x, int y){ // use same method name
        return (x*y)*2;
    }

    public static void main (String[] args){
        GrandMaster Mov = new GrandMaster();
        System.out.println(Mov.area(3,2));
    }
}
