package uk;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e1 extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f34510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34511b;

    @Override // uk.r0
    public final Object a() {
        int[] storage = Arrays.copyOf(this.f34510a, this.f34511b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new ij.x(storage);
    }

    @Override // uk.r0
    public final void b(int i) {
        int[] iArr = this.f34510a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] storage = Arrays.copyOf(iArr, i);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f34510a = storage;
        }
    }

    @Override // uk.r0
    public final int d() {
        return this.f34511b;
    }
}
