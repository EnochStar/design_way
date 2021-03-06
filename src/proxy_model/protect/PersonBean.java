package proxy_model.protect;

/**
 * Package:proxy_model.protect
 * Description:
 *
 * @author:鲍嘉鑫
 */
public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
}
