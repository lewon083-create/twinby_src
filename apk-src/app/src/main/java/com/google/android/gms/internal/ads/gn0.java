package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gn0 implements y71, zt1, s3.i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f5876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f5877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f5878g;

    public /* synthetic */ gn0(jn0 jn0Var, String str, List list, Bundle bundle, boolean z5, boolean z10) {
        this.f5875d = jn0Var;
        this.f5876e = str;
        this.f5877f = list;
        this.f5878g = bundle;
        this.f5873b = z5;
        this.f5874c = z10;
    }

    @Override // s3.i0
    public void a(j3.f0 f0Var) {
        s3.i0 i0Var = (s3.i0) this.f5878g;
        if (i0Var != null) {
            i0Var.a(f0Var);
            f0Var = ((s3.i0) this.f5878g).getPlaybackParameters();
        }
        ((ob.y0) this.f5875d).a(f0Var);
    }

    @Override // com.google.android.gms.internal.ads.zt1
    public void b(pc pcVar) {
        zt1 zt1Var = (zt1) this.f5878g;
        if (zt1Var != null) {
            zt1Var.b(pcVar);
            pcVar = ((zt1) this.f5878g).d();
        }
        ((wu1) this.f5875d).b(pcVar);
    }

    @Override // s3.i0
    public long c() {
        if (this.f5873b) {
            return ((ob.y0) this.f5875d).c();
        }
        s3.i0 i0Var = (s3.i0) this.f5878g;
        i0Var.getClass();
        return i0Var.c();
    }

    @Override // com.google.android.gms.internal.ads.zt1
    public pc d() {
        zt1 zt1Var = (zt1) this.f5878g;
        return zt1Var != null ? zt1Var.d() : ((wu1) this.f5875d).f11903e;
    }

    @Override // s3.i0
    public boolean e() {
        if (this.f5873b) {
            ((ob.y0) this.f5875d).getClass();
            return false;
        }
        s3.i0 i0Var = (s3.i0) this.f5878g;
        i0Var.getClass();
        return i0Var.e();
    }

    public IOException f(boolean z5, boolean z10, IOException ioe) {
        dl.g call = (dl.g) this.f5875d;
        if (ioe != null) {
            n(ioe);
        }
        if (z10) {
            if (ioe != null) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(ioe, "ioe");
            } else {
                Intrinsics.checkNotNullParameter(call, "call");
            }
        }
        if (z5) {
            if (ioe != null) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(ioe, "ioe");
            } else {
                Intrinsics.checkNotNullParameter(call, "call");
            }
        }
        return call.f(this, z10, z5, ioe);
    }

    public dl.b g(zk.x request, boolean z5) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f5873b = z5;
        zk.b0 b0Var = request.f46514d;
        Intrinsics.b(b0Var);
        long jContentLength = b0Var.contentLength();
        dl.g call = (dl.g) this.f5875d;
        Intrinsics.checkNotNullParameter(call, "call");
        return new dl.b(this, ((el.d) this.f5877f).b(request, jContentLength), jContentLength);
    }

    @Override // s3.i0
    public j3.f0 getPlaybackParameters() {
        s3.i0 i0Var = (s3.i0) this.f5878g;
        return i0Var != null ? i0Var.getPlaybackParameters() : (j3.f0) ((ob.y0) this.f5875d).f30542f;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.y71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ed.d h() {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gn0.h():ed.d");
    }

    public void i(s3.a aVar) throws s3.i {
        s3.i0 i0Var;
        s3.i0 i0VarH = aVar.h();
        if (i0VarH == null || i0VarH == (i0Var = (s3.i0) this.f5878g)) {
            return;
        }
        if (i0Var != null) {
            throw new s3.i(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f5878g = i0VarH;
        this.f5877f = aVar;
        ((u3.a0) i0VarH).a((j3.f0) ((ob.y0) this.f5875d).f30542f);
    }

    public el.g j(zk.d0 response) throws IOException {
        el.d dVar = (el.d) this.f5877f;
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String strA = zk.d0.a("Content-Type", response);
            long jD = dVar.d(response);
            return new el.g(strA, jD, i0.o.g(new dl.c(this, dVar.g(response), jD)));
        } catch (IOException ioe) {
            dl.g call = (dl.g) this.f5875d;
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
            n(ioe);
            throw ioe;
        }
    }

    @Override // com.google.android.gms.internal.ads.zt1
    public long k() {
        if (this.f5873b) {
            return ((wu1) this.f5875d).k();
        }
        zt1 zt1Var = (zt1) this.f5878g;
        zt1Var.getClass();
        return zt1Var.k();
    }

    public zk.c0 l(boolean z5) throws IOException {
        try {
            zk.c0 c0VarE = ((el.d) this.f5877f).e(z5);
            if (c0VarE != null) {
                Intrinsics.checkNotNullParameter(this, "deferredTrailers");
                c0VarE.f46342m = this;
            }
            return c0VarE;
        } catch (IOException ioe) {
            dl.g call = (dl.g) this.f5875d;
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
            n(ioe);
            throw ioe;
        }
    }

    @Override // com.google.android.gms.internal.ads.zt1
    public boolean m() {
        if (this.f5873b) {
            return false;
        }
        zt1 zt1Var = (zt1) this.f5878g;
        zt1Var.getClass();
        return zt1Var.m();
    }

    public void n(IOException iOException) {
        this.f5874c = true;
        ((dl.d) this.f5876e).e(iOException);
        dl.j jVarF = ((el.d) this.f5877f).f();
        dl.g call = (dl.g) this.f5875d;
        synchronized (jVarF) {
            try {
                Intrinsics.checkNotNullParameter(call, "call");
                if (!(iOException instanceof gl.d0)) {
                    if (!(jVarF.f15858g != null) || (iOException instanceof gl.a)) {
                        jVarF.f15860j = true;
                        if (jVarF.f15863m == 0) {
                            dl.j.d(call.f15834b, jVarF.f15853b, iOException);
                            jVarF.f15862l++;
                        }
                    }
                } else if (((gl.d0) iOException).f20182b == gl.b.REFUSED_STREAM) {
                    int i = jVarF.f15864n + 1;
                    jVarF.f15864n = i;
                    if (i > 1) {
                        jVarF.f15860j = true;
                        jVarF.f15862l++;
                    }
                } else if (((gl.d0) iOException).f20182b != gl.b.CANCEL || !call.f15846o) {
                    jVarF.f15860j = true;
                    jVarF.f15862l++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void o(gx1 gx1Var) throws bt1 {
        zt1 zt1Var;
        zt1 zt1VarN0 = gx1Var.n0();
        if (zt1VarN0 == null || zt1VarN0 == (zt1Var = (zt1) this.f5878g)) {
            return;
        }
        if (zt1Var != null) {
            throw new bt1(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f5878g = zt1VarN0;
        this.f5877f = gx1Var;
        ((pw1) zt1VarN0).b(((wu1) this.f5875d).f11903e);
    }

    public gn0(ut1 ut1Var) {
        this.f5876e = ut1Var;
        wu1 wu1Var = new wu1();
        wu1Var.f11903e = pc.f9009d;
        this.f5875d = wu1Var;
        this.f5873b = true;
    }

    public gn0(dl.g call, dl.d finder, el.d codec) {
        zk.i eventListener = zk.i.f46409d;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f5875d = call;
        this.f5876e = finder;
        this.f5877f = codec;
        this.f5878g = codec.f();
    }

    public gn0(s3.e0 e0Var, m3.t tVar) {
        this.f5876e = e0Var;
        this.f5875d = new ob.y0(tVar);
        this.f5873b = true;
    }

    public gn0(Context context) {
        this.f5873b = true;
        this.f5874c = false;
        this.f5875d = context;
    }
}
