package d0;

import a0.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15496a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f15497b = b.f15489e;

    @Override // b0.a
    public final b a() {
        return this.f15497b;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ImageFormatFeature(imageCaptureOutputFormat=");
        int i = this.f15496a;
        if (i == 0) {
            str = "JPEG";
        } else if (i != 1) {
            str = "UNDEFINED(" + i + ')';
        } else {
            str = "JPEG_R";
        }
        return u.n(sb2, str, ')');
    }
}
