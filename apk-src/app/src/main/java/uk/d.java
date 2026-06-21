package uk;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f34502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34503b;

    @Override // uk.r0
    public final Object a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f34502a, this.f34503b);
        Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @Override // uk.r0
    public final void b(int i) {
        boolean[] zArr = this.f34502a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i);
            Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
            this.f34502a = zArrCopyOf;
        }
    }

    @Override // uk.r0
    public final int d() {
        return this.f34503b;
    }
}
