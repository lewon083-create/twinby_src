package cj;

import com.google.android.gms.internal.measurement.d4;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f2321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f2322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2323d;

    public f(String uri, r rVar, Map httpHeaders, String str) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(httpHeaders, "httpHeaders");
        this.f2320a = uri;
        this.f2321b = rVar;
        this.f2322c = httpHeaders;
        this.f2323d = str;
    }

    public final List a() {
        return kotlin.collections.s.f(this.f2320a, this.f2321b, this.f2322c, this.f2323d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return d4.d(a(), ((f) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "CreationOptions(uri=" + this.f2320a + ", formatHint=" + this.f2321b + ", httpHeaders=" + this.f2322c + ", userAgent=" + this.f2323d + ")";
    }
}
