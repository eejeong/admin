package com.kbstar.controller;

import com.kbstar.dto.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class MainController {
    @RequestMapping("/")
    public String main(){
        return "index";
    }

    @RequestMapping("/charts")
    public String charts(Model model) {
        model.addAttribute("center", "charts");
        return "index";
    }

    @RequestMapping("/tables")
    public String all(Model model){
        List<Item> list = new ArrayList<>();
        list.add(new Item(100, "pants1", 1000, new Date()));
        list.add(new Item(101, "pants2", 2000, new Date()));
        list.add(new Item(102, "pants3", 3000, new Date()));
        list.add(new Item(103, "pants4", 4000, new Date()));
        list.add(new Item(104, "pants5", 5000, new Date()));
        list.add(new Item(105, "pants6", 6000, new Date()));
        list.add(new Item(106, "pants7", 7000, new Date()));
        list.add(new Item(107, "pants8", 8000, new Date()));
        list.add(new Item(108, "pants9", 9000, new Date()));
        list.add(new Item(109, "pants10", 5000, new Date()));
        list.add(new Item(200, "skirt1", 1000, new Date()));
        list.add(new Item(201, "skirt2", 2000, new Date()));
        list.add(new Item(202, "skirt3", 3000, new Date()));
        list.add(new Item(203, "skirt4", 4000, new Date()));
        list.add(new Item(204, "skirt5", 5000, new Date()));
        list.add(new Item(300, "shirt1", 1000, new Date()));
        list.add(new Item(301, "shirt2", 2000, new Date()));
        list.add(new Item(302, "shirt3", 3000, new Date()));
        list.add(new Item(303, "shirt4", 4000, new Date()));
        list.add(new Item(304, "shirt5", 5000, new Date()));

        model.addAttribute("allitem", list);
        model.addAttribute("left", "left");
        model.addAttribute("center", "tables");
        return "index";
    }

    @RequestMapping("/livechart")
    public String livechart(Model model) {
        model.addAttribute("center", "livechart");
        return "index";
    }
}
