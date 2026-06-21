package z3;

import ad.b1;
import ad.j0;
import android.net.Uri;
import com.google.android.gms.internal.measurement.h5;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f46063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f46064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f46065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f46066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f46067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f46068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f46069h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f46070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f46071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j0 f46072l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j0 f46073m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b1 f46074n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f46075o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f46076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f46077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f46078r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f46079s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f46080t;

    public f(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z5, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z10, String str2, String str3, long j16, long j17, String str4) {
        h5.h((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f46062a = str;
        this.f46063b = uri;
        this.f46064c = uri2;
        this.f46065d = j10;
        this.f46066e = j11;
        this.f46067f = j12;
        this.f46068g = j13;
        this.f46069h = arrayList;
        this.i = z5;
        this.f46070j = j14;
        this.f46071k = j15;
        this.f46072l = j0.r(arrayList2);
        this.f46073m = j0.r(arrayList3);
        this.f46074n = j0.z(new d2.a(19), arrayList4);
        this.f46075o = z10;
        this.f46076p = str2;
        this.f46077q = str3;
        this.f46078r = j16;
        this.f46079s = j17;
        this.f46080t = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f46065d == fVar.f46065d && this.f46066e == fVar.f46066e && this.f46067f == fVar.f46067f && this.f46068g == fVar.f46068g && this.i == fVar.i && this.f46070j == fVar.f46070j && this.f46071k == fVar.f46071k && this.f46075o == fVar.f46075o && this.f46078r == fVar.f46078r && this.f46079s == fVar.f46079s && Objects.equals(this.f46062a, fVar.f46062a) && Objects.equals(this.f46063b, fVar.f46063b) && Objects.equals(this.f46064c, fVar.f46064c) && Objects.equals(this.f46069h, fVar.f46069h) && Objects.equals(this.f46072l, fVar.f46072l) && Objects.equals(this.f46073m, fVar.f46073m) && Objects.equals(this.f46074n, fVar.f46074n) && Objects.equals(this.f46076p, fVar.f46076p) && Objects.equals(this.f46077q, fVar.f46077q) && Objects.equals(this.f46080t, fVar.f46080t);
    }

    public final int hashCode() {
        return Objects.hash(this.f46062a, this.f46063b, this.f46064c, Long.valueOf(this.f46065d), Long.valueOf(this.f46066e), Long.valueOf(this.f46067f), Long.valueOf(this.f46068g), this.f46069h, Boolean.valueOf(this.i), Long.valueOf(this.f46070j), Long.valueOf(this.f46071k), this.f46072l, this.f46073m, this.f46074n, Boolean.valueOf(this.f46075o), this.f46076p, this.f46077q, Long.valueOf(this.f46078r), Long.valueOf(this.f46079s), this.f46080t);
    }
}
