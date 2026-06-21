package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ws1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jx1 f11889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jx1 f11890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11892e;

    public ws1(String str, jx1 jx1Var, jx1 jx1Var2, int i, int i10) {
        boolean z5;
        if (i != 0) {
            z5 = false;
            if (i10 == 0) {
                i10 = 0;
                z5 = true;
            }
        } else {
            z5 = true;
        }
        ix.o(z5);
        ix.o(true ^ TextUtils.isEmpty(str));
        this.f11888a = str;
        this.f11889b = jx1Var;
        jx1Var2.getClass();
        this.f11890c = jx1Var2;
        this.f11891d = i;
        this.f11892e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ws1.class == obj.getClass()) {
            ws1 ws1Var = (ws1) obj;
            if (this.f11891d == ws1Var.f11891d && this.f11892e == ws1Var.f11892e && this.f11888a.equals(ws1Var.f11888a) && this.f11889b.equals(ws1Var.f11889b) && this.f11890c.equals(ws1Var.f11890c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11890c.hashCode() + ((this.f11889b.hashCode() + ((this.f11888a.hashCode() + ((((this.f11891d + 527) * 31) + this.f11892e) * 31)) * 31)) * 31);
    }
}
