package trainingday3.src.main.java.by.epam.training.entities;

public class Ball {
    private final String color;
    private final int weight;

    public Ball(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if(getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        return weight == ball.weight &&
                color.equals( ball.color);
    }

    @Override
    public int hashCode() {
        if(color != null && weight != 0){
            return Math.abs(color.hashCode()) - Math.abs(new Integer(weight).hashCode());
        }
        return hashCode();
    }

    @Override
    public String toString(){
        return getClass().getName() + "@" + " color: " + color + ", weight: " + weight;
    }
}
