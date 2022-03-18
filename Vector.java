public class Vector {

    public Vector(double[] cords){
        this.cords = cords;
    }

    public Vector(Vector v){
        this.cords = v.cords;
    }

    public int dim(){
        return cords.length;
    }

    private void checkVectors(Vector a, Vector b){
        if(a.dim() != b.dim()) throw new RuntimeException("Вектора должны быть одинаковой размерности");
    }

    public Vector diff(Vector v){
        checkVectors(this, v);
        double[] newCords = new double[v.dim()];
        for(int i = 0; i < v.dim(); i++)
            newCords[i] = this.cords[i] - v.cords[i];

        return new Vector(newCords);
    }

    public Vector sum(Vector v){
        checkVectors(this, v);
        double[] newCords = new double[v.dim()];
        for(int i = 0; i < v.dim(); i++)
            newCords[i] = this.cords[i] + v.cords[i];

        return new Vector(newCords);
    }

    public double scalar(Vector v){
        checkVectors(this, v);
        double result = 0;
        for(int i = 0; i < v.dim(); i++)
            result += this.cords[i]*v.cords[i];

        return result;
    }

    public double length(){
        return Math.sqrt(scalar(this));
    }


    public double angle(Vector v){
        checkVectors(this, v);
        if((this.length() * v.length()) != 0) {
            double cosa = scalar(v) / (this.length() * v.length());
            return Math.acos(cosa);
        }else{
            return 0;
        }
    }


    public double vecMul(Vector v){
        checkVectors(this, v);
        return this.length()*v.length()*Math.sin(this.angle(v));
    }

    public double square(Vector v){
        return this.vecMul(v);
    }

    @Override
    public String toString(){
        String str = new String();
        str += "(";
        for(int i = 0; i < dim(); i++)
            str += cords[i] + ", ";

        str+=")";

        return str;
    }

    private final double[] cords;
}
