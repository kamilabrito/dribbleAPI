package br.com.concretesolutions.dribbbleapi.model;

import java.io.Serializable;

/**
 * Created by kamilabrito on 8/26/15.
 */

public class Shot implements Serializable{

    private static final long serialVersionUID = 1L;

    String id;
    String title;
    String description;
    String height;
    String width;
    String likes_count;
    String comments_count;
    String rebounds_count;
    String url;
    String short_url;
    String views_count;
    String rebound_source_id;
    String image_url;
    String image_teaser_url;
    String image_400_url;
    Player player;
    String created_at;

    public Shot() {
    }

    public Shot(String id, String title, String description, String likes_count, String comments_count, String url,
                String views_count, String image_url) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.likes_count = likes_count;
        this.comments_count = comments_count;
        this.url = url;
        this.views_count = views_count;
        this.image_url = image_url;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLikes_count() {
        return likes_count;
    }

    public void setLikes_count(String likes_count) {
        this.likes_count = likes_count;
    }

    public String getComments_count() {
        return comments_count;
    }

    public void setComments_count(String comments_count) {
        this.comments_count = comments_count;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getViews_count() {
        return views_count;
    }

    public void setViews_count(String views_count) {
        this.views_count = views_count;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getRebounds_count() {
        return rebounds_count;
    }

    public void setRebounds_count(String rebounds_count) {
        this.rebounds_count = rebounds_count;
    }

    public String getShort_url() {
        return short_url;
    }

    public void setShort_url(String short_url) {
        this.short_url = short_url;
    }

    public String getRebound_source_id() {
        return rebound_source_id;
    }

    public void setRebound_source_id(String rebound_source_id) {
        this.rebound_source_id = rebound_source_id;
    }

    public String getImage_teaser_url() {
        return image_teaser_url;
    }

    public void setImage_teaser_url(String image_teaser_url) {
        this.image_teaser_url = image_teaser_url;
    }

    public String getImage_400_url() {
        return image_400_url;
    }

    public void setImage_400_url(String image_400_url) {
        this.image_400_url = image_400_url;
    }
    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

}
