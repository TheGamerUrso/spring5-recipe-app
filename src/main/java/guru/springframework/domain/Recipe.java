package guru.springframework.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;

@Entity
public class Recipe 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Name;
    private String description;
    private String prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String direction;
    //TODO add Difficulty
    //private Difficulty difficulty;
    
    @Lob
    private Byte[] image;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return Name;
    }
 
    public void setName(String name) {
        Name = name;
    }
 
    public String getDescription() {
        return description;
    }
 
    public void setDescription(String description) {
        this.description = description;
    }
 
    public String getPrepTime() {
        return prepTime;
    }
 
    public void setPrepTime(String prepTime) {
        this.prepTime = prepTime;
    }
 
    public Integer getCookTime() {
        return cookTime;
    }
 
    public void setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
    }
 
    public Integer getServings() {
        return servings;
    }
    
    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getDirection() {
        return direction;
    }
    public void setDirection(String direction) {
        this.direction = direction;
    }
    public Byte[] getImage() {
        return image;
    }
    public void setImage(Byte[] image) {
        this.image = image;
    }
    public Notes getNotes() {
        return notes;
    }
    public void setNotes(Notes notes) {
        this.notes = notes;
    }  

}
