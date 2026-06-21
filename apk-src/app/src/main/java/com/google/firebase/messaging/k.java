package com.google.firebase.messaging;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements yd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14845a;

    public /* synthetic */ k(int i) {
        this.f14845a = i;
    }

    @Override // yd.a
    public final Object get() {
        switch (this.f14845a) {
            case 0:
                v7.f fVar = FirebaseMessaging.f14762l;
                return null;
            case 1:
                Random random = ge.l.f20136j;
                return null;
            case 2:
                return Collections.EMPTY_SET;
            case 3:
                return null;
            case 4:
                md.m mVar = ExecutorsRegistrar.f14755a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i = Build.VERSION.SDK_INT;
                builderDetectNetwork.detectResourceMismatches();
                if (i >= 26) {
                    builderDetectNetwork.detectUnbufferedIo();
                }
                return new nd.f(Executors.newFixedThreadPool(4, new nd.a("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f14758d.get());
            case 5:
                md.m mVar2 = ExecutorsRegistrar.f14755a;
                return new nd.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new nd.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f14758d.get());
            case 6:
                md.m mVar3 = ExecutorsRegistrar.f14755a;
                return new nd.f(Executors.newCachedThreadPool(new nd.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f14758d.get());
            default:
                md.m mVar4 = ExecutorsRegistrar.f14755a;
                return Executors.newSingleThreadScheduledExecutor(new nd.a("Firebase Scheduler", 0, null));
        }
    }
}
