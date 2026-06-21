package d0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f15501c = e.f15498b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f15502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f15503b;

    public f() {
        e mode = e.f15499c;
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f15502a = mode;
        this.f15503b = b.f15488d;
    }

    @Override // b0.a
    public final b a() {
        return this.f15503b;
    }

    public final String toString() {
        return "VideoStabilizationFeature(mode=" + this.f15502a.name() + ')';
    }
}
