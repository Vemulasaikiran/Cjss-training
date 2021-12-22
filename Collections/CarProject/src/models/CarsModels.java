package models;

import java.util.List;

public class CarsModels {
    private String model;
    private List<CarCP> colorAndPrice;

    public CarsModels(String model, List<CarCP> colorAndPrice) {
        this.model = model;
        this.colorAndPrice = colorAndPrice;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<CarCP> getColorAndPrice() {
        return colorAndPrice;
    }

    public void setColorAndPrice(List<CarCP> colorAndPrice) {
        this.colorAndPrice = colorAndPrice;
    }
}
