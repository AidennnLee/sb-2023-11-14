package com.ll.sb20231114.domain.article.article.service;

import com.ll.sb20231114.domain.article.article.entity.Article;
import com.ll.sb20231114.domain.article.article.repository.ArticleRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component //한 번만 생성되어 재사용 됨. 즉, 공유 객체
public class ArticleService {
    private final ArticleRepository articleRepository = new ArticleRepository();
    private final List<Article> articles = new ArrayList<>();

    public Article write(String title, String body) {
        Article article = new Article(title, body);
        articleRepository.save(article);

        return article;
    }

    public Article findLastArticle() {
        return articleRepository.findLastArticle();
    }

    public List<Article> findAll() {
        return articleRepository.findAll();
    }
}
