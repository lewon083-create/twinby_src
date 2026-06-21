package yads;

import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class jx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f40002a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f40003b = {"", "A", "B", "C"};

    public static String a(int i, boolean z5, int i10, int i11, int[] iArr, int i12) {
        Object[] objArr = {f40003b[i], Integer.valueOf(i10), Integer.valueOf(i11), Character.valueOf(z5 ? 'H' : 'L'), Integer.valueOf(i12)};
        int i13 = lb3.f40466a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static boolean a(List list) {
        return list.size() == 1 && ((byte[]) list.get(0)).length == 1 && ((byte[]) list.get(0))[0] == 1;
    }
}
