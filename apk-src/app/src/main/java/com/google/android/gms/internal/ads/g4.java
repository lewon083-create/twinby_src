package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g4 extends l4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l4[] f5651g;

    public g4(String str, int i, int i10, long j10, long j11, l4[] l4VarArr) {
        super("CHAP");
        this.f5646b = str;
        this.f5647c = i;
        this.f5648d = i10;
        this.f5649e = j10;
        this.f5650f = j11;
        this.f5651g = l4VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g4.class == obj.getClass()) {
            g4 g4Var = (g4) obj;
            if (this.f5647c == g4Var.f5647c && this.f5648d == g4Var.f5648d && this.f5649e == g4Var.f5649e && this.f5650f == g4Var.f5650f && Objects.equals(this.f5646b, g4Var.f5646b) && Arrays.equals(this.f5651g, g4Var.f5651g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5646b.hashCode() + ((((((((this.f5647c + 527) * 31) + this.f5648d) * 31) + ((int) this.f5649e)) * 31) + ((int) this.f5650f)) * 31);
    }
}
