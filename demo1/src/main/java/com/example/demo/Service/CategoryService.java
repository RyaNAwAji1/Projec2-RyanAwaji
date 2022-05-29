package com.example.demo.Service;

import com.example.demo.Modele.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final ArrayList<Category> category = new ArrayList<>();

    public ArrayList<Category> getCategory() {
        return this.category;
    }
    public Boolean addCategoey(Category category) {

        if(isCategoryAvailable(category.getId())) {
            return false;
        }
        return categorys.add(category);
    }

    private boolean isCategoryAvailable(String id) {
        for(Category category: Categorys) {
            if (category.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
    public Boolean updateCategory(Category category) {
        return true;
    }

    public Boolean deletCategory(String id,String categoryid) {
        for(Category category: categorys) {
            if (category.getId().equals(categoryid)) {
                category.remove(category);
                return true;
            }
        }
        return false;
    }
    }



