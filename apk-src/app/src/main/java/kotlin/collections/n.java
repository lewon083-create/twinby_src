package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class n extends m {
    public static final void b(Object[] objArr, StringBuilder sb2, ArrayList arrayList) {
        String strI;
        String strI2;
        String strI3;
        String strI4;
        if (arrayList.contains(objArr)) {
            sb2.append("[...]");
            return;
        }
        arrayList.add(objArr);
        sb2.append('[');
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i];
            String str = "null";
            if (obj == null) {
                sb2.append("null");
            } else if (obj instanceof Object[]) {
                b((Object[]) obj, sb2, arrayList);
                Unit unit = Unit.f27471a;
            } else if (obj instanceof byte[]) {
                String string = Arrays.toString((byte[]) obj);
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb2.append(string);
            } else if (obj instanceof short[]) {
                String string2 = Arrays.toString((short[]) obj);
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                sb2.append(string2);
            } else if (obj instanceof int[]) {
                String string3 = Arrays.toString((int[]) obj);
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                sb2.append(string3);
            } else if (obj instanceof long[]) {
                String string4 = Arrays.toString((long[]) obj);
                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                sb2.append(string4);
            } else if (obj instanceof float[]) {
                String string5 = Arrays.toString((float[]) obj);
                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                sb2.append(string5);
            } else if (obj instanceof double[]) {
                String string6 = Arrays.toString((double[]) obj);
                Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                sb2.append(string6);
            } else if (obj instanceof char[]) {
                String string7 = Arrays.toString((char[]) obj);
                Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
                sb2.append(string7);
            } else if (obj instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) obj);
                Intrinsics.checkNotNullExpressionValue(string8, "toString(...)");
                sb2.append(string8);
            } else if (obj instanceof ij.u) {
                byte[] bArr = ((ij.u) obj).f21358b;
                if (bArr != null && (strI4 = CollectionsKt.I(new ij.u(bArr), ", ", "[", "]", null, 56)) != null) {
                    str = strI4;
                }
                sb2.append(str);
            } else if (obj instanceof ij.e0) {
                short[] sArr = ((ij.e0) obj).f21334b;
                if (sArr != null && (strI3 = CollectionsKt.I(new ij.e0(sArr), ", ", "[", "]", null, 56)) != null) {
                    str = strI3;
                }
                sb2.append(str);
            } else if (obj instanceof ij.x) {
                int[] iArr = ((ij.x) obj).f21361b;
                if (iArr != null && (strI2 = CollectionsKt.I(new ij.x(iArr), ", ", "[", "]", null, 56)) != null) {
                    str = strI2;
                }
                sb2.append(str);
            } else if (obj instanceof ij.a0) {
                long[] jArr = ((ij.a0) obj).f21326b;
                if (jArr != null && (strI = CollectionsKt.I(new ij.a0(jArr), ", ", "[", "]", null, 56)) != null) {
                    str = strI;
                }
                sb2.append(str);
            } else {
                sb2.append(obj.toString());
            }
        }
        sb2.append(']');
        arrayList.remove(s.e(arrayList));
    }
}
