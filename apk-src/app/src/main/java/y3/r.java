package y3;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f36429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f36430f;

    public r(int i, int i10, String str, String str2, String str3, String str4) {
        this.f36425a = i;
        this.f36426b = i10;
        this.f36427c = str;
        this.f36428d = str2;
        this.f36429e = str3;
        this.f36430f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f36425a == rVar.f36425a && this.f36426b == rVar.f36426b && TextUtils.equals(this.f36427c, rVar.f36427c) && TextUtils.equals(this.f36428d, rVar.f36428d) && TextUtils.equals(this.f36429e, rVar.f36429e) && TextUtils.equals(this.f36430f, rVar.f36430f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.f36425a * 31) + this.f36426b) * 31;
        String str = this.f36427c;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f36428d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f36429e;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f36430f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
