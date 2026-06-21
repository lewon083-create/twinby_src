package k4;

import ad.b1;
import ad.g0;
import ad.j0;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.h5;
import g0.a2;
import j3.c0;
import j3.o;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import l7.i;
import n5.f;
import n5.g;
import n5.j;
import ni.x0;
import s3.r;
import s3.t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends s3.a implements Handler.Callback {
    public j A;
    public n5.d B;
    public n5.d C;
    public int D;
    public final Handler E;
    public final t F;
    public final r3.b G;
    public boolean H;
    public boolean I;
    public o J;
    public long K;
    public long L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final le.a f26890t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final r3.e f26891u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f26892v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f26893w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f26894x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f26895y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public f f26896z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t tVar, Looper looper) {
        super(3);
        v7.f fVar = d.Q1;
        this.F = tVar;
        this.E = looper == null ? null : new Handler(looper, this);
        this.f26893w = fVar;
        this.f26890t = new le.a(3);
        this.f26891u = new r3.e(1);
        this.G = new r3.b(2, false);
        this.L = -9223372036854775807L;
        this.K = -9223372036854775807L;
    }

    @Override // s3.a
    public final int B(o oVar) {
        boolean zEquals = Objects.equals(oVar.f26335n, "application/x-media3-cues");
        String str = oVar.f26335n;
        if (!zEquals) {
            v7.f fVar = (v7.f) this.f26893w;
            fVar.getClass();
            if (!((i) fVar.f34767c).c(oVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return c0.l(str) ? s3.a.b(1, 0, 0, 0) : s3.a.b(0, 0, 0, 0);
            }
        }
        return s3.a.b(oVar.O == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void E() {
        boolean z5 = Objects.equals(this.J.f26335n, "application/cea-608") || Objects.equals(this.J.f26335n, "application/x-mp4-cea-608") || Objects.equals(this.J.f26335n, "application/cea-708");
        String str = this.J.f26335n;
        if (!z5) {
            throw new IllegalStateException(hl.d.q("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
        }
    }

    public final long F() {
        if (this.D == -1) {
            return Long.MAX_VALUE;
        }
        this.B.getClass();
        if (this.D >= this.B.l()) {
            return Long.MAX_VALUE;
        }
        return this.B.f(this.D);
    }

    public final long G(long j10) {
        h5.r(j10 != -9223372036854775807L);
        return j10 - this.f32439l;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H() {
        /*
            r7 = this;
            r0 = 1
            r7.f26894x = r0
            j3.o r1 = r7.J
            r1.getClass()
            k4.d r2 = r7.f26893w
            v7.f r2 = (v7.f) r2
            java.lang.Object r2 = r2.f34767c
            l7.i r2 = (l7.i) r2
            java.lang.String r3 = r1.f26335n
            int r4 = r1.K
            if (r3 == 0) goto L50
            int r5 = r3.hashCode()
            r6 = -1
            switch(r5) {
                case 930165504: goto L34;
                case 1566015601: goto L2b;
                case 1566016562: goto L20;
                default: goto L1e;
            }
        L1e:
            r0 = r6
            goto L3e
        L20:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L29
            goto L1e
        L29:
            r0 = 2
            goto L3e
        L2b:
            java.lang.String r5 = "application/cea-608"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L3e
            goto L1e
        L34:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3d
            goto L1e
        L3d:
            r0 = 0
        L3e:
            switch(r0) {
                case 0: goto L4a;
                case 1: goto L4a;
                case 2: goto L42;
                default: goto L41;
            }
        L41:
            goto L50
        L42:
            o5.f r0 = new o5.f
            java.util.List r1 = r1.f26338q
            r0.<init>(r4, r1)
            goto L6d
        L4a:
            o5.c r0 = new o5.c
            r0.<init>(r3, r4)
            goto L6d
        L50:
            boolean r0 = r2.c(r1)
            if (r0 == 0) goto L75
            n5.m r0 = r2.b(r1)
            k4.b r1 = new k4.b
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>(r0)
            r0 = r1
        L6d:
            r7.f26896z = r0
            long r1 = r7.f32440m
            r0.b(r1)
            return
        L75:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r1 = com.google.android.gms.internal.ads.om1.k(r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.e.H():void");
    }

    public final void I(l3.c cVar) {
        b1 b1Var = cVar.f27791a;
        t tVar = this.F;
        tVar.f32648b.f32708n.e(27, new r(b1Var, 0));
        tVar.f32648b.f32708n.e(27, new x0(29, cVar));
    }

    public final void J() {
        this.A = null;
        this.D = -1;
        n5.d dVar = this.B;
        if (dVar != null) {
            dVar.s();
            this.B = null;
        }
        n5.d dVar2 = this.C;
        if (dVar2 != null) {
            dVar2.s();
            this.C = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        I((l3.c) message.obj);
        return true;
    }

    @Override // s3.a
    public final String i() {
        return "TextRenderer";
    }

    @Override // s3.a
    public final boolean k() {
        return this.I;
    }

    @Override // s3.a
    public final boolean m() {
        o oVar = this.J;
        if (oVar != null) {
            if (Objects.equals(oVar.f26335n, "application/x-media3-cues")) {
                a aVar = this.f26892v;
                aVar.getClass();
                if (aVar.a(this.K) == Long.MIN_VALUE) {
                    try {
                        i4.b1 b1Var = this.f32437j;
                        b1Var.getClass();
                        b1Var.a();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.I) {
                    return false;
                }
                if (this.H) {
                    n5.d dVar = this.B;
                    long j10 = this.K;
                    if (dVar == null || dVar.l() <= 0 || dVar.f(dVar.l() - 1) <= j10) {
                        n5.d dVar2 = this.C;
                        long j11 = this.K;
                        if ((dVar2 == null || dVar2.l() <= 0 || dVar2.f(dVar2.l() - 1) <= j11) && this.A != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // s3.a
    public final void n() {
        this.J = null;
        this.L = -9223372036854775807L;
        b1 b1Var = b1.f768f;
        G(this.K);
        l3.c cVar = new l3.c(b1Var);
        Handler handler = this.E;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            I(cVar);
        }
        this.K = -9223372036854775807L;
        if (this.f26896z != null) {
            J();
            f fVar = this.f26896z;
            fVar.getClass();
            fVar.release();
            this.f26896z = null;
            this.f26895y = 0;
        }
    }

    @Override // s3.a
    public final void p(long j10, boolean z5, boolean z10) {
        this.K = j10;
        a aVar = this.f26892v;
        if (aVar != null) {
            aVar.clear();
        }
        b1 b1Var = b1.f768f;
        G(this.K);
        l3.c cVar = new l3.c(b1Var);
        Handler handler = this.E;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            I(cVar);
        }
        this.H = false;
        this.I = false;
        this.L = -9223372036854775807L;
        o oVar = this.J;
        if (oVar == null || Objects.equals(oVar.f26335n, "application/x-media3-cues")) {
            return;
        }
        if (this.f26895y == 0) {
            J();
            f fVar = this.f26896z;
            fVar.getClass();
            fVar.flush();
            fVar.b(this.f32440m);
            return;
        }
        J();
        f fVar2 = this.f26896z;
        fVar2.getClass();
        fVar2.release();
        this.f26896z = null;
        this.f26895y = 0;
        H();
    }

    @Override // s3.a
    public final void u(o[] oVarArr, long j10, long j11, i4.c0 c0Var) {
        o oVar = oVarArr[0];
        this.J = oVar;
        if (Objects.equals(oVar.f26335n, "application/x-media3-cues")) {
            this.f26892v = this.J.L == 1 ? new c() : new a2(1);
            return;
        }
        E();
        if (this.f26896z != null) {
            this.f26895y = 1;
        } else {
            H();
        }
    }

    @Override // s3.a
    public final void x(long j10, long j11) {
        boolean z5;
        r3.b bVar;
        boolean z10;
        long jF;
        if (this.f32442o) {
            long j12 = this.L;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                J();
                this.I = true;
            }
        }
        if (this.I) {
            return;
        }
        o oVar = this.J;
        oVar.getClass();
        boolean zEquals = Objects.equals(oVar.f26335n, "application/x-media3-cues");
        Handler handler = this.E;
        r3.b bVar2 = this.G;
        boolean zD = false;
        zD = false;
        zD = false;
        if (zEquals) {
            this.f26892v.getClass();
            if (!this.H) {
                r3.e eVar = this.f26891u;
                if (w(bVar2, eVar, 0) == -4) {
                    if (eVar.c(4)) {
                        this.H = true;
                    } else {
                        eVar.u();
                        ByteBuffer byteBuffer = eVar.f32192f;
                        byteBuffer.getClass();
                        long j13 = eVar.f32194h;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.f26890t.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        kf.a aVar = new kf.a(28);
                        g0 g0VarQ = j0.q();
                        for (int i = 0; i < parcelableArrayList.size(); i++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                            bundle2.getClass();
                            g0VarQ.b(aVar.apply(bundle2));
                        }
                        n5.a aVar2 = new n5.a(j13, bundle.getLong("d"), g0VarQ.g());
                        eVar.r();
                        zD = this.f26892v.d(aVar2, j10);
                    }
                }
            }
            long jA = this.f26892v.a(this.K);
            if (jA == Long.MIN_VALUE && this.H && !zD) {
                this.I = true;
            }
            if (jA != Long.MIN_VALUE && jA <= j10) {
                zD = true;
            }
            if (zD) {
                j0 j0VarB = this.f26892v.b(j10);
                long jC = this.f26892v.c(j10);
                G(jC);
                l3.c cVar = new l3.c(j0VarB);
                if (handler != null) {
                    handler.obtainMessage(1, cVar).sendToTarget();
                } else {
                    I(cVar);
                }
                this.f26892v.e(jC);
            }
            this.K = j10;
            return;
        }
        E();
        this.K = j10;
        if (this.C == null) {
            f fVar = this.f26896z;
            fVar.getClass();
            fVar.c(j10);
            try {
                f fVar2 = this.f26896z;
                fVar2.getClass();
                this.C = (n5.d) fVar2.d();
            } catch (g e3) {
                m3.b.f("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.J, e3);
                b1 b1Var = b1.f768f;
                G(this.K);
                l3.c cVar2 = new l3.c(b1Var);
                if (handler != null) {
                    handler.obtainMessage(1, cVar2).sendToTarget();
                } else {
                    I(cVar2);
                }
                J();
                f fVar3 = this.f26896z;
                fVar3.getClass();
                fVar3.release();
                this.f26896z = null;
                this.f26895y = 0;
                H();
                return;
            }
        }
        if (this.i != 2) {
            return;
        }
        if (this.B != null) {
            long jF2 = F();
            z5 = false;
            while (jF2 <= j10) {
                this.D++;
                jF2 = F();
                z5 = true;
            }
        } else {
            z5 = false;
        }
        n5.d dVar = this.C;
        if (dVar == null) {
            bVar = bVar2;
            z10 = z5;
        } else if (dVar.c(4)) {
            if (!z5 && F() == Long.MAX_VALUE) {
                if (this.f26895y == 2) {
                    J();
                    f fVar4 = this.f26896z;
                    fVar4.getClass();
                    fVar4.release();
                    this.f26896z = null;
                    this.f26895y = 0;
                    H();
                } else {
                    J();
                    this.I = true;
                }
            }
            bVar = bVar2;
            z10 = z5;
        } else {
            bVar = bVar2;
            z10 = z5;
            if (dVar.f32196d <= j10) {
                n5.d dVar2 = this.B;
                if (dVar2 != null) {
                    dVar2.s();
                }
                this.D = dVar.d(j10);
                this.B = dVar;
                this.C = null;
                z10 = true;
            }
        }
        if (z10) {
            this.B.getClass();
            int iD = this.B.d(j10);
            if (iD == 0 || this.B.l() == 0) {
                jF = this.B.f32196d;
            } else if (iD == -1) {
                n5.d dVar3 = this.B;
                jF = dVar3.f(dVar3.l() - 1);
            } else {
                jF = this.B.f(iD - 1);
            }
            G(jF);
            l3.c cVar3 = new l3.c(this.B.h(j10));
            if (handler != null) {
                handler.obtainMessage(1, cVar3).sendToTarget();
            } else {
                I(cVar3);
            }
        }
        if (this.f26895y == 2) {
            return;
        }
        while (!this.H) {
            try {
                j jVar = this.A;
                if (jVar == null) {
                    f fVar5 = this.f26896z;
                    fVar5.getClass();
                    jVar = (j) fVar5.e();
                    if (jVar == null) {
                        return;
                    } else {
                        this.A = jVar;
                    }
                }
                if (this.f26895y == 1) {
                    jVar.f7316c = 4;
                    f fVar6 = this.f26896z;
                    fVar6.getClass();
                    fVar6.a(jVar);
                    this.A = null;
                    this.f26895y = 2;
                    return;
                }
                int iW = w(bVar, jVar, 0);
                if (iW == -4) {
                    if (jVar.c(4)) {
                        this.H = true;
                        this.f26894x = false;
                    } else {
                        o oVar2 = (o) bVar.f32189d;
                        if (oVar2 == null) {
                            return;
                        }
                        jVar.f29123k = oVar2.f26340s;
                        jVar.u();
                        this.f26894x &= !jVar.c(1);
                    }
                    if (!this.f26894x) {
                        f fVar7 = this.f26896z;
                        fVar7.getClass();
                        fVar7.a(jVar);
                        this.A = null;
                    }
                } else if (iW == -3) {
                    return;
                }
            } catch (g e7) {
                m3.b.f("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.J, e7);
                b1 b1Var2 = b1.f768f;
                G(this.K);
                l3.c cVar4 = new l3.c(b1Var2);
                if (handler != null) {
                    handler.obtainMessage(1, cVar4).sendToTarget();
                } else {
                    I(cVar4);
                }
                J();
                f fVar8 = this.f26896z;
                fVar8.getClass();
                fVar8.release();
                this.f26896z = null;
                this.f26895y = 0;
                H();
                return;
            }
        }
    }
}
