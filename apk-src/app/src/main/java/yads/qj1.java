package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f42324b;

    public qj1(String str, float f10) {
        this.f42323a = str;
        this.f42324b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj1)) {
            return false;
        }
        qj1 qj1Var = (qj1) obj;
        return Intrinsics.a(this.f42323a, qj1Var.f42323a) && Float.compare(this.f42324b, qj1Var.f42324b) == 0;
    }

    public final int hashCode() {
        String str = this.f42323a;
        return Float.hashCode(this.f42324b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Media(htmlContent=" + this.f42323a + ", aspectRatio=" + this.f42324b + ")";
    }
}
