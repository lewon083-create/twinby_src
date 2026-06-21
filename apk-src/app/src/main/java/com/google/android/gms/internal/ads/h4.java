package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h4 extends l4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f6019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l4[] f6020f;

    public h4(String str, boolean z5, boolean z10, String[] strArr, l4[] l4VarArr) {
        super("CTOC");
        this.f6016b = str;
        this.f6017c = z5;
        this.f6018d = z10;
        this.f6019e = strArr;
        this.f6020f = l4VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h4.class == obj.getClass()) {
            h4 h4Var = (h4) obj;
            if (this.f6017c == h4Var.f6017c && this.f6018d == h4Var.f6018d && Objects.equals(this.f6016b, h4Var.f6016b) && Arrays.equals(this.f6019e, h4Var.f6019e) && Arrays.equals(this.f6020f, h4Var.f6020f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6016b.hashCode() + (((((this.f6017c ? 1 : 0) + 527) * 31) + (this.f6018d ? 1 : 0)) * 31);
    }
}
