package zk;

import com.google.android.gms.internal.ads.gb;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f46388j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f46389k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f46390l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f46391m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f46396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f46397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f46398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f46399h;
    public final boolean i;

    public h(String str, String str2, long j10, String str3, String str4, boolean z5, boolean z10, boolean z11, boolean z12) {
        this.f46392a = str;
        this.f46393b = str2;
        this.f46394c = j10;
        this.f46395d = str3;
        this.f46396e = str4;
        this.f46397f = z5;
        this.f46398g = z10;
        this.f46399h = z11;
        this.i = z12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.a(hVar.f46392a, this.f46392a) && Intrinsics.a(hVar.f46393b, this.f46393b) && hVar.f46394c == this.f46394c && Intrinsics.a(hVar.f46395d, this.f46395d) && Intrinsics.a(hVar.f46396e, this.f46396e) && hVar.f46397f == this.f46397f && hVar.f46398g == this.f46398g && hVar.f46399h == this.f46399h && hVar.i == this.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.f46399h) + ((Boolean.hashCode(this.f46398g) + ((Boolean.hashCode(this.f46397f) + gf.a.e(gf.a.e(l7.o.d(this.f46394c, gf.a.e(gf.a.e(527, 31, this.f46392a), 31, this.f46393b), 31), 31, this.f46395d), 31, this.f46396e)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f46392a);
        sb2.append('=');
        sb2.append(this.f46393b);
        if (this.f46399h) {
            long j10 = this.f46394c;
            if (j10 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                Date date = new Date(j10);
                gb gbVar = el.c.f16435a;
                Intrinsics.checkNotNullParameter(date, "<this>");
                String str = ((DateFormat) el.c.f16435a.get()).format(date);
                Intrinsics.checkNotNullExpressionValue(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb2.append(str);
            }
        }
        if (!this.i) {
            sb2.append("; domain=");
            sb2.append(this.f46395d);
        }
        sb2.append("; path=");
        sb2.append(this.f46396e);
        if (this.f46397f) {
            sb2.append("; secure");
        }
        if (this.f46398g) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }
}
