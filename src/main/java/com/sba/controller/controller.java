package com.sba.controller;

import com.sba.assembler.GsonAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class controller {
    @Autowired
    GsonAssembler gsonAssembler;

    @RequestMapping("/")
    public String getHomeScreen(){
        return "index";
    }
    @RequestMapping("/accounts")
    public String getAccount(Model model) throws IOException {
        model.addAttribute("accounts",gsonAssembler.assembleJsonToAccountDto("accounts.json"));
        return "accounts";
    }
}
