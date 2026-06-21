package ij;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f21351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f21352d;

    public q(Object obj, Object obj2, Object obj3) {
        this.f21350b = obj;
        this.f21351c = obj2;
        this.f21352d = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.a(this.f21350b, qVar.f21350b) && Intrinsics.a(this.f21351c, qVar.f21351c) && Intrinsics.a(this.f21352d, qVar.f21352d);
    }

    public final int hashCode() {
        Object obj = this.f21350b;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f21351c;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f21352d;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f21350b + ", " + this.f21351c + ", " + this.f21352d + ')';
    }
}
