package com.codegym.controller;

import com.codegym.model.Feedback;
import com.codegym.service.IFeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private IFeedBackService feedBackService;

    @GetMapping()
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("feedbackForm", new Feedback());
        return modelAndView;
    }

    @PostMapping("/feedback")
    public ModelAndView commentFeedback(@ModelAttribute Feedback feedback) {
        ModelAndView modelAndView = new ModelAndView("result");
        feedBackService.save(feedback);
        modelAndView.addObject("feedback", feedback);
        return modelAndView;
    }
}