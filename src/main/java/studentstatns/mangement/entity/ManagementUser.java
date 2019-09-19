package studentstatns.mangement.entity;


import javax.validation.constraints.NotEmpty;


public class ManagementUser {


    private String  id;

    @NotEmpty
    private String passwd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "ManagementUser{" +
                "id='" + id + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
