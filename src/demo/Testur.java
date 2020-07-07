package demo;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Testur {
    @Test
    public void test(){

        /**
         * 使用SQL语句查询角色名称为’super管理员’的用户id和姓名
         * SqlSession session=MybatisUtil.getSqlSession();
         *         ITUserDAO dao=session.getMapper(ITUserDAO.class);
         *         List<TUser> alluser=dao.selByrolename("超级管理员");
         *         System.out.println(alluser.toString());
         */


           //使用SQL语句查询角色id为’1’的用户姓名和其真实姓名；
        /**
         *  SqlSession session=MybatisUtil.getSqlSession();
         *                  ITUserDAO dao=session.getMapper(ITUserDAO.class);
         *                  List<TUser> alluser=dao.selbyrolesId(1);
         *                  System.out.println(alluser.toString());
         */


        SqlSession session=MybatisUtil.getSqlSession();
        ITUserDAO dao=session.getMapper(ITUserDAO.class);
        int count=dao.selcount();
        System.out.println("查询拥有角色的用户人数:"+count);


    }
}
