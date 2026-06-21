package yads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class yq {
    public static um2 a(wq wqVar, ArrayList arrayList) {
        o51 o51Var = r51.f42498c;
        kx.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        int i10 = 0;
        while (i < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i);
            bundle.getClass();
            xq xqVarFromBundle = wqVar.fromBundle(bundle);
            xqVarFromBundle.getClass();
            int i11 = i10 + 1;
            if (objArrCopyOf.length < i11) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, k51.a(objArrCopyOf.length, i11));
            }
            objArrCopyOf[i10] = xqVarFromBundle;
            i++;
            i10 = i11;
        }
        return r51.b(i10, objArrCopyOf);
    }
}
