package pointofsales.entities;

import java.util.List;

public class Product {
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) throws Exception {
        if (!category.equals("Audio") &&
                !category.equals("Food") &&
                !category.equals("Drinks")) {
            throw new Exception("Unsupported category");
        }
        this.category = category;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private List<Note> notes;

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private List<SaleTax> saleTaxes;

    public List<SaleTax> getSaleTaxes() {
        return saleTaxes;
    }

    public void setSaleTaxes(List<SaleTax> saleTaxes) {
        this.saleTaxes = saleTaxes;
    }
}
