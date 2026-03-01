package com.food.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long category_id;

    private String categoryName;
    private String description;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private Set<FoodItem> items = new HashSet<>();

    public Category() {}

    public Category(long category_id, String categoryName, String description) {
        this.category_id = category_id;
        this.categoryName = categoryName;
        this.description = description;
    }

	public long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(long category_id) {
		this.category_id = category_id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<FoodItem> getItems() {
		return items;
	}

	public void setItems(Set<FoodItem> items) {
		this.items = items;
	}
    

}