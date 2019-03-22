package org.Ermas.jdbc.raw;

import java.util.List;

public interface ArticleDao {

	 List<Article>  listArticles();

	 Article getArticle(String articleId);

	 int addArticle(Article article);

	 int updateArticle(Article article);

	 int deleteArticle(String articleId);
}
