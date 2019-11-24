import java.util.Scanner;
/*Реализуйте класс R3Vector, позволяющий выполнять над векторами в пространстве следующие операции: сложение, вычитание, умножение на число, вычисление скалярного, векторного и смешанного произведений.*/
public class R3Vector {
    private double x;
    private double y;
    private double z;
    public R3Vector() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координату x => ");
        x = in.nextDouble();
        System.out.println("Введите координату y => ");
        y = in.nextDouble();
        System.out.println("Введите координату z => ");
        z = in.nextDouble();
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public R3Vector(double x1, double y1, double z1) {
        this.x = x1;
        this.y = y1;
        this.z = z1;
    }
    public static R3Vector slozheniye(R3Vector a, R3Vector b) {
        System.out.println("Координаты нового вектора, полученного из суммы вектора a и вектора b, равны => " + (a.x + b.x) + "; " + (a.y + b.y) + "; " + (a.z + b.z));
        return new R3Vector(a.x + b.x, a.y + b.y, a.z + b.z);
    }
    public static R3Vector vichitaniye(R3Vector a, R3Vector b) {
        System.out.println("Координаты нового вектора, полученного из разности вектора a и вектора b, равны => " + (a.x - b.x) + "; " + (a.y - b.y) + "; " + (a.z - b.z));
        return new R3Vector(a.x - b.x, a.y - b.y, a.z - b.z);
    }
    public static R3Vector nachislo(R3Vector a) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для умножения => ");
        double n = in.nextDouble();
        System.out.println("Координаты нового вектора, полученного из умножения вектора a на число n, равны => " + (a.x * n) + "; " + (a.y * n) + "; " + (a.z * n));
        return new R3Vector(a.x * n, a.y * n, a.z * n);
    }
    public static void skalyarnoe(R3Vector a, R3Vector b) {
        System.out.println("Скалярное произведение вектора a и вектора b равно => " + (a.x * b.x + a.y * b.y + a.z * b.z));
    }
    public static void vectornoye(R3Vector a, R3Vector b) {
        System.out.println("Векторное  произведение равно => " + ((a.y * b.z - a.z * b.y) + "; " + (a.z * b.x - a.x * b.z) + "; " + (a.x * b.y - a.y * b.x)));
    }
    public static void smeshannoye(R3Vector a, R3Vector b, R3Vector c) {
        System.out.println("Cмешанное произведение вектора a и вектора b равно => " + (a.x * b.y * c.z + a.y * b.z * c.x + a.z * b.x * c.y - a.z * b.y * c.x - a.y * b.x * c.z - a.x * b.z * c.y));
    }
    public static void main(String[] args) {
        R3Vector a = new R3Vector();
        R3Vector b = new R3Vector();
        R3Vector c = new R3Vector();
        slozheniye(a, b);
        vichitaniye(a, b);
        nachislo(a);
        skalyarnoe(a, b);
        vectornoye(a, b);
        smeshannoye(a, b, c);
    }
}
