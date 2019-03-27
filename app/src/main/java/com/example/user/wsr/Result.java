package com.example.user.wsr;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("highlight")
    @Expose
    private String highlight;
    @SerializedName("owner")
    @Expose
    private String owner;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("linenos")
    @Expose
    private Boolean linenos;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("style")
    @Expose
    private String style;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHighlight() {
        return highlight;
    }

    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getLinenos() {
        return linenos;
    }

    public void setLinenos(Boolean linenos) {
        this.linenos = linenos;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Result(Integer id, String url, String highlight, String owner, String title, String code, Boolean linenos, String language, String style) {
        this.id = id;
        this.url = url;
        this.highlight = highlight;
        this.owner = owner;
        this.title = title;
        this.code = code;
        this.linenos = linenos;
        this.language = language;
        this.style = style;
    }
}
