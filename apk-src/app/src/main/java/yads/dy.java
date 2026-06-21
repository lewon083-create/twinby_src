package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class dy {
    public static int a(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i10;
        int i11;
        int iA = q01.a(obj == null ? 0 : obj.hashCode());
        int i12 = iA & i;
        int iA2 = a(i12, obj3);
        if (iA2 == 0) {
            return -1;
        }
        int i13 = ~i;
        int i14 = iA & i13;
        int i15 = -1;
        while (true) {
            i10 = iA2 - 1;
            i11 = iArr[i10];
            if ((i11 & i13) == i14 && n92.a(obj, objArr[i10]) && (objArr2 == null || n92.a(obj2, objArr2[i10]))) {
                break;
            }
            int i16 = i11 & i;
            if (i16 == 0) {
                return -1;
            }
            i15 = i10;
            iA2 = i16;
        }
        int i17 = i11 & i;
        if (i15 == -1) {
            a(i12, i17, obj3);
            return i10;
        }
        iArr[i15] = (i17 & i) | (iArr[i15] & i13);
        return i10;
    }

    public static int a(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & 65535;
        }
        return ((int[]) obj)[i];
    }

    public static void a(int i, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i10;
        } else {
            ((int[]) obj)[i] = i10;
        }
    }
}
