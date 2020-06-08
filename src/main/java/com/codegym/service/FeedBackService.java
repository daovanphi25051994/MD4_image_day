package com.codegym.service;

import com.codegym.model.Feedback;
import com.codegym.repository.IFeedBackRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class FeedBackService implements IFeedBackService {
    @Autowired
    private IFeedBackRepository feedBackRepository;
    @Override
    public Feedback save(Feedback feedback) {
        return feedBackRepository.save(feedback);
    }

    @Override
    public Iterable<Feedback> findAll() {
        return feedBackRepository.findAll();
    }
}