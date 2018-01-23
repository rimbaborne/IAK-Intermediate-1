package bdg.iakgoogle.intermediate1.entity;

/**
 * Created by Admin on 1/23/2018.
 */

public class Cuaca {
    private int image;
    private String title;
    private String information;

    public Cuaca(int image, String title, String information) {
        this.image = image;
        this.title = title;
        this.information = information;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
