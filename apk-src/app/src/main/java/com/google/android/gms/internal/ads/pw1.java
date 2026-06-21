package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.LoudnessCodecController;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pw1 extends gx1 implements zt1 {
    public final g1 B0;
    public final nw1 C0;
    public final n90 D0;
    public final HashSet E0;
    public int F0;
    public boolean G0;
    public jx1 H0;
    public final us1 I0;
    public us1 J0;
    public jx1 K0;
    public long L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public int P0;
    public boolean Q0;
    public long R0;

    /* JADX WARN: Illegal instructions before constructor call */
    public pw1(Context context, zk zkVar, Handler handler, ht1 ht1Var, nw1 nw1Var) {
        bw1 bw1Var = bw1.f3936f;
        n90 n90Var = Build.VERSION.SDK_INT >= 35 ? new n90(26) : null;
        super(1, zkVar, bw1Var, 44100.0f);
        context.getApplicationContext();
        this.C0 = nw1Var;
        this.D0 = n90Var;
        this.P0 = -1000;
        this.B0 = new g1(handler, ht1Var, 1);
        this.R0 = -9223372036854775807L;
        nw1Var.f8472l = new pp0(13, this);
        this.E0 = new HashSet();
        us1 us1Var = us1.f11057b;
        this.I0 = us1Var;
        this.J0 = us1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    @Override // com.google.android.gms.internal.ads.gx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int K(com.google.android.gms.internal.ads.bw1 r13, com.google.android.gms.internal.ads.jx1 r14) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pw1.K(com.google.android.gms.internal.ads.bw1, com.google.android.gms.internal.ads.jx1):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    @Override // com.google.android.gms.internal.ads.gx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList M(com.google.android.gms.internal.ads.bw1 r4, com.google.android.gms.internal.ads.jx1 r5) {
        /*
            r3 = this;
            java.lang.String r0 = r5.f6975m
            if (r0 != 0) goto L7
            com.google.android.gms.internal.ads.r51 r4 = com.google.android.gms.internal.ads.r51.f9713f
            goto L3c
        L7:
            com.google.android.gms.internal.ads.nw1 r0 = r3.C0
            com.google.android.gms.internal.consent_sdk.c r1 = r0.f8476p
            com.google.android.gms.internal.ads.ov1 r0 = r0.m(r5)
            com.google.android.gms.internal.ads.qv1 r0 = r1.q(r0)
            int r0 = r0.f9610d
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L1d
            r1 = 2
            if (r0 == r1) goto L1d
            goto L38
        L1d:
            java.lang.String r0 = "audio/raw"
            java.util.List r0 = com.google.android.gms.internal.ads.mx1.a(r0, r2, r2)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2b
            r0 = 0
            goto L31
        L2b:
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.ads.dx1 r0 = (com.google.android.gms.internal.ads.dx1) r0
        L31:
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.r51 r4 = com.google.android.gms.internal.ads.x41.q(r0)
            goto L3c
        L38:
            com.google.android.gms.internal.ads.r51 r4 = com.google.android.gms.internal.ads.mx1.b(r4, r5, r2, r2)
        L3c:
            java.util.HashMap r0 = com.google.android.gms.internal.ads.mx1.f8033a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            com.google.android.gms.internal.ads.pp0 r4 = new com.google.android.gms.internal.ads.pp0
            r1 = 14
            r4.<init>(r1, r5)
            com.google.android.gms.internal.ads.kx1 r5 = new com.google.android.gms.internal.ads.kx1
            r5.<init>(r4)
            java.util.Collections.sort(r0, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pw1.M(com.google.android.gms.internal.ads.bw1, com.google.android.gms.internal.ads.jx1):java.util.ArrayList");
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final boolean N(jx1 jx1Var) {
        j();
        nw1 nw1Var = this.C0;
        int i = nw1Var.f8476p.q(nw1Var.m(jx1Var)).f9610d;
        return i == 1 || i == 2;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final z7 O(dx1 dx1Var, jx1 jx1Var, float f10) {
        jx1[] jx1VarArr = this.f5947k;
        jx1VarArr.getClass();
        int length = jx1VarArr.length;
        String str = dx1Var.f4712a;
        "OMX.google.raw.decoder".equals(str);
        int iMax = jx1Var.f6976n;
        if (length != 1) {
            for (jx1 jx1Var2 : jx1VarArr) {
                if (dx1Var.d(jx1Var, jx1Var2).f11891d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    iMax = Math.max(iMax, jx1Var2.f6976n);
                }
            }
        }
        this.F0 = iMax;
        int i = Build.VERSION.SDK_INT;
        this.G0 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = dx1Var.f4714c;
        int i10 = this.F0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i11 = jx1Var.E;
        mediaFormat.setInteger("channel-count", i11);
        int i12 = jx1Var.F;
        mediaFormat.setInteger("sample-rate", i12);
        fs1.i(mediaFormat, jx1Var.f6978p);
        fs1.z(mediaFormat, "max-input-size", i10);
        mediaFormat.setInteger("priority", 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        String str3 = jx1Var.f6975m;
        if ("audio/ac4".equals(str3)) {
            Pair pairB = ea0.b(jx1Var);
            if (pairB != null) {
                fs1.z(mediaFormat, "profile", ((Integer) pairB.first).intValue());
                fs1.z(mediaFormat, "level", ((Integer) pairB.second).intValue());
            }
            if (i <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        ow1 ow1Var = new ow1();
        ow1Var.e("audio/raw");
        ow1Var.D = i11;
        ow1Var.E = i12;
        ow1Var.F = 4;
        jx1 jx1Var3 = new jx1(ow1Var);
        nw1 nw1Var = this.C0;
        int i13 = nw1Var.f8476p.q(nw1Var.m(jx1Var3)).f9610d;
        if (i13 != 1 && i13 == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.P0));
        }
        jx1 jx1Var4 = null;
        if (i >= 29) {
            for (Map.Entry entry : this.I0.f11058a.entrySet()) {
                String str4 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str4, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str4, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str4, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str4, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str4, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str4, (ByteBuffer) value);
                }
            }
        }
        if ("audio/raw".equals(dx1Var.f4713b) && !"audio/raw".equals(str3)) {
            jx1Var4 = jx1Var;
        }
        this.K0 = jx1Var4;
        return new z7(dx1Var, mediaFormat, jx1Var, null, this.D0, 11);
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final ws1 P(dx1 dx1Var, jx1 jx1Var, jx1 jx1Var2) {
        int i;
        int i10;
        ws1 ws1VarD = dx1Var.d(jx1Var, jx1Var2);
        int i11 = ws1VarD.f11892e;
        if (this.H == null && N(jx1Var2)) {
            i11 |= 32768;
        }
        "OMX.google.raw.decoder".equals(dx1Var.f4712a);
        if (jx1Var2.f6976n > this.F0) {
            i11 |= 64;
        }
        String str = dx1Var.f4712a;
        if (i11 != 0) {
            i10 = 0;
            i = i11;
        } else {
            i = 0;
            i10 = ws1VarD.f11891d;
        }
        return new ws1(str, jx1Var, jx1Var2, i10, i);
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final long Q(long j10, long j11) {
        long jU;
        nw1 nw1Var = this.C0;
        boolean z5 = nw1Var.r() && this.R0 != -9223372036854775807L;
        if (this.Q0) {
            if (!nw1Var.k()) {
                jU = -9223372036854775807L;
            } else if (nw1Var.f8474n.c()) {
                jU = cq0.t(((sv1) nw1Var.f8474n.f9941f).f10410b, nw1Var.f8478r.f5109a.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = nw1Var.f8478r.f5109a.getBufferSizeInFrames();
                int iF = rs.F(((sv1) nw1Var.f8474n.f9941f).f10409a);
                ix.k0(iF != -2147483647);
                jU = cq0.u(bufferSizeInFrames, 1000000L, iF, RoundingMode.DOWN);
            }
            if (z5 && jU != -9223372036854775807L) {
                float fMin = Math.min(jU, this.R0 - j10);
                pc pcVar = nw1Var.f8482v;
                float f10 = pcVar != null ? pcVar.f9010a : 1.0f;
                this.f5943h.getClass();
                return Math.max(10000L, ((long) ((fMin / f10) / 2.0f)) - (cq0.s(SystemClock.elapsedRealtime()) - j11));
            }
        } else if (z5 || this.f5961r0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final float R(float f10, jx1 jx1Var, jx1[] jx1VarArr) {
        int iMax = -1;
        for (jx1 jx1Var2 : jx1VarArr) {
            int i = jx1Var2.F;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void S(long j10, long j11, String str) {
        g1 g1Var = this.B0;
        Handler handler = g1Var.f5590a;
        if (handler != null) {
            handler.post(new tv1(g1Var, str, j10, j11));
        }
        if (Build.VERSION.SDK_INT >= 31) {
            HashSet hashSet = this.E0;
            if (hashSet.isEmpty()) {
                return;
            }
            bx1 bx1Var = this.M;
            bx1Var.getClass();
            bx1Var.h(new ArrayList(hashSet));
        }
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void T(String str) {
        g1 g1Var = this.B0;
        Handler handler = g1Var.f5590a;
        if (handler != null) {
            handler.post(new tv1(g1Var, str, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void U(Exception exc) {
        rs.H("MediaCodecAudioRenderer", "Audio codec error", exc);
        g1 g1Var = this.B0;
        Handler handler = g1Var.f5590a;
        if (handler != null) {
            handler.post(new tv1(g1Var, exc, 6));
        }
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final ws1 V(zd1 zd1Var) {
        jx1 jx1Var = (jx1) zd1Var.f12972d;
        jx1Var.getClass();
        this.H0 = jx1Var;
        ws1 ws1VarV = super.V(zd1Var);
        g1 g1Var = this.B0;
        Handler handler = g1Var.f5590a;
        if (handler != null) {
            handler.post(new d1(g1Var, jx1Var, ws1VarV, 14));
        }
        return ws1VarV;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void W(jx1 jx1Var, MediaFormat mediaFormat) throws bt1 {
        int[] iArr = null;
        boolean z5 = true;
        if (Build.VERSION.SDK_INT >= 29 && mediaFormat != null) {
            HashSet<String> hashSet = this.E0;
            if (!hashSet.isEmpty()) {
                us1 us1Var = us1.f11057b;
                HashMap map = new HashMap();
                for (String str : hashSet) {
                    if (mediaFormat.containsKey(str)) {
                        int valueTypeForKey = mediaFormat.getValueTypeForKey(str);
                        if (valueTypeForKey == 1) {
                            map.put(str, Integer.valueOf(mediaFormat.getInteger(str)));
                        } else if (valueTypeForKey == 2) {
                            map.put(str, Long.valueOf(mediaFormat.getLong(str)));
                        } else if (valueTypeForKey == 3) {
                            map.put(str, Float.valueOf(mediaFormat.getFloat(str)));
                        } else if (valueTypeForKey == 4) {
                            map.put(str, mediaFormat.getString(str));
                        } else if (valueTypeForKey == 5) {
                            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                            if (byteBuffer == null) {
                                map.put(str, null);
                            } else {
                                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
                                byteBufferAllocate.put(byteBuffer.duplicate());
                                byteBufferAllocate.flip();
                                map.put(str, byteBufferAllocate);
                            }
                        }
                    }
                }
                us1 us1Var2 = new us1(map);
                if (!us1Var2.equals(this.J0)) {
                    this.J0 = us1Var2;
                    g1 g1Var = this.B0;
                    Handler handler = g1Var.f5590a;
                    if (handler != null) {
                        handler.post(new th0(24, g1Var, us1Var2));
                    }
                }
            }
        }
        jx1 jx1Var2 = this.K0;
        if (jx1Var2 != null) {
            jx1Var = jx1Var2;
        } else if (this.M != null) {
            mediaFormat.getClass();
            int integer = "audio/raw".equals(jx1Var.f6975m) ? jx1Var.G : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? cq0.y(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            ow1 ow1Var = new ow1();
            ow1Var.e("audio/raw");
            ow1Var.F = integer;
            ow1Var.G = jx1Var.H;
            ow1Var.H = jx1Var.I;
            ow1Var.f8830j = jx1Var.f6973k;
            ow1Var.f8822a = jx1Var.f6964a;
            ow1Var.f8823b = jx1Var.f6965b;
            ow1Var.f8824c = x41.v(jx1Var.f6966c);
            ow1Var.f8825d = jx1Var.f6967d;
            ow1Var.f8826e = jx1Var.f6968e;
            ow1Var.f8827f = jx1Var.f6969f;
            ow1Var.D = mediaFormat.getInteger("channel-count");
            ow1Var.E = mediaFormat.getInteger("sample-rate");
            jx1Var = new jx1(ow1Var);
            if (this.G0) {
                int i = jx1Var.E;
                if (i == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                if (this.f5940f0) {
                    j();
                }
                if (i10 < 29) {
                    z5 = false;
                }
                ix.k0(z5);
            }
            this.C0.o(jx1Var, iArr);
        } catch (vv1 e3) {
            throw l(e3, e3.f11499b, false, 5001);
        }
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void X() {
        this.C0.C = true;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final boolean Y(long j10, long j11, bx1 bx1Var, ByteBuffer byteBuffer, int i, int i10, int i11, long j12, boolean z5, boolean z10, jx1 jx1Var) throws bt1 {
        byteBuffer.getClass();
        this.R0 = -9223372036854775807L;
        if (this.K0 != null && (i10 & 2) != 0) {
            bx1Var.getClass();
            bx1Var.E(i);
            return true;
        }
        nw1 nw1Var = this.C0;
        if (z5) {
            if (bx1Var != null) {
                bx1Var.E(i);
            }
            this.f5965t0.f11458g += i11;
            nw1Var.C = true;
            return true;
        }
        try {
            if (!nw1Var.q(j12, byteBuffer, i11)) {
                this.R0 = j12;
                return false;
            }
            if (bx1Var != null) {
                bx1Var.E(i);
            }
            this.f5965t0.f11457f += i11;
            return true;
        } catch (wv1 e3) {
            jx1 jx1Var2 = this.H0;
            if (this.f5940f0) {
                j();
            }
            throw l(e3, jx1Var2, false, 5001);
        } catch (xv1 e7) {
            if (this.f5940f0) {
                j();
            }
            throw l(e7, jx1Var, e7.f12349c, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void Z() throws bt1 {
        try {
            nw1 nw1Var = this.C0;
            if (!nw1Var.J && nw1Var.k() && nw1Var.f()) {
                nw1Var.n();
                nw1Var.J = true;
            }
            long j10 = this.f5967u0.f5499e;
            if (j10 != -9223372036854775807L) {
                this.R0 = j10;
            }
        } catch (xv1 e3) {
            throw l(e3, e3.f12350d, e3.f12349c, true != this.f5940f0 ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void a(long j10, boolean z5, boolean z10) {
        super.a(j10, z5, z10);
        this.C0.a();
        this.L0 = j10;
        this.R0 = -9223372036854775807L;
        this.O0 = false;
        this.M0 = true;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void a0(zq1 zq1Var) {
        jx1 jx1Var;
        if (Build.VERSION.SDK_INT < 29 || (jx1Var = zq1Var.f13077d) == null || !Objects.equals(jx1Var.f6975m, "audio/opus") || !this.f5940f0) {
            return;
        }
        ByteBuffer byteBuffer = zq1Var.i;
        byteBuffer.getClass();
        zq1Var.f13077d.getClass();
        if (byteBuffer.remaining() == 8) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong();
            ew1 ew1Var = this.C0.f8478r;
            if (ew1Var != null) {
                ew1Var.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zt1
    public final void b(pc pcVar) {
        nw1 nw1Var = this.C0;
        nw1Var.getClass();
        float f10 = pcVar.f9010a;
        String str = cq0.f4293a;
        nw1Var.f8482v = new pc(Math.max(0.1f, Math.min(f10, 8.0f)), Math.max(0.1f, Math.min(pcVar.f9011b, 8.0f)));
        lw1 lw1Var = new lw1(pcVar, -9223372036854775807L, -9223372036854775807L);
        if (nw1Var.k()) {
            nw1Var.f8480t = lw1Var;
        } else {
            nw1Var.f8481u = lw1Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    @Override // com.google.android.gms.internal.ads.nu1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pw1.c(int, java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.zt1
    public final pc d() {
        return this.C0.f8482v;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void e() {
        this.C0.p();
        this.Q0 = true;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void f() {
        r0();
        this.Q0 = false;
        nw1 nw1Var = this.C0;
        nw1Var.M = false;
        if (nw1Var.k()) {
            ew1 ew1Var = nw1Var.f8478r;
            fw1 fw1Var = ew1Var.f5112d;
            fw1Var.f5474k = 0L;
            fw1Var.f5483t = 0;
            fw1Var.f5482s = 0;
            fw1Var.f5475l = 0L;
            fw1Var.f5488y = -9223372036854775807L;
            fw1Var.f5489z = -9223372036854775807L;
            if (fw1Var.f5484u == -9223372036854775807L) {
                fw1Var.f5472h.b(0);
            }
            fw1Var.f5486w = fw1Var.d();
            if (!ew1Var.i || ew1Var.b()) {
                ew1Var.f5109a.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void g() {
        g1 g1Var = this.B0;
        this.N0 = true;
        this.H0 = null;
        this.R0 = -9223372036854775807L;
        try {
            try {
                this.C0.a();
                super.g();
                vs1 vs1Var = this.f5965t0;
                g1Var.getClass();
                synchronized (vs1Var) {
                }
                Handler handler = g1Var.f5590a;
                if (handler != null) {
                    handler.post(new th0(25, g1Var, vs1Var));
                }
            } catch (Throwable th2) {
                super.g();
                vs1 vs1Var2 = this.f5965t0;
                g1Var.getClass();
                synchronized (vs1Var2) {
                    Handler handler2 = g1Var.f5590a;
                    if (handler2 != null) {
                        handler2.post(new th0(25, g1Var, vs1Var2));
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            vs1 vs1Var3 = this.f5965t0;
            g1Var.getClass();
            synchronized (vs1Var3) {
                Handler handler3 = g1Var.f5590a;
                if (handler3 != null) {
                    handler3.post(new th0(25, g1Var, vs1Var3));
                }
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void h() {
        nw1 nw1Var = this.C0;
        this.O0 = false;
        this.R0 = -9223372036854775807L;
        try {
            try {
                this.f5940f0 = false;
                b0();
                x();
                if (this.N0) {
                    this.N0 = false;
                    nw1Var.b();
                }
            } finally {
                this.H = null;
            }
        } catch (Throwable th2) {
            if (this.N0) {
                this.N0 = false;
                nw1Var.b();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void i() {
        n90 n90Var;
        com.google.android.gms.internal.consent_sdk.c cVar = this.C0.f8476p;
        yf0 yf0Var = (yf0) cVar.f13339c;
        if (yf0Var != null) {
            yf0Var.k();
        }
        yi0 yi0Var = (yi0) cVar.f13342f;
        if (yi0Var != null && yi0Var.f12622b) {
            yi0Var.i = null;
            Context context = (Context) yi0Var.f12623c;
            nz.c(context).unregisterAudioDeviceCallback((iv1) yi0Var.f12626f);
            context.unregisterReceiver((bj.g) yi0Var.f12627g);
            jv1 jv1Var = (jv1) yi0Var.f12628h;
            if (jv1Var != null) {
                jv1Var.f6945b.unregisterContentObserver(jv1Var);
            }
            yi0Var.f12622b = false;
        }
        if (Build.VERSION.SDK_INT < 35 || (n90Var = this.D0) == null) {
            return;
        }
        ((HashSet) n90Var.f8248c).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) n90Var.f8249d;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // com.google.android.gms.internal.ads.zt1
    public final long k() {
        if (this.i == 2) {
            r0();
        }
        return this.L0;
    }

    @Override // com.google.android.gms.internal.ads.zt1
    public final boolean m() {
        boolean z5 = this.O0;
        this.O0 = false;
        return z5;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final String o() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void p0(boolean z5, boolean z10) {
        vs1 vs1Var = new vs1(0);
        this.f5965t0 = vs1Var;
        g1 g1Var = this.B0;
        Handler handler = g1Var.f5590a;
        if (handler != null) {
            handler.post(new tv1(g1Var, vs1Var, 8));
        }
        j();
        fv1 fv1Var = this.f5941g;
        fv1Var.getClass();
        nw1 nw1Var = this.C0;
        nw1Var.f8471k = fv1Var;
        c6 c6Var = this.f5943h;
        c6Var.getClass();
        nw1Var.f8476p.f13340d = c6Var;
    }

    public final void r0() {
        long j10;
        long jMax;
        ArrayDeque arrayDeque;
        long j11;
        u();
        nw1 nw1Var = this.C0;
        l91 l91Var = nw1Var.W;
        if (!nw1Var.k() || nw1Var.D) {
            j10 = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(nw1Var.f8478r.f5112d.a(), cq0.t(((sv1) nw1Var.f8474n.f9941f).f10410b, nw1Var.l()));
            while (true) {
                arrayDeque = nw1Var.f8468g;
                if (arrayDeque.isEmpty() || jMin < ((lw1) arrayDeque.getFirst()).f7664c) {
                    break;
                } else {
                    nw1Var.f8481u = (lw1) arrayDeque.remove();
                }
            }
            lw1 lw1Var = nw1Var.f8481u;
            long jU = jMin - lw1Var.f7664c;
            long jW = cq0.w(jU, lw1Var.f7662a.f9010a);
            if (arrayDeque.isEmpty()) {
                w30 w30Var = (w30) l91Var.f7467e;
                if (w30Var.l()) {
                    if (w30Var.f11624n >= 1024) {
                        long j12 = w30Var.f11623m;
                        p30 p30Var = w30Var.f11620j;
                        p30Var.getClass();
                        long jH = j12 - ((long) (((s20) p30Var.f8917q).h() * (p30Var.i * p30Var.f8903b)));
                        int i = w30Var.f11619h.f7360a;
                        int i10 = w30Var.f11618g.f7360a;
                        if (i == i10) {
                            jU = cq0.u(jU, jH, w30Var.f11624n, RoundingMode.DOWN);
                            j10 = Long.MIN_VALUE;
                        } else {
                            j10 = Long.MIN_VALUE;
                            jU = cq0.u(jU, jH * ((long) i), w30Var.f11624n * ((long) i10), RoundingMode.DOWN);
                        }
                    } else {
                        j10 = Long.MIN_VALUE;
                        jU = (long) (((double) w30Var.f11614c) * jU);
                    }
                    lw1 lw1Var2 = nw1Var.f8481u;
                    j11 = lw1Var2.f7663b + jU;
                    lw1Var2.f7665d = jU - jW;
                } else {
                    j10 = Long.MIN_VALUE;
                    lw1 lw1Var22 = nw1Var.f8481u;
                    j11 = lw1Var22.f7663b + jU;
                    lw1Var22.f7665d = jU - jW;
                }
            } else {
                j10 = Long.MIN_VALUE;
                lw1 lw1Var3 = nw1Var.f8481u;
                j11 = lw1Var3.f7663b + jW + lw1Var3.f7665d;
            }
            long j13 = ((qw1) l91Var.f7466d).f9613l;
            jMax = cq0.t(((sv1) nw1Var.f8474n.f9941f).f10410b, j13) + j11;
            long j14 = nw1Var.T;
            if (j13 > j14) {
                long jT = cq0.t(((sv1) nw1Var.f8474n.f9941f).f10410b, j13 - j14);
                nw1Var.T = j13;
                nw1Var.U += jT;
                if (nw1Var.V == null) {
                    nw1Var.V = new Handler(Looper.myLooper());
                }
                nw1Var.V.removeCallbacksAndMessages(null);
                nw1Var.V.postDelayed(new kr0(18, nw1Var), 100L);
            }
        }
        if (jMax != j10) {
            if (!this.M0) {
                jMax = Math.max(this.L0, jMax);
            }
            this.L0 = jMax;
            this.M0 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final boolean t() {
        return this.C0.r();
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final boolean u() {
        if (!this.f5961r0) {
            return false;
        }
        nw1 nw1Var = this.C0;
        if (nw1Var.k()) {
            return nw1Var.J && !nw1Var.r();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final zt1 n0() {
        return this;
    }
}
