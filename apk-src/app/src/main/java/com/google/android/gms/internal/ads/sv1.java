package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sv1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s50 f10413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10415g;

    public /* synthetic */ sv1(z2 z2Var) {
        this.f10409a = z2Var.f12846a;
        this.f10410b = z2Var.f12847b;
        this.f10411c = z2Var.f12848c;
        this.f10412d = z2Var.f12849d;
        this.f10413e = (s50) z2Var.f12852g;
        this.f10414f = z2Var.f12850e;
        this.f10415g = z2Var.f12851f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sv1.class == obj.getClass()) {
            sv1 sv1Var = (sv1) obj;
            if (this.f10409a == sv1Var.f10409a && this.f10410b == sv1Var.f10410b && this.f10411c == sv1Var.f10411c && this.f10412d == sv1Var.f10412d && this.f10414f == sv1Var.f10414f && this.f10415g == sv1Var.f10415g && this.f10413e.equals(sv1Var.f10413e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f10409a);
        Integer numValueOf2 = Integer.valueOf(this.f10410b);
        Integer numValueOf3 = Integer.valueOf(this.f10411c);
        Boolean bool = Boolean.FALSE;
        return Objects.hash(numValueOf, numValueOf2, numValueOf3, bool, bool, Integer.valueOf(this.f10412d), this.f10413e, Integer.valueOf(this.f10414f), Integer.valueOf(this.f10415g), bool, bool);
    }
}
