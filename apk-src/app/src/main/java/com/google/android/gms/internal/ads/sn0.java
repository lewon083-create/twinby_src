package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f10350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f10351g;

    public sn0(Context context, gx gxVar, Set set, as0 as0Var, sd0 sd0Var) {
        this.f10346b = 0L;
        this.f10345a = 0;
        this.f10347c = context;
        this.f10349e = gxVar;
        this.f10348d = set;
        this.f10350f = as0Var;
        this.f10351g = sd0Var;
    }

    public static m6 c(m6 m6Var, long j10, ByteBuffer byteBuffer, int i) {
        while (j10 >= m6Var.f7789c) {
            m6Var = (m6) m6Var.f7791e;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (m6Var.f7789c - j10));
            m4.a aVar = (m4.a) m6Var.f7790d;
            byteBuffer.put(aVar.f28620a, ((int) (j10 - m6Var.f7788b)) + aVar.f28621b, iMin);
            i -= iMin;
            j10 += (long) iMin;
            if (j10 == m6Var.f7789c) {
                m6Var = (m6) m6Var.f7791e;
            }
        }
        return m6Var;
    }

    public static m6 d(m6 m6Var, long j10, byte[] bArr, int i) {
        while (j10 >= m6Var.f7789c) {
            m6Var = (m6) m6Var.f7791e;
        }
        int i10 = i;
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (m6Var.f7789c - j10));
            m4.a aVar = (m4.a) m6Var.f7790d;
            System.arraycopy(aVar.f28620a, ((int) (j10 - m6Var.f7788b)) + aVar.f28621b, bArr, i - i10, iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == m6Var.f7789c) {
                m6Var = (m6) m6Var.f7791e;
            }
        }
        return m6Var;
    }

    public static m6 e(m6 m6Var, r3.e eVar, a4.g gVar, m3.p pVar) {
        if (eVar.c(1073741824)) {
            long j10 = gVar.f430c;
            int iG = 1;
            pVar.J(1);
            m6 m6VarD = d(m6Var, j10, pVar.f28589a, 1);
            long j11 = j10 + 1;
            byte b2 = pVar.f28589a[0];
            boolean z5 = (b2 & 128) != 0;
            int i = b2 & 127;
            cp1 cp1Var = eVar.f32191e;
            byte[] bArr = cp1Var.f4279a;
            if (bArr == null) {
                cp1Var.f4279a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            m6Var = d(m6VarD, j11, cp1Var.f4279a, i);
            long j12 = j11 + ((long) i);
            if (z5) {
                pVar.J(2);
                m6Var = d(m6Var, j12, pVar.f28589a, 2);
                j12 += 2;
                iG = pVar.G();
            }
            int[] iArr = cp1Var.f4282d;
            if (iArr == null || iArr.length < iG) {
                iArr = new int[iG];
            }
            int[] iArr2 = cp1Var.f4283e;
            if (iArr2 == null || iArr2.length < iG) {
                iArr2 = new int[iG];
            }
            if (z5) {
                int i10 = iG * 6;
                pVar.J(i10);
                m6Var = d(m6Var, j12, pVar.f28589a, i10);
                j12 += (long) i10;
                pVar.M(0);
                for (int i11 = 0; i11 < iG; i11++) {
                    iArr[i11] = pVar.G();
                    iArr2[i11] = pVar.D();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = gVar.f431d - ((int) (j12 - gVar.f430c));
            }
            q4.z zVar = (q4.z) gVar.f432e;
            String str = m3.z.f28608a;
            byte[] bArr2 = zVar.f31776b;
            byte[] bArr3 = cp1Var.f4279a;
            int i12 = zVar.f31775a;
            int i13 = zVar.f31777c;
            int i14 = zVar.f31778d;
            cp1Var.f4284f = iG;
            cp1Var.f4282d = iArr;
            cp1Var.f4283e = iArr2;
            cp1Var.f4280b = bArr2;
            cp1Var.f4279a = bArr3;
            cp1Var.f4281c = i12;
            cp1Var.f4285g = i13;
            cp1Var.f4286h = i14;
            MediaCodec.CryptoInfo cryptoInfo = cp1Var.i;
            cryptoInfo.numSubSamples = iG;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i12;
            r3.b bVar = (r3.b) cp1Var.f4287j;
            bVar.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) bVar.f32189d;
            pattern.set(i13, i14);
            ((MediaCodec.CryptoInfo) bVar.f32188c).setPattern(pattern);
            long j13 = gVar.f430c;
            int i15 = (int) (j12 - j13);
            gVar.f430c = j13 + ((long) i15);
            gVar.f431d -= i15;
        }
        if (!eVar.c(268435456)) {
            eVar.t(gVar.f431d);
            return c(m6Var, gVar.f430c, eVar.f32192f, gVar.f431d);
        }
        pVar.J(4);
        m6 m6VarD2 = d(m6Var, gVar.f430c, pVar.f28589a, 4);
        int iD = pVar.D();
        gVar.f430c += 4;
        gVar.f431d -= 4;
        eVar.t(iD);
        m6 m6VarC = c(m6VarD2, gVar.f430c, eVar.f32192f, iD);
        gVar.f430c += (long) iD;
        int i16 = gVar.f431d - iD;
        gVar.f431d = i16;
        ByteBuffer byteBuffer = eVar.i;
        if (byteBuffer == null || byteBuffer.capacity() < i16) {
            eVar.i = ByteBuffer.allocate(i16);
        } else {
            eVar.i.clear();
        }
        return c(m6VarC, gVar.f430c, eVar.i, gVar.f431d);
    }

    public void a(long j10) {
        m6 m6Var;
        if (j10 == -1) {
            return;
        }
        while (true) {
            m6Var = (m6) this.f10349e;
            if (j10 < m6Var.f7789c) {
                break;
            }
            bb.e eVar = (bb.e) this.f10347c;
            m4.a aVar = (m4.a) m6Var.f7790d;
            synchronized (eVar) {
                m4.f fVar = ((s3.f) eVar.f2021e).f32528c;
                synchronized (fVar) {
                    m4.a[] aVarArr = fVar.f28636f;
                    int i = fVar.f28635e;
                    fVar.f28635e = i + 1;
                    aVarArr[i] = aVar;
                    fVar.f28634d--;
                    fVar.notifyAll();
                }
                eVar.C(aVar);
            }
            m6 m6Var2 = (m6) this.f10349e;
            m6Var2.f7790d = null;
            m6 m6Var3 = (m6) m6Var2.f7791e;
            m6Var2.f7791e = null;
            this.f10349e = m6Var3;
        }
        if (((m6) this.f10350f).f7788b < m6Var.f7788b) {
            this.f10350f = m6Var;
        }
    }

    public int b(int i) {
        m4.a aVarA;
        m6 m6Var = (m6) this.f10351g;
        if (((m4.a) m6Var.f7790d) == null) {
            bb.e eVar = (bb.e) this.f10347c;
            synchronized (eVar) {
                aVarA = ((s3.f) eVar.f2021e).f32528c.a();
                ((HashMap) eVar.f2019c).put(aVarA, (t3.j) eVar.f2020d);
                s3.e eVar2 = (s3.e) ((s3.f) eVar.f2021e).f32540p.get((t3.j) eVar.f2020d);
                if (eVar2 != null) {
                    synchronized (eVar2) {
                        eVar2.f32493d++;
                    }
                }
            }
            m6 m6Var2 = new m6(((m6) this.f10351g).f7789c, this.f10345a);
            m6Var.f7790d = aVarA;
            m6Var.f7791e = m6Var2;
        }
        return Math.min(i, (int) (((m6) this.f10351g).f7789c - this.f10346b));
    }

    public e81 f(final Object obj, final Bundle bundle, final boolean z5) {
        xr0 xr0VarK = xr0.k((Context) this.f10347c, 8);
        xr0VarK.h();
        Set<pn0> set = (Set) this.f10348d;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        wk wkVar = al.Vc;
        q9.s sVar = q9.s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        if (!((String) ykVar.a(wkVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) ykVar2.a(wkVar)).split(StringUtils.COMMA));
        }
        List list = arrayList2;
        p9.k kVar = p9.k.C;
        kVar.f31304k.getClass();
        this.f10346b = SystemClock.elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) ykVar2.a(al.B2)).booleanValue() && bundle != null) {
            kVar.f31304k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (obj instanceof w50) {
                bundle.putLong("client-signals-start", jCurrentTimeMillis);
            } else {
                bundle.putLong("gms-signals-start", jCurrentTimeMillis);
            }
        }
        for (pn0 pn0Var : set) {
            if (!list.contains(String.valueOf(pn0Var.j()))) {
                p9.k.C.f31304k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ed.d dVarH = pn0Var.h();
                dVarH.a(new vy(this, jElapsedRealtime, pn0Var, bundle2), hx.f6285g);
                arrayList.add(dVarH);
            }
        }
        x41 x41VarV = x41.v(arrayList);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.qn0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    obj2 = obj;
                    if (!zHasNext) {
                        break;
                    }
                    on0 on0Var = (on0) ((ed.d) it.next()).get();
                    if (on0Var != null) {
                        on0Var.a(obj2);
                        if (z5) {
                            on0Var.i(obj2);
                        }
                    }
                }
                if (((Boolean) q9.s.f31967e.f31970c.a(al.B2)).booleanValue() && (bundle3 = bundle) != null) {
                    p9.k.C.f31304k.getClass();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    boolean z10 = obj2 instanceof w50;
                    Bundle bundle4 = bundle2;
                    if (z10) {
                        bundle3.putLong("client-signals-end", jCurrentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                        return obj2;
                    }
                    bundle3.putLong("gms-signals-end", jCurrentTimeMillis2);
                    bundle3.putBundle("gms_sig_latency_key", bundle4);
                }
                return obj2;
            }
        };
        Executor executor = (Executor) this.f10349e;
        e81 e81Var = new e81(x41VarV, true, false);
        e81Var.f4874q = new d81(e81Var, callable, executor);
        e81Var.w();
        if (bs0.a()) {
            fs1.R(e81Var, (as0) this.f10350f, xr0VarK, false);
        }
        return e81Var;
    }

    public sn0(bb.e eVar) {
        int i;
        this.f10347c = eVar;
        synchronized (eVar) {
            i = ((s3.f) eVar.f2021e).f32528c.f28632b;
        }
        this.f10345a = i;
        this.f10348d = new m3.p(32);
        m6 m6Var = new m6(0L, i);
        this.f10349e = m6Var;
        this.f10350f = m6Var;
        this.f10351g = m6Var;
    }
}
