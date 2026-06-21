package uk;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f34518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34519b;

    @Override // uk.r0
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f34518a, this.f34519b);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @Override // uk.r0
    public final void b(int i) {
        byte[] bArr = this.f34518a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            this.f34518a = bArrCopyOf;
        }
    }

    @Override // uk.r0
    public final int d() {
        return this.f34519b;
    }
}
