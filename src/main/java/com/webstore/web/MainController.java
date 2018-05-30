package com.webstore.web;

import com.webstore.domain.ProductInstance;
import com.webstore.service.ProductInstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ProductInstanceService productInstanceService;

    @GetMapping("/")
    public String getAllVilableProductInstances(Model model){
        List<ProductInstance> productInstances = productInstanceService.getAllAvailableProductInstances();
        model.addAttribute("productInstances", productInstances);
        return "main";
    }

    @GetMapping("/test")
    public String navigateToTest(Model model){
        return "test";
    }
}
