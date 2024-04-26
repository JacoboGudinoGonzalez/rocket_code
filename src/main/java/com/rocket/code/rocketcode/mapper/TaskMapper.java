package com.rocket.code.rocketcode.mapper;

import com.rocket.code.rocketcode.model.Task;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TaskMapper {

    @Select("SELECT id, title, description, start_date FROM task")
    List<Task> findAll();

    @Select("SELECT id, title, description, start_date FROM task WHERE id = #{id}")
    Task findById(long id);

    @Insert("INSERT INTO task(title, description, start_date) VALUES (#{title},#{description},#{start_date})")
    int insert(Task task);

    @Update("UPDATE task SET title = #{title}, description = #{description}, start_date = #{start_date}  WHERE id = #{id}")
    int update(Task task);

    @Delete("DELETE FROM task WHERE id = #{id}")
    int delete(long id);
}
