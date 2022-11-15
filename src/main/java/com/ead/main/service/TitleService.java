package com.ead.main.service;

import com.ead.main.model.Title;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TitleService {
    List<Title> getTitles();

    String saveTitle(Title title);

    String updateTitle(Title title);

    String deleteTitle(Integer id);

    Title getTitleById(int id);

    List<Title> getTitleByCourseId(Integer id);
}
