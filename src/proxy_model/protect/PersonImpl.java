package proxy_model.protect;

/**
 * Package:proxy_model.protect
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class PersonImpl implements PersonBean {
    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotOrNotRating() {
        if (ratingCount == 0) {
            return 0;
        }
        return (rating/ratingCount);
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }
}
