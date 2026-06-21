package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.d00;
import com.google.android.gms.internal.ads.et;
import com.google.android.gms.internal.ads.f90;
import com.google.android.gms.internal.ads.hf0;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.lo;
import com.google.android.gms.internal.ads.mo;
import com.google.android.gms.internal.ads.o60;
import com.google.android.gms.internal.ads.ph0;
import com.google.android.gms.internal.ads.sz;
import com.google.android.gms.internal.ads.v80;
import com.google.android.gms.internal.ads.wz;
import j0.g;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p9.f;
import p9.k;
import pa.l0;
import q9.s;
import qa.a;
import s9.c;
import s9.e;
import s9.j;
import s9.l;
import xa.b;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AdOverlayInfoParcel extends a implements ReflectedParcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f2544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q9.a f2545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f2546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sz f2547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mo f2548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2550h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f2551j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f2552k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2553l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f2554m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u9.a f2555n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f2556o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f2557p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final lo f2558q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f2559r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f2560s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f2561t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o60 f2562u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v80 f2563v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final et f2564w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f2565x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f2566y;
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new l0(8);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final AtomicLong f2543z = new AtomicLong(0);
    public static final ConcurrentHashMap A = new ConcurrentHashMap();

    public AdOverlayInfoParcel(d00 d00Var, u9.a aVar, String str, String str2, et etVar) {
        this.f2544b = null;
        this.f2545c = null;
        this.f2546d = null;
        this.f2547e = d00Var;
        this.f2558q = null;
        this.f2548f = null;
        this.f2549g = null;
        this.f2550h = false;
        this.i = null;
        this.f2551j = null;
        this.f2552k = 14;
        this.f2553l = 5;
        this.f2554m = null;
        this.f2555n = aVar;
        this.f2556o = null;
        this.f2557p = null;
        this.f2559r = str;
        this.f2560s = str2;
        this.f2561t = null;
        this.f2562u = null;
        this.f2563v = null;
        this.f2564w = etVar;
        this.f2565x = false;
        this.f2566y = f2543z.getAndIncrement();
    }

    public static AdOverlayInfoParcel a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e3) {
            if (!((Boolean) s.f31967e.f31970c.a(al.f3039he)).booleanValue()) {
                return null;
            }
            k.C.f31302h.d("AdOverlayInfoParcel.getFromIntent", e3);
            return null;
        }
    }

    public static final b c(Object obj) {
        if (((Boolean) s.f31967e.f31970c.a(al.f3039he)).booleanValue()) {
            return null;
        }
        return new b(obj);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = g.i0(parcel, 20293);
        g.a0(parcel, 2, this.f2544b, i);
        q9.a aVar = this.f2545c;
        g.X(parcel, 3, c(aVar));
        l lVar = this.f2546d;
        g.X(parcel, 4, c(lVar));
        sz szVar = this.f2547e;
        g.X(parcel, 5, c(szVar));
        mo moVar = this.f2548f;
        g.X(parcel, 6, c(moVar));
        g.b0(parcel, 7, this.f2549g);
        g.h0(parcel, 8, 4);
        parcel.writeInt(this.f2550h ? 1 : 0);
        g.b0(parcel, 9, this.i);
        c cVar = this.f2551j;
        g.X(parcel, 10, c(cVar));
        g.h0(parcel, 11, 4);
        parcel.writeInt(this.f2552k);
        g.h0(parcel, 12, 4);
        parcel.writeInt(this.f2553l);
        g.b0(parcel, 13, this.f2554m);
        g.a0(parcel, 14, this.f2555n, i);
        g.b0(parcel, 16, this.f2556o);
        g.a0(parcel, 17, this.f2557p, i);
        lo loVar = this.f2558q;
        g.X(parcel, 18, c(loVar));
        g.b0(parcel, 19, this.f2559r);
        g.b0(parcel, 24, this.f2560s);
        g.b0(parcel, 25, this.f2561t);
        o60 o60Var = this.f2562u;
        g.X(parcel, 26, c(o60Var));
        v80 v80Var = this.f2563v;
        g.X(parcel, 27, c(v80Var));
        et etVar = this.f2564w;
        g.X(parcel, 28, c(etVar));
        g.h0(parcel, 29, 4);
        parcel.writeInt(this.f2565x ? 1 : 0);
        g.h0(parcel, 30, 8);
        long j10 = this.f2566y;
        parcel.writeLong(j10);
        g.m0(parcel, iI0);
        if (((Boolean) s.f31967e.f31970c.a(al.f3039he)).booleanValue()) {
            A.put(Long.valueOf(j10), new j(aVar, lVar, szVar, loVar, moVar, cVar, o60Var, v80Var, etVar, hx.f6282d.schedule(new s9.k(j10), ((Integer) r2.f31970c.a(al.f3068je)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(f90 f90Var, sz szVar, int i, u9.a aVar, String str, f fVar, String str2, String str3, String str4, o60 o60Var, ph0 ph0Var, String str5) {
        this.f2544b = null;
        this.f2545c = null;
        this.f2546d = f90Var;
        this.f2547e = szVar;
        this.f2558q = null;
        this.f2548f = null;
        this.f2550h = false;
        if (((Boolean) s.f31967e.f31970c.a(al.f3011g1)).booleanValue()) {
            this.f2549g = null;
            this.i = null;
        } else {
            this.f2549g = str2;
            this.i = str3;
        }
        this.f2551j = null;
        this.f2552k = i;
        this.f2553l = 1;
        this.f2554m = null;
        this.f2555n = aVar;
        this.f2556o = str;
        this.f2557p = fVar;
        this.f2559r = str5;
        this.f2560s = null;
        this.f2561t = str4;
        this.f2562u = o60Var;
        this.f2563v = null;
        this.f2564w = ph0Var;
        this.f2565x = false;
        this.f2566y = f2543z.getAndIncrement();
    }

    public AdOverlayInfoParcel(hf0 hf0Var, sz szVar, u9.a aVar) {
        this.f2546d = hf0Var;
        this.f2547e = szVar;
        this.f2552k = 1;
        this.f2555n = aVar;
        this.f2544b = null;
        this.f2545c = null;
        this.f2558q = null;
        this.f2548f = null;
        this.f2549g = null;
        this.f2550h = false;
        this.i = null;
        this.f2551j = null;
        this.f2553l = 1;
        this.f2554m = null;
        this.f2556o = null;
        this.f2557p = null;
        this.f2559r = null;
        this.f2560s = null;
        this.f2561t = null;
        this.f2562u = null;
        this.f2563v = null;
        this.f2564w = null;
        this.f2565x = false;
        this.f2566y = f2543z.getAndIncrement();
    }

    public AdOverlayInfoParcel(q9.a aVar, wz wzVar, lo loVar, mo moVar, c cVar, d00 d00Var, boolean z5, int i, String str, String str2, u9.a aVar2, v80 v80Var, ph0 ph0Var) {
        this.f2544b = null;
        this.f2545c = aVar;
        this.f2546d = wzVar;
        this.f2547e = d00Var;
        this.f2558q = loVar;
        this.f2548f = moVar;
        this.f2549g = str2;
        this.f2550h = z5;
        this.i = str;
        this.f2551j = cVar;
        this.f2552k = i;
        this.f2553l = 3;
        this.f2554m = null;
        this.f2555n = aVar2;
        this.f2556o = null;
        this.f2557p = null;
        this.f2559r = null;
        this.f2560s = null;
        this.f2561t = null;
        this.f2562u = null;
        this.f2563v = v80Var;
        this.f2564w = ph0Var;
        this.f2565x = false;
        this.f2566y = f2543z.getAndIncrement();
    }

    public AdOverlayInfoParcel(q9.a aVar, wz wzVar, lo loVar, mo moVar, c cVar, d00 d00Var, boolean z5, int i, String str, u9.a aVar2, v80 v80Var, ph0 ph0Var, boolean z10) {
        this.f2544b = null;
        this.f2545c = aVar;
        this.f2546d = wzVar;
        this.f2547e = d00Var;
        this.f2558q = loVar;
        this.f2548f = moVar;
        this.f2549g = null;
        this.f2550h = z5;
        this.i = null;
        this.f2551j = cVar;
        this.f2552k = i;
        this.f2553l = 3;
        this.f2554m = str;
        this.f2555n = aVar2;
        this.f2556o = null;
        this.f2557p = null;
        this.f2559r = null;
        this.f2560s = null;
        this.f2561t = null;
        this.f2562u = null;
        this.f2563v = v80Var;
        this.f2564w = ph0Var;
        this.f2565x = z10;
        this.f2566y = f2543z.getAndIncrement();
    }

    public AdOverlayInfoParcel(q9.a aVar, l lVar, c cVar, d00 d00Var, boolean z5, int i, u9.a aVar2, v80 v80Var, ph0 ph0Var) {
        this.f2544b = null;
        this.f2545c = aVar;
        this.f2546d = lVar;
        this.f2547e = d00Var;
        this.f2558q = null;
        this.f2548f = null;
        this.f2549g = null;
        this.f2550h = z5;
        this.i = null;
        this.f2551j = cVar;
        this.f2552k = i;
        this.f2553l = 2;
        this.f2554m = null;
        this.f2555n = aVar2;
        this.f2556o = null;
        this.f2557p = null;
        this.f2559r = null;
        this.f2560s = null;
        this.f2561t = null;
        this.f2562u = null;
        this.f2563v = v80Var;
        this.f2564w = ph0Var;
        this.f2565x = false;
        this.f2566y = f2543z.getAndIncrement();
    }

    public AdOverlayInfoParcel(e eVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z5, String str2, IBinder iBinder5, int i, int i10, String str3, u9.a aVar, String str4, f fVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z10, long j10) {
        this.f2544b = eVar;
        this.f2549g = str;
        this.f2550h = z5;
        this.i = str2;
        this.f2552k = i;
        this.f2553l = i10;
        this.f2554m = str3;
        this.f2555n = aVar;
        this.f2556o = str4;
        this.f2557p = fVar;
        this.f2559r = str5;
        this.f2560s = str6;
        this.f2561t = str7;
        this.f2565x = z10;
        this.f2566y = j10;
        if (((Boolean) s.f31967e.f31970c.a(al.f3039he)).booleanValue()) {
            j jVar = (j) A.remove(Long.valueOf(j10));
            if (jVar != null) {
                this.f2545c = jVar.f32846a;
                this.f2546d = jVar.f32847b;
                this.f2547e = jVar.f32848c;
                this.f2558q = jVar.f32849d;
                this.f2548f = jVar.f32850e;
                this.f2562u = jVar.f32852g;
                this.f2563v = jVar.f32853h;
                this.f2564w = jVar.i;
                this.f2551j = jVar.f32851f;
                jVar.f32854j.cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.f2545c = (q9.a) b.X1(b.L1(iBinder));
        this.f2546d = (l) b.X1(b.L1(iBinder2));
        this.f2547e = (sz) b.X1(b.L1(iBinder3));
        this.f2558q = (lo) b.X1(b.L1(iBinder6));
        this.f2548f = (mo) b.X1(b.L1(iBinder4));
        this.f2551j = (c) b.X1(b.L1(iBinder5));
        this.f2562u = (o60) b.X1(b.L1(iBinder7));
        this.f2563v = (v80) b.X1(b.L1(iBinder8));
        this.f2564w = (et) b.X1(b.L1(iBinder9));
    }

    public AdOverlayInfoParcel(e eVar, q9.a aVar, l lVar, c cVar, u9.a aVar2, d00 d00Var, v80 v80Var, String str) {
        this.f2544b = eVar;
        this.f2545c = aVar;
        this.f2546d = lVar;
        this.f2547e = d00Var;
        this.f2558q = null;
        this.f2548f = null;
        this.f2549g = null;
        this.f2550h = false;
        this.i = null;
        this.f2551j = cVar;
        this.f2552k = -1;
        this.f2553l = 4;
        this.f2554m = null;
        this.f2555n = aVar2;
        this.f2556o = null;
        this.f2557p = null;
        this.f2559r = str;
        this.f2560s = null;
        this.f2561t = null;
        this.f2562u = null;
        this.f2563v = v80Var;
        this.f2564w = null;
        this.f2565x = false;
        this.f2566y = f2543z.getAndIncrement();
    }
}
