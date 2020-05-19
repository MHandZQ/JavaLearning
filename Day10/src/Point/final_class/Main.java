package Point.final_class;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(123,456);
        System.out.println(p.x());
        System.out.println(p.y());
        System.out.println(p);
    }
}


final class Point{
    private final int x;
    private final int y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int x(){return this.x;}

    public int y(){return this.y;}
}