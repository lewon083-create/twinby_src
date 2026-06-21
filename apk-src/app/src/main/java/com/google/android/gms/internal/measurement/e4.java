package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc.p f13714b;

    public e4(Context context, zc.p pVar) {
        this.f13713a = context;
        this.f13714b = pVar;
    }

    public final boolean equals(Object obj) {
        zc.p pVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e4) {
            e4 e4Var = (e4) obj;
            zc.p pVar2 = e4Var.f13714b;
            if (this.f13713a.equals(e4Var.f13713a) && ((pVar = this.f13714b) != null ? pVar.equals(pVar2) : pVar2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f13713a.hashCode() ^ 1000003;
        zc.p pVar = this.f13714b;
        return (iHashCode * 1000003) ^ (pVar == null ? 0 : pVar.hashCode());
    }

    public final String toString() {
        String string = this.f13713a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f13714b);
        StringBuilder sb2 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        l7.o.t(sb2, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
