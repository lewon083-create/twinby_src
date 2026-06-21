package x1;

import android.graphics.Insets;
import com.google.android.gms.internal.ads.om1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f35688e = new b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35692d;

    public b(int i, int i10, int i11, int i12) {
        this.f35689a = i;
        this.f35690b = i10;
        this.f35691c = i11;
        this.f35692d = i12;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f35689a, bVar2.f35689a), Math.max(bVar.f35690b, bVar2.f35690b), Math.max(bVar.f35691c, bVar2.f35691c), Math.max(bVar.f35692d, bVar2.f35692d));
    }

    public static b b(int i, int i10, int i11, int i12) {
        return (i == 0 && i10 == 0 && i11 == 0 && i12 == 0) ? f35688e : new b(i, i10, i11, i12);
    }

    public static b c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return b1.a.c(this.f35689a, this.f35690b, this.f35691c, this.f35692d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f35692d == bVar.f35692d && this.f35689a == bVar.f35689a && this.f35691c == bVar.f35691c && this.f35690b == bVar.f35690b;
    }

    public final int hashCode() {
        return (((((this.f35689a * 31) + this.f35690b) * 31) + this.f35691c) * 31) + this.f35692d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f35689a);
        sb2.append(", top=");
        sb2.append(this.f35690b);
        sb2.append(", right=");
        sb2.append(this.f35691c);
        sb2.append(", bottom=");
        return om1.l(sb2, this.f35692d, '}');
    }
}
