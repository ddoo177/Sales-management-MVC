package QLBH_MVC.Controller;

import QLBH_MVC.Entity.Category;
import QLBH_MVC.Entity.Vegetable;
import QLBH_MVC.Repository.CategoryRepository;
import QLBH_MVC.Repository.VegetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VegetableController {

    @Autowired
    private VegetableRepository vegetableRepository;
    
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/shop")
    public String shopPage(Model m) {
        Iterable<Vegetable> list = vegetableRepository.findAll();
        Iterable<Category> list2 = categoryRepository.findAll();
        m.addAttribute("listVegetable", list);
        m.addAttribute("listCategory", list2);
        return "shop";
    }
    
    @GetMapping("/shop/{id}")
    public String shopPageCategory(@PathVariable("id") int id, Model m) {
        Iterable<Vegetable> list = vegetableRepository.findByCategory(id);
        Iterable<Category> list2 = categoryRepository.findAll();
        m.addAttribute("listVegetable", list);
        m.addAttribute("listCategory", list2);
        return "shop";
    }
    
    @GetMapping("/shop/result")
    public String shopPageCategory(@RequestParam("key") String key, Model m) {
        Iterable<Vegetable> list = vegetableRepository.findByNameContaining(key);
        Iterable<Category> list2 = categoryRepository.findAll();
        m.addAttribute("listVegetable", list);
        m.addAttribute("listCategory", list2);
        return "shop";
    }
    
    @GetMapping("/shop/bestseller")
    public String shopPageCategory(Model m) {
        Iterable<Vegetable> list = vegetableRepository.findTop5BySold();
        Iterable<Category> list2 = categoryRepository.findAll();
        m.addAttribute("listVegetable", list);
        m.addAttribute("listCategory", list2);
        return "shop";
    }
}