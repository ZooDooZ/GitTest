package Exercise1;

import java.util.Objects;

public class Box {


    private String mark;
    private String model;
    private int vintageCar;

    public Box(String mark, String model, int vintageCar) {
        this.mark = mark;
        this.model = model;
        this.vintageCar = vintageCar;
    }

    public Box(Box box2){
        this.mark = box2.mark;
        this.model = box2.model;
        this.vintageCar = box2.vintageCar;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVintageCar(int vintageCar) {
        this.vintageCar = vintageCar;
    }

    @Override
    public String toString() {
        return "Box{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", vintageCar=" + vintageCar +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return vintageCar == box.vintageCar && Objects.equals(mark, box.mark) && Objects.equals(model, box.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, model, vintageCar);
    }
}
