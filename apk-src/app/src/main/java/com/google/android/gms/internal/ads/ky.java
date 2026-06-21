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
public final class ky implements g91 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final me1 f7329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f7332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InputStream f7333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7334h;
    public Uri i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile li f7335j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7336k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7337l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public db1 f7338m;

    public ky(Context context, me1 me1Var, String str, int i) {
        this.f7328b = context;
        this.f7329c = me1Var;
        this.f7330d = str;
        this.f7331e = i;
        new AtomicLong(-1L);
        this.f7332f = ((Boolean) q9.s.f31967e.f31970c.a(al.f3118n2)).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.ct1
    public final int C(byte[] bArr, int i, int i10) throws IOException {
        if (!this.f7334h) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f7333g;
        return inputStream != null ? inputStream.read(bArr, i, i10) : this.f7329c.C(bArr, i, i10);
    }

    public final boolean a() {
        if (!this.f7332f) {
            return false;
        }
        wk wkVar = al.f2968d5;
        q9.s sVar = q9.s.f31967e;
        if (!((Boolean) sVar.f31970c.a(wkVar)).booleanValue() || this.f7336k) {
            return ((Boolean) sVar.f31970c.a(al.f2984e5)).booleanValue() && !this.f7337l;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void g() throws IOException {
        if (!this.f7334h) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f7334h = false;
        this.i = null;
        InputStream inputStream = this.f7333g;
        if (inputStream == null) {
            this.f7329c.g();
        } else {
            ua.b.d(inputStream);
            this.f7333g = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long k(db1 db1Var) throws IOException {
        if (this.f7334h) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.f7334h = true;
        Uri uri = db1Var.f4544a;
        this.i = uri;
        this.f7338m = db1Var;
        this.f7335j = li.a(uri);
        wk wkVar = al.f2921a5;
        q9.s sVar = q9.s.f31967e;
        ii iiVarI = null;
        if (!((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            if (this.f7335j != null) {
                this.f7335j.i = db1Var.f4546c;
                li liVar = this.f7335j;
                String str = this.f7330d;
                liVar.f7531j = str != null ? str : "";
                this.f7335j.f7532k = this.f7331e;
                iiVarI = p9.k.C.f31303j.i(this.f7335j);
            }
            if (iiVarI != null && iiVarI.c()) {
                this.f7336k = iiVarI.g();
                this.f7337l = iiVarI.f();
                if (!a()) {
                    this.f7333g = iiVarI.e();
                    return -1L;
                }
            }
        } else if (this.f7335j != null) {
            this.f7335j.i = db1Var.f4546c;
            li liVar2 = this.f7335j;
            String str2 = this.f7330d;
            liVar2.f7531j = str2 != null ? str2 : "";
            this.f7335j.f7532k = this.f7331e;
            long jLongValue = (this.f7335j.f7530h ? (Long) sVar.f31970c.a(al.f2954c5) : (Long) sVar.f31970c.a(al.f2937b5)).longValue();
            p9.k.C.f31304k.getClass();
            SystemClock.elapsedRealtime();
            ni niVarO = c6.o(this.f7328b, this.f7335j);
            try {
                try {
                    try {
                        qi qiVar = (qi) niVarO.f6961b.get(jLongValue, TimeUnit.MILLISECONDS);
                        qiVar.getClass();
                        this.f7336k = qiVar.f9505c;
                        this.f7337l = qiVar.f9507e;
                        if (!a()) {
                            this.f7333g = qiVar.f9503a;
                        }
                    } catch (ExecutionException | TimeoutException unused) {
                        niVarO.cancel(false);
                    }
                } catch (InterruptedException unused2) {
                    niVarO.cancel(false);
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable unused3) {
            }
            p9.k.C.f31304k.getClass();
            SystemClock.elapsedRealtime();
            throw null;
        }
        if (this.f7335j != null) {
            Map map = db1Var.f4545b;
            long j10 = db1Var.f4546c;
            long j11 = db1Var.f4547d;
            int i = db1Var.f4548e;
            Uri uri2 = Uri.parse(this.f7335j.f7524b);
            ix.m0(uri2, "The uri must be set.");
            this.f7338m = new db1(uri2, map, j10, j11, i);
        }
        return this.f7329c.k(this.f7338m);
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final Uri l() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void H(em1 em1Var) {
    }
}
