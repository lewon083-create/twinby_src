package u3;

import android.content.Context;
import android.media.LoudnessCodecController;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.internal.ads.p30;
import com.google.android.gms.internal.ads.p5;
import com.google.android.gms.internal.ads.rh0;
import com.google.android.gms.internal.ads.vs1;
import com.google.android.gms.internal.measurement.h5;
import j3.f0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Objects;
import k6.t0;
import s3.a1;
import s3.i0;
import t.v0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends b4.s implements i0 {
    public final Context J0;
    public final o4.v K0;
    public final y L0;
    public final bb.e M0;
    public int N0;
    public boolean O0;
    public j3.o P0;
    public j3.o Q0;
    public long R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public int W0;
    public boolean X0;
    public long Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, b4.l lVar, boolean z5, Handler handler, s3.t tVar, y yVar) {
        super(context.getApplicationContext(), 1, lVar, z5, 44100.0f);
        bb.e eVar = Build.VERSION.SDK_INT >= 35 ? new bb.e(4) : null;
        this.J0 = context.getApplicationContext();
        this.L0 = yVar;
        this.M0 = eVar;
        this.W0 = -1000;
        this.K0 = new o4.v(handler, tVar, 1);
        this.Y0 = -9223372036854775807L;
        yVar.f34229n = new t0(15, this);
    }

    public final int B0(j3.o oVar) {
        c cVarA;
        y yVar = this.L0;
        if (yVar.X) {
            cVarA = c.f34081d;
        } else {
            g gVarB = yVar.f34233r.b(yVar.g(oVar));
            p5 p5Var = new p5();
            p5Var.f8926a = gVarB.f34114a;
            p5Var.f8927b = gVarB.f34115b;
            p5Var.f8928c = gVarB.f34116c;
            cVarA = p5Var.a();
        }
        if (!cVarA.f34082a) {
            return 0;
        }
        int i = cVarA.f34083b ? 1536 : 512;
        return cVarA.f34084c ? i | 2048 : i;
    }

    public final void C0() {
        long j10;
        long jMax;
        long j11;
        k();
        y yVar = this.L0;
        bb.e eVar = yVar.f34217b;
        if (!yVar.n() || yVar.F) {
            j10 = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(yVar.f34235t.a(), m3.z.S(((j) yVar.f34231p.f9941f).f34129b, yVar.j()));
            ArrayDeque arrayDeque = yVar.f34224h;
            while (!arrayDeque.isEmpty() && jMin >= ((x) arrayDeque.getFirst()).f34212c) {
                yVar.f34238w = (x) arrayDeque.remove();
            }
            x xVar = yVar.f34238w;
            long jU = jMin - xVar.f34212c;
            long jZ = m3.z.z(jU, xVar.f34210a.f26237a);
            if (arrayDeque.isEmpty()) {
                k3.n nVar = (k3.n) eVar.f2021e;
                if (nVar.isActive()) {
                    if (nVar.f26885n >= 1024) {
                        long j12 = nVar.f26884m;
                        p30 p30Var = nVar.f26881j;
                        p30Var.getClass();
                        long jB = j12 - ((long) (((k3.m) p30Var.f8917q).B() * (p30Var.i * p30Var.f8903b)));
                        int i = nVar.f26880h.f26860a;
                        int i10 = nVar.f26879g.f26860a;
                        if (i == i10) {
                            jU = m3.z.U(jU, jB, nVar.f26885n, RoundingMode.DOWN);
                            j10 = Long.MIN_VALUE;
                        } else {
                            j10 = Long.MIN_VALUE;
                            jU = m3.z.U(jU, jB * ((long) i), nVar.f26885n * ((long) i10), RoundingMode.DOWN);
                        }
                    } else {
                        j10 = Long.MIN_VALUE;
                        jU = (long) (((double) nVar.f26875c) * jU);
                    }
                    x xVar2 = yVar.f34238w;
                    j11 = xVar2.f34211b + jU;
                    xVar2.f34213d = jU - jZ;
                } else {
                    j10 = Long.MIN_VALUE;
                    x xVar22 = yVar.f34238w;
                    j11 = xVar22.f34211b + jU;
                    xVar22.f34213d = jU - jZ;
                }
            } else {
                j10 = Long.MIN_VALUE;
                x xVar3 = yVar.f34238w;
                j11 = xVar3.f34211b + jZ + xVar3.f34213d;
            }
            long j13 = ((c0) eVar.f2020d).f34092q;
            jMax = m3.z.S(((j) yVar.f34231p.f9941f).f34129b, j13) + j11;
            long j14 = yVar.Z;
            if (j13 > j14) {
                long jS = m3.z.S(((j) yVar.f34231p.f9941f).f34129b, j13 - j14);
                yVar.Z = j13;
                yVar.f34216a0 += jS;
                if (yVar.f34218b0 == null) {
                    yVar.f34218b0 = new Handler(Looper.myLooper());
                }
                yVar.f34218b0.removeCallbacksAndMessages(null);
                yVar.f34218b0.postDelayed(new t.a0(9, yVar), 100L);
            }
        }
        if (jMax != j10) {
            if (!this.S0) {
                jMax = Math.max(this.R0, jMax);
            }
            this.R0 = jMax;
            this.S0 = false;
        }
    }

    @Override // b4.s
    public final s3.c G(b4.p pVar, j3.o oVar, j3.o oVar2) {
        s3.c cVarB = pVar.b(oVar, oVar2);
        int i = cVarB.f32463e;
        if (this.J == null && w0(oVar2)) {
            i |= 32768;
        }
        "OMX.google.raw.decoder".equals(pVar.f1907a);
        if (oVar2.f26336o > this.N0) {
            i |= 64;
        }
        int i10 = i;
        return new s3.c(pVar.f1907a, oVar, oVar2, i10 != 0 ? 0 : cVarB.f32462d, i10);
    }

    @Override // b4.s
    public final float N(float f10, j3.o oVar, j3.o[] oVarArr) {
        int iMax = -1;
        for (j3.o oVar2 : oVarArr) {
            int i = oVar2.G;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // b4.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList O(b4.k r4, j3.o r5, boolean r6) {
        /*
            r3 = this;
            java.lang.String r0 = r5.f26335n
            r1 = 0
            if (r0 != 0) goto L8
            ad.b1 r4 = ad.b1.f768f
            goto L2f
        L8:
            u3.y r0 = r3.L0
            int r0 = r0.h(r5)
            if (r0 == 0) goto L2b
            java.lang.String r0 = "audio/raw"
            java.util.List r0 = b4.y.e(r0, r1, r1)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L1e
            r0 = 0
            goto L24
        L1e:
            java.lang.Object r0 = r0.get(r1)
            b4.p r0 = (b4.p) r0
        L24:
            if (r0 == 0) goto L2b
            ad.b1 r4 = ad.j0.w(r0)
            goto L2f
        L2b:
            ad.b1 r4 = b4.y.g(r4, r5, r6, r1)
        L2f:
            java.util.HashMap r6 = b4.y.f1966a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            a0.y r4 = new a0.y
            android.content.Context r0 = r3.J0
            r4.<init>(r0, r5)
            b4.t r5 = new b4.t
            r5.<init>(r1, r4)
            java.util.Collections.sort(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.a0.O(b4.k, j3.o, boolean):java.util.ArrayList");
    }

    @Override // b4.s
    public final long P(long j10, long j11) {
        long jU;
        y yVar = this.L0;
        boolean z5 = yVar.l() && this.Y0 != -9223372036854775807L;
        if (this.X0) {
            if (!yVar.n()) {
                jU = -9223372036854775807L;
            } else if (rh0.b(yVar.f34231p)) {
                jU = m3.z.S(((j) yVar.f34231p.f9941f).f34129b, yVar.f34235t.f34156a.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = yVar.f34235t.f34156a.getBufferSizeInFrames();
                int iM = q4.b.m(((j) yVar.f34231p.f9941f).f34128a);
                h5.r(iM != -2147483647);
                jU = m3.z.U(bufferSizeInFrames, 1000000L, iM, RoundingMode.DOWN);
            }
            if (this.V0 && z5 && jU != -9223372036854775807L) {
                float fMin = Math.min(jU, this.Y0 - j10);
                f0 f0Var = yVar.f34239x;
                return Math.max(10000L, (long) ((fMin / (f0Var != null ? f0Var.f26237a : 1.0f)) / 2.0f));
            }
        } else if (z5 || this.f1948u0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // b4.s
    public final q9.o R(b4.p pVar, j3.o oVar, MediaCrypto mediaCrypto, float f10) {
        j3.o[] oVarArr = this.f32438k;
        oVarArr.getClass();
        String str = pVar.f1907a;
        "OMX.google.raw.decoder".equals(str);
        int iMax = oVar.f26336o;
        String str2 = oVar.f26335n;
        int i = oVar.F;
        if (oVarArr.length != 1) {
            for (j3.o oVar2 : oVarArr) {
                if (pVar.b(oVar, oVar2).f32462d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    iMax = Math.max(iMax, oVar2.f26336o);
                }
            }
        }
        this.N0 = iMax;
        this.O0 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = pVar.f1909c;
        int i10 = this.N0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i);
        int i11 = oVar.G;
        mediaFormat.setInteger("sample-rate", i11);
        m3.b.r(mediaFormat, oVar.f26338q);
        m3.b.n(mediaFormat, "max-input-size", i10);
        mediaFormat.setInteger("priority", 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if ("audio/ac4".equals(str2)) {
            Pair pairC = m3.d.c(oVar);
            if (pairC != null) {
                m3.b.n(mediaFormat, "profile", ((Integer) pairC.first).intValue());
                m3.b.n(mediaFormat, "level", ((Integer) pairC.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        int i12 = Build.VERSION.SDK_INT;
        j3.n nVar = new j3.n();
        nVar.f26292m = j3.c0.n("audio/raw");
        nVar.E = i;
        nVar.F = i11;
        nVar.G = 4;
        if (this.L0.h(new j3.o(nVar)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i12 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i12 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.W0));
        }
        E(mediaFormat);
        this.Q0 = (!"audio/raw".equals(pVar.f1908b) || "audio/raw".equals(str2)) ? null : oVar;
        return new q9.o(pVar, mediaFormat, oVar, null, mediaCrypto, this.M0);
    }

    @Override // b4.s
    public final void S(r3.e eVar) {
        j3.o oVar;
        rh0 rh0Var;
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || (oVar = eVar.f32190d) == null || !Objects.equals(oVar.f26335n, "audio/opus") || !this.f1935i0) {
            return;
        }
        ByteBuffer byteBuffer = eVar.i;
        byteBuffer.getClass();
        j3.o oVar2 = eVar.f32190d;
        oVar2.getClass();
        int i10 = oVar2.I;
        if (byteBuffer.remaining() == 8) {
            int i11 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            y yVar = this.L0;
            r rVar = yVar.f34235t;
            if (rVar == null || !rVar.c() || (rh0Var = yVar.f34231p) == null || !((j) rh0Var.f9941f).f34137k) {
                return;
            }
            r rVar2 = yVar.f34235t;
            if (i < 29) {
                rVar2.getClass();
            } else {
                rVar2.f34156a.setOffloadDelayPadding(i10, i11);
            }
        }
    }

    @Override // b4.s
    public final void Y(Exception exc) {
        m3.b.f("MediaCodecAudioRenderer", "Audio codec error", exc);
        o4.v vVar = this.K0;
        Handler handler = vVar.f29700a;
        if (handler != null) {
            handler.post(new k(vVar, exc, 3));
        }
    }

    @Override // b4.s
    public final void Z(long j10, long j11, String str) {
        o4.v vVar = this.K0;
        Handler handler = vVar.f29700a;
        if (handler != null) {
            handler.post(new k(vVar, str, j10, j11));
        }
    }

    @Override // s3.i0
    public final void a(f0 f0Var) {
        y yVar = this.L0;
        yVar.getClass();
        yVar.f34239x = new f0(m3.z.i(f0Var.f26237a, 0.1f, 8.0f), m3.z.i(f0Var.f26238b, 0.1f, 8.0f));
        if (yVar.v()) {
            yVar.t();
            return;
        }
        x xVar = new x(f0Var, -9223372036854775807L, -9223372036854775807L);
        if (yVar.n()) {
            yVar.f34237v = xVar;
        } else {
            yVar.f34238w = xVar;
        }
    }

    @Override // b4.s
    public final void a0(s3.b bVar) {
        o4.v vVar = this.K0;
        Handler handler = vVar.f29700a;
        if (handler != null) {
            handler.post(new v0(8, vVar, bVar));
        }
    }

    @Override // b4.s
    public final void b0(String str) {
        o4.v vVar = this.K0;
        Handler handler = vVar.f29700a;
        if (handler != null) {
            handler.post(new k(vVar, str, 5));
        }
    }

    @Override // s3.i0
    public final long c() {
        if (this.i == 2) {
            C0();
        }
        return this.R0;
    }

    @Override // b4.s
    public final s3.c c0(r3.b bVar) throws s3.i {
        j3.o oVar = (j3.o) bVar.f32189d;
        oVar.getClass();
        this.P0 = oVar;
        s3.c cVarC0 = super.c0(bVar);
        o4.v vVar = this.K0;
        Handler handler = vVar.f29700a;
        if (handler != null) {
            handler.post(new k(vVar, oVar, cVarC0));
        }
        return cVarC0;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea A[Catch: l -> 0x00e8, TryCatch #0 {l -> 0x00e8, blocks: (B:36:0x00bf, B:39:0x00c7, B:41:0x00cb, B:43:0x00d4, B:47:0x00e2, B:50:0x00ea, B:54:0x00f1, B:55:0x00f6), top: B:59:0x00bf }] */
    @Override // b4.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d0(j3.o r8, android.media.MediaFormat r9) throws s3.i {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.a0.d0(j3.o, android.media.MediaFormat):void");
    }

    @Override // s3.i0
    public final boolean e() {
        boolean z5 = this.U0;
        this.U0 = false;
        return z5;
    }

    @Override // b4.s
    public final void e0() {
        this.L0.getClass();
    }

    @Override // b4.s
    public final void g0() {
        this.L0.E = true;
    }

    @Override // s3.i0
    public final f0 getPlaybackParameters() {
        return this.L0.f34239x;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    @Override // b4.s, s3.a, s3.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.a0.handleMessage(int, java.lang.Object):void");
    }

    @Override // s3.a
    public final String i() {
        return "MediaCodecAudioRenderer";
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    @Override // b4.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j0(long r1, long r3, b4.m r5, java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, j3.o r14) throws s3.i {
        /*
            r0 = this;
            r6.getClass()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.Y0 = r1
            j3.o r1 = r0.Q0
            r2 = 1
            if (r1 == 0) goto L1a
            r1 = r8 & 2
            if (r1 == 0) goto L1a
            r5.getClass()
            r5.g(r7)
            return r2
        L1a:
            u3.y r1 = r0.L0
            if (r12 == 0) goto L2d
            if (r5 == 0) goto L23
            r5.g(r7)
        L23:
            com.google.android.gms.internal.ads.vs1 r3 = r0.f1956y0
            int r4 = r3.f11458g
            int r4 = r4 + r9
            r3.f11458g = r4
            r1.E = r2
            return r2
        L2d:
            boolean r1 = r1.k(r10, r6, r9)     // Catch: u3.n -> L44 u3.m -> L5e
            if (r1 == 0) goto L40
            if (r5 == 0) goto L38
            r5.g(r7)
        L38:
            com.google.android.gms.internal.ads.vs1 r1 = r0.f1956y0
            int r3 = r1.f11457f
            int r3 = r3 + r9
            r1.f11457f = r3
            return r2
        L40:
            r0.Y0 = r10
            r1 = 0
            return r1
        L44:
            r1 = move-exception
            boolean r2 = r0.f1935i0
            if (r2 == 0) goto L55
            s3.a1 r2 = r0.f32433e
            r2.getClass()
            int r2 = r2.f32449a
            if (r2 == 0) goto L55
            r2 = 5003(0x138b, float:7.01E-42)
            goto L57
        L55:
            r2 = 5002(0x138a, float:7.009E-42)
        L57:
            boolean r3 = r1.f34143c
            s3.i r1 = r0.d(r1, r14, r3, r2)
            throw r1
        L5e:
            r1 = move-exception
            j3.o r2 = r0.P0
            boolean r3 = r0.f1935i0
            if (r3 == 0) goto L71
            s3.a1 r3 = r0.f32433e
            r3.getClass()
            int r3 = r3.f32449a
            if (r3 == 0) goto L71
            r3 = 5004(0x138c, float:7.012E-42)
            goto L73
        L71:
            r3 = 5001(0x1389, float:7.008E-42)
        L73:
            boolean r4 = r1.f34141b
            s3.i r1 = r0.d(r1, r2, r4, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.a0.j0(long, long, b4.m, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, j3.o):boolean");
    }

    @Override // s3.a
    public final boolean k() {
        if (!this.f1948u0) {
            return false;
        }
        y yVar = this.L0;
        if (yVar.n()) {
            return yVar.L && !yVar.l();
        }
        return true;
    }

    @Override // s3.a
    public final boolean m() {
        return this.L0.l();
    }

    @Override // b4.s
    public final void m0() throws s3.i {
        try {
            y yVar = this.L0;
            if (!yVar.L && yVar.n() && yVar.e()) {
                yVar.p();
                yVar.L = true;
            }
            long j10 = this.f1958z0.f1927e;
            if (j10 != -9223372036854775807L) {
                this.Y0 = j10;
            }
        } catch (n e3) {
            throw d(e3, e3.f34144d, e3.f34143c, this.f1935i0 ? 5003 : 5002);
        }
    }

    @Override // b4.s, s3.a
    public final void n() {
        o4.v vVar = this.K0;
        this.T0 = true;
        this.P0 = null;
        this.Y0 = -9223372036854775807L;
        this.V0 = false;
        try {
            this.L0.f();
            try {
                super.n();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.n();
                throw th2;
            } finally {
            }
        }
    }

    @Override // s3.a
    public final void o(boolean z5, boolean z10) {
        vs1 vs1Var = new vs1(1);
        this.f1956y0 = vs1Var;
        o4.v vVar = this.K0;
        Handler handler = vVar.f29700a;
        if (handler != null) {
            handler.post(new k(vVar, vs1Var, 6));
        }
        a1 a1Var = this.f32433e;
        a1Var.getClass();
        boolean z11 = a1Var.f32450b;
        y yVar = this.L0;
        if (z11) {
            h5.r(yVar.P);
            if (!yVar.V) {
                yVar.V = true;
                yVar.r();
            }
        } else if (yVar.V) {
            yVar.V = false;
            yVar.r();
        }
        t3.j jVar = this.f32435g;
        jVar.getClass();
        yVar.f34228m = jVar;
        m3.t tVar = this.f32436h;
        tVar.getClass();
        yVar.f34233r.f34177f = tVar;
    }

    @Override // b4.s, s3.a
    public final void p(long j10, boolean z5, boolean z10) throws s3.i {
        super.p(j10, z5, z10);
        this.L0.f();
        this.R0 = j10;
        this.Y0 = -9223372036854775807L;
        this.U0 = false;
        this.V0 = false;
        this.S0 = true;
    }

    @Override // s3.a
    public final void q() {
        bb.e eVar;
        this.L0.f34233r.d();
        if (Build.VERSION.SDK_INT < 35 || (eVar = this.M0) == null) {
            return;
        }
        ((HashSet) eVar.f2019c).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) eVar.f2021e;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // s3.a
    public final void r() {
        y yVar = this.L0;
        this.U0 = false;
        this.V0 = false;
        this.Y0 = -9223372036854775807L;
        try {
            try {
                this.f1935i0 = false;
                n0();
                l0();
                ni.i iVar = this.J;
                if (iVar != null) {
                    iVar.A(null);
                }
                this.J = null;
            } catch (Throwable th2) {
                ni.i iVar2 = this.J;
                if (iVar2 != null) {
                    iVar2.A(null);
                }
                this.J = null;
                throw th2;
            }
        } finally {
            if (this.T0) {
                this.T0 = false;
                yVar.s();
            }
        }
    }

    @Override // s3.a
    public final void s() {
        this.L0.o();
        this.X0 = true;
    }

    @Override // s3.a
    public final void t() {
        C0();
        this.X0 = false;
        y yVar = this.L0;
        yVar.O = false;
        if (yVar.n()) {
            r rVar = yVar.f34235t;
            t tVar = rVar.f34160e;
            tVar.f34190k = 0L;
            tVar.f34199t = 0;
            tVar.f34198s = 0;
            tVar.f34191l = 0L;
            tVar.f34204y = -9223372036854775807L;
            tVar.f34205z = -9223372036854775807L;
            if (tVar.f34200u == -9223372036854775807L) {
                tVar.f34188h.a(0);
            }
            tVar.f34202w = tVar.a();
            if (!rVar.f34164j || rVar.c()) {
                rVar.f34156a.pause();
            }
        }
        this.V0 = false;
    }

    @Override // b4.s
    public final boolean w0(j3.o oVar) {
        a1 a1Var = this.f32433e;
        a1Var.getClass();
        if (a1Var.f32449a != 0) {
            int iB0 = B0(oVar);
            if ((iB0 & 512) != 0) {
                a1 a1Var2 = this.f32433e;
                a1Var2.getClass();
                if (a1Var2.f32449a == 2 || (iB0 & 1024) != 0 || (oVar.I == 0 && oVar.J == 0)) {
                    return true;
                }
            }
        }
        return this.L0.h(oVar) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
    @Override // b4.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int x0(b4.k r19, j3.o r20) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.a0.x0(b4.k, j3.o):int");
    }

    @Override // s3.a
    public final i0 h() {
        return this;
    }
}
