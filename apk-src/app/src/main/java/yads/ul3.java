package yads;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ul3 implements fe1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43713b;

    public ul3(boolean z5) {
        this.f43713b = z5;
    }

    @Override // yads.fe1
    public final String a() {
        String str = String.format("viewable: %s", Arrays.copyOf(new Object[]{Boolean.valueOf(this.f43713b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
