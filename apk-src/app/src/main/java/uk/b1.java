package uk;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b1 extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f34496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34497b;

    @Override // uk.r0
    public final Object a() {
        byte[] storage = Arrays.copyOf(this.f34496a, this.f34497b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new ij.u(storage);
    }

    @Override // uk.r0
    public final void b(int i) {
        byte[] bArr = this.f34496a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] storage = Arrays.copyOf(bArr, i);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f34496a = storage;
        }
    }

    @Override // uk.r0
    public final int d() {
        return this.f34497b;
    }
}
