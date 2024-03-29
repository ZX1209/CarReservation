package controllers;

import net.sf.ehcache.search.expression.Or;
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
        /*
        News testNews = new News(8l,"success?");

        testNews.save();
        */

        /*success
        OrderTable orderTabletest = new OrderTable(3l,"testuser2",4l,"testvisitor2");
        orderTabletest.save();
        */
        OrderTable orderTabletest = OrderTable.find("from OrderTable where UserID=? ",3l).first();


        /*
        renderText(orderTabletest.getUserName());
        */


        //let orderTabletest can be used in the html
        //like ${orderTabletest.username}
        //html first then the value to send
        render("app/Views/Application/GJsLearning.html",orderTabletest);
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