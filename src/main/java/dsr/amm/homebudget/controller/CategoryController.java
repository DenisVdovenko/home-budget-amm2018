package dsr.amm.homebudget.controller;

import dsr.amm.homebudget.data.dto.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import dsr.amm.homebudget.data.entity.Category;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.*;

import dsr.amm.homebudget.service.CategoryService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<CategoryDTO> getAll() {
        return service.getCategories();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createOne(@RequestBody @Valid CategoryDTO categoryDTO) {
        service.create(categoryDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }
}
