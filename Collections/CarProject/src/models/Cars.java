package models;

import java.util.List;

public class Cars {
    private String model;
    private List<CarsModels> models;




    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<CarsModels> getModels() {
        return models;
    }

    public void setModels(List<CarsModels> models) {
        this.models = models;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", models=" + models +
                '}';
    }
}
