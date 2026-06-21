package g0;

import android.util.Size;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface i1 extends b2 {
    public static final g i = new g("camerax.core.imageOutput.targetAspectRatio", a0.e.class, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f19605j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g f19606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g f19607l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final g f19608m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g f19609n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g f19610o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final g f19611p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final g f19612q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g f19613r;

    static {
        Class cls = Integer.TYPE;
        f19605j = new g("camerax.core.imageOutput.targetRotation", cls, null);
        f19606k = new g("camerax.core.imageOutput.appTargetRotation", cls, null);
        f19607l = new g("camerax.core.imageOutput.mirrorMode", cls, null);
        f19608m = new g("camerax.core.imageOutput.targetResolution", Size.class, null);
        f19609n = new g("camerax.core.imageOutput.defaultResolution", Size.class, null);
        f19610o = new g("camerax.core.imageOutput.maxResolution", Size.class, null);
        f19611p = new g("camerax.core.imageOutput.supportedResolutions", List.class, null);
        f19612q = new g("camerax.core.imageOutput.resolutionSelector", t0.b.class, null);
        f19613r = new g("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    static void r(i1 i1Var) {
        boolean zH = i1Var.h(i);
        boolean z5 = ((Size) i1Var.g(f19608m, null)) != null;
        if (zH && z5) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (i1Var.j() != null) {
            if (zH || z5) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default t0.b j() {
        return (t0.b) g(f19612q, null);
    }

    default int s(int i10) {
        return ((Integer) g(f19605j, Integer.valueOf(i10))).intValue();
    }
}
