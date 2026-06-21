package uk;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f34537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34538b;

    @Override // uk.r0
    public final Object a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f34537a, this.f34538b);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override // uk.r0
    public final void b(int i) {
        char[] cArr = this.f34537a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i);
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.f34537a = cArrCopyOf;
        }
    }

    @Override // uk.r0
    public final int d() {
        return this.f34538b;
    }
}
