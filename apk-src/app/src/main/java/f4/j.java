package f4;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.kw0;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import hl.l;
import java.util.Locale;
import m3.p;
import m3.z;
import oa.s;
import pa.n;
import q4.a0;
import q4.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements i, OnCompleteListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f16646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f16647f;

    public j(oa.e eVar, int i, oa.a aVar, long j10, long j11) {
        this.f16646e = eVar;
        this.f16643b = i;
        this.f16647f = aVar;
        this.f16644c = j10;
        this.f16645d = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static pa.g d(oa.p r4, pa.e r5, int r6) {
        /*
            pa.k0 r5 = r5.f31348w
            r0 = 0
            if (r5 != 0) goto L7
            r5 = r0
            goto L9
        L7:
            pa.g r5 = r5.f31394e
        L9:
            if (r5 == 0) goto L35
            boolean r1 = r5.f31355c
            if (r1 == 0) goto L35
            int[] r1 = r5.f31357e
            r2 = 0
            if (r1 != 0) goto L24
            int[] r1 = r5.f31359g
            if (r1 != 0) goto L19
            goto L2b
        L19:
            int r3 = r1.length
            if (r2 >= r3) goto L2b
            r3 = r1[r2]
            if (r3 != r6) goto L21
            goto L35
        L21:
            int r2 = r2 + 1
            goto L19
        L24:
            int r3 = r1.length
            if (r2 >= r3) goto L35
            r3 = r1[r2]
            if (r3 != r6) goto L32
        L2b:
            int r4 = r4.f29880m
            int r6 = r5.f31358f
            if (r4 >= r6) goto L35
            return r5
        L32:
            int r2 = r2 + 1
            goto L24
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.j.d(oa.p, pa.e, int):pa.g");
    }

    @Override // f4.i
    public void a(long j10) {
        this.f16644c = j10;
    }

    @Override // f4.i
    public void b(p pVar, long j10, int i, boolean z5) {
        int iA;
        ((a0) this.f16647f).getClass();
        int i10 = this.f16643b;
        if (i10 != -1 && i != (iA = e4.h.a(i10))) {
            String str = z.f28608a;
            Locale locale = Locale.US;
            m3.b.s("RtpPcmReader", om1.j("Received RTP packet with unexpected sequence number. Expected: ", iA, "; received: ", i, "."));
        }
        long jT = l.t(this.f16645d, ((e4.k) this.f16646e).f16139b, j10, this.f16644c);
        int iA2 = pVar.a();
        ((a0) this.f16647f).d(iA2, pVar);
        ((a0) this.f16647f).f(jT, 1, iA2, 0, null);
        this.f16643b = i;
    }

    @Override // f4.i
    public void c(m mVar, int i) {
        a0 a0VarP = mVar.P(i, 1);
        this.f16647f = a0VarP;
        a0VarP.a(((e4.k) this.f16646e).f16140c);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        long j10;
        long j11;
        oa.e eVar = (oa.e) this.f16646e;
        if (eVar.f()) {
            n nVar = (n) pa.m.b().f31398b;
            if (nVar == null || nVar.f31404c) {
                oa.p pVar = (oa.p) eVar.f29845k.get((oa.a) this.f16647f);
                if (pVar != null) {
                    Object obj = pVar.f29871c;
                    if (obj instanceof pa.e) {
                        pa.e eVar2 = (pa.e) obj;
                        long j12 = this.f16644c;
                        int i14 = 0;
                        boolean z5 = j12 > 0;
                        int i15 = eVar2.f31342q;
                        if (nVar != null) {
                            z5 &= nVar.f31405d;
                            i = nVar.f31406e;
                            i11 = nVar.f31407f;
                            i10 = nVar.f31403b;
                            if (eVar2.f31348w != null && !eVar2.s()) {
                                pa.g gVarD = d(pVar, eVar2, this.f16643b);
                                if (gVarD == null) {
                                    return;
                                }
                                boolean z10 = gVarD.f31356d && j12 > 0;
                                i11 = gVarD.f31358f;
                                z5 = z10;
                            }
                        } else {
                            i = 5000;
                            i10 = 0;
                            i11 = 100;
                        }
                        int i16 = i;
                        int iElapsedRealtime = -1;
                        if (task.isSuccessful()) {
                            i13 = 0;
                        } else if (task.h()) {
                            i14 = -1;
                            i13 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof na.d) {
                                Status status = ((na.d) exception).f29186b;
                                i12 = status.f2633b;
                                ma.b bVar = status.f2636e;
                                if (bVar != null) {
                                    i13 = i12;
                                    i14 = bVar.f28761c;
                                }
                            } else {
                                i12 = 101;
                            }
                            i13 = i12;
                            i14 = -1;
                        }
                        if (z5) {
                            long j13 = this.f16645d;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j13);
                            j11 = jCurrentTimeMillis;
                            j10 = j12;
                        } else {
                            j10 = 0;
                            j11 = 0;
                        }
                        s sVar = new s(new pa.k(this.f16643b, i13, i14, j10, j11, null, null, i15, iElapsedRealtime), i10, i16, i11);
                        kw0 kw0Var = eVar.f29849o;
                        kw0Var.sendMessage(kw0Var.obtainMessage(18, sVar));
                    }
                }
            }
        }
    }

    @Override // f4.i
    public void seek(long j10, long j11) {
        this.f16644c = j10;
        this.f16645d = j11;
    }

    public j(e4.k kVar) {
        this.f16646e = kVar;
        this.f16644c = -9223372036854775807L;
        this.f16645d = 0L;
        this.f16643b = -1;
    }
}
