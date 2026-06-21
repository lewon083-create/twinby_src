package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jo0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6908a;

    public /* synthetic */ jo0(int i) {
        this.f6908a = i;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f6908a) {
            case 0:
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new jm0(gxVar, 5);
            case 1:
                return new gq0();
            case 2:
                return new fq0();
            case 3:
                mq0 mq0Var = new mq0();
                try {
                    s91.a();
                    break;
                } catch (GeneralSecurityException e3) {
                    t9.c0.m("Failed to Configure Aead. ".concat(e3.toString()));
                    p9.k.C.f31302h.d("CryptoUtils.registerAead", e3);
                }
                return mq0Var;
            case 4:
                return new nq0();
            case 5:
                return ua.a.f34401a;
            case 6:
                sq0 sq0Var = new sq0();
                sq0Var.f10376a = null;
                return sq0Var;
            case 7:
                return new dr0();
            case 8:
                gx gxVar2 = hx.f6284f;
                gr.G(gxVar2);
                return gxVar2;
            case 9:
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                if (executorServiceUnconfigurableExecutorService instanceof r81) {
                    return (r81) executorServiceUnconfigurableExecutorService;
                }
                return executorServiceUnconfigurableExecutorService instanceof ScheduledExecutorService ? new x81((ScheduledExecutorService) executorServiceUnconfigurableExecutorService) : new gx(executorServiceUnconfigurableExecutorService);
            case 10:
                x81 x81Var = hx.f6283e;
                gr.G(x81Var);
                return x81Var;
            case 11:
                gx gxVar3 = hx.f6284f;
                gr.G(gxVar3);
                return gxVar3;
            case 12:
                return new ew();
            case 13:
                return new px0();
            case 14:
                return new iy0();
            case 15:
                return new vz0();
            case 16:
                return new kz0();
            case 17:
                return new cv0();
            case 18:
                return new l11();
            default:
                return new d21();
        }
    }
}
