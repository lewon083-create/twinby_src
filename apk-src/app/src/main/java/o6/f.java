package o6;

import android.os.Bundle;
import androidx.lifecycle.o;
import androidx.lifecycle.w;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;
import ob.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g8.c f29783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f29784b;

    public f(g8.c cVar) {
        this.f29783a = cVar;
        this.f29784b = new e(cVar);
    }

    public final void a(Bundle source) {
        g8.c cVar = this.f29783a;
        g gVar = (g) cVar.f20012d;
        if (!cVar.f20009a) {
            cVar.a();
        }
        if (((w) gVar.getLifecycle()).f1606c.a(o.f1576e)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + ((w) gVar.getLifecycle()).f1606c).toString());
        }
        if (cVar.f20010b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleL = null;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter("androidx.lifecycle.BundlableSavedStateRegistry.key", "key");
            if (source.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundleL = ya.e.l(source, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
        }
        cVar.f20016h = bundleL;
        cVar.f20010b = true;
    }

    public final void b(Bundle source) {
        Intrinsics.checkNotNullParameter(source, "outBundle");
        g8.c cVar = this.f29783a;
        Intrinsics.checkNotNullParameter(source, "outBundle");
        j0.d();
        Bundle value = i0.o.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(value, "source");
        Bundle from = (Bundle) cVar.f20016h;
        if (from != null) {
            Intrinsics.checkNotNullParameter(from, "from");
            value.putAll(from);
        }
        synchronized (((z) cVar.f20014f)) {
            try {
                for (Map.Entry entry : ((LinkedHashMap) cVar.f20015g).entrySet()) {
                    String key = (String) entry.getKey();
                    Bundle value2 = ((d) entry.getValue()).a();
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value2, "value");
                    value.putBundle(key, value2);
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Intrinsics.checkNotNullParameter(value, "source");
        if (value.isEmpty()) {
            return;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter("androidx.lifecycle.BundlableSavedStateRegistry.key", "key");
        Intrinsics.checkNotNullParameter(value, "value");
        source.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", value);
    }
}
