package b4;

import android.media.MediaCodecInfo;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaCodecInfo[] f1965b;

    public w(boolean z5, boolean z10, boolean z11, int i) {
        switch (i) {
            case 1:
                int i10 = 1;
                if (!z5 && !z10 && !z11) {
                    i10 = 0;
                }
                this.f1964a = i10;
                break;
            default:
                this.f1964a = (z5 || z10 || z11) ? 1 : 0;
                break;
        }
    }
}
