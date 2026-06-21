package yads;

import android.content.Context;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fh1 {
    public static ArrayList a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new se1(context, new gh1()));
        pt2 pt2VarA = fw2.a().a(context);
        if (pt2VarA == null || pt2VarA.f42030g) {
            return arrayList;
        }
        if (b01.f36891b == null) {
            synchronized (b01.f36890a) {
                try {
                    if (b01.f36891b == null) {
                        b01.f36891b = new yy0(context, "com.google.android.gms.location.LocationServices");
                    }
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        yy0 yy0Var = b01.f36891b;
        if (yy0Var == null) {
            throw new IllegalStateException("Required value was null.");
        }
        arrayList.add(yy0Var);
        arrayList.add(z01.a(context));
        return arrayList;
    }
}
