package zk;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f46318n = new c(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f46323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f46324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f46325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f46326h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f46327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f46328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f46329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f46330m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z5, boolean z10, int i, int i10, boolean z11, boolean z12, boolean z13, int i11, int i12, boolean z14, boolean z15, boolean z16, String str) {
        this.f46319a = z5;
        this.f46320b = z10;
        this.f46321c = i;
        this.f46322d = i10;
        this.f46323e = z11;
        this.f46324f = z12;
        this.f46325g = z13;
        this.f46326h = i11;
        this.i = i12;
        this.f46327j = z14;
        this.f46328k = z15;
        this.f46329l = z16;
        this.f46330m = str;
    }

    public final String toString() {
        String str = this.f46330m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f46319a) {
            sb2.append("no-cache, ");
        }
        if (this.f46320b) {
            sb2.append("no-store, ");
        }
        int i = this.f46321c;
        if (i != -1) {
            sb2.append("max-age=");
            sb2.append(i);
            sb2.append(", ");
        }
        int i10 = this.f46322d;
        if (i10 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i10);
            sb2.append(", ");
        }
        if (this.f46323e) {
            sb2.append("private, ");
        }
        if (this.f46324f) {
            sb2.append("public, ");
        }
        if (this.f46325g) {
            sb2.append("must-revalidate, ");
        }
        int i11 = this.f46326h;
        if (i11 != -1) {
            sb2.append("max-stale=");
            sb2.append(i11);
            sb2.append(", ");
        }
        int i12 = this.i;
        if (i12 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i12);
            sb2.append(", ");
        }
        if (this.f46327j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f46328k) {
            sb2.append("no-transform, ");
        }
        if (this.f46329l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        this.f46330m = string;
        return string;
    }
}
