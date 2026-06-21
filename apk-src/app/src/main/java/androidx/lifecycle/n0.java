package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements s, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f1571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1572d;

    public n0(String key, m0 handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f1570b = key;
        this.f1571c = handle;
    }

    public final void a(p lifecycle, o6.e registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f1572d) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f1572d = true;
        lifecycle.a(this);
        registry.c(this.f1570b, (d.f) this.f1571c.f1569a.f366f);
    }

    @Override // androidx.lifecycle.s
    public final void d(u source, n event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == n.ON_DESTROY) {
            this.f1572d = false;
            source.getLifecycle().b(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
