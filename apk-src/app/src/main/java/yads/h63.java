package yads;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h63 extends sl2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wq f39045e = new zf.a(24);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f39047d;

    public h63() {
        this.f39046c = false;
        this.f39047d = false;
    }

    public static h63 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) == 3) {
            return bundle.getBoolean(Integer.toString(1, 36), false) ? new h63(bundle.getBoolean(Integer.toString(2, 36), false)) : new h63();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h63)) {
            return false;
        }
        h63 h63Var = (h63) obj;
        return this.f39047d == h63Var.f39047d && this.f39046c == h63Var.f39046c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f39046c), Boolean.valueOf(this.f39047d)});
    }

    public h63(boolean z5) {
        this.f39046c = true;
        this.f39047d = z5;
    }
}
