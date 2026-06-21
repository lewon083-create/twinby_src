package uk;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h1 extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f34527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34528b;

    @Override // uk.r0
    public final Object a() {
        long[] storage = Arrays.copyOf(this.f34527a, this.f34528b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new ij.a0(storage);
    }

    @Override // uk.r0
    public final void b(int i) {
        long[] jArr = this.f34527a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] storage = Arrays.copyOf(jArr, i);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f34527a = storage;
        }
    }

    @Override // uk.r0
    public final int d() {
        return this.f34528b;
    }
}
