package ni;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends Throwable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f29470d;

    public p(String code, String str, String str2) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f29468b = code;
        this.f29469c = str;
        this.f29470d = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f29469c;
    }
}
