package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.ads.oc;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s5 implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t5 f13547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t5 f13548c;

    public s5(t5 t5Var) {
        this.f13547b = t5Var;
        if (t5Var.e()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f13548c = (t5) t5Var.f(4);
    }

    public final t5 a() {
        t5 t5VarB = b();
        t5VarB.getClass();
        boolean zG = true;
        byte bByteValue = ((Byte) t5VarB.f(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zG = false;
            } else {
                zG = m6.f13489c.a(t5VarB.getClass()).g(t5VarB);
                t5VarB.f(2);
            }
        }
        if (zG) {
            return t5VarB;
        }
        throw new oc("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final t5 b() {
        if (!this.f13548c.e()) {
            return this.f13548c;
        }
        this.f13548c.j();
        return this.f13548c;
    }

    public final void c() {
        if (this.f13548c.e()) {
            return;
        }
        t5 t5Var = (t5) this.f13547b.f(4);
        m6.f13489c.a(t5Var.getClass()).e(t5Var, this.f13548c);
        this.f13548c = t5Var;
    }

    public final Object clone() {
        s5 s5Var = (s5) this.f13547b.f(5);
        s5Var.f13548c = b();
        return s5Var;
    }
}
