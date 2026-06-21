package uk;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k1 extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f34541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34542b;

    @Override // uk.r0
    public final Object a() {
        short[] storage = Arrays.copyOf(this.f34541a, this.f34542b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new ij.e0(storage);
    }

    @Override // uk.r0
    public final void b(int i) {
        short[] sArr = this.f34541a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] storage = Arrays.copyOf(sArr, i);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f34541a = storage;
        }
    }

    @Override // uk.r0
    public final int d() {
        return this.f34542b;
    }
}
