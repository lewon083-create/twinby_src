package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.et;
import com.google.android.gms.internal.ads.fr;
import l7.j;
import l7.l;
import l7.m;
import q9.f;
import q9.o;
import q9.r;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class OfflinePingSender extends Worker {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final et f2542h;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        o oVar = r.f31959g.f31961b;
        fr frVar = new fr();
        oVar.getClass();
        this.f2542h = (et) new f(oVar, context, frVar).d(context, false);
    }

    @Override // androidx.work.Worker
    public final m doWork() {
        try {
            this.f2542h.k();
            return new l(l7.f.f28023c);
        } catch (RemoteException unused) {
            return new j();
        }
    }
}
