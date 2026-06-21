package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ur1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tr1 f43760b;

    public ur1(String str, tr1 tr1Var) {
        this.f43759a = str;
        this.f43760b = tr1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur1)) {
            return false;
        }
        ur1 ur1Var = (ur1) obj;
        return Intrinsics.a(this.f43759a, ur1Var.f43759a) && this.f43760b == ur1Var.f43760b;
    }

    public final int hashCode() {
        return this.f43760b.hashCode() + (this.f43759a.hashCode() * 31);
    }

    public final String toString() {
        return "MediationNetworkMessage(message=" + this.f43759a + ", type=" + this.f43760b + ")";
    }
}
