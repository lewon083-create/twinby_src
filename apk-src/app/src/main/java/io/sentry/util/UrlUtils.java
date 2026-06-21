package io.sentry.util;

import io.sentry.ISpan;
import io.sentry.SpanDataConvention;
import io.sentry.protocol.Request;
import java.net.URI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class UrlUtils {

    @NotNull
    public static final String SENSITIVE_DATA_SUBSTITUTE = "[Filtered]";

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class UrlDetails {

        @Nullable
        private final String fragment;

        @Nullable
        private final String query;

        @Nullable
        private final String url;

        public UrlDetails(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.url = str;
            this.query = str2;
            this.fragment = str3;
        }

        public void applyToRequest(@Nullable Request request) {
            if (request == null) {
                return;
            }
            request.setUrl(this.url);
            request.setQueryString(this.query);
            request.setFragment(this.fragment);
        }

        public void applyToSpan(@Nullable ISpan iSpan) {
            if (iSpan == null) {
                return;
            }
            String str = this.query;
            if (str != null) {
                iSpan.setData(SpanDataConvention.HTTP_QUERY_KEY, str);
            }
            String str2 = this.fragment;
            if (str2 != null) {
                iSpan.setData(SpanDataConvention.HTTP_FRAGMENT_KEY, str2);
            }
        }

        @Nullable
        public String getFragment() {
            return this.fragment;
        }

        @Nullable
        public String getQuery() {
            return this.query;
        }

        @Nullable
        public String getUrl() {
            return this.url;
        }

        @NotNull
        public String getUrlOrFallback() {
            String str = this.url;
            return str == null ? "unknown" : str;
        }
    }

    @NotNull
    private static String filterUserInfo(@NotNull String str) {
        if (!str.contains("@")) {
            return str;
        }
        boolean zStartsWith = str.startsWith("@");
        String str2 = SENSITIVE_DATA_SUBSTITUTE;
        if (zStartsWith) {
            return SENSITIVE_DATA_SUBSTITUTE.concat(str);
        }
        if (str.substring(0, str.indexOf(64)).contains(io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            str2 = "[Filtered]:[Filtered]";
        }
        StringBuilder sbJ = pe.a.j(str2);
        sbJ.append(str.substring(str.indexOf(64)));
        return sbJ.toString();
    }

    private static boolean isValidAbsoluteUrl(@NotNull URI uri) {
        try {
            uri.toURL();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @NotNull
    public static UrlDetails parse(@NotNull String str) {
        String str2;
        try {
            URI uri = new URI(str);
            if (uri.isAbsolute() && !isValidAbsoluteUrl(uri)) {
                return new UrlDetails(null, null, null);
            }
            String rawPath = "";
            if (uri.getScheme() == null) {
                str2 = "";
            } else {
                str2 = uri.getScheme() + "://";
            }
            String rawAuthority = uri.getRawAuthority() == null ? "" : uri.getRawAuthority();
            if (uri.getRawPath() != null) {
                rawPath = uri.getRawPath();
            }
            return new UrlDetails(str2 + filterUserInfo(rawAuthority) + rawPath, uri.getRawQuery(), uri.getRawFragment());
        } catch (Exception unused) {
            return new UrlDetails(null, null, null);
        }
    }

    @Nullable
    public static UrlDetails parseNullable(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return parse(str);
    }
}
