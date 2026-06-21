package a6;

import a0.u;
import com.google.android.gms.internal.ads.om1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f447e;

    public b(int i, float f10, float f11, float f12, long j10) {
        this.f443a = i;
        this.f444b = f10;
        this.f445c = f11;
        this.f446d = f12;
        this.f447e = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f445c == bVar.f445c && this.f446d == bVar.f446d && this.f444b == bVar.f444b && this.f443a == bVar.f443a && this.f447e == bVar.f447e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f447e) + u.g(this.f443a, l7.o.b(this.f444b, l7.o.b(this.f446d, Float.hashCode(this.f445c) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavigationEvent(touchX=");
        sb2.append(this.f445c);
        sb2.append(", touchY=");
        sb2.append(this.f446d);
        sb2.append(", progress=");
        sb2.append(this.f444b);
        sb2.append(", swipeEdge=");
        sb2.append(this.f443a);
        sb2.append(", frameTimeMillis=");
        return om1.m(sb2, this.f447e, ')');
    }
}
