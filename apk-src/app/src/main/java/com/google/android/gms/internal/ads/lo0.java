package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class lo0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f7587b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f7588a;

    public lo0(Handler handler) {
        this.f7588a = handler;
    }

    public static /* synthetic */ void f(go0 go0Var) {
        ArrayList arrayList = f7587b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(go0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static go0 g() {
        go0 go0Var;
        ArrayList arrayList = f7587b;
        synchronized (arrayList) {
            try {
                go0Var = arrayList.isEmpty() ? new go0() : (go0) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return go0Var;
    }

    public final boolean a() {
        return this.f7588a.hasMessages(37);
    }

    public final go0 b(int i, Object obj) {
        go0 go0VarG = g();
        go0VarG.f5884a = this.f7588a.obtainMessage(i, obj);
        return go0VarG;
    }

    public final boolean c(int i) {
        return this.f7588a.sendEmptyMessage(i);
    }

    public final void d(int i) {
        this.f7588a.removeMessages(i);
    }

    public final boolean e(Runnable runnable) {
        return this.f7588a.post(runnable);
    }
}
