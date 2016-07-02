package com.farrukhworkstation.demoapplication.models;

import com.farrukhworkstation.demoapplication.databases.MyDatabase;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by Farrukh Work Station on 6/26/2016.
 */
@Table(database = MyDatabase.class)
public class Hit extends BaseModel {

    @Column
    @PrimaryKey
    @SerializedName("id")
    @Expose
    private Integer id;

    @Column
    @SerializedName("pageURL")
    @Expose
    private String pageURL;

    @Column
    @SerializedName("type")
    @Expose
    private String type;

    @Column
    @SerializedName("tags")
    @Expose
    private String tags;

    @Column
    @SerializedName("previewURL")
    @Expose
    private String previewURL;

    @Column
    @SerializedName("previewWidth")
    @Expose
    private Integer previewWidth;

    @Column
    @SerializedName("previewHeight")
    @Expose
    private Integer previewHeight;

    @Column
    @SerializedName("webformatURL")
    @Expose
    private String webformatURL;

    @Column
    @SerializedName("webformatWidth")
    @Expose
    private Integer webformatWidth;

    @Column
    @SerializedName("webformatHeight")
    @Expose
    private Integer webformatHeight;

    @Column
    @SerializedName("imageWidth")
    @Expose
    private Integer imageWidth;

    @Column
    @SerializedName("imageHeight")
    @Expose
    private Integer imageHeight;

    @Column
    @SerializedName("views")
    @Expose
    private Integer views;

    @Column
    @SerializedName("downloads")
    @Expose
    private Integer downloads;

    @Column
    @SerializedName("favorites")
    @Expose
    private Integer favorites;

    @Column
    @SerializedName("likes")
    @Expose
    private Integer likes;

    @Column
    @SerializedName("comments")
    @Expose
    private Integer comments;

    @Column
    @SerializedName("user_id")
    @Expose
    private Integer userId;

    @Column
    @SerializedName("user")
    @Expose
    private String user;

    @Column
    @SerializedName("userImageURL")
    @Expose
    private String userImageURL;

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The pageURL
     */
    public String getPageURL() {
        return pageURL;
    }

    /**
     *
     * @param pageURL
     * The pageURL
     */
    public void setPageURL(String pageURL) {
        this.pageURL = pageURL;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The tags
     */
    public String getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     * The tags
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     *
     * @return
     * The previewURL
     */
    public String getPreviewURL() {
        return previewURL;
    }

    /**
     *
     * @param previewURL
     * The previewURL
     */
    public void setPreviewURL(String previewURL) {
        this.previewURL = previewURL;
    }

    /**
     *
     * @return
     * The previewWidth
     */
    public Integer getPreviewWidth() {
        return previewWidth;
    }

    /**
     *
     * @param previewWidth
     * The previewWidth
     */
    public void setPreviewWidth(Integer previewWidth) {
        this.previewWidth = previewWidth;
    }

    /**
     *
     * @return
     * The previewHeight
     */
    public Integer getPreviewHeight() {
        return previewHeight;
    }

    /**
     *
     * @param previewHeight
     * The previewHeight
     */
    public void setPreviewHeight(Integer previewHeight) {
        this.previewHeight = previewHeight;
    }

    /**
     *
     * @return
     * The webformatURL
     */
    public String getWebformatURL() {
        return webformatURL;
    }

    /**
     *
     * @param webformatURL
     * The webformatURL
     */
    public void setWebformatURL(String webformatURL) {
        this.webformatURL = webformatURL;
    }

    /**
     *
     * @return
     * The webformatWidth
     */
    public Integer getWebformatWidth() {
        return webformatWidth;
    }

    /**
     *
     * @param webformatWidth
     * The webformatWidth
     */
    public void setWebformatWidth(Integer webformatWidth) {
        this.webformatWidth = webformatWidth;
    }

    /**
     *
     * @return
     * The webformatHeight
     */
    public Integer getWebformatHeight() {
        return webformatHeight;
    }

    /**
     *
     * @param webformatHeight
     * The webformatHeight
     */
    public void setWebformatHeight(Integer webformatHeight) {
        this.webformatHeight = webformatHeight;
    }

    /**
     *
     * @return
     * The imageWidth
     */
    public Integer getImageWidth() {
        return imageWidth;
    }

    /**
     *
     * @param imageWidth
     * The imageWidth
     */
    public void setImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
    }

    /**
     *
     * @return
     * The imageHeight
     */
    public Integer getImageHeight() {
        return imageHeight;
    }

    /**
     *
     * @param imageHeight
     * The imageHeight
     */
    public void setImageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
    }

    /**
     *
     * @return
     * The views
     */
    public Integer getViews() {
        return views;
    }

    /**
     *
     * @param views
     * The views
     */
    public void setViews(Integer views) {
        this.views = views;
    }

    /**
     *
     * @return
     * The downloads
     */
    public Integer getDownloads() {
        return downloads;
    }

    /**
     *
     * @param downloads
     * The downloads
     */
    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    /**
     *
     * @return
     * The favorites
     */
    public Integer getFavorites() {
        return favorites;
    }

    /**
     *
     * @param favorites
     * The favorites
     */
    public void setFavorites(Integer favorites) {
        this.favorites = favorites;
    }

    /**
     *
     * @return
     * The likes
     */
    public Integer getLikes() {
        return likes;
    }

    /**
     *
     * @param likes
     * The likes
     */
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    /**
     *
     * @return
     * The comments
     */
    public Integer getComments() {
        return comments;
    }

    /**
     *
     * @param comments
     * The comments
     */
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    /**
     *
     * @return
     * The userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     *
     * @param userId
     * The user_id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     *
     * @return
     * The user
     */
    public String getUser() {
        return user;
    }

    /**
     *
     * @param user
     * The user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     *
     * @return
     * The userImageURL
     */
    public String getUserImageURL() {
        return userImageURL;
    }

    /**
     *
     * @param userImageURL
     * The userImageURL
     */
    public void setUserImageURL(String userImageURL) {
        this.userImageURL = userImageURL;
    }
}
