package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class vd1 extends wd1 {
    public static int a(long j10) {
        int i = (int) j10;
        if (((long) i) == j10) {
            return i;
        }
        throw new IllegalArgumentException(o43.a("Out of range: %s", Long.valueOf(j10)));
    }

    public static int b(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j10 < -2147483648L ? VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR : (int) j10;
    }

    public static int[] a(Collection collection) {
        if (collection instanceof ud1) {
            return ((ud1) collection).a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
