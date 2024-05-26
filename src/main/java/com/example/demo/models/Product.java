package com.example.demo.models;

import jdk.jfr.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Product extends BaseModel {
    private String title;
    private String price;
    private String description;
    private Category category;
    private String imageUrl;

}
