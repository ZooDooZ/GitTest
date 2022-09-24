package Exercise2;

public enum Department {

    HR(1),
    BRANDING(2),
    SALES(3),
    MARKETING(4),
    ADMINISTRATION(5),
    HEAD(6),
    IT(7);

    private final int departmentId;

    private Department(int id){
        this.departmentId = id;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                '}';
    }
}
