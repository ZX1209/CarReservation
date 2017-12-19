package controllers;

import play.*;
import play.mvc.*;

import java.awt.*;
import java.util.*;
import java.util.List;

import models.*;

import static play.test.FunctionalTest.renderArgs;

public class Application extends Controller {

    public static void order()
    {
    	OrderTable ordertable =new OrderTable(2l,"Bob", "zury");
    	ordertable.save();
        render("app/Views/Application/order.html");
    }

    public static void getdata()
    {
        String id=params.get("userid");
        String name=params.get("username");

        render(id,name);
        render("app/Views/Application/GJsLearning.html");
    }


    public static void test_third_part_order()
    {

        render("app/Views/Application/test_third_part_order.html");
    }




    public static void test_third_part_log_in()
    {
        render("app/Views/Application/order.html");
    }



    public static void confirm() {

        render("app/Views/Application/confirm.html");
    }

    public static void Apply() {

        render("app/Views/Application/Apply.html");
    }



    public static void firsttest() {

        renderText("this is a test page!");
    }

    //save   保存进数据库
    public static void save() {

        News testNews = new News(8l,"success?");

        testNews.save();

        renderText("success");
    }

    public static void secondtest() {

        //find
        News newSingle = News.find("from News where cId=? order by cId desc",1l).first();
        //cmd printf
        System.out.println(newSingle.getcTitle());
        System.out.println("====================");
        //findall
        List<News> newsList=News.findAll();
        for(News news:newsList){
            System.out.println(news.getcTitle()+"/////////////////"+news.getId());
        }
        render("app/Views/Application/TestPage.html");
    }

    public static void GJsLearning()
    {
        render("app/Views/Application/GJsLearning.html");

    }
    public static void log_in()
    {

        render("app/Views/Application/log_in.html");

    }



}