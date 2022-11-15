package com.ead.main.repository;

import com.ead.main.model.Title;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface TitleRepository extends JpaRepository<Title,Integer> {

    @Modifying
    @Transactional
    @Query(
            nativeQuery = true,
            value = "UPDATE title SET title_name = ?2 WHERE id= ?1"
    )
    int updateTitle(Integer id,String title);

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM TITLE WHERE course_title= ?1"
    )
    List<Title> getTitlesByCourseId(int id);
}
