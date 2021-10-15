class ParentOne { // parent class
    public int area(int x, int y){
        return x*y;
    }
}

public class InheretenceEx extends ParentOne { // child class
    public int total(int x, int y, int z){
        int area1 = z + area(x,y);
        return area1;
    }

    public static void main (String[] args){
        InheretenceEx inEX = new InheretenceEx();
        System.out.println(inEX.total(1,2,3));
    }
}
