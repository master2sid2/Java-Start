import java.util.Date;

/**
 * Created by Master on 8.1.2015.
 */
public class Students {
    private int id;
    private String name,soname,midlName,address,phoneNumber,department,group;
    private Date birthDate;
    private int kurs;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSoname(String soname) {
        this.soname = soname;
    }

    public void setMidlName(String midlName) {
        this.midlName = midlName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getSoname() {
        return soname;
    }

    public String getMidlName() {
        return midlName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getGroup() {
        return group;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getKurs() {
        return kurs;
    }

    public Students(int id, String name, String soname, String midlName, Date birthDate,
                    String address, String phoneNumber, String department, String kurs, String group){

        this.id = id;
        this.name = name;
        this.soname = soname;
        this.midlName = midlName;
        this.birthDate = birthDate;
        this.department = department;
        this.group = group;
        this.address = address;
        this.phoneNumber = phoneNumber;




    }


}
