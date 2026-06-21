package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f34580e = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sk.f f34581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wk.h f34582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f34583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f34584d;

    public s(sk.f descriptor, wk.h readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.f34581a = descriptor;
        this.f34582b = readIfAbsent;
        int iF = descriptor.f();
        if (iF <= 64) {
            this.f34583c = iF != 64 ? (-1) << iF : 0L;
            this.f34584d = f34580e;
            return;
        }
        this.f34583c = 0L;
        int i = (iF - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iF & 63) != 0) {
            Intrinsics.checkNotNullParameter(jArr, "<this>");
            jArr[i - 1] = (-1) << iF;
        }
        this.f34584d = jArr;
    }
}
