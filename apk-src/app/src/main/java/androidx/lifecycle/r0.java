package androidx.lifecycle;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements o6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o6.e f1586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f1588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ij.p f1589d;

    public r0(o6.e savedStateRegistry, a1 viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f1586a = savedStateRegistry;
        this.f1589d = ij.h.b(new q0(0, viewModelStoreOwner));
    }

    @Override // o6.d
    public final Bundle a() {
        kotlin.collections.j0.d();
        Bundle source = i0.o.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(source, "source");
        Bundle from = this.f1588c;
        if (from != null) {
            Intrinsics.checkNotNullParameter(from, "from");
            source.putAll(from);
        }
        for (Map.Entry entry : ((s0) this.f1589d.getValue()).f1590b.entrySet()) {
            String key = (String) entry.getKey();
            Bundle value = ((d.f) ((m0) entry.getValue()).f1569a.f366f).a();
            Intrinsics.checkNotNullParameter(value, "source");
            if (!value.isEmpty()) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                source.putBundle(key, value);
            }
        }
        this.f1587b = false;
        return source;
    }

    public final void b() {
        if (this.f1587b) {
            return;
        }
        Bundle from = this.f1586a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        kotlin.collections.j0.d();
        Bundle source = i0.o.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(source, "source");
        Bundle from2 = this.f1588c;
        if (from2 != null) {
            Intrinsics.checkNotNullParameter(from2, "from");
            source.putAll(from2);
        }
        if (from != null) {
            Intrinsics.checkNotNullParameter(from, "from");
            source.putAll(from);
        }
        this.f1588c = source;
        this.f1587b = true;
    }
}
