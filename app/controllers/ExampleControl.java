package controllers;

import net.sf.ehcache.search.expression.Or;
import play.*;
import play.mvc.*;

import java.awt.*;
import java.util.*;
import java.util.List;

import models.*;

import static play.test.FunctionalTest.renderArgs;

//controllers 类 不要与 models 类名字重复
public class ExampleControl extends Controller {
    public static void order()
    {

        render("app/Views/Example/order.html");
    }

    public static void savedata()
    {
        models.Example example;
        example = new models.Example("213516541","jfalsdj","sadf5151","2524165","ajksdfhkj",new Date(),new Date());
        example.save();
    }

    public static void show(int i)
    {
        //[Example]  可以在render的url后传参,,之后,直接在网页中用${_变量名_}来调用
        render("app/Views/Example/order.html",i);
    }


    public static void query()
    {
        //查询语句
        Example.find("from Example where userId=? order by userId desc","213516541").first();

    }

}
