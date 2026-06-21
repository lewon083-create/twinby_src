package io.sentry;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.util.Objects;
import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class Dsn {

    @NotNull
    private static final Pattern ORG_ID_PATTERN = Pattern.compile("^o(\\d+)\\.");

    @Nullable
    private final String orgId;

    @Nullable
    private final String path;

    @NotNull
    private final String projectId;

    @NotNull
    private final String publicKey;

    @Nullable
    private final String secretKey;

    @NotNull
    private final URI sentryUri;

    public Dsn(@Nullable String str) {
        try {
            String strTrim = ((String) Objects.requireNonNull(str, "The DSN is required.")).trim();
            if (strTrim.isEmpty()) {
                throw new IllegalArgumentException("The DSN is empty.");
            }
            URI uriNormalize = new URI(strTrim).normalize();
            String scheme = uriNormalize.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                throw new IllegalArgumentException("Invalid DSN scheme: " + scheme);
            }
            String userInfo = uriNormalize.getUserInfo();
            if (userInfo == null || userInfo.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String[] strArrSplit = userInfo.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1);
            String str2 = strArrSplit[0];
            this.publicKey = str2;
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String strGroup = null;
            this.secretKey = strArrSplit.length > 1 ? strArrSplit[1] : null;
            String path = uriNormalize.getPath();
            path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
            int iLastIndexOf = path.lastIndexOf("/") + 1;
            String strSubstring = path.substring(0, iLastIndexOf);
            strSubstring = strSubstring.endsWith("/") ? strSubstring : strSubstring.concat("/");
            this.path = strSubstring;
            String strSubstring2 = path.substring(iLastIndexOf);
            this.projectId = strSubstring2;
            if (strSubstring2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
            }
            this.sentryUri = new URI(scheme, null, uriNormalize.getHost(), uriNormalize.getPort(), strSubstring + "api/" + strSubstring2, null, null);
            String host = uriNormalize.getHost();
            if (host != null) {
                Matcher matcher = ORG_ID_PATTERN.matcher(host);
                if (matcher.find()) {
                    strGroup = matcher.group(1);
                }
            }
            this.orgId = strGroup;
        } catch (Throwable th2) {
            throw new IllegalArgumentException(th2);
        }
    }

    @Nullable
    public String getOrgId() {
        return this.orgId;
    }

    @Nullable
    public String getPath() {
        return this.path;
    }

    @NotNull
    public String getProjectId() {
        return this.projectId;
    }

    @NotNull
    public String getPublicKey() {
        return this.publicKey;
    }

    @Nullable
    public String getSecretKey() {
        return this.secretKey;
    }

    @NotNull
    public URI getSentryUri() {
        return this.sentryUri;
    }
}
