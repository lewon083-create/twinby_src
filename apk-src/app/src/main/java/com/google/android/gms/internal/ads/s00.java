package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s00 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10120b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10122d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s00(t00 t00Var, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.f10121c = runnable2;
        this.f10122d = t00Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f10120b) {
            case 0:
                Process.setThreadPriority(((t00) this.f10122d).f10458b);
                ((Runnable) this.f10121c).run();
                return;
            case 1:
                synchronized (((q3.s) this.f10122d)) {
                    ((ConditionVariable) this.f10121c).open();
                    q3.s.a((q3.s) this.f10122d);
                    ((q3.s) this.f10122d).f31684b.getClass();
                    break;
                }
                return;
            default:
                new u9.l((Context) this.f10121c, null).a((String) this.f10122d, null);
                return;
        }
    }

    public s00(u9.d dVar, Context context, String str) {
        this.f10121c = context;
        this.f10122d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s00(q3.s sVar, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f10122d = sVar;
        this.f10121c = conditionVariable;
    }
}
