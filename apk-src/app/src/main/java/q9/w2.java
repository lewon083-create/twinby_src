package q9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.vg;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w2 extends ug implements s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k9.o f31975b;

    public w2(k9.o oVar) {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        this.f31975b = oVar;
    }

    public static s1 l4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof s1 ? (s1) iInterfaceQueryLocalInterface : new r1(iBinder);
    }

    @Override // q9.s1
    public final boolean c() {
        return this.f31975b == null;
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            h3 h3Var = (h3) vg.b(parcel, h3.CREATOR);
            vg.f(parcel);
            l3(h3Var);
            parcel2.writeNoException();
            return true;
        }
        if (i != 2) {
            return false;
        }
        boolean zC = c();
        parcel2.writeNoException();
        ClassLoader classLoader = vg.f11374a;
        parcel2.writeInt(zC ? 1 : 0);
        return true;
    }

    @Override // q9.s1
    public final void l3(h3 h3Var) {
        Integer num;
        k9.o oVar = this.f31975b;
        if (oVar != null) {
            int i = h3Var.f31895c;
            String str = h3Var.f31896d;
            long j10 = h3Var.f31897e;
            r3.b bVar = (r3.b) oVar;
            ka.k kVar = (ka.k) bVar.f32188c;
            ti.j jVar = (ti.j) bVar.f32189d;
            kVar.getClass();
            HashMap map = new HashMap();
            HashMap map2 = (HashMap) kVar.f27325d;
            Iterator it = map2.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    num = null;
                    break;
                } else {
                    num = (Integer) it.next();
                    if (map2.get(num) == jVar) {
                        break;
                    }
                }
            }
            map.put("adId", num);
            map.put("eventName", "onPaidEvent");
            map.put("valueMicros", Long.valueOf(j10));
            map.put("precision", Integer.valueOf(i));
            map.put(AppsFlyerProperties.CURRENCY_CODE, str);
            kVar.I(map);
        }
    }
}
