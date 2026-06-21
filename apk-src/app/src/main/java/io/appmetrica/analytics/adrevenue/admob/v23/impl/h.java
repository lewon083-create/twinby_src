package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.nv;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.util.concurrent.atomic.AtomicReference;
import k9.r;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends e {
    public h(@NonNull b bVar, @NonNull ClientContext clientContext) {
        super(bVar, clientContext);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        String strQ;
        String str;
        String str2;
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, k9.i.class, nv.class)) {
            return false;
        }
        k9.i iVar = (k9.i) objArr[0];
        nv nvVar = (nv) objArr[1];
        this.f21477a.getClass();
        ModuleAdType moduleAdType = ModuleAdType.REWARDED;
        r rVarA = nvVar.a();
        AtomicReference atomicReference = nvVar.f8457a;
        if (atomicReference.get() != null) {
            str2 = (String) atomicReference.get();
        } else {
            synchronized (nvVar) {
                try {
                    strQ = nvVar.f8458b.q();
                } catch (RemoteException e3) {
                    u9.i.k("#007 Could not call remote method.", e3);
                    strQ = null;
                }
                if (strQ == null) {
                    nvVar.f8457a.set("");
                } else {
                    nvVar.f8457a.set(strQ);
                }
                str = (String) nvVar.f8457a.get();
            }
            str2 = str;
        }
        a(b.a(iVar, moduleAdType, "rewardedAd", rVarA, str2));
        return true;
    }
}
