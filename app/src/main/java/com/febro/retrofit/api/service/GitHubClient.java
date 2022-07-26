package com.febro.retrofit.api.service;

import com.febro.retrofit.api.model.GitHubRepo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

// interface defines a method named reposForUser with return type List<GitHubRepo>. Retrofit makes sure the server response gets mapped correctly (in case the response matches the given class).
public interface GitHubClient {
    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> reposForUser(
            @Path("user") String user
    );
}
