package com.example.android.voicespace.news;

import com.example.android.voicespace.news.objects.ArticlesObject;

import java.util.List;

public interface NewsContractor {
    interface View{
        void onErrorMessage(String message);
        void onResponseSuccess(List<ArticlesObject> response);
    }
    interface Presenter{
        void requestArticle();
    }
}