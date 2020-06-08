package com.codegym.service;

import com.codegym.model.Feedback;

public interface IFeedBackService {
    Feedback save(Feedback feedback);
    Iterable<Feedback> findAll();
}
