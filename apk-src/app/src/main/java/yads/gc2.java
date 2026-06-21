package yads;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gc2 extends sl2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wq f38701d = new zf.a(22);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f38702c;

    public gc2() {
        this.f38702c = -1.0f;
    }

    public static gc2 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) != 1) {
            throw new IllegalArgumentException();
        }
        float f10 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
        return f10 == -1.0f ? new gc2() : new gc2(f10);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof gc2) && this.f38702c == ((gc2) obj).f38702c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f38702c)});
    }

    public gc2(float f10) {
        ni.a("percent must be in the range of [0, 100]", f10 >= 0.0f && f10 <= 100.0f);
        this.f38702c = f10;
    }
}
