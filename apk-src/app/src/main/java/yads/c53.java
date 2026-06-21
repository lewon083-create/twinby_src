package yads;

import android.view.View;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c53 implements fe1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f37297b;

    public c53(jb2 jb2Var) {
        this.f37297b = jb2Var;
    }

    @Override // yads.fe1
    public final String a() {
        String str = String.format("supports: {inlineVideo: %s}", Arrays.copyOf(new Object[]{Boolean.valueOf(this.f37297b.isHardwareAccelerated())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
