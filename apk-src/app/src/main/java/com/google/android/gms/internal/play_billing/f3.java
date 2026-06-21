package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f3 implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g3 f14183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g3 f14184c;

    public f3(g3 g3Var) {
        this.f14183b = g3Var;
        if (g3Var.c()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f14184c = (g3) g3Var.d(4);
    }

    public static void a(int i, List list) {
        String strK = a0.u.k(list.size() - i, "Element at index ", " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(strK);
            }
            list.remove(size);
        }
    }

    public final g3 b() {
        g3 g3VarC = c();
        if (g3.m(g3VarC, true)) {
            return g3VarC;
        }
        throw new i4();
    }

    public final g3 c() {
        if (!this.f14184c.c()) {
            return this.f14184c;
        }
        g3 g3Var = this.f14184c;
        g3Var.getClass();
        c4.f14151c.a(g3Var.getClass()).b(g3Var);
        g3Var.j();
        return this.f14184c;
    }

    public final Object clone() {
        f3 f3Var = (f3) this.f14183b.d(5);
        f3Var.f14184c = c();
        return f3Var;
    }

    public final void d() {
        if (this.f14184c.c()) {
            return;
        }
        g3 g3Var = (g3) this.f14183b.d(4);
        c4.f14151c.a(g3Var.getClass()).d(g3Var, this.f14184c);
        this.f14184c = g3Var;
    }
}
