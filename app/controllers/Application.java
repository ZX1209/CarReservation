package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void firsttest() {

        renderText("this is a test page!");
    }


    public static void secondtest() {

        render("app/Views/Application/TestPage.html");
    }

    public static void GJsLearning()
    {
        render("app/Views/Application/GJsLearning.html");

    }

}