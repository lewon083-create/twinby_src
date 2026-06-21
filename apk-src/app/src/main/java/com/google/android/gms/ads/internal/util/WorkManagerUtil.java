package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.internal.ads.b30;
import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.vg;
import java.util.HashMap;
import java.util.HashSet;
import ka.k;
import l7.c;
import l7.e;
import l7.f;
import m7.l;
import t9.w;
import u7.j;
import u9.i;
import xa.a;
import xa.b;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class WorkManagerUtil extends ug implements w {
    public WorkManagerUtil() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a aVarL1 = b.L1(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            vg.f(parcel);
            boolean zZze = zze(aVarL1, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZze ? 1 : 0);
            return true;
        }
        if (i == 2) {
            a aVarL12 = b.L1(parcel.readStrongBinder());
            vg.f(parcel);
            zzf(aVarL12);
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return false;
        }
        a aVarL13 = b.L1(parcel.readStrongBinder());
        r9.a aVar = (r9.a) vg.b(parcel, r9.a.CREATOR);
        vg.f(parcel);
        boolean zZzg = zzg(aVarL13, aVar);
        parcel2.writeNoException();
        parcel2.writeInt(zZzg ? 1 : 0);
        return true;
    }

    @Override // t9.w
    public final boolean zze(a aVar, String str, String str2) {
        return zzg(aVar, new r9.a(str, str2, ""));
    }

    @Override // t9.w
    public final void zzf(a aVar) {
        Context context = (Context) b.X1(aVar);
        try {
            l.P(context.getApplicationContext(), new b30(new l7.b(0)));
        } catch (IllegalStateException unused) {
        }
        try {
            l lVarO = l.O(context);
            lVarO.f28733e.b(new v7.b(lVarO, 0));
            e eVar = new e();
            c cVar = new c();
            cVar.f28011a = 1;
            cVar.f28016f = -1L;
            cVar.f28017g = -1L;
            new HashSet();
            cVar.f28012b = false;
            cVar.f28013c = false;
            cVar.f28011a = 2;
            cVar.f28014d = false;
            cVar.f28015e = false;
            cVar.f28018h = eVar;
            cVar.f28016f = -1L;
            cVar.f28017g = -1L;
            k kVar = new k(OfflinePingSender.class);
            ((j) kVar.f27325d).f34338j = cVar;
            ((HashSet) kVar.f27326e).add("offline_ping_sender_work");
            lVarO.k(kVar.A());
        } catch (IllegalStateException e3) {
            i.i("Failed to instantiate WorkManager.", e3);
        }
    }

    @Override // t9.w
    public final boolean zzg(a aVar, r9.a aVar2) throws Throwable {
        Context context = (Context) b.X1(aVar);
        try {
            l.P(context.getApplicationContext(), new b30(new l7.b(0)));
        } catch (IllegalStateException unused) {
        }
        e eVar = new e();
        c cVar = new c();
        cVar.f28011a = 1;
        cVar.f28016f = -1L;
        cVar.f28017g = -1L;
        new HashSet();
        cVar.f28012b = false;
        cVar.f28013c = false;
        cVar.f28011a = 2;
        cVar.f28014d = false;
        cVar.f28015e = false;
        cVar.f28018h = eVar;
        cVar.f28016f = -1L;
        cVar.f28017g = -1L;
        HashMap map = new HashMap();
        map.put("uri", aVar2.f32272b);
        map.put("gws_query_id", aVar2.f32273c);
        map.put("image_url", aVar2.f32274d);
        f fVar = new f(map);
        f.c(fVar);
        k kVar = new k(OfflineNotificationPoster.class);
        j jVar = (j) kVar.f27325d;
        jVar.f34338j = cVar;
        jVar.f34334e = fVar;
        ((HashSet) kVar.f27326e).add("offline_notification_work");
        try {
            l.O(context).k(kVar.A());
            return true;
        } catch (IllegalStateException e3) {
            i.i("Failed to instantiate WorkManager.", e3);
            return false;
        }
    }
}
