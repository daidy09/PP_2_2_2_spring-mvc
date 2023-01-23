package Model;

public class Car {


    private String color;
    private int seats;
    private int speed;

    public Car() {
    }
    public Car(String color, int seats, int speed) {
        this.color = color;
        this.seats = seats;
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", seats=" + seats +
                ", speed=" + speed +
                '}';
    }
}
