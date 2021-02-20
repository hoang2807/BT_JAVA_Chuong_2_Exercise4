package exercise4.pack1;

public class Subject {
    private int tinchi;
    private float diem;

    public Subject() {
        tinchi = 0;
        diem = 0;
    }

    public Subject(int tinchi, float diem) {
        this.tinchi = tinchi;
        this.diem = diem;
    }

    public float getDiem() {
        return diem;
    }

    public int getTinchi() {
        return tinchi;
    }
}
