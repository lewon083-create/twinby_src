package d2;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f15548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15553f;

    public i(Uri uri, int i, int i10, boolean z5, String str, int i11) {
        uri.getClass();
        this.f15548a = uri;
        this.f15549b = i;
        this.f15550c = i10;
        this.f15551d = z5;
        this.f15552e = str;
        this.f15553f = i11;
    }

    public i(String str, String str2) {
        this.f15548a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f15549b = 0;
        this.f15550c = 400;
        this.f15551d = false;
        this.f15552e = str2;
        this.f15553f = 0;
    }
}
