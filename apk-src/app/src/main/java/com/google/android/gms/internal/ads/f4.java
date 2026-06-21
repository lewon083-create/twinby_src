package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f4 extends l4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f5222b;

    public f4(String str, byte[] bArr) {
        super(str);
        this.f5222b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f4.class == obj.getClass()) {
            f4 f4Var = (f4) obj;
            if (this.f7384a.equals(f4Var.f7384a) && Arrays.equals(this.f5222b, f4Var.f5222b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5222b) + ((this.f7384a.hashCode() + 527) * 31);
    }
}
