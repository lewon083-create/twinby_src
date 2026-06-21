package yads;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f39131a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yl1 f39132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gd0 f39133c;

    public static gd0 a(yl1 yl1Var) {
        pd0 pd0Var = new pd0();
        pd0Var.f41896b = null;
        Uri uri = yl1Var.f45105b;
        x11 x11Var = new x11(uri != null ? uri.toString() : null, yl1Var.f45109f, pd0Var);
        ma3 it = yl1Var.f45106c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (x11Var.f44573d) {
                x11Var.f44573d.put(str, str2);
            }
        }
        HashMap map = new HashMap();
        UUID uuid = jr.f39932a;
        ae0 ae0Var = new ae0(0);
        UUID uuid2 = yl1Var.f45104a;
        nn0 nn0Var = xx0.f44834d;
        uuid2.getClass();
        nn0Var.getClass();
        boolean z5 = yl1Var.f45107d;
        boolean z10 = yl1Var.f45108e;
        int[] iArrA = vd1.a(yl1Var.f45110g);
        for (int i : iArrA) {
            if (i != 2 && i != 1) {
                throw new IllegalArgumentException();
            }
        }
        gd0 gd0Var = new gd0(uuid2, nn0Var, x11Var, map, z5, (int[]) iArrA.clone(), z10, ae0Var, 300000L);
        byte[] bArrA = yl1Var.a();
        if (!gd0Var.f38718m.isEmpty()) {
            throw new IllegalStateException();
        }
        gd0Var.f38727v = 0;
        gd0Var.f38728w = bArrA;
        return gd0Var;
    }

    public final tk0 a(hm1 hm1Var) {
        gd0 gd0Var;
        hm1Var.f39245c.getClass();
        yl1 yl1Var = hm1Var.f39245c.f37094c;
        if (yl1Var != null && lb3.f40466a >= 18) {
            synchronized (this.f39131a) {
                try {
                    if (!lb3.a(yl1Var, this.f39132b)) {
                        this.f39132b = yl1Var;
                        this.f39133c = a(yl1Var);
                    }
                    gd0Var = this.f39133c;
                    gd0Var.getClass();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return gd0Var;
        }
        return tk0.f43347a;
    }
}
