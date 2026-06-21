package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.util.SparseBooleanArray;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jz implements em1, yu1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AtomicInteger f7008v = new AtomicInteger(0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final AtomicInteger f7009w = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ez f7011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f7012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cy f7013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f7014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fc f7015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public vu1 f7016h;
    public ByteBuffer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7017j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public wx f7018k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7019l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7020m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f7021n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f7022o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f7023p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Integer f7025r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f7026s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile fz f7027t;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f7024q = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final HashSet f7028u = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:24:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public jz(android.content.Context r6, com.google.android.gms.internal.ads.cy r7, com.google.android.gms.internal.ads.sz r8, java.lang.Integer r9) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jz.<init>(android.content.Context, com.google.android.gms.internal.ads.cy, com.google.android.gms.internal.ads.sz, java.lang.Integer):void");
    }

    @Override // com.google.android.gms.internal.ads.yu1
    public final void b(int i) {
        this.f7020m += i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.em1
    public final void d(h41 h41Var, db1 db1Var, boolean z5) {
        if (h41Var instanceof zj1) {
            synchronized (this.f7024q) {
                this.f7026s.add((zj1) h41Var);
            }
        } else if (h41Var instanceof fz) {
            this.f7027t = (fz) h41Var;
            sz szVar = (sz) this.f7014f.get();
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3118n2)).booleanValue() && szVar != null && this.f7027t.f5515p) {
                HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.f7027t.f5517r));
                map.put("gcacheDownloaded", String.valueOf(this.f7027t.f5518s));
                t9.g0.f33596l.post(new l81(13, szVar, map));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yu1
    public final void e(bt1 bt1Var) {
        wx wxVar = this.f7018k;
        if (wxVar != null) {
            wxVar.x("onPlayerError", bt1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.yu1
    public final void f(int i) {
        wx wxVar = this.f7018k;
        if (wxVar != null) {
            wxVar.Y(i);
        }
    }

    public final void finalize() {
        f7008v.decrementAndGet();
        if (t9.c0.o()) {
            t9.c0.m("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.em1
    public final void g(db1 db1Var, boolean z5, int i) {
        this.f7019l += i;
    }

    @Override // com.google.android.gms.internal.ads.yu1
    public final void j(bs bsVar) {
        wx wxVar = this.f7018k;
        if (wxVar != null) {
            wxVar.w(bsVar.f3860a, bsVar.f3861b);
        }
    }

    @Override // com.google.android.gms.internal.ads.yu1
    public final void k(jx1 jx1Var) {
        sz szVar = (sz) this.f7014f.get();
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3118n2)).booleanValue() || szVar == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = jx1Var.f6974l;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = jx1Var.f6975m;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = jx1Var.f6972j;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        szVar.c("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.yu1
    public final void l(jx1 jx1Var) {
        sz szVar = (sz) this.f7014f.get();
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3118n2)).booleanValue() || szVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put(RRWebVideoEvent.JsonKeys.FRAME_RATE, String.valueOf(jx1Var.f6986x));
        map.put("bitRate", String.valueOf(jx1Var.i));
        int i = jx1Var.f6982t;
        int i10 = jx1Var.f6983u;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i10).length());
        sb2.append(i);
        sb2.append("x");
        sb2.append(i10);
        map.put("resolution", sb2.toString());
        String str = jx1Var.f6974l;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = jx1Var.f6975m;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = jx1Var.f6972j;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        szVar.c("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.yu1
    public final void o(IOException iOException) {
        wx wxVar = this.f7018k;
        if (wxVar != null) {
            if (this.f7013e.f4379j) {
                wxVar.y(iOException);
            } else {
                wxVar.x("onLoadError", iOException);
            }
        }
    }

    public final long p() {
        if (this.f7027t != null && this.f7027t.f5516q && this.f7027t.f5517r) {
            return Math.min(this.f7019l, this.f7027t.f5519t);
        }
        return 0L;
    }

    public final long q() {
        if (this.f7027t != null && this.f7027t.f5516q) {
            fz fzVar = this.f7027t;
            if (fzVar.f5514o != null) {
                AtomicLong atomicLong = fzVar.f5521v;
                if (atomicLong.get() != -1) {
                    return atomicLong.get();
                }
                synchronized (fzVar) {
                    try {
                        if (fzVar.f5520u == null) {
                            fzVar.f5520u = hx.f6279a.b(new ze(3, fzVar));
                        }
                    } finally {
                    }
                }
                if (fzVar.f5520u.isDone()) {
                    try {
                        fzVar.f5521v.compareAndSet(-1L, ((Long) fzVar.f5520u.get()).longValue());
                        return fzVar.f5521v.get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }
            return -1L;
        }
        synchronized (this.f7024q) {
            while (true) {
                ArrayList arrayList = this.f7026s;
                if (!arrayList.isEmpty()) {
                    long j10 = this.f7021n;
                    Map mapD = ((zj1) arrayList.remove(0)).d();
                    long j11 = 0;
                    if (mapD != null) {
                        Iterator it = mapD.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && ix.c0((CharSequence) entry.getKey(), "content-length") && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j11 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused2) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.f7021n = j10 + j11;
                }
            }
        }
        return this.f7021n;
    }

    @Override // com.google.android.gms.internal.ads.yu1
    public final void r() {
        wx wxVar = this.f7018k;
        if (wxVar != null) {
            wxVar.u();
        }
    }

    public final void s(boolean z5) {
        uz1 uz1Var;
        boolean zEquals;
        if (this.f7016h == null) {
            return;
        }
        int i = 0;
        while (true) {
            vu1 vu1Var = this.f7016h;
            vu1Var.f11492e.b();
            ot1 ot1Var = vu1Var.f11491d;
            ot1Var.J0();
            int length = ot1Var.i.length;
            if (i >= 2) {
                return;
            }
            b bVar = this.f7012d;
            synchronized (bVar.f3523c) {
                uz1Var = bVar.f3525e;
            }
            uz1Var.getClass();
            tz1 tz1Var = new tz1(uz1Var);
            boolean z10 = !z5;
            SparseBooleanArray sparseBooleanArray = tz1Var.E;
            if (sparseBooleanArray.get(i) != z10) {
                if (z5) {
                    sparseBooleanArray.delete(i);
                } else {
                    sparseBooleanArray.put(i, true);
                }
            }
            uz1 uz1Var2 = new uz1(tz1Var);
            synchronized (bVar.f3523c) {
                zEquals = bVar.f3525e.equals(uz1Var2);
                bVar.f3525e = uz1Var2;
            }
            if (!zEquals) {
                if (uz1Var2.A && bVar.f3524d == null) {
                    rs.r("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
                }
                ut1 ut1Var = bVar.f3521a;
                if (ut1Var != null) {
                    ut1Var.i.c(10);
                }
            }
            i++;
        }
    }

    public final cz1 t(Uri uri) {
        v41 v41Var = x41.f12018c;
        r51 r51Var = r51.f9713f;
        List list = Collections.EMPTY_LIST;
        r51 r51Var2 = r51.f9713f;
        b4 b4Var = b4.f3576a;
        n5 n5Var = new n5("", new h0(), uri != null ? new q2(uri, r51Var2) : null, new c2(), r7.B);
        int i = this.f7013e.f4376f;
        fc fcVar = this.f7015g;
        fcVar.f5319b = i;
        n5Var.f8193b.getClass();
        return new cz1(n5Var, (t81) fcVar.f5320c, (nu0) fcVar.f5321d, (c6) fcVar.f5322e, fcVar.f5319b);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(android.net.Uri[] r10, java.nio.ByteBuffer r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jz.u(android.net.Uri[], java.nio.ByteBuffer, boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.em1
    public final void m(db1 db1Var, boolean z5) {
    }
}
