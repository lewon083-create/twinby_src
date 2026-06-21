package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t80 {

    @NotNull
    public static final s80 Companion = new s80();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final qk.a[] f43235d = {null, null, new uk.c(uk.a1.f34493a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f43238c;

    public /* synthetic */ t80(int i, String str, boolean z5, List list) {
        if (7 != (i & 7)) {
            uk.o0.e(i, 7, r80.f42511a.getDescriptor());
            throw null;
        }
        this.f43236a = str;
        this.f43237b = z5;
        this.f43238c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t80)) {
            return false;
        }
        t80 t80Var = (t80) obj;
        return Intrinsics.a(this.f43236a, t80Var.f43236a) && this.f43237b == t80Var.f43237b && Intrinsics.a(this.f43238c, t80Var.f43238c);
    }

    public final int hashCode() {
        return this.f43238c.hashCode() + ((Boolean.hashCode(this.f43237b) + (this.f43236a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String str = this.f43236a;
        boolean z5 = this.f43237b;
        List list = this.f43238c;
        StringBuilder sb2 = new StringBuilder("DebugPanelSdkData(version=");
        sb2.append(str);
        sb2.append(", isIntegratedSuccess=");
        sb2.append(z5);
        sb2.append(", integrationMessages=");
        return t.z.h(sb2, list, ")");
    }

    public t80(boolean z5, List list) {
        this.f43236a = "7.18.4";
        this.f43237b = z5;
        this.f43238c = list;
    }
}
