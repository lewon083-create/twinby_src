package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.et;
import com.google.android.gms.internal.ads.fr;
import q9.f;
import q9.o;
import q9.r;
import u9.i;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            o oVar = r.f31959g.f31961b;
            fr frVar = new fr();
            oVar.getClass();
            ((et) new f(oVar, this, frVar).d(this, false)).x0(intent);
        } catch (RemoteException e3) {
            i.e("RemoteException calling handleNotificationIntent: ".concat(e3.toString()));
        }
    }
}
