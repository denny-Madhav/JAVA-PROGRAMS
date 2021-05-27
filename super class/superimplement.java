class vehicle {
 int speed=100;
    
}
class car extends vehicle{
    int speed=120;
    void display()
    {
        System.out.println(speed);
        System.out.println(super.speed);
    }
}
class runny1{
    public static void main(String[] args) {
        car s=new car();
        s.display();
    }
}