package lab;

public class Donut {
    private Long id;
    private String nameOfDonut;
    private int price;
    private Long picture_id;
    private String description;
    private String[] ingredients;

    public Donut() {
    }

    public Donut(String nameOfDonut, int price, Long picture_id, String description, String[] ingredients) {
        this.nameOfDonut = nameOfDonut;
        this.price = price;
        this.picture_id = picture_id;
        this.description = description;
        this.ingredients = ingredients;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOfDonut() {
        return nameOfDonut;
    }

    public void setNameOfDonut(String nameOfDonut) {
        this.nameOfDonut = nameOfDonut;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Long getPicture_id() {
        return picture_id;
    }

    public void setPicture_id(Long picture_id) {
        this.picture_id = picture_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }
}
