import java.util.Date;

abstract class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject() {
        dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    @Override
    public String toString() {
        return "===== " + getClass().getSimpleName() + " =====" + "\ncolor: " + this.color + "\nfilled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
