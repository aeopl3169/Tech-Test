package com.shashishiva.mvvmnewsapp.repository

import com.shashishiva.mvvmnewsapp.api.RetrofitInstance
import com.shashishiva.mvvmnewsapp.db.ArticleDatabase
import com.shashishiva.mvvmnewsapp.models.Article

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int, apiKey: String) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber, apiKey)

    suspend fun searchNews(searchQuery: String, pageNumber: Int, apiKey: String) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber, apiKey)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}