package s3;

import com.google.android.gms.internal.ads.xt1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f32551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f32552c;

    public h0(xt1 xt1Var) {
        this.f32550a = xt1Var.f12328a;
        this.f32551b = xt1Var.f12329b;
        this.f32552c = xt1Var.f12330c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f32550a == h0Var.f32550a && this.f32551b == h0Var.f32551b && this.f32552c == h0Var.f32552c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f32550a), Float.valueOf(this.f32551b), Long.valueOf(this.f32552c));
    }
}
