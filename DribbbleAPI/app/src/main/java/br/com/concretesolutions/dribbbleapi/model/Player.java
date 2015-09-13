package br.com.concretesolutions.dribbbleapi.model;

import java.io.Serializable;

/**
 * Created by kamilabrito on 8/26/15.
 */

public class Player implements Serializable {

    private static final long serialVersionUID = 1L;

    String id;
    String name;
    String location;
    String followers_count;
    String draftees_count;
    String likes_count;
    String likes_received_count;
    String comments_count;
    String comments_received_count;
    String rebounds_count;
    String rebounds_received_count;
    String url;
    String avatar_url;
    String username;
    String twitter_screen_name;
    String website_url;
    String drafted_by_player_id;
    String shots_count;
    String following_count;
    String created_at;


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFollowers_count() {
        return followers_count;
    }

    public void setFollowers_count(String followers_count) {
        this.followers_count = followers_count;
    }

    public String getDraftees_count() {
        return draftees_count;
    }

    public void setDraftees_count(String draftees_count) {
        this.draftees_count = draftees_count;
    }

    public String getLikes_count() {
        return likes_count;
    }

    public void setLikes_count(String likes_count) {
        this.likes_count = likes_count;
    }

    public String getLikes_received_count() {
        return likes_received_count;
    }

    public void setLikes_received_count(String likes_received_count) {
        this.likes_received_count = likes_received_count;
    }

    public String getComments_count() {
        return comments_count;
    }

    public void setComments_count(String comments_count) {
        this.comments_count = comments_count;
    }

    public String getComments_received_count() {
        return comments_received_count;
    }

    public void setComments_received_count(String comments_received_count) {
        this.comments_received_count = comments_received_count;
    }

    public String getRebounds_count() {
        return rebounds_count;
    }

    public void setRebounds_count(String rebounds_count) {
        this.rebounds_count = rebounds_count;
    }

    public String getRebounds_received_count() {
        return rebounds_received_count;
    }

    public void setRebounds_received_count(String rebounds_received_count) {
        this.rebounds_received_count = rebounds_received_count;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTwitter_screen_name() {
        return twitter_screen_name;
    }

    public void setTwitter_screen_name(String twitter_screen_name) {
        this.twitter_screen_name = twitter_screen_name;
    }

    public String getWebsite_url() {
        return website_url;
    }

    public void setWebsite_url(String website_url) {
        this.website_url = website_url;
    }

    public String getDrafted_by_player_id() {
        return drafted_by_player_id;
    }

    public void setDrafted_by_player_id(String drafted_by_player_id) {
        this.drafted_by_player_id = drafted_by_player_id;
    }

    public String getShots_count() {
        return shots_count;
    }

    public void setShots_count(String shots_count) {
        this.shots_count = shots_count;
    }

    public String getFollowing_count() {
        return following_count;
    }

    public void setFollowing_count(String following_count) {
        this.following_count = following_count;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public Player(String id, String name, String avatar_url) {
        this.id = id;
        this.name = name;
        this.avatar_url = avatar_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }
}
