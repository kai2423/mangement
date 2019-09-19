package studentstatns.mangement.entity;

public class Student_change {


    private String name_change;


    private String idCardNumber_change;

    private String studentId_change;

    private String classes_change;

    private String sex_change;

    private String age_change;

    private String nation_change;

    private String nativePlace_change;

    public String getName_change() {
        return name_change;
    }

    public void setName_change(String name_change) {
        this.name_change = name_change;
    }

    public String getIdCardNumber_change() {
        return idCardNumber_change;
    }

    public void setIdCardNumber_change(String idCardNumber_change) {
        this.idCardNumber_change = idCardNumber_change;
    }

    public String getStudentId_change() {
        return studentId_change;
    }

    public void setStudentId_change(String studentId_change) {
        this.studentId_change = studentId_change;
    }

    public String getClasses_change() {
        return classes_change;
    }

    public void setClasses_change(String classes_change) {
        this.classes_change = classes_change;
    }

    public String getSex_change() {
        return sex_change;
    }

    public void setSex_change(String sex_change) {
        this.sex_change = sex_change;
    }

    public String getAge_change() {
        return age_change;
    }

    public void setAge_change(String age_change) {
        this.age_change = age_change;
    }

    public String getNation_change() {
        return nation_change;
    }

    public void setNation_change(String nation_change) {
        this.nation_change = nation_change;
    }

    public String getNativePlace_change() {
        return nativePlace_change;
    }

    public void setNativePlace_change(String nativePlace_change) {
        this.nativePlace_change = nativePlace_change;
    }

    @Override
    public String toString() {
        return "Student_change{" +
                "name_change='" + name_change + '\'' +
                ", idCardNumber_change='" + idCardNumber_change + '\'' +
                ", studentId_change='" + studentId_change + '\'' +
                ", classes_change='" + classes_change + '\'' +
                ", sex_change='" + sex_change + '\'' +
                ", age_change='" + age_change + '\'' +
                ", nation_change='" + nation_change + '\'' +
                ", nativePlace_change='" + nativePlace_change + '\'' +
                '}';
    }
}
