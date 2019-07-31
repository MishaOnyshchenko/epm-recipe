package com.epm.recipe.service.impl.config;

import com.epm.recipe.persistence.RecipeRepository;
import com.epm.recipe.service.RecipeService;
import com.epm.recipe.service.impl.DefaultRecipeService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfiguration {

    @Bean
    public RecipeService recipeService(RecipeRepository recipeRepository) {
        return new DefaultRecipeService(recipeRepository);
    }

}
