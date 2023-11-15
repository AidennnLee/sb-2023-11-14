package com.ll.sb20231114.domain.article.article.controller;

import com.ll.sb20231114.domain.article.article.entity.Article;
import com.ll.sb20231114.domain.article.article.service.ArticleService;
import com.ll.sb20231114.global.rsData.RsData.RsData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

//전체 구조 : controller -> service 호출 -> repository 호출 -> 세 부분이 entity를 주고받음
@Controller
public class ArticleController {
    @Autowired //필드 자동 주입. new로 생성하지 않아도 됨. Component인 경우만 가능
    private ArticleService articleService;

    @GetMapping("/article/write")
    String showWrite(){
        return "article/write";
    }

    //GetMapping과 PostMapping이므로 url 동일해도 됨
    @PostMapping("/article/write")
    @ResponseBody
    RsData doWrite(
            String title,
            String body
    ){
        Article article = articleService.write(title, body);

        RsData<Article> rs = new RsData<>(
                "S-1",
                "%d번 게시물이 작성되었습니다.".formatted(article.getId()),

                article
        );

        return rs;
    }

    @GetMapping("/article/getArticles")
    @ResponseBody
    List<Article> getArticles(){
        return articleService.findAll();
    }

    private void findAll() {
    }

    @GetMapping("/article/getLastArticle")
    @ResponseBody
    Article getLastArticle( ){
        return articleService.findLastArticle();
    }
}

