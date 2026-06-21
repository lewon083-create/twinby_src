package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ja implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Handler f6765c;

    public /* synthetic */ ja(Handler handler, int i) {
        this.f6764b = i;
        this.f6765c = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f6764b) {
            case 0:
                this.f6765c.post(runnable);
                break;
            case 1:
                this.f6765c.post(runnable);
                break;
            default:
                this.f6765c.post(runnable);
                break;
        }
    }

    public ja(ox0 ox0Var, Handler handler) {
        this.f6764b = 0;
        this.f6765c = handler;
    }
}
