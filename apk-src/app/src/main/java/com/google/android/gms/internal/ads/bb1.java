package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bb1 extends w91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ea1 f3715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h91 f3717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w91 f3718d;

    public bb1(ea1 ea1Var, String str, h91 h91Var, w91 w91Var) {
        this.f3715a = ea1Var;
        this.f3716b = str;
        this.f3717c = h91Var;
        this.f3718d = w91Var;
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final boolean a() {
        return this.f3715a != ea1.f4903m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bb1)) {
            return false;
        }
        bb1 bb1Var = (bb1) obj;
        return bb1Var.f3717c.equals(this.f3717c) && bb1Var.f3718d.equals(this.f3718d) && bb1Var.f3716b.equals(this.f3716b) && bb1Var.f3715a.equals(this.f3715a);
    }

    public final int hashCode() {
        return Objects.hash(bb1.class, this.f3716b, this.f3717c, this.f3718d, this.f3715a);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f3717c);
        String strValueOf2 = String.valueOf(this.f3718d);
        String strValueOf3 = String.valueOf(this.f3715a);
        String str = this.f3716b;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 64 + length2 + 27 + strValueOf2.length() + 11 + strValueOf3.length() + 1);
        l7.o.t(sb2, "LegacyKmsEnvelopeAead Parameters (kekUri: ", str, ", dekParsingStrategy: ", strValueOf);
        l7.o.t(sb2, ", dekParametersForNewKeys: ", strValueOf2, ", variant: ", strValueOf3);
        sb2.append(")");
        return sb2.toString();
    }
}
