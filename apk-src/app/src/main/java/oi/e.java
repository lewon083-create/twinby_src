package oi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends Throwable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30677c;

    public e(String code, String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f30676b = code;
        this.f30677c = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f30677c;
    }
}
