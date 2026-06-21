package o6;

import android.os.Bundle;
import androidx.lifecycle.k;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ob.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g8.c f29781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f29782b;

    public e(g8.c impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.f29781a = impl;
    }

    public final Bundle a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(key, "key");
        g8.c cVar = this.f29781a;
        if (!cVar.f20010b) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle source = (Bundle) cVar.f20016h;
        if (source == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleL = source.containsKey(key) ? ya.e.l(source, key) : null;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        source.remove(key);
        Intrinsics.checkNotNullParameter(source, "source");
        if (source.isEmpty()) {
            cVar.f20016h = null;
        }
        return bundleL;
    }

    public final d b() {
        d dVar;
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesProvider", "key");
        g8.c cVar = this.f29781a;
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesProvider", "key");
        synchronized (((z) cVar.f20014f)) {
            Iterator it = ((LinkedHashMap) cVar.f20015g).entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                d dVar2 = (d) entry.getValue();
                if (Intrinsics.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    public final void c(String key, d provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        g8.c cVar = this.f29781a;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        synchronized (((z) cVar.f20014f)) {
            if (((LinkedHashMap) cVar.f20015g).containsKey(key)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            ((LinkedHashMap) cVar.f20015g).put(key, provider);
            Unit unit = Unit.f27471a;
        }
    }

    public final void d() {
        Intrinsics.checkNotNullParameter(k.class, "clazz");
        if (!this.f29781a.f20011c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a aVar = this.f29782b;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f29782b = aVar;
        try {
            k.class.getDeclaredConstructor(null);
            a aVar2 = this.f29782b;
            if (aVar2 != null) {
                String className = k.class.getName();
                Intrinsics.checkNotNullExpressionValue(className, "getName(...)");
                Intrinsics.checkNotNullParameter(className, "className");
                aVar2.f29778a.add(className);
            }
        } catch (NoSuchMethodException e3) {
            throw new IllegalArgumentException("Class " + k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
        }
    }
}
