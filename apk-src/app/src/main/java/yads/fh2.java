package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fh2 {

    @NotNull
    public static final eh2 Companion = new eh2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qk.a[] f38444b = {new uk.c(ih2.f39544a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38445a;

    public /* synthetic */ fh2(int i, List list) {
        if (1 == (i & 1)) {
            this.f38445a = list;
        } else {
            uk.o0.e(i, 1, dh2.f37768a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fh2) && Intrinsics.a(this.f38445a, ((fh2) obj).f38445a);
    }

    public final int hashCode() {
        return this.f38445a.hashCode();
    }

    public final String toString() {
        return "PrefetchedMediationData(mediationPrefetchAdapters=" + this.f38445a + ")";
    }

    public fh2(List list) {
        this.f38445a = list;
    }
}
