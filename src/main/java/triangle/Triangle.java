package triangle;

public class Triangle {
    private float a;
    private float b;
    private float c;
    public Triangle(float a, float b, float c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public float getA() {
        return a;
    }
    public void setA(float a) {
        this.a = a;
    }
    public float getB() {
        return b;
    }
    public void setB(float b) {
        this.b = b;
    }
    public float getC() {
        return c;
    }
    public void setC(float c) {
        this.c = c;
    }


    public float nuaChuVi(float a, float b,float c) {
        return (a+b+c)/2;
    }

    public float chuVi(float a, float b,float c) {
        return a+b+c;
    }

    public float dienTich(float a, float b,float c) {
        float p= (a+b+c)/2;
        float sd;
        sd = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return sd;
    }
    @Override
    public String toString() {
        return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
    }


}