package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ex0 {

    @NotNull
    public static final dx0 Companion = new dx0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38275d;

    public /* synthetic */ ex0(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            uk.o0.e(i, 15, cx0.f37544a.getDescriptor());
            throw null;
        }
        this.f38272a = str;
        this.f38273b = str2;
        this.f38274c = str3;
        this.f38275d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex0)) {
            return false;
        }
        ex0 ex0Var = (ex0) obj;
        return Intrinsics.a(this.f38272a, ex0Var.f38272a) && Intrinsics.a(this.f38273b, ex0Var.f38273b) && Intrinsics.a(this.f38274c, ex0Var.f38274c) && Intrinsics.a(this.f38275d, ex0Var.f38275d);
    }

    public final int hashCode() {
        return this.f38275d.hashCode() + k4.a(this.f38274c, k4.a(this.f38273b, this.f38272a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str = this.f38272a;
        String str2 = this.f38273b;
        return com.google.android.gms.internal.ads.om1.n(t.z.j("FontUrls(regular=", str, ", bold=", str2, ", light="), this.f38274c, ", medium=", this.f38275d, ")");
    }
}
