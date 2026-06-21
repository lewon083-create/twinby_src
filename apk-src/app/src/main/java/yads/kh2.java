package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kh2 {

    @NotNull
    public static final jh2 Companion = new jh2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sh2 f40204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ii2 f40205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ci2 f40206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f40207e;

    public /* synthetic */ kh2(int i, String str, sh2 sh2Var, ii2 ii2Var, ci2 ci2Var, String str2) {
        if (31 != (i & 31)) {
            uk.o0.e(i, 31, ih2.f39544a.getDescriptor());
            throw null;
        }
        this.f40203a = str;
        this.f40204b = sh2Var;
        this.f40205c = ii2Var;
        this.f40206d = ci2Var;
        this.f40207e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh2)) {
            return false;
        }
        kh2 kh2Var = (kh2) obj;
        return Intrinsics.a(this.f40203a, kh2Var.f40203a) && Intrinsics.a(this.f40204b, kh2Var.f40204b) && Intrinsics.a(this.f40205c, kh2Var.f40205c) && Intrinsics.a(this.f40206d, kh2Var.f40206d) && Intrinsics.a(this.f40207e, kh2Var.f40207e);
    }

    public final int hashCode() {
        int iHashCode = this.f40203a.hashCode() * 31;
        sh2 sh2Var = this.f40204b;
        int iHashCode2 = (iHashCode + (sh2Var == null ? 0 : sh2Var.hashCode())) * 31;
        ii2 ii2Var = this.f40205c;
        int iHashCode3 = (this.f40206d.hashCode() + ((iHashCode2 + (ii2Var == null ? 0 : ii2Var.hashCode())) * 31)) * 31;
        String str = this.f40207e;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f40203a;
        sh2 sh2Var = this.f40204b;
        ii2 ii2Var = this.f40205c;
        ci2 ci2Var = this.f40206d;
        String str2 = this.f40207e;
        StringBuilder sb2 = new StringBuilder("PrefetchedMediationInfo(adapter=");
        sb2.append(str);
        sb2.append(", networkWinner=");
        sb2.append(sh2Var);
        sb2.append(", revenue=");
        sb2.append(ii2Var);
        sb2.append(", result=");
        sb2.append(ci2Var);
        sb2.append(", networkAdInfo=");
        return a0.u.o(sb2, str2, ")");
    }

    public kh2(String str, sh2 sh2Var, ii2 ii2Var, ci2 ci2Var, String str2) {
        this.f40203a = str;
        this.f40204b = sh2Var;
        this.f40205c = ii2Var;
        this.f40206d = ci2Var;
        this.f40207e = str2;
    }
}
