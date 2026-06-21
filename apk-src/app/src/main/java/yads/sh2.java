package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sh2 {

    @NotNull
    public static final rh2 Companion = new rh2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42944b;

    public /* synthetic */ sh2(int i, String str, String str2) {
        if (3 != (i & 3)) {
            uk.o0.e(i, 3, qh2.f42302a.getDescriptor());
            throw null;
        }
        this.f42943a = str;
        this.f42944b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh2)) {
            return false;
        }
        sh2 sh2Var = (sh2) obj;
        return Intrinsics.a(this.f42943a, sh2Var.f42943a) && Intrinsics.a(this.f42944b, sh2Var.f42944b);
    }

    public final int hashCode() {
        return this.f42944b.hashCode() + (this.f42943a.hashCode() * 31);
    }

    public final String toString() {
        return t.z.f("PrefetchedMediationNetworkWinner(networkName=", this.f42943a, ", networkAdUnit=", this.f42944b, ")");
    }
}
