import java.util.Date;
/**
 * Created by Master on 8.1.2015.
 */
public class Students {
    private int id;
    private String name;
    private String lastName;
    private String midName;
    private String address;
    private String phoneNumber;
    private String department;
    private String group;
    private Date birthDate;
    private int course;

    public Students(int id, String name, String lastName, String midName, Date birthDate,
                    String address, String phoneNumber, String department, int course, String group){

        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.midName = midName;
        this.birthDate = birthDate;
        this.department = department;
        this.course = course;
        this.group = group;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        checkString(name);
        this.name = name;
    }

    public void setLastName(String lastName) {
        checkString(lastName);
        this.lastName = lastName;
    }

    public void setMidName(String midName) {
        checkString(midName);
        this.midName = midName;
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
        this.birthDate = (birthDate == null) ? this.birthDate : birthDate;
    }

    public void setCourse(int kurs) {
        this.course = kurs;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
            return lastName;
    }

    public String getMidName() {
        return midName;
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

    public int getCourse() {
        return course;
    }

    private void checkString(String s){
        if(s == null || s.equals(" "))
            throw new IllegalArgumentException("Неверно введены данные!");

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Students{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", midlName='").append(midName).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", department='").append(department).append('\'');
        sb.append(", group='").append(group).append('\'');
        sb.append(", birthDate=").append(birthDate);
        sb.append(", course=").append(course);
        sb.append('}');
        return sb.toString();
    }
}
