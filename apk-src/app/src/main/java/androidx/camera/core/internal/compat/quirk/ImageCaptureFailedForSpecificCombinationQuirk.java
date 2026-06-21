package androidx.camera.core.internal.compat.quirk;

import a0.a2;
import a0.k1;
import a0.q2;
import g0.w1;
import g0.x2;
import g0.z2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f1255a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    public static boolean e(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() == 3) {
            Iterator it = linkedHashSet.iterator();
            boolean z5 = false;
            boolean z10 = false;
            boolean z11 = false;
            while (it.hasNext()) {
                q2 q2Var = (q2) it.next();
                if (q2Var instanceof a2) {
                    z5 = true;
                } else if (q2Var instanceof k1) {
                    z11 = true;
                } else if (q2Var.f209h.h(x2.C)) {
                    z10 = q2Var.f209h.n() == z2.f19815e;
                }
            }
            if (z5 && z10 && z11) {
                return true;
            }
        }
        return false;
    }
}
