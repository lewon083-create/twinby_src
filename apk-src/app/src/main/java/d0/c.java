package d0;

import android.util.Range;
import com.google.android.gms.internal.ads.om1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Range f15492d = new Range(30, 30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15493a = 60;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15494b = 60;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f15495c = b.f15487c;

    @Override // b0.a
    public final b a() {
        return this.f15495c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FpsRangeFeature(minFps=");
        sb2.append(this.f15493a);
        sb2.append(", maxFps=");
        return om1.l(sb2, this.f15494b, ')');
    }
}
