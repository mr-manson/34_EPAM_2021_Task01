package by.epamts.nikalaichanka_aleh.blueballs;

import java.util.Objects;

public class Ball {

    private String color;
    private int weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Ball() {
    }

    public Ball(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Ball ball = (Ball) o;
            return weight == ball.weight && Objects.equals(color, ball.color);
    }

    @Override
    public String toString() {
        return "Ball{" + "color='" + color + '\'' + ", weight=" + weight + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }
}
