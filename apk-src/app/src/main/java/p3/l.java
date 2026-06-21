package p3;

import android.net.Uri;
import com.google.android.gms.internal.measurement.h5;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f31172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f31175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f31176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f31177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f31178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f31179h;
    public final int i;

    static {
        j3.y.a("media3.datasource");
    }

    public l(Uri uri, long j10, int i, byte[] bArr, Map map, long j11, long j12, String str, int i10) {
        h5.h(j10 + j11 >= 0);
        h5.h(j11 >= 0);
        h5.h(j12 > 0 || j12 == -1);
        uri.getClass();
        this.f31172a = uri;
        this.f31173b = j10;
        this.f31174c = i;
        this.f31175d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f31176e = Collections.unmodifiableMap(new HashMap(map));
        this.f31177f = j11;
        this.f31178g = j12;
        this.f31179h = str;
        this.i = i10;
    }

    public static String b(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public final k a() {
        k kVar = new k();
        kVar.f31164a = this.f31172a;
        kVar.f31165b = this.f31173b;
        kVar.f31166c = this.f31174c;
        kVar.f31167d = this.f31175d;
        kVar.f31168e = this.f31176e;
        kVar.f31169f = this.f31177f;
        kVar.f31170g = this.f31178g;
        kVar.f31171h = this.f31179h;
        kVar.i = this.i;
        return kVar;
    }

    public final l c(long j10) {
        long j11 = this.f31178g;
        return d(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public final l d(long j10, long j11) {
        if (j10 == 0 && this.f31178g == j11) {
            return this;
        }
        return new l(this.f31172a, this.f31173b, this.f31174c, this.f31175d, this.f31176e, this.f31177f + j10, j11, this.f31179h, this.i);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        sb2.append(b(this.f31174c));
        sb2.append(" ");
        sb2.append(this.f31172a);
        sb2.append(", ");
        sb2.append(this.f31177f);
        sb2.append(", ");
        sb2.append(this.f31178g);
        sb2.append(", ");
        sb2.append(this.f31179h);
        sb2.append(", ");
        return t.z.d(this.i, "]", sb2);
    }
}
