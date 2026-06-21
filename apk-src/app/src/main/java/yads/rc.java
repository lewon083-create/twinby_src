package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rc implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f42541d;

    public rc(String str, String str2, String str3, ArrayList arrayList) {
        this.f42538a = str;
        this.f42539b = str2;
        this.f42540c = str3;
        this.f42541d = arrayList;
    }

    @Override // yads.m0
    public final String a() {
        return this.f42538a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc)) {
            return false;
        }
        rc rcVar = (rc) obj;
        return Intrinsics.a(this.f42538a, rcVar.f42538a) && Intrinsics.a(this.f42539b, rcVar.f42539b) && Intrinsics.a(this.f42540c, rcVar.f42540c) && Intrinsics.a(this.f42541d, rcVar.f42541d);
    }

    public final int hashCode() {
        return this.f42541d.hashCode() + k4.a(this.f42540c, k4.a(this.f42539b, this.f42538a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str = this.f42538a;
        String str2 = this.f42539b;
        String str3 = this.f42540c;
        List list = this.f42541d;
        StringBuilder sbJ = t.z.j("AdtuneAction(actionType=", str, ", adtuneUrl=", str2, ", optOutUrl=");
        sbJ.append(str3);
        sbJ.append(", trackingUrls=");
        sbJ.append(list);
        sbJ.append(")");
        return sbJ.toString();
    }
}
