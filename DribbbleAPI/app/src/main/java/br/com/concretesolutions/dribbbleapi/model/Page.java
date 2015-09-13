package br.com.concretesolutions.dribbbleapi.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by kamilabrito on 8/27/15.
 */
public class Page implements Serializable {

    private static final long serialVersionUID = 1L;

    String page;
    String per_page;
    String pages;
    String total;
    ArrayList <Shot> shots = new ArrayList<>();

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPer_page() {
        return per_page;
    }

    public void setPer_page(String per_page) {
        this.per_page = per_page;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public ArrayList<Shot> getShots() {
        return shots;
    }

    public void setShots(ArrayList<Shot> shots) {
        this.shots = shots;
    }
}
