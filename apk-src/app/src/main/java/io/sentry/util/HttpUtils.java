package io.sentry.util;

import io.sentry.HttpStatusCodeRange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class HttpUtils {
    public static final String COOKIE_HEADER_NAME = "Cookie";
    private static final List<String> SENSITIVE_HEADERS = Arrays.asList("X-FORWARDED-FOR", "AUTHORIZATION", "COOKIE", "SET-COOKIE", "X-API-KEY", "X-REAL-IP", "REMOTE-ADDR", "FORWARDED", "PROXY-AUTHORIZATION", "X-CSRF-TOKEN", "X-CSRFTOKEN", "X-XSRF-TOKEN");
    private static final List<String> SECURITY_COOKIES = Arrays.asList("JSESSIONID", "JSESSIONIDSSO", "JSSOSESSIONID", "SESSIONID", "SID", "CSRFTOKEN", "XSRF-TOKEN");
    private static final HttpStatusCodeRange CLIENT_ERROR_STATUS_CODES = new HttpStatusCodeRange(400, 499);
    private static final HttpStatusCodeRange SEVER_ERROR_STATUS_CODES = new HttpStatusCodeRange(500, HttpStatusCodeRange.DEFAULT_MAX);

    public static boolean containsSensitiveHeader(@NotNull String str) {
        return SENSITIVE_HEADERS.contains(str.toUpperCase(Locale.ROOT));
    }

    @Nullable
    public static String filterOutSecurityCookies(@Nullable String str, @Nullable List<String> list) {
        if (str == null) {
            return null;
        }
        try {
            String[] strArrSplit = str.split(";", -1);
            StringBuilder sb2 = new StringBuilder();
            int length = strArrSplit.length;
            boolean z5 = true;
            int i = 0;
            while (i < length) {
                String str2 = strArrSplit[i];
                if (!z5) {
                    sb2.append(";");
                }
                String str3 = str2.split("=", -1)[0];
                if (isSecurityCookie(str3.trim(), list)) {
                    sb2.append(str3 + "=" + UrlUtils.SENSITIVE_DATA_SUBSTITUTE);
                } else {
                    sb2.append(str2);
                }
                i++;
                z5 = false;
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static List<String> filterOutSecurityCookiesFromHeader(@Nullable Enumeration<String> enumeration, @Nullable String str, @Nullable List<String> list) {
        if (enumeration == null) {
            return null;
        }
        return filterOutSecurityCookiesFromHeader(Collections.list(enumeration), str, list);
    }

    public static boolean isHttpClientError(int i) {
        return CLIENT_ERROR_STATUS_CODES.isInRange(i);
    }

    public static boolean isHttpServerError(int i) {
        return SEVER_ERROR_STATUS_CODES.isInRange(i);
    }

    public static boolean isSecurityCookie(@NotNull String str, @Nullable List<String> list) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        if (SECURITY_COOKIES.contains(upperCase)) {
            return true;
        }
        if (list == null) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().toUpperCase(Locale.ROOT).equals(upperCase)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static List<String> filterOutSecurityCookiesFromHeader(@Nullable List<String> list, @Nullable String str, @Nullable List<String> list2) {
        if (list == null) {
            return null;
        }
        if (str != null && !COOKIE_HEADER_NAME.equalsIgnoreCase(str)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(filterOutSecurityCookies(it.next(), list2));
        }
        return arrayList;
    }
}
