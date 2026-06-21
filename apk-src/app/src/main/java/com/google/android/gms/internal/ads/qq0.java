package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingDeque f9577a = new LinkedBlockingDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable f9578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r81 f9579c;

    public qq0(jc0 jc0Var, r81 r81Var) {
        this.f9578b = jc0Var;
        this.f9579c = r81Var;
    }

    public final synchronized void a(int i) {
        LinkedBlockingDeque linkedBlockingDeque = this.f9577a;
        int size = i - linkedBlockingDeque.size();
        for (int i10 = 0; i10 < size; i10++) {
            linkedBlockingDeque.add(((gx) this.f9579c).b(this.f9578b));
        }
    }

    public final synchronized ed.d b() {
        a(1);
        return (ed.d) this.f9577a.poll();
    }
}
