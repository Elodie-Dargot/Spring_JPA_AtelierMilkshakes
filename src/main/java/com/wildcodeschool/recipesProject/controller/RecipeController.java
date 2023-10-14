package com.wildcodeschool.recipesProject.controller;


import com.wildcodeschool.recipesProject.entity.Recipe;
import com.wildcodeschool.recipesProject.repository.RecipeRepository;
import org.hibernate.mapping.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class RecipeController {
    private final RecipeRepository recipeRepository;
    public RecipeController(RecipeRepository repositoryInjected){
        this.recipeRepository = repositoryInjected;
    }

    @GetMapping(path = "/recipes")
    public String getAll(Model model) {
        model.addAttribute("recipe", recipeRepository.findAll());
        return "recipes";
    }

    @GetMapping("/recipe")
    public String getRecipe(Model model,
                            @RequestParam(required = false) Long id) {

        Recipe recipe = new Recipe();
        if (id != null) {
            Optional<Recipe> optionalRecipe = recipeRepository.findById(id);
            if (optionalRecipe.isPresent()) {
                recipe = optionalRecipe.get();
            }
        }
        model.addAttribute("recipe", recipe);

        return "recipe";
    }

    @PostMapping("/recipe")
    public String postWizard(@ModelAttribute Recipe recipe) {

        recipeRepository.save(recipe);
        return "redirect:/wizards";
    }

    @GetMapping("/recipe/delete")
    public String deleteRecipe(@RequestParam Long id) {

        recipeRepository.deleteById(id);

        return "redirect:/recipes";
    }

}
