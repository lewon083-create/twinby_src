package io.appmetrica.analytics.coreutils.internal.logger;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class LoggerStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap f21803a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f21804b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile PublicLogger f21805c = PublicLogger.getAnonymousInstance();

    @NonNull
    public static PublicLogger getMainPublicOrAnonymousLogger() {
        return f21805c;
    }

    @NonNull
    public static PublicLogger getOrCreateMainPublicLogger(@NonNull String str) {
        f21805c = getOrCreatePublicLogger(str);
        return f21805c;
    }

    @NonNull
    public static PublicLogger getOrCreatePublicLogger(String str) {
        PublicLogger publicLogger;
        if (TextUtils.isEmpty(str)) {
            return PublicLogger.getAnonymousInstance();
        }
        PublicLogger publicLogger2 = (PublicLogger) f21803a.get(str);
        if (publicLogger2 != null) {
            return publicLogger2;
        }
        synchronized (f21804b) {
            try {
                publicLogger = (PublicLogger) f21803a.get(str);
                if (publicLogger == null) {
                    publicLogger = new PublicLogger(ApiKeyUtils.createPartialApiKey(str));
                    f21803a.put(str, publicLogger);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return publicLogger;
    }

    public static void unsetPublicLoggers() {
        f21803a = new HashMap();
        f21805c = PublicLogger.getAnonymousInstance();
    }
}
