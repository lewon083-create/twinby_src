package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ib1 extends w91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa1 f6452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6453b;

    public ib1(fa1 fa1Var, int i) {
        this.f6452a = fa1Var;
        this.f6453b = i;
    }

    public static ib1 b(fa1 fa1Var, int i) throws GeneralSecurityException {
        if (i < 8 || i > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new ib1(fa1Var, i);
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final boolean a() {
        return this.f6452a != fa1.f5300j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ib1)) {
            return false;
        }
        ib1 ib1Var = (ib1) obj;
        return ib1Var.f6452a == this.f6452a && ib1Var.f6453b == this.f6453b;
    }

    public final int hashCode() {
        return Objects.hash(ib1.class, this.f6452a, Integer.valueOf(this.f6453b));
    }

    public final String toString() {
        String str = this.f6452a.f5304b;
        int length = str.length();
        int i = this.f6453b;
        StringBuilder sb2 = new StringBuilder(length + 48 + String.valueOf(i).length() + 1);
        sb2.append("X-AES-GCM Parameters (variant: ");
        sb2.append(str);
        sb2.append("salt_size_bytes: ");
        sb2.append(i);
        sb2.append(")");
        return sb2.toString();
    }
}
