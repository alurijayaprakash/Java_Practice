public class MethodOverLoading { 
    
    public int area(int x){;
        return x*x;
    }

    public int area(int x, int y){
        return x*y;
    }

    public static void main (String[] args){
        MethodOverLoading MethOvL = new MethodOverLoading();
        System.out.println(MethOvL.area(2));
        System.out.println(MethOvL.area(3,2));
    }
}
