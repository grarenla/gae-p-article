package model;


import com.googlecode.objectify.ObjectifyService;
import entities.Article;

import java.util.List;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class ArticleModel {
    static {
        ObjectifyService.register(Article.class);
    }

    public static List<Article> list() {
        return ofy().load().type(Article.class).list();
    }
}
