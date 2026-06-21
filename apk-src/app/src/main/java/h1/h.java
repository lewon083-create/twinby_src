package h1;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f20336a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f20337b = new Object();

    public static final void a(f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int[] iArr = new int[i];
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        fVar.f20329b = iArr;
        Object[] objArr = new Object[i];
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        fVar.f20330c = objArr;
    }

    public static final int b(f fVar, Object obj, int i) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int i10 = fVar.f20331d;
        if (i10 == 0) {
            return -1;
        }
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        try {
            int iA = i1.a.a(fVar.f20331d, i, fVar.f20329b);
            if (iA < 0 || Intrinsics.a(obj, fVar.f20330c[iA])) {
                return iA;
            }
            int i11 = iA + 1;
            while (i11 < i10 && fVar.f20329b[i11] == i) {
                if (Intrinsics.a(obj, fVar.f20330c[i11])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = iA - 1; i12 >= 0 && fVar.f20329b[i12] == i; i12--) {
                if (Intrinsics.a(obj, fVar.f20330c[i12])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
