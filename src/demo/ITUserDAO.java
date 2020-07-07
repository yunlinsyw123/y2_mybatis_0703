package demo;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface ITUserDAO {
    //使用SQL语句查询角色名称为’super管理员’的用户id和姓名
    @Select("select u.user_id,u.user_username from t_user u join T_USER_ROLE ur on u.user_id=ur.USERID join t_roles r on r.role_id=ur.ROLEID where r.role_rolename=#{rlname}")
    @Options(flushCache = false, timeout = 10000,useCache=true)
    @Results({
            @Result(id = true,property ="userId",column = "user_id"),
            @Result(property ="userUsername",column = "user_username"),
            @Result(property ="userPwd",column = "user_pwd"),
            @Result(property ="userRealname",column = "user_realname"),

            @Result(id = true,property = "roleId",column = "role_id"),
            @Result(property = "roleRolename",column = "role_rolename"),
            @Result(property = "roleDemo",column = "role_demo")

    })
    public List<TUser> selByrolename(@Param("rlname") String rolename);

    //使用SQL语句查询角色id为’1’的用户姓名和其真实姓名；
    @Select("select u.user_username,u.user_realname from t_user u join T_USER_ROLE ur on u.user_id=ur.USERID join t_roles r on r.role_id=ur.ROLEID where r.role_id=#{id}")
    @Options(flushCache = false, timeout = 10000,useCache=true)
    @Results({
            @Result(id = true,property ="userId",column = "user_id"),
            @Result(property ="userUsername",column = "user_username"),
            @Result(property ="userPwd",column = "user_pwd"),
            @Result(property ="userRealname",column = "user_realname"),

            @Result(id = true,property = "roleId",column = "role_id"),
            @Result(property = "roleRolename",column = "role_rolename"),
            @Result(property = "roleDemo",column = "role_demo")
    })
    public List<TUser> selbyrolesId(@Param("id") int rolesid);

    @Select("select count(*) from t_user u join T_USER_ROLE ur on u.user_id=ur.USERID join t_roles r on r.role_id=ur.ROLEID")
    public int selcount();
}
