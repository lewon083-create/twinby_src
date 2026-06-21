package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements Serializable, w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f13302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile transient boolean f13303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object f13304d;

    public x(w wVar) {
        this.f13302b = wVar;
    }

    @Override // com.google.android.gms.internal.auth.w
    public final Object h() {
        if (!this.f13303c) {
            synchronized (this) {
                try {
                    if (!this.f13303c) {
                        Object objH = this.f13302b.h();
                        this.f13304d = objH;
                        this.f13303c = true;
                        return objH;
                    }
                } finally {
                }
            }
        }
        return this.f13304d;
    }

    public final String toString() {
        return pe.a.f("Suppliers.memoize(", (this.f13303c ? pe.a.f("<supplier that returned ", String.valueOf(this.f13304d), ">") : this.f13302b).toString(), ")");
    }
}
