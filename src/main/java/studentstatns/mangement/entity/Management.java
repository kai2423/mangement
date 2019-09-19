package studentstatns.mangement.entity;

import javax.validation.constraints.NotEmpty;

public class Management {

    private  String id;

    @NotEmpty
    private  String name;

    @NotEmpty
    private  String passwd;

    @NotEmpty
    private  String post;

    private  String classes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Management{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", passwd='" + passwd + '\'' +
                ", post='" + post + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
