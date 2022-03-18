public class VectorTest {
    public static void main(String[] args) {
        Vector a = new Vector(new double[]{1.4, -2.3, 4.3, -2});
        Vector b = new Vector(new double[]{1.3, 3.3, 9.1, -1});

        System.out.println("a + b = " + a.sum(b));
        System.out.println("a - b = " + a.diff(b));
        System.out.println("модуль a = " + a.length());
        System.out.println("скалярное произведение a*b = " + a.scalar(b));
        System.out.println("Векторное произв a*b по модулю = " + a.vecMul(b));
        System.out.println("Угол между a и b в радианах = " + a.angle(b));
        System.out.println("Площадь параллелограмма образованного векторами a b = " + a.square(b));

    }
}
