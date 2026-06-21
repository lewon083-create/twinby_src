package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qd implements jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f42275b;

    public qd(String str, Runnable runnable) {
        this.f42274a = str;
        this.f42275b = runnable;
    }

    public final void a() {
        this.f42275b.run();
    }

    public final boolean a(String str, String str2) {
        return "mobileads".equals(str) && Intrinsics.a(this.f42274a, str2);
    }
}
