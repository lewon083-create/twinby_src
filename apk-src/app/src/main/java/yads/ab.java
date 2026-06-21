package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36679c;

    public ab(String str, String str2, boolean z5) {
        this.f36677a = z5;
        this.f36678b = str;
        this.f36679c = str2;
    }

    public final String a() {
        return this.f36679c;
    }

    public final String b() {
        return this.f36678b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return this.f36677a == abVar.f36677a && Intrinsics.a(this.f36678b, abVar.f36678b) && Intrinsics.a(this.f36679c, abVar.f36679c);
    }

    public final int hashCode() {
        return this.f36679c.hashCode() + k4.a(this.f36678b, Boolean.hashCode(this.f36677a) * 31, 31);
    }

    public final String toString() {
        boolean z5 = this.f36677a;
        String str = this.f36678b;
        String str2 = this.f36679c;
        StringBuilder sb2 = new StringBuilder("AdTuneInfo(shouldShow=");
        sb2.append(z5);
        sb2.append(", token=");
        sb2.append(str);
        sb2.append(", advertiserInfo=");
        return a0.u.o(sb2, str2, ")");
    }
}
