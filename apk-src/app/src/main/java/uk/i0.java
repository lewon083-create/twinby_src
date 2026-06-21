package uk;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f34531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34532b;

    @Override // uk.r0
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f34531a, this.f34532b);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @Override // uk.r0
    public final void b(int i) {
        long[] jArr = this.f34531a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f34531a = jArrCopyOf;
        }
    }

    @Override // uk.r0
    public final int d() {
        return this.f34532b;
    }
}
