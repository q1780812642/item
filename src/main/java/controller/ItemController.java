package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pojo.Item;
import service.ItemService;

@RequestMapping(value = "/item")
@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping(value = "/queryById")
    public Item queryById (@RequestParam(name = "id", required = true) Long id){

        return itemService.queryItemById(id);
    }
}
