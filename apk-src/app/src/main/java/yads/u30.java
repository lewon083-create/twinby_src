package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u30 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f43532k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f43533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f43536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f43537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f43538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f43539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f43540h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f43541j;

    static {
        io0.a("goog.exo.datasource");
    }

    public u30(Uri uri, long j10, int i, byte[] bArr, Map map, long j11, long j12, String str, int i10, Object obj) {
        ni.a(j10 + j11 >= 0);
        ni.a(j11 >= 0);
        ni.a(j12 > 0 || j12 == -1);
        this.f43533a = uri;
        this.f43534b = j10;
        this.f43535c = i;
        this.f43536d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f43537e = Collections.unmodifiableMap(new HashMap(map));
        this.f43538f = j11;
        this.f43539g = j12;
        this.f43540h = str;
        this.i = i10;
        this.f43541j = obj;
    }

    public final u30 a(long j10, long j11) {
        return (j10 == 0 && this.f43539g == j11) ? this : new u30(this.f43533a, this.f43534b, this.f43535c, this.f43536d, this.f43537e, this.f43538f + j10, j11, this.f43540h, this.i, this.f43541j);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i = this.f43535c;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb2.append(str);
        sb2.append(" ");
        sb2.append(this.f43533a);
        sb2.append(", ");
        sb2.append(this.f43538f);
        sb2.append(", ");
        sb2.append(this.f43539g);
        sb2.append(", ");
        sb2.append(this.f43540h);
        sb2.append(", ");
        return t.z.d(this.i, "]", sb2);
    }
}
