package juli.unit_prize;

import javax.persistence.Entity;

@Entity
public class Product {
    private String name;
    private Double unitPrize;

    public Product() {
    }

    public Product(String name, Double unitPrize) {
        this.name = name;
        this.unitPrize = unitPrize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getUnitPrize() {
        return unitPrize;
    }

    public void setUnitPrize(Double unitPrize) {
        this.unitPrize = unitPrize;
    }
}
