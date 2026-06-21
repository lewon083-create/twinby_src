package p3;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class i extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31158b;

    public i(int i) {
        this.f31158b = i;
    }

    public i(Exception exc, int i) {
        super(exc);
        this.f31158b = i;
    }

    public i(String str, int i) {
        super(str);
        this.f31158b = i;
    }

    public i(String str, Exception exc, int i) {
        super(str, exc);
        this.f31158b = i;
    }
}
