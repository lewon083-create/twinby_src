package c7;

import com.google.android.gms.internal.ads.om1;
import ij.p;
import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f2246g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f2251f = ij.h.b(new i(0, this));

    static {
        new j("", 0, 0, 0);
        f2246g = new j("", 0, 1, 0);
        new j("", 1, 0, 0);
    }

    public j(String str, int i, int i10, int i11) {
        this.f2247b = i;
        this.f2248c = i10;
        this.f2249d = i11;
        this.f2250e = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j other = (j) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        Object value = this.f2251f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-bigInteger>(...)");
        Object value2 = other.f2251f.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "<get-bigInteger>(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f2247b == jVar.f2247b && this.f2248c == jVar.f2248c && this.f2249d == jVar.f2249d;
    }

    public final int hashCode() {
        return ((((527 + this.f2247b) * 31) + this.f2248c) * 31) + this.f2249d;
    }

    public final String toString() {
        String str = this.f2250e;
        String strK = !StringsKt.D(str) ? om1.k("-", str) : "";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2247b);
        sb2.append('.');
        sb2.append(this.f2248c);
        sb2.append('.');
        return z.d(this.f2249d, strK, sb2);
    }
}
