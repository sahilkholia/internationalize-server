package com.server.internationalize.repository;
import com.server.internationalize.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SurveyRepo extends JpaRepository<Survey,Long> {

}