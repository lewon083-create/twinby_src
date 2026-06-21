package r0;

import a0.g0;
import a0.i0;
import a0.j2;
import a0.o2;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.appsflyer.internal.m;
import com.google.android.gms.internal.auth.g;
import i0.o;
import io.appmetrica.analytics.impl.lp;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.c0;
import oi.i;
import q0.n;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f32146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerThread f32147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0.d f32148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f32149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f32151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f32152h;
    public final LinkedHashMap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SurfaceTexture f32153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SurfaceTexture f32154k;

    public d(i0 i0Var, g0 g0Var, g0 g0Var2) {
        Map map = Collections.EMPTY_MAP;
        this.f32150f = 0;
        this.f32151g = false;
        this.f32152h = new AtomicBoolean(false);
        this.i = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f32147c = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f32149e = handler;
        this.f32148d = new j0.d(handler);
        this.f32146b = new c(g0Var, g0Var2);
        try {
            try {
                o.w(new i(this, i0Var)).get();
            } catch (InterruptedException | ExecutionException e3) {
                e = e3;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e7) {
            d();
            throw e7;
        }
    }

    public final void a() {
        if (this.f32151g && this.f32150f == 0) {
            LinkedHashMap linkedHashMap = this.i;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((n) it.next()).close();
            }
            linkedHashMap.clear();
            c cVar = this.f32146b;
            if (((AtomicBoolean) cVar.f12502c).getAndSet(false)) {
                s0.i.c((Thread) cVar.f12504e);
                cVar.i();
            }
            cVar.f32142o = -1;
            cVar.f32143p = -1;
            this.f32147c.quit();
        }
    }

    public final void b(Runnable runnable, Runnable runnable2) {
        try {
            this.f32148d.execute(new q0.o(this, runnable2, runnable, 3));
        } catch (RejectedExecutionException e3) {
            g.P("DualSurfaceProcessor", "Unable to executor runnable", e3);
            runnable2.run();
        }
    }

    public final void c(o2 o2Var) {
        if (this.f32152h.get()) {
            o2Var.d();
        } else {
            b(new c0(20, this, o2Var), new j2(o2Var, 1));
        }
    }

    public final void d() {
        if (this.f32152h.getAndSet(true)) {
            return;
        }
        b(new lp(24, this), new m(6));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f32152h.get() || (surfaceTexture2 = this.f32153j) == null || this.f32154k == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f32154k.updateTexImage();
        for (Map.Entry entry : this.i.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            n nVar = (n) entry.getKey();
            if (nVar.f31610d == 34) {
                try {
                    this.f32146b.p(surfaceTexture.getTimestamp(), surface, nVar, this.f32153j, this.f32154k);
                } catch (RuntimeException e3) {
                    g.l("DualSurfaceProcessor", "Failed to render with OpenGL.", e3);
                }
            }
        }
    }
}
