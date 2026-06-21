package yads;

import io.sentry.SentryOptions;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class of {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ij.g f41533a = ij.h.b(nf.f41244b);

    public static String a(long j10) {
        if (j10 < 1024) {
            return j10 + "B";
        }
        if (j10 < SentryOptions.MAX_EVENT_SIZE_BYTES) {
            return (j10 / 1024) + "KB";
        }
        if (j10 >= 1073741824) {
            return (j10 / 1073741824) + "GB";
        }
        return (j10 / SentryOptions.MAX_EVENT_SIZE_BYTES) + "MB";
    }
}
