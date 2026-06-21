package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k9.a f8006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8007c;

    public /* synthetic */ mt0(oq0 oq0Var) {
        this.f8005a = (String) oq0Var.f8762c;
        this.f8006b = (k9.a) oq0Var.f8763d;
        this.f8007c = (String) oq0Var.f8764e;
    }

    public final String a() {
        k9.a aVar = this.f8006b;
        return aVar == null ? "unknown" : aVar.name().toLowerCase(Locale.ENGLISH);
    }

    public final boolean equals(Object obj) {
        k9.a aVar;
        k9.a aVar2;
        if (obj instanceof mt0) {
            mt0 mt0Var = (mt0) obj;
            if (this.f8005a.equals(mt0Var.f8005a) && (aVar = this.f8006b) != null && (aVar2 = mt0Var.f8006b) != null && aVar.equals(aVar2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f8005a, this.f8006b);
    }
}
