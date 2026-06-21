package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class uv1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f11112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11113b;

    public uv1(int i) {
        switch (i) {
            case 1:
                this.f11112a = new SparseBooleanArray();
                break;
            default:
                this.f11112a = new SparseBooleanArray();
                break;
        }
    }

    public void a(int i) {
        com.google.android.gms.internal.measurement.h5.r(!this.f11113b);
        this.f11112a.append(i, true);
    }

    public j3.m b() {
        com.google.android.gms.internal.measurement.h5.r(!this.f11113b);
        this.f11113b = true;
        return new j3.m(this.f11112a);
    }

    public void c(int i) {
        ix.k0(!this.f11113b);
        this.f11112a.append(i, true);
    }

    public cw1 d() {
        ix.k0(!this.f11113b);
        this.f11113b = true;
        return new cw1(this.f11112a);
    }
}
