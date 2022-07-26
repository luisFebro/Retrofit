package com.febro.retrofit.api.model;

// what kind of data that comes with request
// There is a defined class GitHubRepo. This class comprises required class properties to map the response data.
public class GitHubRepo {
    private String name;
    private int id;

    public GitHubRepo() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
