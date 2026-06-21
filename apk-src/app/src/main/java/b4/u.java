package b4;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1963c;

    public u(String str, boolean z5, boolean z10) {
        this.f1961a = str;
        this.f1962b = z5;
        this.f1963c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == u.class) {
            u uVar = (u) obj;
            if (TextUtils.equals(this.f1961a, uVar.f1961a) && this.f1962b == uVar.f1962b && this.f1963c == uVar.f1963c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((gf.a.e(31, 31, this.f1961a) + (this.f1962b ? 1231 : 1237)) * 31) + (this.f1963c ? 1231 : 1237);
    }
}
