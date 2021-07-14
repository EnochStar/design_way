import java.util.Date;

/**
 * Package:PACKAGE_NAME
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class Person {
    private Date date;
    private String name;

    public Person(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "date=" + date +
                ", name='" + name + '\'' +
                '}';
    }
}
