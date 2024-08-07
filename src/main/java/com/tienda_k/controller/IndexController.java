package com.tienda_k.controller;

import com.tienda_k.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/")
    public String inicio(Model model) {
        var productos = productoService.getProductos(false);
        model.addAttribute("productos", productos);
        
        return "index";
    }
}
