package fj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Throwable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19301d;

    public a(String code, String str, String str2) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f19299b = code;
        this.f19300c = str;
        this.f19301d = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f19300c;
    }
}
