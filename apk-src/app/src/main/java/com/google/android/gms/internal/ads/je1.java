package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class je1 extends ue1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h91 f6838c;

    public je1(int i, int i10, h91 h91Var) {
        this.f6836a = i;
        this.f6837b = i10;
        this.f6838c = h91Var;
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final boolean a() {
        return this.f6838c != h91.f6072s;
    }

    public final int b() {
        h91 h91Var = h91.f6072s;
        int i = this.f6837b;
        h91 h91Var2 = this.f6838c;
        if (h91Var2 == h91Var) {
            return i;
        }
        if (h91Var2 == h91.f6069p || h91Var2 == h91.f6070q || h91Var2 == h91.f6071r) {
            return i + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof je1)) {
            return false;
        }
        je1 je1Var = (je1) obj;
        return je1Var.f6836a == this.f6836a && je1Var.b() == b() && je1Var.f6838c == this.f6838c;
    }

    public final int hashCode() {
        return Objects.hash(je1.class, Integer.valueOf(this.f6836a), Integer.valueOf(this.f6837b), this.f6838c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f6838c);
        int length = strValueOf.length();
        int i = this.f6837b;
        int length2 = String.valueOf(i).length();
        int i10 = this.f6836a;
        StringBuilder sb2 = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i10).length() + 10);
        sb2.append("AES-CMAC Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i);
        return l7.o.l(sb2, "-byte tags, and ", i10, "-byte key)");
    }
}
