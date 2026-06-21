package io.sentry;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class HttpStatusCodeRange {
    public static final int DEFAULT_MAX = 599;
    public static final int DEFAULT_MIN = 500;
    private final int max;
    private final int min;

    public HttpStatusCodeRange(int i, int i10) {
        this.min = i;
        this.max = i10;
    }

    public boolean isInRange(int i) {
        return i >= this.min && i <= this.max;
    }

    public HttpStatusCodeRange(int i) {
        this.min = i;
        this.max = i;
    }
}
