package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p31 implements Serializable, o31 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient t31 f8918b = new t31();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o31 f8919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile transient boolean f8920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient Object f8921e;

    public p31(o31 o31Var) {
        this.f8919c = o31Var;
    }

    @Override // com.google.android.gms.internal.ads.o31
    /* JADX INFO: renamed from: h */
    public final Object mo8h() {
        if (!this.f8920d) {
            synchronized (this.f8918b) {
                try {
                    if (!this.f8920d) {
                        Object objMo8h = this.f8919c.mo8h();
                        this.f8921e = objMo8h;
                        this.f8920d = true;
                        return objMo8h;
                    }
                } finally {
                }
            }
        }
        return this.f8921e;
    }

    public final String toString() {
        Object objG;
        if (this.f8920d) {
            String strValueOf = String.valueOf(this.f8921e);
            objG = t.z.g(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        } else {
            objG = this.f8919c;
        }
        String string = objG.toString();
        return t.z.g(new StringBuilder(string.length() + 19), "Suppliers.memoize(", string, ")");
    }
}
