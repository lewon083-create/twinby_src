package kotlin.collections;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class o extends n {
    public static List c(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        Intrinsics.checkNotNullExpressionValue(listAsList, "asList(...)");
        return listAsList;
    }

    public static void d(int i, int i10, int i11, byte[] bArr, byte[] destination) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(bArr, i10, destination, i, i11 - i10);
    }

    public static void e(int i, int i10, int i11, int[] iArr, int[] destination) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(iArr, i10, destination, i, i11 - i10);
    }

    public static void f(Object[] objArr, int i, Object[] destination, int i10, int i11) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(objArr, i10, destination, i, i11 - i10);
    }

    public static /* synthetic */ void g(Object[] objArr, int i, Object[] objArr2, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i = 0;
        }
        f(objArr, 0, objArr2, i, i10);
    }

    public static Object[] h(Object[] objArr, int i, int i10) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        m.a(i10, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i10);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void i(Object[] objArr, int i, int i10) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Arrays.fill(objArr, i, i10, (Object) null);
    }
}
