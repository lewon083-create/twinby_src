package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6293c;

    public hx1(String str, boolean z5, boolean z10) {
        this.f6291a = str;
        this.f6292b = z5;
        this.f6293c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != hx1.class) {
            return false;
        }
        hx1 hx1Var = (hx1) obj;
        return TextUtils.equals(this.f6291a, hx1Var.f6291a) && this.f6292b == hx1Var.f6292b && this.f6293c == hx1Var.f6293c;
    }

    public final int hashCode() {
        return ((((this.f6291a.hashCode() + 31) * 31) + (true != this.f6292b ? 1237 : 1231)) * 31) + (true != this.f6293c ? 1237 : 1231);
    }
}
