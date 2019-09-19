package studentstatns.mangement.entity;




public class Student {


    private String name;


    private String idCardNumber;

    private String studentId;

    private String classes;

    private String sex;

    private String age;

    private String nation;

    private String NativePlace;

    private Education education = new Education();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getNativePlace() {
        return NativePlace;
    }

    public void setNativePlace(String nativePlace) {
        NativePlace = nativePlace;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", idCardNumber=" + idCardNumber +
                    ", studentId=" + studentId +
                    ", classes='" + classes + '\'' +
                    ", sex='" + sex + '\'' +
                    ", age='" + age + '\'' +
                    ", nation='" + nation + '\'' +
                    ", NativePlace='" + NativePlace + '\'' +
                    '}';
    }
}
