package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ge0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ns1 f5787b;

    public /* synthetic */ ge0(ns1 ns1Var, int i) {
        this.f5786a = i;
        this.f5787b = ns1Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f5786a) {
            case 0:
                return new gk0(21, (hp) this.f5787b.f8433a);
            case 1:
                return new ox0(29, (w10) this.f5787b.f8433a);
            case 2:
                return new dl0(3, (uo0) this.f5787b.f8433a);
            case 3:
                return new nn0((gp0) this.f5787b.f8433a);
            case 4:
                File dir = ((Context) this.f5787b.f8433a).getDir("yqzdkcache", 0);
                gr.G(dir);
                return dir;
            case 5:
                ExecutorService executorService = (ExecutorService) this.f5787b.f8433a;
                if (executorService instanceof r81) {
                    return (r81) executorService;
                }
                return executorService instanceof ScheduledExecutorService ? new x81((ScheduledExecutorService) executorService) : new gx(executorService);
            case 6:
                return new ny0((ExecutorService) this.f5787b.f8433a);
            default:
                DisplayMetrics displayMetrics = ((Context) this.f5787b.f8433a).getResources().getDisplayMetrics();
                gr.G(displayMetrics);
                return displayMetrics;
        }
    }
}
