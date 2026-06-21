package yads;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42436b;

    public r01(String str, String str2) {
        this.f42435a = str;
        this.f42436b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r01.class == obj.getClass()) {
            r01 r01Var = (r01) obj;
            if (TextUtils.equals(this.f42435a, r01Var.f42435a) && TextUtils.equals(this.f42436b, r01Var.f42436b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f42436b.hashCode() + (this.f42435a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Header[name=");
        sb2.append(this.f42435a);
        sb2.append(",value=");
        return a0.u.o(sb2, this.f42436b, "]");
    }
}
