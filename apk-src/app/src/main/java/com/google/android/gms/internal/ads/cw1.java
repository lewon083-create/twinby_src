package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f4351a;

    public final int a(int i) {
        SparseBooleanArray sparseBooleanArray = this.f4351a;
        ix.n0(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cw1) {
            return this.f4351a.equals(((cw1) obj).f4351a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4351a.hashCode();
    }
}
