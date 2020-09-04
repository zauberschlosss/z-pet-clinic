package com.zaubershlosss.zpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("owners")
public class OwnerController {

    @RequestMapping({"", "/", "/index", "/owners/index.html"})
    public String listOwners() {
        return "owners/index";
    }
}