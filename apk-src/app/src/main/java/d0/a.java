package d0;

import a0.i0;
import a0.q2;
import a0.u1;
import com.google.android.gms.internal.auth.g;
import g0.d0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0 f15483c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f15484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f15485b;

    static {
        i0 SDR = i0.f112d;
        Intrinsics.checkNotNullExpressionValue(SDR, "SDR");
        f15483c = SDR;
    }

    public a() {
        i0 dynamicRange = i0.f113e;
        Intrinsics.checkNotNullParameter(dynamicRange, "dynamicRange");
        this.f15484a = dynamicRange;
        this.f15485b = b.f15486b;
    }

    @Override // b0.a
    public final b a() {
        return this.f15485b;
    }

    @Override // b0.a
    public final boolean b(u1 sessionConfig, d0 cameraInfoInternal) {
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        Set setA = cameraInfoInternal.a();
        Intrinsics.checkNotNullExpressionValue(setA, "getSupportedDynamicRanges(...)");
        g.e("DynamicRangeFeature", "isSupportedIndividually: cameraInfoSupportedDynamicRanges = " + setA + ", this = " + this);
        i0 i0Var = this.f15484a;
        if (!setA.contains(i0Var)) {
            return false;
        }
        for (q2 q2Var : (List) sessionConfig.f229e) {
            Set setL = q2Var.l(cameraInfoInternal);
            g.e("DynamicRangeFeature", "isSupportedIndividually: useCaseSupportedDynamicRanges = " + setL + ", this = " + this + ", useCases = " + q2Var);
            if (setL != null && !setL.contains(i0Var)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "DynamicRangeFeature(dynamicRange=" + this.f15484a + ')';
    }
}
