package d;

import com.google.android.gms.internal.ads.om1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15435e;

    public a(a6.b navigationEvent) {
        Intrinsics.checkNotNullParameter(navigationEvent, "navigationEvent");
        float f10 = navigationEvent.f445c;
        float f11 = navigationEvent.f446d;
        float f12 = navigationEvent.f444b;
        int i = navigationEvent.f443a;
        long j10 = navigationEvent.f447e;
        this.f15431a = f10;
        this.f15432b = f11;
        this.f15433c = f12;
        this.f15434d = i;
        this.f15435e = j10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackEventCompat(touchX=");
        sb2.append(this.f15431a);
        sb2.append(", touchY=");
        sb2.append(this.f15432b);
        sb2.append(", progress=");
        sb2.append(this.f15433c);
        sb2.append(", swipeEdge=");
        sb2.append(this.f15434d);
        sb2.append(", frameTimeMillis=");
        return om1.m(sb2, this.f15435e, ')');
    }
}
