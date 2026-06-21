package io.sentry;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URI;
import java.util.Locale;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class DsnUtil {
    public static boolean urlContainsDsnHost(@Nullable SentryOptions sentryOptions, @Nullable String str) {
        URI sentryUri;
        String host;
        if (sentryOptions == null || str == null || sentryOptions.getDsn() == null || (host = (sentryUri = sentryOptions.retrieveParsedDsn().getSentryUri()).getHost()) == null) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = host.toLowerCase(locale);
        int port = sentryUri.getPort();
        if (port <= 0) {
            return str.toLowerCase(locale).contains(lowerCase);
        }
        return str.toLowerCase(locale).contains(lowerCase + StringUtils.PROCESS_POSTFIX_DELIMITER + port);
    }
}
