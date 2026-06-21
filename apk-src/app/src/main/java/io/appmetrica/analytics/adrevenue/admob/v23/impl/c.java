package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.wh;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.util.concurrent.atomic.AtomicReference;
import k9.r;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends e {
    public c(@NonNull b bVar, @NonNull ClientContext clientContext) {
        super(bVar, clientContext);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        String strD;
        String str;
        String str2;
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, k9.i.class, wh.class)) {
            return false;
        }
        k9.i iVar = (k9.i) objArr[0];
        wh whVar = (wh) objArr[1];
        this.f21477a.getClass();
        ModuleAdType moduleAdType = ModuleAdType.APP_OPEN;
        r rVarA = whVar.a();
        AtomicReference atomicReference = whVar.f11809b;
        if (atomicReference.get() != null) {
            str2 = (String) atomicReference.get();
        } else {
            synchronized (whVar) {
                try {
                    strD = whVar.f11808a.d();
                } catch (RemoteException e3) {
                    u9.i.k("#007 Could not call remote method.", e3);
                    strD = null;
                }
                if (strD == null) {
                    whVar.f11809b.set("");
                } else {
                    whVar.f11809b.set(strD);
                }
                str = (String) whVar.f11809b.get();
            }
            str2 = str;
        }
        a(b.a(iVar, moduleAdType, "appOpenAd", rVarA, str2));
        return true;
    }
}
