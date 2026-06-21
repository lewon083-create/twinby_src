package com.google.android.gms.internal.ads;

import android.net.Uri;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class az extends xy implements em1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicInteger f3485p = new AtomicInteger(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f3486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final cy f3487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.android.gms.ads.identifier.c f3489h;
    public final e2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ByteBuffer f3490j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3491k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f3492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f3493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f3494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f3495o;

    public az(sz szVar, cy cyVar) {
        super(szVar);
        this.f3487f = cyVar;
        this.f3489h = new com.google.android.gms.ads.identifier.c(4);
        this.i = new e2();
        this.f3492l = new Object();
        String strQ = szVar.q();
        this.f3493m = (String) (strQ == null ? a31.f2740b : new j31(strQ)).a();
        this.f3494n = szVar.s();
        f3485p.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final void a() {
        f3485p.decrementAndGet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean] */
    @Override // com.google.android.gms.internal.ads.xy
    public final boolean b(String str) {
        String str2;
        String str3;
        long jCurrentTimeMillis;
        long jLongValue;
        long jLongValue2;
        byte[] bArr;
        long j10;
        g91 g91Var;
        g91 g91Var2;
        long j11;
        String str4 = str;
        this.f3486e = str4;
        String str5 = "error";
        String strConcat = "cache:".concat(String.valueOf(u9.d.d(str4, "MD5")));
        try {
            n90 n90Var = new n90(23);
            String str6 = this.f12372c;
            cy cyVar = this.f3487f;
            me1 me1Var = new me1(str6, cyVar.f4374d, cyVar.f4375e, true, n90Var);
            me1Var.H(this);
            boolean z5 = cyVar.i;
            g91 kyVar = me1Var;
            if (z5) {
                kyVar = new ky(this.f12371b, me1Var, this.f3493m, this.f3494n);
            }
            kyVar.k(new db1(Uri.parse(str4), 0L, -1L));
            sz szVar = (sz) this.f12373d.get();
            if (szVar != null) {
                szVar.V0(strConcat, this);
            }
            p9.k.C.f31304k.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
            wk wkVar = al.Z;
            q9.s sVar = q9.s.f31967e;
            jLongValue = ((Long) sVar.f31970c.a(wkVar)).longValue();
            jLongValue2 = ((Long) sVar.f31970c.a(al.Y)).longValue();
            this.f3490j = ByteBuffer.allocate(cyVar.f4373c);
            bArr = new byte[8192];
            j10 = jCurrentTimeMillis;
            g91Var = kyVar;
        } catch (Exception e3) {
            e = e3;
        }
        while (true) {
            try {
                int iC = g91Var.C(bArr, 0, Math.min(this.f3490j.remaining(), 8192));
                if (iC == -1) {
                    this.f3495o = true;
                    str4 = str;
                    u9.d.f34372b.post(new vy(this, str4, strConcat, (int) this.i.c(this.f3490j)));
                    return true;
                }
                str4 = str;
                str2 = str5;
                try {
                    synchronized (this.f3492l) {
                        g91Var2 = g91Var;
                        try {
                            if (this.f3488g) {
                                j11 = jCurrentTimeMillis;
                            } else {
                                j11 = jCurrentTimeMillis;
                                this.f3490j.put(bArr, 0, iC);
                            }
                        } finally {
                        }
                    }
                    if (this.f3490j.remaining() <= 0) {
                        o();
                        return true;
                    }
                    str3 = this.f3488g;
                    try {
                        if (str3 != 0) {
                            int iLimit = this.f3490j.limit();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(iLimit).length() + 24);
                            sb2.append("Precache abort at ");
                            sb2.append(iLimit);
                            sb2.append(" bytes");
                            throw new IOException(sb2.toString());
                        }
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        if (jCurrentTimeMillis2 - j10 >= jLongValue) {
                            o();
                            j10 = jCurrentTimeMillis2;
                        }
                        if (jCurrentTimeMillis2 - j11 > 1000 * jLongValue2) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(jLongValue2).length() + 29);
                            sb3.append("Timeout exceeded. Limit: ");
                            sb3.append(jLongValue2);
                            sb3.append(" sec");
                            throw new IOException(sb3.toString());
                        }
                        str5 = str2;
                        g91Var = g91Var2;
                        jCurrentTimeMillis = j11;
                    } catch (Exception e7) {
                        e = e7;
                    }
                } catch (Exception e10) {
                    e = e10;
                    str3 = str2;
                }
            } catch (Exception e11) {
                e = e11;
                str4 = str;
                str2 = str5;
            }
            str3 = str2;
            String canonicalName = e.getClass().getCanonicalName();
            String message = e.getMessage();
            String strG = t.z.g(new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length()), canonicalName, StringUtils.PROCESS_POSTFIX_DELIMITER, message);
            StringBuilder sb4 = new StringBuilder(strG.length() + String.valueOf(str4).length() + 34);
            sb4.append("Failed to preload url ");
            sb4.append(str4);
            sb4.append(" Exception: ");
            sb4.append(strG);
            u9.i.h(sb4.toString());
            l(str4, strConcat, str3, strG);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.em1
    public final void d(h41 h41Var, db1 db1Var, boolean z5) {
        if (h41Var instanceof me1) {
            ((ArrayList) this.f3489h.f2535d).add((me1) h41Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final void k() {
        this.f3488g = true;
    }

    public final void o() {
        com.google.android.gms.ads.identifier.c cVar = this.f3489h;
        Iterator it = ((ArrayList) cVar.f2535d).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((me1) it.next()).d().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        cVar.f2534c = Math.max(cVar.f2534c, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        int i = (int) cVar.f2534c;
        int iC = (int) this.i.c(this.f3490j);
        int iPosition = this.f3490j.position();
        int iRound = Math.round((iPosition / i) * iC);
        int i10 = jz.f7008v.get();
        int i11 = jz.f7009w.get();
        String str = this.f3486e;
        u9.d.f34372b.post(new ty(this, str, "cache:".concat(String.valueOf(u9.d.d(str, "MD5"))), iPosition, i, iRound, iC, iRound > 0, i10, i11));
    }

    @Override // com.google.android.gms.internal.ads.em1
    public final void m(db1 db1Var, boolean z5) {
    }

    @Override // com.google.android.gms.internal.ads.em1
    public final void g(db1 db1Var, boolean z5, int i) {
    }
}
