package uk;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x0 extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f34605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34606b;

    @Override // uk.r0
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f34605a, this.f34606b);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @Override // uk.r0
    public final void b(int i) {
        short[] sArr = this.f34605a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i);
            Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
            this.f34605a = sArrCopyOf;
        }
    }

    @Override // uk.r0
    public final int d() {
        return this.f34606b;
    }
}
