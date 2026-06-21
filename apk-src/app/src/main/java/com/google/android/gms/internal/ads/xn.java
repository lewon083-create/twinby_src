package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pi f12205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f12207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f12208e;

    static {
        String str = cq0.f4293a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public xn(pi piVar, boolean z5, int[] iArr, boolean[] zArr) {
        int i = piVar.f9070a;
        this.f12204a = i;
        ix.o(i == iArr.length && i == zArr.length);
        this.f12205b = piVar;
        this.f12206c = z5 && i > 1;
        this.f12207d = (int[]) iArr.clone();
        this.f12208e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xn.class == obj.getClass()) {
            xn xnVar = (xn) obj;
            if (this.f12206c == xnVar.f12206c && this.f12205b.equals(xnVar.f12205b) && Arrays.equals(this.f12207d, xnVar.f12207d) && Arrays.equals(this.f12208e, xnVar.f12208e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12208e) + ((Arrays.hashCode(this.f12207d) + (((this.f12205b.hashCode() * 31) + (this.f12206c ? 1 : 0)) * 31)) * 31);
    }
}
