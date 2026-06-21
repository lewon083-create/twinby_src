package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f43166a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f43169d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f43171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f43172g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43167b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f43168c = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f43170e = -1;

    public final u30 a() {
        ni.a(this.f43166a, "The uri must be set.");
        return new u30(this.f43166a, 0L, this.f43167b, null, this.f43168c, this.f43169d, this.f43170e, this.f43171f, this.f43172g, null);
    }

    public final t30 a(int i) {
        this.f43172g = i;
        return this;
    }

    public final t30 a(String str) {
        this.f43171f = str;
        return this;
    }

    public final t30 a(Uri uri) {
        this.f43166a = uri;
        return this;
    }
}
