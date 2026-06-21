package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yw1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f12780g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f12781h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f12782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f12783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b4.e f12784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f12785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cb0 f12786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12787f;

    public yw1(MediaCodec mediaCodec, HandlerThread handlerThread) {
        cb0 cb0Var = new cb0();
        this.f12782a = mediaCodec;
        this.f12783b = handlerThread;
        this.f12786e = cb0Var;
        this.f12785d = new AtomicReference();
    }

    public static xw1 c() {
        ArrayDeque arrayDeque = f12780g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new xw1();
                }
                return (xw1) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        if (this.f12787f) {
            try {
                b4.e eVar = this.f12784c;
                if (eVar == null) {
                    throw null;
                }
                eVar.removeCallbacksAndMessages(null);
                cb0 cb0Var = this.f12786e;
                synchronized (cb0Var) {
                    cb0Var.f4133a = false;
                }
                b4.e eVar2 = this.f12784c;
                if (eVar2 == null) {
                    throw null;
                }
                eVar2.obtainMessage(3).sendToTarget();
                synchronized (cb0Var) {
                    while (!cb0Var.f4133a) {
                        cb0Var.wait();
                    }
                }
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e3);
            }
        }
    }

    public final void b() {
        RuntimeException runtimeException = (RuntimeException) this.f12785d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}
