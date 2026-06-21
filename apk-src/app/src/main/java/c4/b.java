package c4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.w6;
import com.google.android.gms.internal.ads.yf0;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.h5;
import i4.c0;
import j3.a0;
import j3.b0;
import j3.o;
import j3.z;
import java.util.ArrayList;
import s3.q;
import s3.t;
import s3.y;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends s3.a implements Handler.Callback {
    public long A;
    public b0 B;
    public long C;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a f2207t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final t f2208u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Handler f2209v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z4.a f2210w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b4 f2211x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f2212y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f2213z;

    public b(t tVar, Looper looper) {
        super(5);
        this.f2208u = tVar;
        this.f2209v = looper == null ? null : new Handler(looper, this);
        this.f2207t = a.f2206a;
        this.f2210w = new z4.a(1);
        this.C = -9223372036854775807L;
    }

    @Override // s3.a
    public final int B(o oVar) {
        if (this.f2207t.b(oVar)) {
            return s3.a.b(oVar.O == 0 ? 4 : 2, 0, 0, 0);
        }
        return s3.a.b(0, 0, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(j3.b0 r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            j3.a0[] r1 = r6.f26216a
            int r2 = r1.length
            if (r0 >= r2) goto L46
            r2 = r1[r0]
            j3.o r2 = r2.a()
            if (r2 == 0) goto L3e
            c4.a r3 = r5.f2207t
            boolean r4 = r3.b(r2)
            if (r4 == 0) goto L3e
            com.google.android.gms.internal.measurement.b4 r2 = r3.a(r2)
            r1 = r1[r0]
            byte[] r1 = r1.c()
            r1.getClass()
            z4.a r3 = r5.f2210w
            r3.r()
            int r4 = r1.length
            r3.t(r4)
            java.nio.ByteBuffer r4 = r3.f32192f
            r4.put(r1)
            r3.u()
            j3.b0 r1 = r2.l(r3)
            if (r1 == 0) goto L43
            r5.E(r1, r7)
            goto L43
        L3e:
            r1 = r1[r0]
            r7.add(r1)
        L43:
            int r0 = r0 + 1
            goto L1
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.b.E(j3.b0, java.util.ArrayList):void");
    }

    public final long F(long j10) {
        h5.r(j10 != -9223372036854775807L);
        h5.r(this.C != -9223372036854775807L);
        return j10 - this.C;
    }

    public final void G(b0 b0Var) {
        t tVar = this.f2208u;
        y yVar = tVar.f32648b;
        z zVar = yVar.f32700i0;
        yf0 yf0Var = yVar.f32708n;
        w6 w6VarA = zVar.a();
        int i = 0;
        while (true) {
            a0[] a0VarArr = b0Var.f26216a;
            if (i >= a0VarArr.length) {
                break;
            }
            a0VarArr[i].b(w6VarA);
            i++;
        }
        yVar.f32700i0 = new z(w6VarA);
        z zVarD = yVar.D();
        if (!zVarD.equals(yVar.R)) {
            yVar.R = zVarD;
            yf0Var.c(14, new q(0, tVar));
        }
        yf0Var.c(28, new q(1, b0Var));
        yf0Var.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        G((b0) message.obj);
        return true;
    }

    @Override // s3.a
    public final String i() {
        return "MetadataRenderer";
    }

    @Override // s3.a
    public final boolean k() {
        return this.f2213z;
    }

    @Override // s3.a
    public final boolean m() {
        return true;
    }

    @Override // s3.a
    public final void n() {
        this.B = null;
        this.f2211x = null;
        this.C = -9223372036854775807L;
    }

    @Override // s3.a
    public final void p(long j10, boolean z5, boolean z10) {
        this.B = null;
        this.f2212y = false;
        this.f2213z = false;
    }

    @Override // s3.a
    public final void u(o[] oVarArr, long j10, long j11, c0 c0Var) {
        this.f2211x = this.f2207t.a(oVarArr[0]);
        b0 b0Var = this.B;
        if (b0Var != null) {
            long j12 = b0Var.f26217b;
            long j13 = (this.C + j12) - j11;
            if (j12 != j13) {
                b0Var = new b0(j13, b0Var.f26216a);
            }
            this.B = b0Var;
        }
        this.C = j11;
    }

    @Override // s3.a
    public final void x(long j10, long j11) {
        boolean z5 = true;
        while (z5) {
            if (!this.f2212y && this.B == null) {
                z4.a aVar = this.f2210w;
                aVar.r();
                r3.b bVar = this.f32432d;
                bVar.r();
                int iW = w(bVar, aVar, 0);
                if (iW == -4) {
                    if (aVar.c(4)) {
                        this.f2212y = true;
                    } else if (aVar.f32194h >= this.f32440m) {
                        aVar.f46190k = this.A;
                        aVar.u();
                        b4 b4Var = this.f2211x;
                        String str = m3.z.f28608a;
                        b0 b0VarL = b4Var.l(aVar);
                        if (b0VarL != null) {
                            ArrayList arrayList = new ArrayList(b0VarL.f26216a.length);
                            E(b0VarL, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.B = new b0(F(aVar.f32194h), (a0[]) arrayList.toArray(new a0[0]));
                            }
                        }
                    }
                } else if (iW == -5) {
                    o oVar = (o) bVar.f32189d;
                    oVar.getClass();
                    this.A = oVar.f26340s;
                }
            }
            b0 b0Var = this.B;
            if (b0Var == null || b0Var.f26217b > F(j10)) {
                z5 = false;
            } else {
                b0 b0Var2 = this.B;
                Handler handler = this.f2209v;
                if (handler != null) {
                    handler.obtainMessage(1, b0Var2).sendToTarget();
                } else {
                    G(b0Var2);
                }
                this.B = null;
                z5 = true;
            }
            if (this.f2212y && this.B == null) {
                this.f2213z = true;
            }
        }
    }
}
