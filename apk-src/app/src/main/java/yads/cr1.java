package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cr1 {

    @NotNull
    public static final br1 Companion = new br1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f37483c;

    public /* synthetic */ cr1(int i, String str, String str2, boolean z5) {
        if (7 != (i & 7)) {
            uk.o0.e(i, 7, ar1.f36845a.getDescriptor());
            throw null;
        }
        this.f37481a = str;
        this.f37482b = str2;
        this.f37483c = z5;
    }

    public final String a() {
        return this.f37481a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr1)) {
            return false;
        }
        cr1 cr1Var = (cr1) obj;
        return Intrinsics.a(this.f37481a, cr1Var.f37481a) && Intrinsics.a(this.f37482b, cr1Var.f37482b) && this.f37483c == cr1Var.f37483c;
    }

    public final int hashCode() {
        int iHashCode = this.f37481a.hashCode() * 31;
        String str = this.f37482b;
        return Boolean.hashCode(this.f37483c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.f37481a;
        String str2 = this.f37482b;
        boolean z5 = this.f37483c;
        StringBuilder sbJ = t.z.j("MediationAdapterData(format=", str, ", version=", str2, ", isIntegrated=");
        sbJ.append(z5);
        sbJ.append(")");
        return sbJ.toString();
    }

    public cr1(String str, String str2, boolean z5) {
        this.f37481a = str;
        this.f37482b = str2;
        this.f37483c = z5;
    }
}
