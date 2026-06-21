package io.sentry.exception;

import com.google.android.gms.internal.ads.om1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class InvalidSentryTraceHeaderException extends Exception {
    private static final long serialVersionUID = -8353316997083420940L;

    @NotNull
    private final String sentryTraceHeader;

    public InvalidSentryTraceHeaderException(@NotNull String str) {
        this(str, null);
    }

    @NotNull
    public String getSentryTraceHeader() {
        return this.sentryTraceHeader;
    }

    public InvalidSentryTraceHeaderException(@NotNull String str, @Nullable Throwable th2) {
        super(om1.k("sentry-trace header does not conform to expected format: ", str), th2);
        this.sentryTraceHeader = str;
    }
}
