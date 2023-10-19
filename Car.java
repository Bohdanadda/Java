public class Car {
    public String brand;
    public String model;
    public int speed;

    public Car(String brand, String model)
    {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }
    public void acelerate(int value)
    {
        speed += value;
    }

    public void dacelerate(int value)
    {
        if(speed - value >= 0)
        {
            speed -= value;
        }
        else
        {
            speed = 0;
        }
    }
    public int getSpeed()
    {
        return speed;
    }


}
