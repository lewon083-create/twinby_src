package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0302l5 implements InterfaceC0455r9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0580w9 f24269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f24270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f24271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f24272d;

    public C0302l5(@NotNull InterfaceC0580w9 interfaceC0580w9, @NotNull List<? extends G8> list, @NotNull List<? extends G8> list2, @NotNull R4 r42) {
        this.f24269a = interfaceC0580w9;
        this.f24270b = list;
        this.f24271c = list2;
        Objects.toString(r42);
        this.f24272d = new AtomicBoolean(true);
    }

    public final boolean a() {
        List list = this.f24271c;
        if (!list.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((G8) it.next()).b()) {
                    return false;
                }
            }
        }
        List list2 = this.f24270b;
        if (list2.isEmpty() || list2.isEmpty()) {
            return false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (((G8) it2.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        this.f24272d.set(false);
    }

    public final void c() {
        this.f24272d.set(true);
    }

    public final void d() {
        if (this.f24272d.get()) {
            List list = this.f24271c;
            if (!list.isEmpty() && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((G8) it.next()).b()) {
                        return;
                    }
                }
            }
            ((C0295kn) this.f24269a).c();
        }
    }

    public final void e() {
        if (this.f24272d.get() && a()) {
            ((C0295kn) this.f24269a).c();
        }
    }

    public final void f() {
        if (this.f24272d.get() && a()) {
            ((C0295kn) this.f24269a).b();
        }
    }
}
