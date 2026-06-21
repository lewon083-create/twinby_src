package uk;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f34599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34600b;

    @Override // uk.r0
    public final Object a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f34599a, this.f34600b);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override // uk.r0
    public final void b(int i) {
        float[] fArr = this.f34599a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i);
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
            this.f34599a = fArrCopyOf;
        }
    }

    @Override // uk.r0
    public final int d() {
        return this.f34600b;
    }
}
