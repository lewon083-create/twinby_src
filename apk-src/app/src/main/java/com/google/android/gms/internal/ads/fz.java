package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fz extends h41 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f5506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g91 f5507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cf f5508h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5509j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f5510k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InputStream f5511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5512m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Uri f5513n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile li f5514o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f5515p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5516q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5517r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5518s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f5519t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ed.d f5520u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicLong f5521v;

    public fz(Context context, g91 g91Var, String str, int i, em1 em1Var, cf cfVar) {
        super(false);
        this.f5506f = context;
        this.f5507g = g91Var;
        this.f5508h = cfVar;
        this.i = str;
        this.f5509j = i;
        this.f5515p = false;
        this.f5516q = false;
        this.f5517r = false;
        this.f5518s = false;
        this.f5519t = 0L;
        this.f5521v = new AtomicLong(-1L);
        this.f5520u = null;
        this.f5510k = ((Boolean) q9.s.f31967e.f31970c.a(al.f3118n2)).booleanValue();
        H(em1Var);
    }

    @Override // com.google.android.gms.internal.ads.ct1
    public final int C(byte[] bArr, int i, int i10) throws IOException {
        if (!this.f5512m) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.f5511l;
        int iC = inputStream != null ? inputStream.read(bArr, i, i10) : this.f5507g.C(bArr, i, i10);
        if (this.f5510k && this.f5511l == null) {
            return iC;
        }
        c(iC);
        return iC;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void g() throws IOException {
        if (!this.f5512m) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.f5512m = false;
        this.f5513n = null;
        boolean z5 = (this.f5510k && this.f5511l == null) ? false : true;
        InputStream inputStream = this.f5511l;
        if (inputStream != null) {
            ua.b.d(inputStream);
            this.f5511l = null;
        } else {
            this.f5507g.g();
        }
        if (z5) {
            f();
        }
    }

    public final boolean h() {
        if (!this.f5510k) {
            return false;
        }
        wk wkVar = al.f2968d5;
        q9.s sVar = q9.s.f31967e;
        if (!((Boolean) sVar.f31970c.a(wkVar)).booleanValue() || this.f5517r) {
            return ((Boolean) sVar.f31970c.a(al.f2984e5)).booleanValue() && !this.f5518s;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v23, types: [p9.k] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v32, types: [com.google.android.gms.internal.ads.wx] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.g91
    public final long k(db1 db1Var) throws Throwable {
        ii iiVarI;
        boolean z5;
        long j10;
        boolean z10;
        boolean z11;
        long jElapsedRealtime;
        StringBuilder sb2;
        ?? string;
        qi qiVar;
        db1 db1Var2 = db1Var;
        if (this.f5512m) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        ?? r52 = 1;
        this.f5512m = true;
        Uri uri = db1Var2.f4544a;
        this.f5513n = uri;
        boolean z12 = this.f5510k;
        if (!z12) {
            b(db1Var);
        }
        this.f5514o = li.a(uri);
        wk wkVar = al.f2921a5;
        q9.s sVar = q9.s.f31967e;
        if (!((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            if (this.f5514o != null) {
                this.f5514o.i = db1Var2.f4546c;
                li liVar = this.f5514o;
                String str = this.i;
                liVar.f7531j = str != null ? str : "";
                this.f5514o.f7532k = this.f5509j;
                iiVarI = p9.k.C.f31303j.i(this.f5514o);
            } else {
                iiVarI = null;
            }
            if (iiVarI != null && iiVarI.c()) {
                synchronized (iiVarI) {
                    z5 = iiVarI.f6496c;
                }
                this.f5515p = z5;
                this.f5517r = iiVarI.g();
                this.f5518s = iiVarI.f();
                synchronized (iiVarI) {
                    j10 = iiVarI.f6498e;
                }
                this.f5519t = j10;
                this.f5516q = true;
                if (!h()) {
                    this.f5511l = iiVarI.e();
                    if (this.f5510k) {
                        b(db1Var);
                    }
                    return -1L;
                }
            }
        } else if (this.f5514o != null) {
            this.f5514o.i = db1Var2.f4546c;
            li liVar2 = this.f5514o;
            String str2 = this.i;
            liVar2.f7531j = str2 != null ? str2 : "";
            this.f5514o.f7532k = this.f5509j;
            long jLongValue = (this.f5514o.f7530h ? (Long) sVar.f31970c.a(al.f2954c5) : (Long) sVar.f31970c.a(al.f2937b5)).longValue();
            ?? string2 = p9.k.C;
            string2.f31304k.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            ni niVarO = c6.o(this.f5506f, this.f5514o);
            try {
                try {
                    qiVar = (qi) niVarO.f6961b.get(jLongValue, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                    z11 = false;
                } catch (ExecutionException | TimeoutException unused2) {
                    z10 = false;
                } catch (Throwable th2) {
                    th = th2;
                    r52 = 0;
                }
                try {
                    this.f5515p = qiVar.f9504b;
                    this.f5517r = qiVar.f9505c;
                    this.f5518s = qiVar.f9507e;
                    this.f5519t = qiVar.f9506d;
                    if (!h()) {
                        this.f5511l = qiVar.f9503a;
                        if (z12) {
                            b(db1Var);
                        }
                        string2.f31304k.getClass();
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        wx wxVar = ((jz) this.f5508h.f4193c).f7018k;
                        if (wxVar != null) {
                            wxVar.v(jElapsedRealtime3, true);
                        }
                        this.f5516q = true;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 24);
                        sb3.append("Cache connection took ");
                        sb3.append(jElapsedRealtime3);
                        sb3.append("ms");
                        t9.c0.m(sb3.toString());
                        return -1L;
                    }
                    string2.f31304k.getClass();
                    long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                    wx wxVar2 = ((jz) this.f5508h.f4193c).f7018k;
                    if (wxVar2 != null) {
                        wxVar2.v(jElapsedRealtime4, true);
                    }
                    this.f5516q = true;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 24);
                    sb4.append("Cache connection took ");
                    sb4.append(jElapsedRealtime4);
                    sb4.append("ms");
                    string = sb4.toString();
                } catch (InterruptedException unused3) {
                    z11 = true;
                    niVarO.cancel(true);
                    Thread.currentThread().interrupt();
                    p9.k.C.f31304k.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                    wx wxVar3 = ((jz) this.f5508h.f4193c).f7018k;
                    if (wxVar3 != null) {
                        wxVar3.v(jElapsedRealtime, z11);
                    }
                    this.f5516q = z11;
                    sb2 = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 24);
                    sb2.append("Cache connection took ");
                    sb2.append(jElapsedRealtime);
                    sb2.append("ms");
                    string2 = sb2.toString();
                    string = string2;
                } catch (ExecutionException | TimeoutException unused4) {
                    z10 = true;
                    niVarO.cancel(true);
                    p9.k.C.f31304k.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                    wx wxVar4 = ((jz) this.f5508h.f4193c).f7018k;
                    if (wxVar4 != null) {
                        wxVar4.v(jElapsedRealtime, z10);
                    }
                    this.f5516q = z10;
                    sb2 = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 24);
                    sb2.append("Cache connection took ");
                    sb2.append(jElapsedRealtime);
                    sb2.append("ms");
                    string2 = sb2.toString();
                    string = string2;
                } catch (Throwable th3) {
                    th = th3;
                    p9.k.C.f31304k.getClass();
                    long jElapsedRealtime5 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                    ?? r22 = ((jz) this.f5508h.f4193c).f7018k;
                    if (r22 != 0) {
                        r22.v(jElapsedRealtime5, r52);
                    }
                    this.f5516q = r52;
                    StringBuilder sb5 = new StringBuilder(String.valueOf(jElapsedRealtime5).length() + 24);
                    sb5.append("Cache connection took ");
                    sb5.append(jElapsedRealtime5);
                    sb5.append("ms");
                    t9.c0.m(sb5.toString());
                    throw th;
                }
                t9.c0.m(string);
            } catch (Throwable th4) {
                th = th4;
                r52 = string2;
            }
        }
        this.f5516q = false;
        if (this.f5514o != null) {
            Map map = db1Var2.f4545b;
            long j11 = db1Var2.f4546c;
            long j12 = db1Var2.f4547d;
            int i = db1Var2.f4548e;
            Uri uri2 = Uri.parse(this.f5514o.f7524b);
            ix.m0(uri2, "The uri must be set.");
            db1Var2 = new db1(uri2, map, j11, j12, i);
        }
        return this.f5507g.k(db1Var2);
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final Uri l() {
        return this.f5513n;
    }
}
