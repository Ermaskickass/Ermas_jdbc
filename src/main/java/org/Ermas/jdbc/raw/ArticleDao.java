package org.Ermas.jdbc.raw;

import java.util.List;

public interface ArticleDao {
	
	/**
	 * 목록
	 */
	 List<Article>  listArticles();
	
	/**
	 * 조회(글 1개 조회)
	 */
	 Article getArticle(String articleId);
	
	/**
	 * 글 등록
	 */
	 void upaddArticle(Article article);
	
	/**
	 * 글 수정
	 */
	 void updateArticle(Article article);
	
	/**
	 * 글 삭제
	 */
	 void deleteArticle(String articleId);
}
