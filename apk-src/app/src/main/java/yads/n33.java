package yads;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n33 extends sl2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wq f41164e = new zl.g0(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f41166d;

    public n33(int i) {
        ni.a("maxStars must be a positive integer", i > 0);
        this.f41165c = i;
        this.f41166d = -1.0f;
    }

    public static n33 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) != 2) {
            throw new IllegalArgumentException();
        }
        int i = bundle.getInt(Integer.toString(1, 36), 5);
        float f10 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
        return f10 == -1.0f ? new n33(i) : new n33(i, f10);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n33)) {
            return false;
        }
        n33 n33Var = (n33) obj;
        return this.f41165c == n33Var.f41165c && this.f41166d == n33Var.f41166d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f41165c), Float.valueOf(this.f41166d)});
    }

    public n33(int i, float f10) {
        boolean z5 = false;
        ni.a("maxStars must be a positive integer", i > 0);
        if (f10 >= 0.0f && f10 <= i) {
            z5 = true;
        }
        ni.a("starRating is out of range [0, maxStars]", z5);
        this.f41165c = i;
        this.f41166d = f10;
    }
}
