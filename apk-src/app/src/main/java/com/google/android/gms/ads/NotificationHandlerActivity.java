package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.et;
import com.google.android.gms.internal.ads.fr;
import q9.f;
import q9.o;
import q9.r;
import u9.i;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            o oVar = r.f31959g.f31961b;
            fr frVar = new fr();
            oVar.getClass();
            et etVar = (et) new f(oVar, this, frVar).d(this, false);
            if (etVar == null) {
                i.e("OfflineUtils is null");
            } else {
                etVar.x0(getIntent());
            }
        } catch (RemoteException e3) {
            i.e("RemoteException calling handleNotificationIntent: ".concat(e3.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
