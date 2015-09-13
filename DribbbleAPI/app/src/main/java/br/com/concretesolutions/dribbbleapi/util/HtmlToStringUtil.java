package br.com.concretesolutions.dribbbleapi.util;

import android.text.Html;

/**
 * Created by kamilabrito on 8/29/15.
 */
public class HtmlToStringUtil {

    public static String stripHtml(String html) {
        if (html != null) {
            return Html.fromHtml(html).toString();
        }
        return "";
    }
}
