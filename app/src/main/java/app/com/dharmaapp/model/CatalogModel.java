package app.com.dharmaapp.model;

public class CatalogModel {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    private String name;
    private int image;
    private String path;

    public CatalogModel(String name, int image, String path) {
        this.name = name;
        this.image = image;
        this.path = path;
    }
}
