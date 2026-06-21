package gd;

import ad.b1;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.m1;
import java.util.ArrayList;
import java.util.Iterator;
import ob.y1;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yd.a f20116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f20117b = null;

    public c(yd.a aVar) {
        this.f20116a = aVar;
    }

    public static boolean a(ArrayList arrayList, b bVar) {
        String str = bVar.f20110a;
        String str2 = bVar.f20111b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            if (bVar2.f20110a.equals(str) && bVar2.f20111b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList b() {
        jd.c cVar = (jd.c) ((jd.b) this.f20116a.get());
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : ((m1) cVar.f26619a.f45c).f("frc", "")) {
            b1 b1Var = kd.a.f27374a;
            c0.i(bundle);
            jd.a aVar = new jd.a();
            String str = (String) y1.e(bundle, "origin", String.class, null);
            c0.i(str);
            aVar.f26604a = str;
            String str2 = (String) y1.e(bundle, "name", String.class, null);
            c0.i(str2);
            aVar.f26605b = str2;
            aVar.f26606c = y1.e(bundle, "value", Object.class, null);
            aVar.f26607d = (String) y1.e(bundle, "trigger_event_name", String.class, null);
            aVar.f26608e = ((Long) y1.e(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            aVar.f26609f = (String) y1.e(bundle, "timed_out_event_name", String.class, null);
            aVar.f26610g = (Bundle) y1.e(bundle, "timed_out_event_params", Bundle.class, null);
            aVar.f26611h = (String) y1.e(bundle, "triggered_event_name", String.class, null);
            aVar.i = (Bundle) y1.e(bundle, "triggered_event_params", Bundle.class, null);
            aVar.f26612j = ((Long) y1.e(bundle, "time_to_live", Long.class, 0L)).longValue();
            aVar.f26613k = (String) y1.e(bundle, "expired_event_name", String.class, null);
            aVar.f26614l = (Bundle) y1.e(bundle, "expired_event_params", Bundle.class, null);
            aVar.f26616n = ((Boolean) y1.e(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            aVar.f26615m = ((Long) y1.e(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            aVar.f26617o = ((Long) y1.e(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.util.ArrayList r20) throws gd.a {
        /*
            Method dump skipped, instruction units count: 871
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.c.c(java.util.ArrayList):void");
    }
}
