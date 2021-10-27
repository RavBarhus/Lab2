

public class Point3d {
    /** координата X **/
    private double xCoord;
    /** координата Y **/
    private double yCoord;
    /** координата Y **/
    private double zCoord;
    /** Конструктор инициализации **/
    public Point3d ( double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord= z;
    }
    /** Конструктор по умолчанию. **/
    public Point3d () {
        this(0, 0, 0);
    }
    /** Возвращение координаты X **/
    public double getX () {
        return xCoord;
    }
    /** Возвращение координаты Y **/
    public double getY () {
        return yCoord;
    }
    public double getZ () {
        return zCoord;
    }
    /** Установка значения координаты X. **/
    public void setX ( double val) {
        xCoord = val;
    }
    /** Установка значения координаты Y. **/
    public void setY ( double val) {
        yCoord = val;
    }
    /** Установка значения координаты Z. **/
    public void setZ ( double val) {
        zCoord = val;
    }
    /** Сравнение по трем точкам**/
    public boolean equalsDots(Point3d obj){
        return xCoord==obj.xCoord && yCoord==obj.yCoord && zCoord==obj.zCoord;
    }
    /** Сравнение по точке X**/
    public boolean equalsDotX(Point3d obj){
        return xCoord==obj.xCoord;
    }
    /** Сравнение по точке Y**/
    public boolean equalsDotY(Point3d obj){
        return yCoord==obj.yCoord;
    }
    /** Сравнение по точке Z**/
    public boolean equalsDotZ(Point3d obj){
        return zCoord==obj.zCoord;
    }
    /**Расчет дистанции до точки **/
    public double distanceTo(Point3d obj){
        return Math.sqrt(Math.pow(obj.xCoord-xCoord,2)+
                Math.pow(obj.yCoord-yCoord,2)+Math.pow(obj.zCoord-zCoord,2));
    }
    /**Статический метод для расчета площади **/
    public static double computeArea(Point3d a,Point3d b,Point3d c){
        if (a.equalsDots(b) || b.equalsDots(c) || c.equalsDots(a)){
            System.out.println("Одинаковые точки");
            return 0;
        }
        double p=(a.distanceTo(b)+b.distanceTo(c)+c.distanceTo(a))/2;
        return Math.sqrt(p*(p-a.distanceTo(b))*(p-b.distanceTo(c))*(p-c.distanceTo(a)));
    }
}





