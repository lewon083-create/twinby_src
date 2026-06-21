package yads;

import android.graphics.RectF;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class eq0 implements fe1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f38235c;

    public eq0(int i, RectF rectF) {
        this.f38234b = i;
        this.f38235c = rectF;
    }

    @Override // yads.fe1
    public final String a() {
        String str;
        Integer numValueOf = Integer.valueOf(this.f38234b);
        RectF rectF = this.f38235c;
        if (rectF != null) {
            str = String.format("{x:%s,y:%s,width:%s,height:%s}", Arrays.copyOf(new Object[]{Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.width()), Float.valueOf(rectF.height())}, 4));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        } else {
            str = null;
        }
        String str2 = String.format("exposure:{exposedPercentage:%s,visibleRectangle:%s,occlusionRectangles:[]}", Arrays.copyOf(new Object[]{numValueOf, str}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }
}
