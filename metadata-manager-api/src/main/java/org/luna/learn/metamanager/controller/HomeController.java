package org.luna.learn.metamanager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Home Controller
 *
 * @author Liu Yang
 * @date 2022/5/16 14:02
 */
@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping("home")
    public String home() {
        return "home";
    }

}
