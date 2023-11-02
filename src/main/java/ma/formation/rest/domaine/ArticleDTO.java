package ma.formation.rest.domaine;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
@Data

public class ArticleDTO implements Serializable {
    private Long id;
    @Size(min = 1, max = 30, message = "description size must be between 1 and 30")
    private String description;
    private Double price;
    @Min(value = 1, message = "The quantity value must be greeter than 1")
    private Double quantity;


    public void ArticleDTO (){}

    public ArticleDTO(Long id, String description, Double price, Double quantity) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
}