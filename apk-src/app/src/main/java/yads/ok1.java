package yads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ok1 extends ro {
    public static final byte[] F0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final long[] A;
    public qn0 A0;
    public nx0 B;
    public pa0 B0;
    public nx0 C;
    public long C0;
    public nk0 D;
    public long D0;
    public nk0 E;
    public int E0;
    public MediaCrypto F;
    public boolean G;
    public final long H;
    public float I;
    public float J;
    public fk1 K;
    public nx0 L;
    public MediaFormat M;
    public boolean N;
    public float O;
    public ArrayDeque P;
    public nk1 Q;
    public kk1 R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f41554a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f41555b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f41556c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ir f41557d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public long f41558e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f41559f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f41560g0;
    public ByteBuffer h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f41561i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f41562j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f41563k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f41564l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f41565m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final dk1 f41566n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f41567n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final qk1 f41568o;
    public int o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f41569p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f41570p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f41571q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f41572q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sa0 f41573r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f41574r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sa0 f41575s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f41576s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sa0 f41577t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f41578t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final yo f41579u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public long f41580u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final q63 f41581v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public long f41582v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f41583w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f41584w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final MediaCodec.BufferInfo f41585x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f41586x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long[] f41587y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f41588y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long[] f41589z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f41590z0;

    public ok1(int i, ee0 ee0Var, qk1 qk1Var, boolean z5, float f10) {
        super(i);
        this.f41566n = ee0Var;
        this.f41568o = (qk1) ni.a(qk1Var);
        this.f41569p = z5;
        this.f41571q = f10;
        this.f41573r = sa0.d();
        this.f41575s = new sa0(0);
        this.f41577t = new sa0(2);
        yo yoVar = new yo();
        this.f41579u = yoVar;
        this.f41581v = new q63();
        this.f41583w = new ArrayList();
        this.f41585x = new MediaCodec.BufferInfo();
        this.I = 1.0f;
        this.J = 1.0f;
        this.H = -9223372036854775807L;
        this.f41587y = new long[10];
        this.f41589z = new long[10];
        this.A = new long[10];
        this.C0 = -9223372036854775807L;
        this.D0 = -9223372036854775807L;
        yoVar.c(0);
        yoVar.f42864d.order(ByteOrder.nativeOrder());
        this.O = -1.0f;
        this.S = 0;
        this.o0 = 0;
        this.f41559f0 = -1;
        this.f41560g0 = -1;
        this.f41558e0 = -9223372036854775807L;
        this.f41580u0 = -9223372036854775807L;
        this.f41582v0 = -9223372036854775807L;
        this.f41570p0 = 0;
        this.f41572q0 = 0;
    }

    public abstract float a(float f10, nx0[] nx0VarArr);

    public abstract int a(qk1 qk1Var, nx0 nx0Var);

    public abstract ArrayList a(qk1 qk1Var, nx0 nx0Var, boolean z5);

    public abstract ck1 a(kk1 kk1Var, nx0 nx0Var, MediaCrypto mediaCrypto, float f10);

    public abstract va0 a(kk1 kk1Var, nx0 nx0Var, nx0 nx0Var2);

    public abstract void a(Exception exc);

    public abstract void a(String str);

    public abstract void a(String str, long j10, long j11);

    public abstract void a(nx0 nx0Var, MediaFormat mediaFormat);

    public void a(sa0 sa0Var) {
    }

    public abstract boolean a(long j10, long j11, fk1 fk1Var, ByteBuffer byteBuffer, int i, int i10, int i11, long j12, boolean z5, boolean z10, nx0 nx0Var);

    public abstract void b(sa0 sa0Var);

    public boolean b(nx0 nx0Var) {
        return false;
    }

    public final boolean c(long j10, long j11) throws qn0 {
        boolean z5;
        boolean zA;
        int iA;
        boolean z10;
        if (this.f41560g0 < 0) {
            if (this.X && this.f41576s0) {
                try {
                    iA = this.K.a(this.f41585x);
                } catch (IllegalStateException unused) {
                    t();
                    if (this.f41586x0) {
                        u();
                    }
                    return false;
                }
            } else {
                iA = this.K.a(this.f41585x);
            }
            if (iA < 0) {
                if (iA != -2) {
                    if (this.f41556c0 && (this.f41584w0 || this.f41570p0 == 2)) {
                        t();
                    }
                    return false;
                }
                this.f41578t0 = true;
                MediaFormat mediaFormatA = this.K.a();
                if (this.S != 0 && mediaFormatA.getInteger("width") == 32 && mediaFormatA.getInteger("height") == 32) {
                    this.f41555b0 = true;
                } else {
                    if (this.Z) {
                        mediaFormatA.setInteger("channel-count", 1);
                    }
                    this.M = mediaFormatA;
                    this.N = true;
                }
                return true;
            }
            if (this.f41555b0) {
                this.f41555b0 = false;
                this.K.a(false, iA);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f41585x;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                t();
                return false;
            }
            this.f41560g0 = iA;
            ByteBuffer byteBufferB = this.K.b(iA);
            this.h0 = byteBufferB;
            if (byteBufferB != null) {
                byteBufferB.position(this.f41585x.offset);
                ByteBuffer byteBuffer = this.h0;
                MediaCodec.BufferInfo bufferInfo2 = this.f41585x;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.Y) {
                MediaCodec.BufferInfo bufferInfo3 = this.f41585x;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j12 = this.f41580u0;
                    if (j12 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j12;
                    }
                }
            }
            long j13 = this.f41585x.presentationTimeUs;
            int size = this.f41583w.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z10 = false;
                    break;
                }
                if (((Long) this.f41583w.get(i)).longValue() == j13) {
                    this.f41583w.remove(i);
                    z10 = true;
                    break;
                }
                i++;
            }
            this.f41561i0 = z10;
            long j14 = this.f41582v0;
            long j15 = this.f41585x.presentationTimeUs;
            this.f41562j0 = j14 == j15;
            b(j15);
        }
        if (this.X && this.f41576s0) {
            try {
                fk1 fk1Var = this.K;
                ByteBuffer byteBuffer2 = this.h0;
                int i10 = this.f41560g0;
                MediaCodec.BufferInfo bufferInfo4 = this.f41585x;
                z5 = false;
                try {
                    zA = a(j10, j11, fk1Var, byteBuffer2, i10, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f41561i0, this.f41562j0, this.C);
                } catch (IllegalStateException unused2) {
                    t();
                    if (this.f41586x0) {
                        u();
                    }
                    return z5;
                }
            } catch (IllegalStateException unused3) {
                z5 = false;
            }
        } else {
            z5 = false;
            fk1 fk1Var2 = this.K;
            ByteBuffer byteBuffer3 = this.h0;
            int i11 = this.f41560g0;
            MediaCodec.BufferInfo bufferInfo5 = this.f41585x;
            zA = a(j10, j11, fk1Var2, byteBuffer3, i11, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f41561i0, this.f41562j0, this.C);
        }
        if (zA) {
            a(this.f41585x.presentationTimeUs);
            boolean z11 = (this.f41585x.flags & 4) != 0 ? true : z5;
            this.f41560g0 = -1;
            this.h0 = null;
            if (!z11) {
                return true;
            }
            t();
        }
        return z5;
    }

    @Override // yads.ro
    public boolean f() {
        return this.f41586x0;
    }

    @Override // yads.ro
    public boolean g() {
        boolean zIsReady;
        if (this.B == null) {
            return false;
        }
        if (e()) {
            zIsReady = this.f42653l;
        } else {
            ps2 ps2Var = this.f42650h;
            ps2Var.getClass();
            zIsReady = ps2Var.isReady();
        }
        if (zIsReady || this.f41560g0 >= 0) {
            return true;
        }
        return this.f41558e0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f41558e0;
    }

    @Override // yads.ro
    public final int l() {
        return 8;
    }

    public final boolean m() throws qn0 {
        if (this.f41574r0) {
            this.f41570p0 = 1;
            if (this.U || this.W) {
                this.f41572q0 = 3;
                return false;
            }
            this.f41572q0 = 2;
        } else {
            y();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n() throws yads.qn0 {
        /*
            Method dump skipped, instruction units count: 864
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ok1.n():boolean");
    }

    public final void o() {
        try {
            this.K.flush();
        } finally {
            w();
        }
    }

    public final boolean p() {
        if (this.K == null) {
            return false;
        }
        int i = this.f41572q0;
        if (i == 3 || this.U || ((this.V && !this.f41578t0) || (this.W && this.f41576s0))) {
            u();
            return true;
        }
        if (i == 2) {
            int i10 = lb3.f40466a;
            if (i10 < 23) {
                throw new IllegalStateException();
            }
            if (i10 >= 23) {
                try {
                    y();
                } catch (qn0 e3) {
                    kh1.d("MediaCodecRenderer", kh1.a("Failed to update the DRM session, releasing the codec instead.", e3));
                    u();
                    return true;
                }
            }
        }
        o();
        return false;
    }

    public boolean q() {
        return false;
    }

    public final void r() {
        nx0 nx0Var;
        if (this.K != null || this.f41563k0 || (nx0Var = this.B) == null) {
            return;
        }
        if (this.E == null && b(nx0Var)) {
            nx0 nx0Var2 = this.B;
            this.f41565m0 = false;
            this.f41579u.b();
            this.f41577t.b();
            this.f41564l0 = false;
            this.f41563k0 = false;
            String str = nx0Var2.f41375m;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.f41579u.f45133l = 32;
            } else {
                this.f41579u.f45133l = 1;
            }
            this.f41563k0 = true;
            return;
        }
        nk0 nk0Var = this.E;
        nk0.a(this.D, nk0Var);
        this.D = nk0Var;
        String str2 = this.B.f41375m;
        if (nk0Var != null) {
            if (this.F == null) {
                vx0 vx0VarA = a(nk0Var);
                if (vx0VarA != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(vx0VarA.f44219a, vx0VarA.f44220b);
                        this.F = mediaCrypto;
                        this.G = !vx0VarA.f44221c && mediaCrypto.requiresSecureDecoderComponent(str2);
                    } catch (MediaCryptoException e3) {
                        throw a(6006, this.B, e3, false);
                    }
                } else if (this.D.c() == null) {
                    return;
                }
            }
            if (vx0.f44218d) {
                int state = this.D.getState();
                if (state == 1) {
                    mk0 mk0VarC = this.D.c();
                    mk0VarC.getClass();
                    throw a(mk0VarC.f40934b, this.B, (Exception) mk0VarC, false);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            a(this.F, this.G);
        } catch (nk1 e7) {
            throw a(4001, this.B, e7, false);
        }
    }

    public abstract void s();

    public final void t() throws qn0 {
        int i = this.f41572q0;
        if (i == 1) {
            o();
            return;
        }
        if (i == 2) {
            o();
            y();
        } else if (i != 3) {
            this.f41586x0 = true;
            v();
        } else {
            u();
            r();
        }
    }

    public final void u() {
        try {
            fk1 fk1Var = this.K;
            if (fk1Var != null) {
                fk1Var.release();
                this.B0.f41852b++;
                a(this.R.f40227a);
            }
            this.K = null;
            try {
                MediaCrypto mediaCrypto = this.F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.K = null;
            try {
                MediaCrypto mediaCrypto2 = this.F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public void w() {
        this.f41559f0 = -1;
        this.f41575s.f42864d = null;
        this.f41560g0 = -1;
        this.h0 = null;
        this.f41558e0 = -9223372036854775807L;
        this.f41576s0 = false;
        this.f41574r0 = false;
        this.f41554a0 = false;
        this.f41555b0 = false;
        this.f41561i0 = false;
        this.f41562j0 = false;
        this.f41583w.clear();
        this.f41580u0 = -9223372036854775807L;
        this.f41582v0 = -9223372036854775807L;
        ir irVar = this.f41557d0;
        if (irVar != null) {
            irVar.f39617a = 0L;
            irVar.f39618b = 0L;
            irVar.f39619c = false;
        }
        this.f41570p0 = 0;
        this.f41572q0 = 0;
        this.o0 = this.f41567n0 ? 1 : 0;
    }

    public final void x() {
        w();
        this.A0 = null;
        this.f41557d0 = null;
        this.P = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.f41578t0 = false;
        this.O = -1.0f;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f41556c0 = false;
        this.f41567n0 = false;
        this.o0 = 0;
        this.G = false;
    }

    public final void y() throws qn0 {
        try {
            this.F.setMediaDrmSession(a(this.E).f44220b);
            nk0 nk0Var = this.E;
            nk0.a(this.D, nk0Var);
            this.D = nk0Var;
            this.f41570p0 = 0;
            this.f41572q0 = 0;
        } catch (MediaCryptoException e3) {
            throw a(6006, this.B, (Exception) e3, false);
        }
    }

    public boolean a(kk1 kk1Var) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public final boolean b(long j10, long j11) {
        ?? r15;
        if (this.f41586x0) {
            throw new IllegalStateException();
        }
        yo yoVar = this.f41579u;
        int i = yoVar.f45132k;
        if (i > 0) {
            r15 = 0;
            if (!a(j10, j11, null, yoVar.f42864d, this.f41560g0, 0, i, yoVar.f42866f, yoVar.b(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR), this.f41579u.b(4), this.C)) {
                return false;
            }
            a(this.f41579u.f45131j);
            this.f41579u.b();
        } else {
            r15 = 0;
        }
        if (this.f41584w0) {
            this.f41586x0 = true;
            return r15;
        }
        if (this.f41564l0) {
            if (!this.f41579u.a(this.f41577t)) {
                throw new IllegalStateException();
            }
            this.f41564l0 = r15;
        }
        if (this.f41565m0) {
            yo yoVar2 = this.f41579u;
            if (yoVar2.f45132k > 0) {
                return true;
            }
            this.f41565m0 = r15;
            yoVar2.b();
            this.f41577t.b();
            this.f41564l0 = r15;
            this.f41563k0 = r15;
            this.f41565m0 = r15;
            r();
            if (!this.f41563k0) {
                return r15;
            }
        }
        if (this.f41584w0) {
            throw new IllegalStateException();
        }
        ox0 ox0Var = this.f42645c;
        ox0Var.f41758a = null;
        ox0Var.f41759b = null;
        this.f41577t.b();
        while (true) {
            this.f41577t.b();
            int iA = a(ox0Var, this.f41577t, (int) r15);
            if (iA == -5) {
                a(ox0Var);
                break;
            }
            if (iA != -4) {
                if (iA != -3) {
                    throw new IllegalStateException();
                }
            } else {
                if (this.f41577t.b(4)) {
                    this.f41584w0 = true;
                    break;
                }
                if (this.f41588y0) {
                    nx0 nx0Var = this.B;
                    nx0Var.getClass();
                    this.C = nx0Var;
                    a(nx0Var, (MediaFormat) null);
                    this.f41588y0 = r15;
                }
                this.f41577t.c();
                if (!this.f41579u.a(this.f41577t)) {
                    this.f41564l0 = true;
                    break;
                }
            }
        }
        yo yoVar3 = this.f41579u;
        if (yoVar3.f45132k > 0) {
            yoVar3.c();
        }
        if (this.f41579u.f45132k > 0 || this.f41584w0 || this.f41565m0) {
            return true;
        }
        return r15;
    }

    public final vx0 a(nk0 nk0Var) throws qn0 {
        k20 k20VarD = nk0Var.d();
        if (k20VarD != null && !(k20VarD instanceof vx0)) {
            throw a(6001, this.B, (Exception) new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + k20VarD), false);
        }
        return (vx0) k20VarD;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.kk1 r18, android.media.MediaCrypto r19) {
        /*
            Method dump skipped, instruction units count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ok1.a(yads.kk1, android.media.MediaCrypto):void");
    }

    public void v() {
    }

    public final boolean c(int i) throws qn0 {
        ox0 ox0Var = this.f42645c;
        ox0Var.f41758a = null;
        ox0Var.f41759b = null;
        this.f41573r.b();
        int iA = a(ox0Var, this.f41573r, i | 4);
        if (iA == -5) {
            a(ox0Var);
            return true;
        }
        if (iA != -4 || !this.f41573r.b(4)) {
            return false;
        }
        this.f41584w0 = true;
        t();
        return false;
    }

    public final boolean c(nx0 nx0Var) {
        if (lb3.f40466a >= 23 && this.K != null && this.f41572q0 != 3 && this.f42649g != 0) {
            float f10 = this.J;
            nx0[] nx0VarArr = this.i;
            nx0VarArr.getClass();
            float fA = a(f10, nx0VarArr);
            float f11 = this.O;
            if (f11 == fA) {
                return true;
            }
            if (fA == -1.0f) {
                if (this.f41574r0) {
                    this.f41570p0 = 1;
                    this.f41572q0 = 3;
                    return false;
                }
                u();
                r();
                return false;
            }
            if (f11 == -1.0f && fA <= this.f41571q) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fA);
            this.K.a(bundle);
            this.O = fA;
        }
        return true;
    }

    public final List b(boolean z5) {
        ArrayList arrayListA = a(this.f41568o, this.B, z5);
        if (!arrayListA.isEmpty() || !z5) {
            return arrayListA;
        }
        ArrayList arrayListA2 = a(this.f41568o, this.B, false);
        if (!arrayListA2.isEmpty()) {
            kh1.d("MediaCodecRenderer", "Drm session requires secure decoder for " + this.B.f41375m + ", but no secure decoder available. Trying to proceed with " + arrayListA2 + ".");
        }
        return arrayListA2;
    }

    public final void b(long j10) {
        Object objA;
        q63 q63Var = this.f41581v;
        synchronized (q63Var) {
            objA = q63Var.a(j10, true);
        }
        nx0 nx0Var = (nx0) objA;
        if (nx0Var == null && this.N) {
            nx0Var = (nx0) this.f41581v.c();
        }
        if (nx0Var != null) {
            this.C = nx0Var;
        } else if (!this.N || this.C == null) {
            return;
        }
        a(this.C, this.M);
        this.N = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0051 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.media.MediaCrypto r20, boolean r21) throws yads.nk1 {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ok1.a(android.media.MediaCrypto, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if (r12 != false) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public yads.va0 a(yads.ox0 r12) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ok1.a(yads.ox0):yads.va0");
    }

    @Override // yads.ro
    public void a(long j10, boolean z5) {
        int i;
        this.f41584w0 = false;
        this.f41586x0 = false;
        this.f41590z0 = false;
        if (this.f41563k0) {
            this.f41579u.b();
            this.f41577t.b();
            this.f41564l0 = false;
        } else if (p()) {
            r();
        }
        q63 q63Var = this.f41581v;
        synchronized (q63Var) {
            i = q63Var.f42201d;
        }
        if (i > 0) {
            this.f41588y0 = true;
        }
        this.f41581v.a();
        int i10 = this.E0;
        if (i10 != 0) {
            int i11 = i10 - 1;
            this.D0 = this.f41589z[i11];
            this.C0 = this.f41587y[i11];
            this.E0 = 0;
        }
    }

    public void a(long j10) {
        while (true) {
            int i = this.E0;
            if (i == 0 || j10 < this.A[0]) {
                return;
            }
            long[] jArr = this.f41587y;
            this.C0 = jArr[0];
            this.D0 = this.f41589z[0];
            int i10 = i - 1;
            this.E0 = i10;
            System.arraycopy(jArr, 1, jArr, 0, i10);
            long[] jArr2 = this.f41589z;
            System.arraycopy(jArr2, 1, jArr2, 0, this.E0);
            long[] jArr3 = this.A;
            System.arraycopy(jArr3, 1, jArr3, 0, this.E0);
            s();
        }
    }

    @Override // yads.ro
    public final void a(nx0[] nx0VarArr, long j10, long j11) {
        if (this.D0 == -9223372036854775807L) {
            if (this.C0 == -9223372036854775807L) {
                this.C0 = j10;
                this.D0 = j11;
                return;
            }
            throw new IllegalStateException();
        }
        int i = this.E0;
        if (i == this.f41589z.length) {
            kh1.d("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f41589z[this.E0 - 1]);
        } else {
            this.E0 = i + 1;
        }
        long[] jArr = this.f41587y;
        int i10 = this.E0 - 1;
        jArr[i10] = j10;
        this.f41589z[i10] = j11;
        this.A[i10] = this.f41580u0;
    }

    @Override // yads.ro
    public final void a(long j10, long j11) throws qn0 {
        boolean z5 = false;
        if (this.f41590z0) {
            this.f41590z0 = false;
            t();
        }
        qn0 qn0Var = this.A0;
        if (qn0Var == null) {
            try {
                if (this.f41586x0) {
                    v();
                    return;
                }
                if (this.B != null || c(2)) {
                    r();
                    if (this.f41563k0) {
                        g73.a("bypassRender");
                        while (b(j10, j11)) {
                        }
                        g73.a();
                    } else if (this.K != null) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        g73.a("drainAndFeed");
                        while (c(j10, j11) && (this.H == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < this.H)) {
                        }
                        while (n() && (this.H == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < this.H)) {
                        }
                        g73.a();
                    } else {
                        pa0 pa0Var = this.B0;
                        int i = pa0Var.f41854d;
                        ps2 ps2Var = this.f42650h;
                        ps2Var.getClass();
                        pa0Var.f41854d = i + ps2Var.a(j10 - this.f42651j);
                        c(1);
                    }
                    synchronized (this.B0) {
                    }
                    return;
                }
                return;
            } catch (IllegalStateException e3) {
                int i10 = lb3.f40466a;
                if (i10 < 21 || !(e3 instanceof MediaCodec.CodecException)) {
                    StackTraceElement[] stackTrace = e3.getStackTrace();
                    if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                        throw e3;
                    }
                }
                a(e3);
                if (i10 >= 21 && (e3 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e3).isRecoverable()) {
                    z5 = true;
                }
                if (z5) {
                    u();
                }
                throw a(4003, this.B, a(e3, this.R), z5);
            }
        }
        this.A0 = null;
        throw qn0Var;
    }

    @Override // yads.ro
    public void a(float f10, float f11) {
        this.I = f10;
        this.J = f11;
        c(this.L);
    }

    @Override // yads.ro
    public final int a(nx0 nx0Var) throws qn0 {
        try {
            return a(this.f41568o, nx0Var);
        } catch (tk1 e3) {
            throw a(4002, nx0Var, (Exception) e3, false);
        }
    }

    public jk1 a(IllegalStateException illegalStateException, kk1 kk1Var) {
        return new jk1(illegalStateException, kk1Var);
    }
}
