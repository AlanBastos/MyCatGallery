package com.projetos.catgallery.model.image;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Image {

    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("title")
    @Expose
    public Object title;
    @SerializedName("description")
    @Expose
    public Object description;
    @SerializedName("datetime")
    @Expose
    public int datetime;
    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("animated")
    @Expose
    public Boolean animated;
    @SerializedName("width")
    @Expose
    public int width;
    @SerializedName("height")
    @Expose
    public int height;
    @SerializedName("size")
    @Expose
    public int size;
    @SerializedName("views")
    @Expose
    public int views;
    @SerializedName("bandwidth")
    @Expose
    public long bandwidth;
    @SerializedName("vote")
    @Expose
    public Object vote;
    @SerializedName("favorite")
    @Expose
    public Boolean favorite;
    @SerializedName("nsfw")
    @Expose
    public Object nsfw;
    @SerializedName("section")
    @Expose
    public Object section;
    @SerializedName("account_url")
    @Expose
    public Object accountUrl;
    @SerializedName("account_id")
    @Expose
    public Object accountId;
    @SerializedName("is_ad")
    @Expose
    public Boolean isAd;
    @SerializedName("in_most_viral")
    @Expose
    public Boolean inMostViral;
    @SerializedName("has_sound")
    @Expose
    public Boolean hasSound;
    @SerializedName("tags")
    @Expose
    public List<Object> tags = null;
    @SerializedName("ad_type")
    @Expose
    public int adType;
    @SerializedName("ad_url")
    @Expose
    public String adUrl;
    @SerializedName("edited")
    @Expose
    public String edited;
    @SerializedName("in_gallery")
    @Expose
    public Boolean inGallery;
    @SerializedName("link")
    @Expose
    public String link;
    @SerializedName("comment_count")
    @Expose
    public Object commentCount;
    @SerializedName("favorite_count")
    @Expose
    public Object favoriteCount;
    @SerializedName("ups")
    @Expose
    public Object ups;
    @SerializedName("downs")
    @Expose
    public Object downs;
    @SerializedName("points")
    @Expose
    public Object points;
    @SerializedName("score")
    @Expose
    public Object score;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Integer getDatetime() {
        return datetime;
    }

    public void setDatetime(Integer datetime) {
        this.datetime = datetime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getAnimated() {
        return animated;
    }

    public void setAnimated(Boolean animated) {
        this.animated = animated;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public long getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Object getVote() {
        return vote;
    }

    public void setVote(Object vote) {
        this.vote = vote;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public Object getNsfw() {
        return nsfw;
    }

    public void setNsfw(Object nsfw) {
        this.nsfw = nsfw;
    }

    public Object getSection() {
        return section;
    }

    public void setSection(Object section) {
        this.section = section;
    }

    public Object getAccountUrl() {
        return accountUrl;
    }

    public void setAccountUrl(Object accountUrl) {
        this.accountUrl = accountUrl;
    }

    public Object getAccountId() {
        return accountId;
    }

    public void setAccountId(Object accountId) {
        this.accountId = accountId;
    }

    public Boolean getAd() {
        return isAd;
    }

    public void setAd(Boolean ad) {
        isAd = ad;
    }

    public Boolean getInMostViral() {
        return inMostViral;
    }

    public void setInMostViral(Boolean inMostViral) {
        this.inMostViral = inMostViral;
    }

    public Boolean getHasSound() {
        return hasSound;
    }

    public void setHasSound(Boolean hasSound) {
        this.hasSound = hasSound;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public Integer getAdType() {
        return adType;
    }

    public void setAdType(Integer adType) {
        this.adType = adType;
    }

    public String getAdUrl() {
        return adUrl;
    }

    public void setAdUrl(String adUrl) {
        this.adUrl = adUrl;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public Boolean getInGallery() {
        return inGallery;
    }

    public void setInGallery(Boolean inGallery) {
        this.inGallery = inGallery;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Object getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Object commentCount) {
        this.commentCount = commentCount;
    }

    public Object getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Object favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public Object getUps() {
        return ups;
    }

    public void setUps(Object ups) {
        this.ups = ups;
    }

    public Object getDowns() {
        return downs;
    }

    public void setDowns(Object downs) {
        this.downs = downs;
    }

    public Object getPoints() {
        return points;
    }

    public void setPoints(Object points) {
        this.points = points;
    }

    public Object getScore() {
        return score;
    }

    public void setScore(Object score) {
        this.score = score;
    }
}
