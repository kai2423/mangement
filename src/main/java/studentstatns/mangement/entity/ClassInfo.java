package studentstatns.mangement.entity;


public class ClassInfo {

    private String classes;
    private String teacher;
    private String num;

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ClassInfo{" +
                "classes='" + classes + '\'' +
                ", teacher='" + teacher + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}
