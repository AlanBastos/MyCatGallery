package com.projetos.catgallery.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.projetos.catgallery.model.image.Image;

import java.util.List;

public class Cat {

    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("description")
    @Expose
    public Object description;
    @SerializedName("datetime")
    @Expose
    public int datetime;
    @SerializedName("cover")
    @Expose
    public String cover;
    @SerializedName("cover_width")
    @Expose
    public int coverWidth;
    @SerializedName("cover_height")
    @Expose
    public int coverHeight;
    @SerializedName("account_url")
    @Expose
    public String accountUrl;
    @SerializedName("account_id")
    @Expose
    public int accountId;
    @SerializedName("privacy")
    @Expose
    public String privacy;
    @SerializedName("layout")
    @Expose
    public String layout;
    @SerializedName("views")
    @Expose
    public int views;
    @SerializedName("link")
    @Expose
    public String link;
    @SerializedName("ups")
    @Expose
    public int ups;
    @SerializedName("downs")
    @Expose
    public int downs;
    @SerializedName("points")
    @Expose
    public int points;
    @SerializedName("score")
    @Expose
    public int score;
    @SerializedName("is_album")
    @Expose
    public Boolean isAlbum;
    @SerializedName("vote")
    @Expose
    public Object vote;
    @SerializedName("favorite")
    @Expose
    public Boolean favorite;
    @SerializedName("nsfw")
    @Expose
    public Boolean nsfw;
    @SerializedName("section")
    @Expose
    public String section;
    @SerializedName("comment_count")
    @Expose
    public int commentCount;
    @SerializedName("favorite_count")
    @Expose
    public int favoriteCount;
    @SerializedName("topic")
    @Expose
    public String topic;
    @SerializedName("topic_id")
    @Expose
    public int topicId;
    @SerializedName("images_count")
    @Expose
    public int imagesCount;
    @SerializedName("in_gallery")
    @Expose
    public Boolean inGallery;
    @SerializedName("is_ad")
    @Expose
    public Boolean isAd;
    @SerializedName("tags")
    @Expose
    public List<Tag> tags = null;
    @SerializedName("ad_type")
    @Expose
    public int adType;
    @SerializedName("ad_url")
    @Expose
    public String adUrl;
    @SerializedName("in_most_viral")
    @Expose
    public Boolean inMostViral;
    @SerializedName("include_album_ads")
    @Expose
    public Boolean includeAlbumAds;
    @SerializedName("images")
    @Expose
    public List<Image> images = null;
    @SerializedName("ad_config")
    @Expose
    public AdConfig adConfig;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
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

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getCoverWidth() {
        return coverWidth;
    }

    public void setCoverWidth(Integer coverWidth) {
        this.coverWidth = coverWidth;
    }

    public Integer getCoverHeight() {
        return coverHeight;
    }

    public void setCoverHeight(Integer coverHeight) {
        this.coverHeight = coverHeight;
    }

    public String getAccountUrl() {
        return accountUrl;
    }

    public void setAccountUrl(String accountUrl) {
        this.accountUrl = accountUrl;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getUps() {
        return ups;
    }

    public void setUps(Integer ups) {
        this.ups = ups;
    }

    public Integer getDowns() {
        return downs;
    }

    public void setDowns(Integer downs) {
        this.downs = downs;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Boolean getAlbum() {
        return isAlbum;
    }

    public void setAlbum(Boolean album) {
        isAlbum = album;
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

    public Boolean getNsfw() {
        return nsfw;
    }

    public void setNsfw(Boolean nsfw) {
        this.nsfw = nsfw;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getImagesCount() {
        return imagesCount;
    }

    public void setImagesCount(Integer imagesCount) {
        this.imagesCount = imagesCount;
    }

    public Boolean getInGallery() {
        return inGallery;
    }

    public void setInGallery(Boolean inGallery) {
        this.inGallery = inGallery;
    }

    public Boolean getAd() {
        return isAd;
    }

    public void setAd(Boolean ad) {
        isAd = ad;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
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

    public Boolean getInMostViral() {
        return inMostViral;
    }

    public void setInMostViral(Boolean inMostViral) {
        this.inMostViral = inMostViral;
    }

    public Boolean getIncludeAlbumAds() {
        return includeAlbumAds;
    }

    public void setIncludeAlbumAds(Boolean includeAlbumAds) {
        this.includeAlbumAds = includeAlbumAds;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public AdConfig getAdConfig() {
        return adConfig;
    }

    public void setAdConfig(AdConfig adConfig) {
        this.adConfig = adConfig;
    }
}

class AdConfig {

    @SerializedName("safeFlags")
    @Expose
    public List<String> safeFlags = null;
    @SerializedName("highRiskFlags")
    @Expose
    public List<Object> highRiskFlags = null;
    @SerializedName("unsafeFlags")
    @Expose
    public List<String> unsafeFlags = null;
    @SerializedName("wallUnsafeFlags")
    @Expose
    public List<Object> wallUnsafeFlags = null;
    @SerializedName("showsAds")
    @Expose
    public Boolean showsAds;

}

class Tag {

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("display_name")
    @Expose
    public String displayName;
    @SerializedName("followers")
    @Expose
    public int followers;
    @SerializedName("total_items")
    @Expose
    public int totalItems;
    @SerializedName("following")
    @Expose
    public Boolean following;
    @SerializedName("is_whitelisted")
    @Expose
    public Boolean isWhitelisted;
    @SerializedName("background_hash")
    @Expose
    public String backgroundHash;
    @SerializedName("thumbnail_hash")
    @Expose
    public Object thumbnailHash;
    @SerializedName("accent")
    @Expose
    public String accent;
    @SerializedName("background_is_animated")
    @Expose
    public Boolean backgroundIsAnimated;
    @SerializedName("thumbnail_is_animated")
    @Expose
    public Boolean thumbnailIsAnimated;
    @SerializedName("is_promoted")
    @Expose
    public Boolean isPromoted;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("logo_hash")
    @Expose
    public Object logoHash;
    @SerializedName("logo_destination_url")
    @Expose
    public Object logoDestinationUrl;
    @SerializedName("description_annotations")
    @Expose
    public DescriptionAnnotations descriptionAnnotations;

}

class DescriptionAnnotations {
    //Empty Class
}

