package io.sentry.exception;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryEnvelopeException extends Exception {
    private static final long serialVersionUID = -8307801916948173232L;

    public SentryEnvelopeException(@Nullable String str) {
        super(str);
    }

    public SentryEnvelopeException(@Nullable String str, @Nullable Throwable th2) {
        super(str, th2);
    }
}
