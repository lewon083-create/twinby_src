package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.cq;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.util.concurrent.atomic.AtomicReference;
import k9.r;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends e {
    public f(@NonNull b bVar, @NonNull ClientContext clientContext) {
        super(bVar, clientContext);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        String strA;
        String str;
        String str2;
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, k9.i.class, v9.a.class)) {
            return false;
        }
        k9.i iVar = (k9.i) objArr[0];
        v9.a aVar = (v9.a) objArr[1];
        this.f21477a.getClass();
        ModuleAdType moduleAdType = ModuleAdType.INTERSTITIAL;
        r rVarA = aVar.a();
        cq cqVar = (cq) aVar;
        AtomicReference atomicReference = cqVar.f4291d;
        if (atomicReference.get() != null) {
            str2 = (String) atomicReference.get();
        } else {
            synchronized (cqVar) {
                try {
                    strA = cqVar.f4290c.A();
                } catch (RemoteException e3) {
                    u9.i.k("#007 Could not call remote method.", e3);
                    strA = null;
                }
                if (strA == null) {
                    cqVar.f4291d.set("");
                } else {
                    cqVar.f4291d.set(strA);
                }
                str = (String) cqVar.f4291d.get();
            }
            str2 = str;
        }
        a(b.a(iVar, moduleAdType, "interstitialAd", rVarA, str2));
        return true;
    }
}
