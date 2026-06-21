package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m50 {

    @NotNull
    public static final l50 Companion = new l50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40801d;

    public /* synthetic */ m50(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            uk.o0.e(i, 15, k50.f40076a.getDescriptor());
            throw null;
        }
        this.f40798a = str;
        this.f40799b = str2;
        this.f40800c = str3;
        this.f40801d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m50)) {
            return false;
        }
        m50 m50Var = (m50) obj;
        return Intrinsics.a(this.f40798a, m50Var.f40798a) && Intrinsics.a(this.f40799b, m50Var.f40799b) && Intrinsics.a(this.f40800c, m50Var.f40800c) && Intrinsics.a(this.f40801d, m50Var.f40801d);
    }

    public final int hashCode() {
        return this.f40801d.hashCode() + k4.a(this.f40800c, k4.a(this.f40799b, this.f40798a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str = this.f40798a;
        String str2 = this.f40799b;
        return com.google.android.gms.internal.ads.om1.n(t.z.j("DebugPanelAppData(appId=", str, ", appVersion=", str2, ", system="), this.f40800c, ", androidApiLevel=", this.f40801d, ")");
    }

    public m50(String str, String str2, String str3, String str4) {
        this.f40798a = str;
        this.f40799b = str2;
        this.f40800c = str3;
        this.f40801d = str4;
    }
}
