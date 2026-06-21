package yads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hk1 extends ok1 implements bk1 {
    public final Context G0;
    public final cl H0;
    public final jl I0;
    public int J0;
    public boolean K0;
    public nx0 L0;
    public long M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public nn2 Q0;

    public hk1(Context context, ee0 ee0Var, qk1 qk1Var, boolean z5, Handler handler, xn0 xn0Var, zb0 zb0Var) {
        super(1, ee0Var, qk1Var, z5, 44100.0f);
        this.G0 = context.getApplicationContext();
        this.I0 = zb0Var;
        this.H0 = new cl(handler, xn0Var);
        zb0Var.a(new gk1(this));
    }

    @Override // yads.ok1
    public final va0 a(kk1 kk1Var, nx0 nx0Var, nx0 nx0Var2) {
        va0 va0VarA = kk1Var.a(nx0Var, nx0Var2);
        int i = va0VarA.f43979e;
        if (a(nx0Var2, kk1Var) > this.J0) {
            i |= 64;
        }
        int i10 = i;
        return new va0(kk1Var.f40227a, nx0Var, nx0Var2, i10 != 0 ? 0 : va0VarA.f43978d, i10);
    }

    @Override // yads.ok1
    public final void b(sa0 sa0Var) {
        if (!this.N0 || sa0Var.b(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR)) {
            return;
        }
        if (Math.abs(sa0Var.f42866f - this.M0) > 500000) {
            this.M0 = sa0Var.f42866f;
        }
        this.N0 = false;
    }

    @Override // yads.ro
    public final String d() {
        return "MediaCodecAudioRenderer";
    }

    @Override // yads.ok1, yads.ro
    public final boolean f() {
        if (!this.f41586x0) {
            return false;
        }
        zb0 zb0Var = (zb0) this.I0;
        if (!zb0Var.f()) {
            return true;
        }
        if (zb0Var.S) {
            return (zb0Var.f() && zb0Var.i.b(zb0Var.d())) ? false : true;
        }
        return false;
    }

    @Override // yads.ok1, yads.ro
    public final boolean g() {
        zb0 zb0Var = (zb0) this.I0;
        return (zb0Var.f() && zb0Var.i.b(zb0Var.d())) || super.g();
    }

    @Override // yads.bk1
    public final ge2 getPlaybackParameters() {
        zb0 zb0Var = (zb0) this.I0;
        return zb0Var.f45322k ? zb0Var.f45336y : zb0Var.c().f43617a;
    }

    @Override // yads.ro
    public final void h() {
        this.P0 = true;
        try {
            ((zb0) this.I0).b();
            try {
                this.B = null;
                this.C0 = -9223372036854775807L;
                this.D0 = -9223372036854775807L;
                this.E0 = 0;
                p();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                this.B = null;
                this.C0 = -9223372036854775807L;
                this.D0 = -9223372036854775807L;
                this.E0 = 0;
                p();
                throw th2;
            } finally {
            }
        }
    }

    @Override // yads.ro, yads.cf2
    public final void handleMessage(int i, Object obj) {
        if (i == 2) {
            jl jlVar = this.I0;
            float fFloatValue = ((Float) obj).floatValue();
            zb0 zb0Var = (zb0) jlVar;
            if (zb0Var.J != fFloatValue) {
                zb0Var.J = fFloatValue;
                zb0Var.k();
                return;
            }
            return;
        }
        if (i == 3) {
            pk pkVar = (pk) obj;
            zb0 zb0Var2 = (zb0) this.I0;
            if (zb0Var2.f45333v.equals(pkVar)) {
                return;
            }
            zb0Var2.f45333v = pkVar;
            if (zb0Var2.Y) {
                return;
            }
            zb0Var2.b();
            return;
        }
        if (i == 6) {
            ((zb0) this.I0).a((ql) obj);
            return;
        }
        switch (i) {
            case 9:
                jl jlVar2 = this.I0;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                zb0 zb0Var3 = (zb0) jlVar2;
                ge2 ge2Var = zb0Var3.c().f43617a;
                ub0 ub0VarC = zb0Var3.c();
                if (!ge2Var.equals(ub0VarC.f43617a) || zBooleanValue != ub0VarC.f43618b) {
                    ub0 ub0Var = new ub0(ge2Var, zBooleanValue, -9223372036854775807L, -9223372036854775807L);
                    if (!zb0Var3.f()) {
                        zb0Var3.f45335x = ub0Var;
                    } else {
                        zb0Var3.f45334w = ub0Var;
                    }
                }
                break;
            case 10:
                jl jlVar3 = this.I0;
                int iIntValue = ((Integer) obj).intValue();
                zb0 zb0Var4 = (zb0) jlVar3;
                if (zb0Var4.W != iIntValue) {
                    zb0Var4.W = iIntValue;
                    zb0Var4.V = iIntValue != 0;
                    zb0Var4.b();
                }
                break;
            case 11:
                this.Q0 = (nn2) obj;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // yads.ro
    public final void i() {
        try {
            try {
                this.f41565m0 = false;
                this.f41579u.b();
                this.f41577t.b();
                this.f41564l0 = false;
                this.f41563k0 = false;
                u();
            } finally {
                nk0.a(this.E, null);
                this.E = null;
            }
        } finally {
            if (this.P0) {
                this.P0 = false;
                zb0 zb0Var = (zb0) this.I0;
                zb0Var.b();
                for (bl blVar : zb0Var.f45318f) {
                    blVar.reset();
                }
                for (bl blVar2 : zb0Var.f45319g) {
                    blVar2.reset();
                }
                zb0Var.U = false;
                zb0Var.f45312a0 = false;
            }
        }
    }

    @Override // yads.ro
    public final void j() {
        ((zb0) this.I0).h();
    }

    @Override // yads.ro
    public final void k() {
        long jA = ((zb0) this.I0).a(f());
        if (jA != Long.MIN_VALUE) {
            if (!this.O0) {
                jA = Math.max(this.M0, jA);
            }
            this.M0 = jA;
            this.O0 = false;
        }
        ((zb0) this.I0).g();
    }

    @Override // yads.ok1
    public final void s() {
        ((zb0) this.I0).G = true;
    }

    @Override // yads.ok1
    public final void v() throws qn0 {
        try {
            zb0 zb0Var = (zb0) this.I0;
            if (!zb0Var.S && zb0Var.f() && zb0Var.a()) {
                zb0Var.i();
                zb0Var.S = true;
            }
        } catch (il e3) {
            throw a(5002, e3.f39576d, e3, e3.f39575c);
        }
    }

    @Override // yads.ok1
    public final float a(float f10, nx0[] nx0VarArr) {
        int iMax = -1;
        for (nx0 nx0Var : nx0VarArr) {
            int i = nx0Var.A;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // yads.ok1
    public final boolean b(nx0 nx0Var) {
        return ((zb0) this.I0).a(nx0Var) != 0;
    }

    @Override // yads.ok1
    public final ArrayList a(qk1 qk1Var, nx0 nx0Var, boolean z5) {
        return yk1.a(a(qk1Var, nx0Var, z5, this.I0), nx0Var);
    }

    public static r51 a(qk1 qk1Var, nx0 nx0Var, boolean z5, jl jlVar) {
        String str = nx0Var.f41375m;
        if (str == null) {
            o51 o51Var = r51.f42498c;
            return um2.f43723f;
        }
        if (((zb0) jlVar).a(nx0Var) != 0) {
            List listA = yk1.a("audio/raw", false, false);
            kk1 kk1Var = listA.isEmpty() ? null : (kk1) listA.get(0);
            if (kk1Var != null) {
                return r51.a(kk1Var);
            }
        }
        ((zl.u0) qk1Var).getClass();
        List listA2 = yk1.a(str, z5, false);
        String strA = yk1.a(nx0Var);
        if (strA == null) {
            return r51.a((Collection) listA2);
        }
        List listA3 = yk1.a(strA, z5, false);
        o51 o51Var2 = r51.f42498c;
        return new n51().a(listA2).a(listA3).a();
    }

    @Override // yads.ro
    public final bk1 c() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010c  */
    @Override // yads.ok1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.ck1 a(yads.kk1 r14, yads.nx0 r15, android.media.MediaCrypto r16, float r17) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.hk1.a(yads.kk1, yads.nx0, android.media.MediaCrypto, float):yads.ck1");
    }

    @Override // yads.bk1
    public final long a() {
        if (this.f42649g == 2) {
            long jA = ((zb0) this.I0).a(f());
            if (jA != Long.MIN_VALUE) {
                if (!this.O0) {
                    jA = Math.max(this.M0, jA);
                }
                this.M0 = jA;
                this.O0 = false;
            }
        }
        return this.M0;
    }

    @Override // yads.ok1
    public final void a(Exception exc) {
        kh1.b("MediaCodecAudioRenderer", kh1.a("Audio codec error", exc));
        this.H0.a(exc);
    }

    @Override // yads.ok1
    public final void a(String str, long j10, long j11) {
        this.H0.a(str, j10, j11);
    }

    @Override // yads.ok1
    public final void a(String str) {
        this.H0.a(str);
    }

    @Override // yads.ro
    public final void a(boolean z5) {
        pa0 pa0Var = new pa0();
        this.B0 = pa0Var;
        this.H0.b(pa0Var);
        on2 on2Var = this.f42646d;
        on2Var.getClass();
        if (on2Var.f41657a) {
            zb0 zb0Var = (zb0) this.I0;
            zb0Var.getClass();
            if (lb3.f40466a >= 21) {
                if (zb0Var.V) {
                    if (!zb0Var.Y) {
                        zb0Var.Y = true;
                        zb0Var.b();
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            zb0 zb0Var2 = (zb0) this.I0;
            if (zb0Var2.Y) {
                zb0Var2.Y = false;
                zb0Var2.b();
            }
        }
        jl jlVar = this.I0;
        af2 af2Var = this.f42648f;
        af2Var.getClass();
        ((zb0) jlVar).f45328q = af2Var;
    }

    @Override // yads.ok1
    public final va0 a(ox0 ox0Var) {
        va0 va0VarA = super.a(ox0Var);
        this.H0.a(ox0Var.f41759b, va0VarA);
        return va0VarA;
    }

    @Override // yads.ok1
    public final void a(nx0 nx0Var, MediaFormat mediaFormat) throws qn0 {
        int iB;
        int i;
        nx0 nx0Var2 = this.L0;
        int[] iArr = null;
        if (nx0Var2 != null) {
            nx0Var = nx0Var2;
        } else if (this.K != null) {
            if ("audio/raw".equals(nx0Var.f41375m)) {
                iB = nx0Var.B;
            } else if (lb3.f40466a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                iB = mediaFormat.getInteger("pcm-encoding");
            } else {
                iB = mediaFormat.containsKey("v-bits-per-sample") ? lb3.b(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            }
            mx0 mx0Var = new mx0();
            mx0Var.f41075k = "audio/raw";
            mx0Var.f41090z = iB;
            mx0Var.A = nx0Var.C;
            mx0Var.B = nx0Var.D;
            mx0Var.f41088x = mediaFormat.getInteger("channel-count");
            mx0Var.f41089y = mediaFormat.getInteger("sample-rate");
            nx0 nx0Var3 = new nx0(mx0Var);
            if (this.K0 && nx0Var3.f41388z == 6 && (i = nx0Var.f41388z) < 6) {
                iArr = new int[i];
                for (int i10 = 0; i10 < nx0Var.f41388z; i10++) {
                    iArr[i10] = i10;
                }
            }
            nx0Var = nx0Var3;
        }
        try {
            ((zb0) this.I0).a(nx0Var, iArr);
        } catch (el e3) {
            throw a(5001, e3.f38161b, (Exception) e3, false);
        }
    }

    @Override // yads.ok1, yads.ro
    public final void a(long j10, boolean z5) {
        super.a(j10, z5);
        ((zb0) this.I0).b();
        this.M0 = j10;
        this.N0 = true;
        this.O0 = true;
    }

    @Override // yads.ok1
    public final boolean a(long j10, long j11, fk1 fk1Var, ByteBuffer byteBuffer, int i, int i10, int i11, long j12, boolean z5, boolean z10, nx0 nx0Var) throws qn0 {
        byteBuffer.getClass();
        if (this.L0 != null && (i10 & 2) != 0) {
            fk1Var.getClass();
            fk1Var.a(false, i);
            return true;
        }
        if (z5) {
            if (fk1Var != null) {
                fk1Var.a(false, i);
            }
            this.B0.f41856f += i11;
            ((zb0) this.I0).G = true;
            return true;
        }
        try {
            if (!((zb0) this.I0).a(byteBuffer, j12, i11)) {
                return false;
            }
            if (fk1Var != null) {
                fk1Var.a(false, i);
            }
            this.B0.f41855e += i11;
            return true;
        } catch (fl e3) {
            throw a(5001, e3.f38474d, e3, e3.f38473c);
        } catch (il e7) {
            throw a(5002, nx0Var, e7, e7.f39575c);
        }
    }

    @Override // yads.bk1
    public final void a(ge2 ge2Var) {
        zb0 zb0Var = (zb0) this.I0;
        zb0Var.getClass();
        float f10 = ge2Var.f38745b;
        int i = lb3.f40466a;
        ge2 ge2Var2 = new ge2(Math.max(0.1f, Math.min(f10, 8.0f)), Math.max(0.1f, Math.min(ge2Var.f38746c, 8.0f)));
        if (zb0Var.f45322k && lb3.f40466a >= 23) {
            zb0Var.a(ge2Var2);
            return;
        }
        boolean z5 = zb0Var.c().f43618b;
        ub0 ub0VarC = zb0Var.c();
        if (ge2Var2.equals(ub0VarC.f43617a) && z5 == ub0VarC.f43618b) {
            return;
        }
        ub0 ub0Var = new ub0(ge2Var2, z5, -9223372036854775807L, -9223372036854775807L);
        if (zb0Var.f()) {
            zb0Var.f45334w = ub0Var;
        } else {
            zb0Var.f45335x = ub0Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if ((r4.isEmpty() ? null : (yads.kk1) r4.get(0)) != null) goto L30;
     */
    @Override // yads.ok1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.qk1 r13, yads.nx0 r14) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.hk1.a(yads.qk1, yads.nx0):int");
    }

    public final int a(nx0 nx0Var, kk1 kk1Var) {
        int i;
        if (!rk2.f42615a.a().equals(kk1Var.f40227a) || (i = lb3.f40466a) >= 24 || (i == 23 && lb3.d(this.G0))) {
            return nx0Var.f41376n;
        }
        return -1;
    }
}
