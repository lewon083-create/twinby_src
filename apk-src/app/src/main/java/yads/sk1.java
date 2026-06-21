package yads;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f42959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f42960c;

    public sk1(String str, boolean z5, boolean z10) {
        this.f42958a = str;
        this.f42959b = z5;
        this.f42960c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == sk1.class) {
            sk1 sk1Var = (sk1) obj;
            if (TextUtils.equals(this.f42958a, sk1Var.f42958a) && this.f42959b == sk1Var.f42959b && this.f42960c == sk1Var.f42960c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((k4.a(this.f42958a, 31, 31) + (this.f42959b ? 1231 : 1237)) * 31) + (this.f42960c ? 1231 : 1237);
    }
}
