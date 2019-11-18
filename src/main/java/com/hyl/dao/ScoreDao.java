package com.hyl.dao;

import com.hyl.pojo.Score;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreDao {

    int insertScore(Score score);

    int deleteScore(Score score);

    int updateScore(Score score);

    List<Score> searchFromScore(String s);

    Score selectScoreById(Score score);

    List<Score> selectAllScores();

}
