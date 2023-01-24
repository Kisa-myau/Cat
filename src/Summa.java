public class Summa {
    int a, b, c;
    double x,y,z;
    public int sum (int a,int b){
        int s1=a+b;
        return s1;
    }
    public double sum (int a, int b, int c){
        int s2 = a+b+c;
        return s2;
    }
    public double sum (double x, double y){
        double s3=x+y;
        return s3;
    }
    public  double sum (double x, double y, double z){
        double s4 = x+y+z;
        return s4;
    }
    public double sum (int a, double x, double y){
        double s5 = a+x+y;
        return s5;
    }
    public double sum (Integer i, Integer j){
        double s6 = i+j;
        return s6;
    }

}
