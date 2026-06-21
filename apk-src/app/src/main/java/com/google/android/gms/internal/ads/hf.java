package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n5 f6113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f6117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6118h;
    public final int i;

    static {
        String str = cq0.f4293a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public hf(Object obj, int i, n5 n5Var, Object obj2, int i10, long j10, long j11, int i11, int i12) {
        ix.o(i >= 0);
        ix.o(i10 >= 0);
        this.f6111a = obj;
        this.f6112b = i;
        this.f6113c = n5Var;
        this.f6114d = obj2;
        this.f6115e = i10;
        this.f6116f = j10;
        this.f6117g = j11;
        this.f6118h = i11;
        this.i = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hf.class == obj.getClass()) {
            hf hfVar = (hf) obj;
            if (this.f6112b == hfVar.f6112b && this.f6115e == hfVar.f6115e && this.f6116f == hfVar.f6116f && this.f6117g == hfVar.f6117g && this.f6118h == hfVar.f6118h && this.i == hfVar.i && Objects.equals(this.f6113c, hfVar.f6113c) && Objects.equals(this.f6111a, hfVar.f6111a) && Objects.equals(this.f6114d, hfVar.f6114d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f6111a, Integer.valueOf(this.f6112b), this.f6113c, this.f6114d, Integer.valueOf(this.f6115e), Long.valueOf(this.f6116f), Long.valueOf(this.f6117g), Integer.valueOf(this.f6118h), Integer.valueOf(this.i));
    }

    public final String toString() {
        int i = this.f6112b;
        int length = String.valueOf(i).length();
        int i10 = this.f6115e;
        int length2 = String.valueOf(i10).length();
        long j10 = this.f6116f;
        StringBuilder sb2 = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j10).length());
        om1.u(sb2, "mediaItem=", i, ", period=", i10);
        sb2.append(", pos=");
        sb2.append(j10);
        String string = sb2.toString();
        int i11 = this.f6118h;
        if (i11 == -1) {
            return string;
        }
        int length3 = string.length();
        long j11 = this.f6117g;
        int length4 = String.valueOf(i11).length() + length3 + 13 + String.valueOf(j11).length() + 10;
        int i12 = this.i;
        StringBuilder sb3 = new StringBuilder(length4 + 5 + String.valueOf(i12).length());
        sb3.append(string);
        sb3.append(", contentPos=");
        sb3.append(j11);
        return pe.a.g(sb3, i11, ", adGroup=", i12, ", ad=");
    }
}
