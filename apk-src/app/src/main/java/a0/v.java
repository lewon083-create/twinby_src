package a0;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0.k f234b;

    public v(ArrayList arrayList, g0.k kVar) {
        this.f233a = arrayList;
        this.f234b = kVar;
        f2.g.a("Camera ID set cannot be empty.", !arrayList.isEmpty());
    }

    public final String a() {
        ArrayList arrayList = this.f233a;
        f2.g.h("getInternalId() is only available for single-camera identifiers.", arrayList.size() == 1);
        return (String) CollectionsKt.D(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f233a.equals(vVar.f233a) && Intrinsics.a(this.f234b, vVar.f234b);
    }

    public final int hashCode() {
        int iHashCode = this.f233a.hashCode() * 31;
        g0.k kVar = this.f234b;
        return iHashCode + (kVar != null ? kVar.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CameraIdentifier{cameraIds="
            r0.<init>(r1)
            r6 = 0
            r7 = 62
            java.util.ArrayList r2 = r8.f233a
            java.lang.String r3 = ","
            r4 = 0
            r5 = 0
            java.lang.String r1 = kotlin.collections.CollectionsKt.I(r2, r3, r4, r5, r6, r7)
            r0.append(r1)
            g0.k r1 = r8.f234b
            if (r1 == 0) goto L2b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ", compatId="
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L2d
        L2b:
            java.lang.String r1 = ""
        L2d:
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = a0.u.n(r0, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.v.toString():java.lang.String");
    }
}
