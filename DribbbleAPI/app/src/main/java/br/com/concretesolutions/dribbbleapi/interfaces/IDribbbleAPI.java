package br.com.concretesolutions.dribbbleapi.interfaces;

import br.com.concretesolutions.dribbbleapi.model.Page;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by kamilabrito on 8/29/15.
 */
public interface IDribbbleAPI {

    @GET("/shots/popular")
    Page getPage(
            @Query("page") String page
    );
}
