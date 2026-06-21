package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProtobufStateStorage f22876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S7 f22877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0039ao f22878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Hm f22879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ti f22880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ri f22881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A6 f22882h;
    public R7 i;

    public Q7(Context context, ProtobufStateStorage protobufStateStorage, S7 s72, InterfaceC0039ao interfaceC0039ao, Hm hm, Ti ti2, Ri ri2, A6 a62, R7 r72) {
        this.f22875a = context;
        this.f22876b = protobufStateStorage;
        this.f22877c = s72;
        this.f22878d = interfaceC0039ao;
        this.f22879e = hm;
        this.f22880f = ti2;
        this.f22881g = ri2;
        this.f22882h = a62;
        this.i = r72;
    }

    @NotNull
    public final synchronized R7 a() {
        return this.i;
    }

    public final synchronized boolean b(@NotNull U7 u72) {
        try {
            boolean z5 = false;
            if (u72.a() == T7.f23004b) {
                return false;
            }
            if (u72.equals(this.i.b())) {
                return false;
            }
            List listA = (List) this.f22878d.invoke(this.i.a(), u72);
            boolean z10 = listA != null;
            if (listA == null) {
                listA = this.i.a();
            }
            if (this.f22877c.a(u72, this.i.b())) {
                z5 = true;
            } else {
                u72 = (U7) this.i.b();
            }
            if (z5 || z10) {
                R7 r72 = this.i;
                R7 r73 = (R7) this.f22879e.invoke(u72, listA);
                this.i = r73;
                this.f22876b.save(r73);
                AbstractC0137ej.a("Update distribution data: %s -> %s", r72, this.i);
            }
            return z5;
        } finally {
        }
    }

    public final synchronized U7 c() {
        try {
            if (!this.f22881g.a()) {
                U7 u72 = (U7) this.f22880f.invoke();
                this.f22881g.b();
                if (u72 != null) {
                    b(u72);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (U7) this.i.b();
    }

    @NotNull
    public final U7 a(@NotNull U7 u72) {
        U7 u7C;
        this.f22882h.a(this.f22875a);
        synchronized (this) {
            b(u72);
            u7C = c();
        }
        return u7C;
    }

    @NotNull
    public final U7 b() {
        this.f22882h.a(this.f22875a);
        return c();
    }
}
