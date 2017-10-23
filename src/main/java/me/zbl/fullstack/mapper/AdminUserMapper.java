package me.zbl.fullstack.mapper;

import java.util.List;
import me.zbl.fullstack.entity.AdminUser;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AdminUserMapper {
    @Delete({
        "delete from admin_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into admin_user (username, password, ",
        "nickname, email, ",
        "github, qq, wecaht, ",
        "avatar, bir_year, ",
        "bir_month, bir_day, ",
        "gmt_create, gmt_modified, ",
        "hobby, motto, ",
        "md_info)",
        "values (#{username,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{nickname,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, ",
        "#{github,jdbcType=VARCHAR}, #{qq,jdbcType=VARCHAR}, #{wecaht,jdbcType=VARCHAR}, ",
        "#{avatar,jdbcType=VARCHAR}, #{birYear,jdbcType=INTEGER}, ",
        "#{birMonth,jdbcType=INTEGER}, #{birDay,jdbcType=INTEGER}, ",
        "#{gmtCreate,jdbcType=TIMESTAMP}, #{gmtModified,jdbcType=TIMESTAMP}, ",
        "#{hobby,jdbcType=LONGVARCHAR}, #{motto,jdbcType=LONGVARCHAR}, ",
        "#{mdInfo,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(AdminUser record);

    @Select({
        "select",
        "id, username, password, nickname, email, github, qq, wecaht, avatar, bir_year, ",
        "bir_month, bir_day, gmt_create, gmt_modified, hobby, motto, md_info",
        "from admin_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="github", property="github", jdbcType=JdbcType.VARCHAR),
        @Result(column="qq", property="qq", jdbcType=JdbcType.VARCHAR),
        @Result(column="wecaht", property="wecaht", jdbcType=JdbcType.VARCHAR),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="bir_year", property="birYear", jdbcType=JdbcType.INTEGER),
        @Result(column="bir_month", property="birMonth", jdbcType=JdbcType.INTEGER),
        @Result(column="bir_day", property="birDay", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="hobby", property="hobby", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="motto", property="motto", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="md_info", property="mdInfo", jdbcType=JdbcType.LONGVARCHAR)
    })
    AdminUser selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, username, password, nickname, email, github, qq, wecaht, avatar, bir_year, ",
        "bir_month, bir_day, gmt_create, gmt_modified, hobby, motto, md_info",
        "from admin_user"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="github", property="github", jdbcType=JdbcType.VARCHAR),
        @Result(column="qq", property="qq", jdbcType=JdbcType.VARCHAR),
        @Result(column="wecaht", property="wecaht", jdbcType=JdbcType.VARCHAR),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="bir_year", property="birYear", jdbcType=JdbcType.INTEGER),
        @Result(column="bir_month", property="birMonth", jdbcType=JdbcType.INTEGER),
        @Result(column="bir_day", property="birDay", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="hobby", property="hobby", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="motto", property="motto", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="md_info", property="mdInfo", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<AdminUser> selectAll();

    @Update({
        "update admin_user",
        "set username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "nickname = #{nickname,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "github = #{github,jdbcType=VARCHAR},",
          "qq = #{qq,jdbcType=VARCHAR},",
          "wecaht = #{wecaht,jdbcType=VARCHAR},",
          "avatar = #{avatar,jdbcType=VARCHAR},",
          "bir_year = #{birYear,jdbcType=INTEGER},",
          "bir_month = #{birMonth,jdbcType=INTEGER},",
          "bir_day = #{birDay,jdbcType=INTEGER},",
          "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modified = #{gmtModified,jdbcType=TIMESTAMP},",
          "hobby = #{hobby,jdbcType=LONGVARCHAR},",
          "motto = #{motto,jdbcType=LONGVARCHAR},",
          "md_info = #{mdInfo,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AdminUser record);
}