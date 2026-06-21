package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z7 implements x6, p9.d, k81, pa.b, pa.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f12902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f12903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f12904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f12905g;

    public /* synthetic */ z7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f12900b = i;
        this.f12901c = obj;
        this.f12902d = obj2;
        this.f12903e = obj3;
        this.f12904f = obj4;
        this.f12905g = obj5;
    }

    public static wd d() {
        jd jdVarB0 = wd.B0();
        jdVarB0.h(32768L);
        return (wd) jdVarB0.d();
    }

    public ed.d a(String str) {
        u9.k kVar = u9.k.f34394c;
        if (str != null) {
            if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3009g)).booleanValue() || !str.isEmpty()) {
                try {
                    return e(0L, str, 1);
                } catch (NullPointerException | RejectedExecutionException unused) {
                    return vv.d(kVar);
                }
            }
        }
        return vv.d(kVar);
    }

    @Override // com.google.android.gms.internal.ads.x6
    public ArrayList b(long j10) {
        Map map = (Map) this.f12903e;
        HashMap map2 = (HashMap) this.f12904f;
        HashMap map3 = (HashMap) this.f12905g;
        u7 u7Var = (u7) this.f12901c;
        ArrayList arrayList = new ArrayList();
        String str = u7Var.f10859h;
        u7Var.g(j10, str, arrayList);
        TreeMap treeMap = new TreeMap();
        u7Var.h(j10, false, str, treeMap);
        u7Var.j(j10, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                x7 x7Var = (x7) map2.get(pair.first);
                x7Var.getClass();
                arrayList2.add(new z40(null, null, null, bitmapDecodeByteArray, x7Var.f12056c, 0, x7Var.f12058e, x7Var.f12055b, 0, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, -3.4028235E38f, x7Var.f12059f, x7Var.f12060g, x7Var.f12062j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            x7 x7Var2 = (x7) map2.get(entry.getKey());
            x7Var2.getClass();
            n40 n40Var = (n40) entry.getValue();
            CharSequence charSequence = n40Var.f8178a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (s7 s7Var : (s7[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), s7.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(s7Var), spannableStringBuilder.getSpanEnd(s7Var), (CharSequence) "");
            }
            int i10 = 0;
            while (i10 < spannableStringBuilder.length()) {
                int i11 = i10 + 1;
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
                i10 = i11;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i14 = 0;
            while (i14 < spannableStringBuilder.length() - 1) {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i14) == '\n' && spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
                i14 = i15;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i16 = 0;
            while (i16 < spannableStringBuilder.length() - 1) {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i16) == ' ' && spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
                i16 = i17;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f10 = x7Var2.f12056c;
            int i18 = x7Var2.f12057d;
            n40Var.f8182e = f10;
            n40Var.f8183f = i18;
            n40Var.f8184g = x7Var2.f12058e;
            n40Var.f8185h = x7Var2.f12055b;
            n40Var.f8188l = x7Var2.f12059f;
            float f11 = x7Var2.i;
            int i19 = x7Var2.f12061h;
            n40Var.f8187k = f11;
            n40Var.f8186j = i19;
            n40Var.f8190n = x7Var2.f12062j;
            arrayList2.add(n40Var.a());
        }
        return arrayList2;
    }

    @Override // pa.c
    public void c0(ma.b bVar) {
        try {
            ((LinkedBlockingQueue) this.f12904f).put(d());
        } catch (InterruptedException unused) {
        }
    }

    public ed.d e(final long j10, final String str, final int i) {
        final String strG;
        Executor executor = (s81) this.f12903e;
        u9.h hVar = (u9.h) this.f12901c;
        if (i > hVar.f34388a) {
            zs0 zs0Var = (zs0) this.f12904f;
            if (zs0Var == null || !hVar.f34391d) {
                return vv.d(u9.k.f34395d);
            }
            p9.k.C.f31304k.getClass();
            cb cbVar = new cb(System.currentTimeMillis(), "", str, 2);
            kh0 kh0Var = zs0Var.f13101a;
            kh0Var.getClass();
            kh0Var.a(new n90(13, kh0Var, cbVar));
            return vv.d(u9.k.f34396e);
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.H9)).booleanValue()) {
            Uri uri = Uri.parse(str);
            String encodedQuery = uri.getEncodedQuery();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            builderClearQuery.appendQueryParameter("pa", Integer.toString(i));
            String strValueOf = String.valueOf(builderClearQuery.build());
            strG = t.z.g(new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length()), strValueOf, "&", encodedQuery);
        } else {
            strG = str;
        }
        z71 z71Var = new z71() { // from class: com.google.android.gms.internal.ads.ys0
            @Override // com.google.android.gms.internal.ads.z71
            public final ed.d a(Object obj) {
                u9.k kVar = (u9.k) obj;
                if (kVar != u9.k.f34395d) {
                    return vv.d(kVar);
                }
                z7 z7Var = this.f12729a;
                u9.h hVar2 = (u9.h) z7Var.f12901c;
                long j11 = hVar2.f34389b;
                int i10 = i;
                if (i10 != 1) {
                    j11 = (long) (hVar2.f34390c * j10);
                }
                return z7Var.e(j11, str, i10 + 1);
            }
        };
        if (j10 == 0) {
            final int i10 = 1;
            return vv.J(((gx) executor).b(new Callable(this) { // from class: com.google.android.gms.internal.ads.xs0

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ z7 f12294c;

                {
                    this.f12294c = this;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    switch (i10) {
                    }
                    return this.f12294c.f(strG);
                }
            }), z71Var, executor);
        }
        final int i11 = 0;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.ads.xs0

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z7 f12294c;

            {
                this.f12294c = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i11) {
                }
                return this.f12294c.f(strG);
            }
        };
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        x81 x81Var = (x81) executor;
        x81Var.getClass();
        c91 c91Var = new c91(callable);
        return vv.J(new v81(c91Var, x81Var.f12078d.schedule(c91Var, j10, timeUnit)), z71Var, x81Var);
    }

    public u9.k f(String str) {
        w00 w00Var;
        u9.l lVar = (u9.l) this.f12902d;
        wk wkVar = al.Z9;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue() && (w00Var = (w00) this.f12905g) != null) {
            p9.k kVar = p9.k.C;
            if (kVar.f31297c.G(str) || kVar.f31297c.H(str)) {
                xr1 xr1Var = w00Var.f11561c;
                String strEncodeToString = xr1Var != null ? Base64.encodeToString(xr1Var.b(), 10) : null;
                HashMap map = new HashMap();
                if (strEncodeToString != null) {
                    map.put((String) sVar.f31970c.a(al.f2926aa), strEncodeToString);
                }
                return lVar.a(str, map);
            }
        }
        return lVar.a(str, null);
    }

    @Override // com.google.android.gms.internal.ads.x6
    public int h() {
        return ((long[]) this.f12902d).length;
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public void mo6i(Object obj) {
        as0 as0Var;
        as0 as0Var2;
        as0 as0Var3;
        as0 as0Var4;
        switch (this.f12900b) {
            case 5:
                hi hiVar = (hi) this.f12905g;
                r40 r40Var = (r40) obj;
                synchronized (hiVar) {
                    if (r40Var != null) {
                        try {
                            r40Var.b();
                        } finally {
                        }
                    }
                    ((s70) r40Var.f9702g.f10189b.f7326c).f10190c = (uk0) ((oq0) hiVar.f6143d).f8763d;
                    ((kx0) this.f12901c).r(r40Var);
                    ((n10) hiVar.f6142c).b().execute(new w40(this, 1));
                    if (!((Boolean) vl.f11414c.r()).booleanValue() || (as0Var = (as0) this.f12902d) == null) {
                        bs0 bs0Var = (bs0) hiVar.f6144e;
                        xr0 xr0Var = (xr0) this.f12903e;
                        xr0Var.m(r40Var.f9696a.f5033b);
                        xr0Var.v0(r40Var.f9701f.f4843b);
                        xr0Var.a(true);
                        bs0Var.b(xr0Var.p());
                    } else {
                        as0Var.e(r40Var.f9696a.f5033b);
                        as0Var.g(r40Var.f9701f.f4843b);
                        xr0 xr0Var2 = (xr0) this.f12903e;
                        xr0Var2.a(true);
                        as0Var.a(xr0Var2);
                        as0Var.h();
                    }
                    break;
                }
                return;
            case 6:
                no0 no0Var = (no0) this.f12905g;
                r40 r40Var2 = (r40) obj;
                synchronized (no0Var) {
                    if (r40Var2 != null) {
                        try {
                            r40Var2.b();
                        } finally {
                        }
                    }
                    no0Var.f8397j = null;
                    if (((Boolean) q9.s.f31967e.f31970c.a(al.m9)).booleanValue()) {
                        ((s70) r40Var2.f9702g.f10189b.f7326c).f10192e = no0Var.f8392d;
                    }
                    ((al0) this.f12901c).r(r40Var2);
                    if (!((Boolean) vl.f11414c.r()).booleanValue() || (as0Var2 = (as0) this.f12902d) == null) {
                        bs0 bs0Var2 = no0Var.f8396h;
                        xr0 xr0Var3 = (xr0) this.f12903e;
                        xr0Var3.m(r40Var2.f9696a.f5033b);
                        xr0Var3.v0(r40Var2.f9701f.f4843b);
                        xr0Var3.a(true);
                        bs0Var2.b(xr0Var3.p());
                    } else {
                        as0Var2.e(r40Var2.f9696a.f5033b);
                        as0Var2.g(r40Var2.f9701f.f4843b);
                        xr0 xr0Var4 = (xr0) this.f12903e;
                        xr0Var4.a(true);
                        as0Var2.a(xr0Var4);
                        as0Var2.h();
                    }
                    break;
                }
                return;
            case 7:
                kp0 kp0Var = (kp0) this.f12905g;
                d90 d90Var = (d90) obj;
                synchronized (kp0Var) {
                    if (d90Var != null) {
                        try {
                            d90Var.b();
                        } finally {
                        }
                    }
                    kp0Var.i = null;
                    wk wkVar = al.f3125n9;
                    q9.s sVar = q9.s.f31967e;
                    if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                        kx0 kx0Var = d90Var.f9702g.f10189b;
                        uk0 uk0Var = kp0Var.f7280d;
                        s70 s70Var = (s70) kx0Var.f7326c;
                        s70Var.f10190c = uk0Var;
                        s70Var.f10193f = kp0Var.f7281e;
                    }
                    ((al0) this.f12901c).r(d90Var);
                    if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                        final int i = 1;
                        kp0Var.f7278b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ip0

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ z7 f6566c;

                            {
                                this.f6566c = this;
                            }

                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                switch (i) {
                                    case 0:
                                        ((kp0) this.f6566c.f12905g).f7281e.k();
                                        break;
                                    default:
                                        ((kp0) this.f6566c.f12905g).f7280d.k();
                                        break;
                                }
                            }
                        });
                        final int i10 = 0;
                        kp0Var.f7278b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ip0

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ z7 f6566c;

                            {
                                this.f6566c = this;
                            }

                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                switch (i10) {
                                    case 0:
                                        ((kp0) this.f6566c.f12905g).f7281e.k();
                                        break;
                                    default:
                                        ((kp0) this.f6566c.f12905g).f7280d.k();
                                        break;
                                }
                            }
                        });
                    }
                    if (!((Boolean) vl.f11414c.r()).booleanValue() || (as0Var3 = (as0) this.f12902d) == null) {
                        bs0 bs0Var3 = kp0Var.f7283g;
                        xr0 xr0Var5 = (xr0) this.f12903e;
                        xr0Var5.m(d90Var.f9696a.f5033b);
                        xr0Var5.v0(d90Var.f9701f.f4843b);
                        xr0Var5.a(true);
                        bs0Var3.b(xr0Var5.p());
                    } else {
                        as0Var3.e(d90Var.f9696a.f5033b);
                        as0Var3.g(d90Var.f9701f.f4843b);
                        xr0 xr0Var6 = (xr0) this.f12903e;
                        xr0Var6.a(true);
                        as0Var3.a(xr0Var6);
                        as0Var3.h();
                    }
                    break;
                }
                return;
            default:
                rp0 rp0Var = (rp0) this.f12905g;
                qc0 qc0Var = (qc0) obj;
                synchronized (rp0Var) {
                    if (qc0Var != null) {
                        try {
                            qc0Var.b();
                        } finally {
                        }
                    }
                    ((s70) qc0Var.f9702g.f10189b.f7326c).f10193f = rp0Var.f10012d;
                    ((al0) this.f12901c).r(qc0Var);
                    Executor executor = rp0Var.f10010b;
                    np0 np0Var = rp0Var.f10012d;
                    Objects.requireNonNull(np0Var);
                    executor.execute(new h30(26, np0Var));
                    rp0Var.f10012d.g();
                    if (!((Boolean) vl.f11414c.r()).booleanValue() || (as0Var4 = (as0) this.f12902d) == null) {
                        bs0 bs0Var4 = rp0Var.f10015g;
                        xr0 xr0Var7 = (xr0) this.f12903e;
                        xr0Var7.m(qc0Var.f9696a.f5033b);
                        xr0Var7.v0(qc0Var.f9701f.f4843b);
                        xr0Var7.a(true);
                        bs0Var4.b(xr0Var7.p());
                    } else {
                        as0Var4.e(qc0Var.f9696a.f5033b);
                        as0Var4.g(qc0Var.f9701f.f4843b);
                        xr0 xr0Var8 = (xr0) this.f12903e;
                        xr0Var8.a(true);
                        as0Var4.a(xr0Var8);
                        as0Var4.h();
                    }
                    break;
                }
                return;
        }
    }

    @Override // p9.d
    public void j() {
        switch (this.f12900b) {
            case 4:
                break;
            default:
                rv0 rv0Var = (rv0) this.f12901c;
                if (rv0Var != null) {
                    if (rv0Var.r() || rv0Var.s()) {
                        rv0Var.f();
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        as0 as0Var;
        as0 as0Var2;
        as0 as0Var3;
        as0 as0Var4;
        switch (this.f12900b) {
            case 5:
                xr0 xr0Var = (xr0) this.f12903e;
                if (((Boolean) q9.s.f31967e.f31970c.a(al.B6)).booleanValue()) {
                    t9.c0.n("Native ad failed to load", th2);
                }
                m10 m10Var = (m10) this.f12904f;
                q9.x1 x1VarV = vv.v(th2, ((b50) m10Var.f7731o.j()).f3628l);
                ((k60) m10Var.f7727k.j()).K(x1VarV);
                hi hiVar = (hi) this.f12905g;
                ((n10) hiVar.f6142c).b().execute(new th0(4, this, x1VarV));
                gr.v("NativeAdLoader.onFailure", th2, x1VarV.f31976b);
                ((kx0) this.f12901c).mo4h();
                if (!((Boolean) vl.f11414c.r()).booleanValue() || (as0Var = (as0) this.f12902d) == null) {
                    bs0 bs0Var = (bs0) hiVar.f6144e;
                    xr0Var.n(x1VarV);
                    xr0Var.g(th2);
                    xr0Var.a(false);
                    bs0Var.b(xr0Var.p());
                    return;
                }
                as0Var.f(x1VarV);
                xr0Var.g(th2);
                xr0Var.a(false);
                as0Var.a(xr0Var);
                as0Var.h();
                return;
            case 6:
                wk wkVar = al.B6;
                q9.s sVar = q9.s.f31967e;
                if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                    t9.c0.n("App open ad failed to load", th2);
                }
                no0 no0Var = (no0) this.f12905g;
                q10 q10Var = (q10) no0Var.f8393e.g();
                q9.x1 x1VarV2 = q10Var == null ? vv.v(th2, null) : vv.v(th2, q10Var.h().f3628l);
                synchronized (no0Var) {
                    try {
                        no0Var.f8397j = null;
                        if (q10Var != null) {
                            ((k60) q10Var.f9268l.j()).K(x1VarV2);
                            if (((Boolean) sVar.f31970c.a(al.m9)).booleanValue()) {
                                no0Var.f8390b.execute(new th0(5, this, x1VarV2));
                            }
                        } else {
                            no0Var.f8392d.K(x1VarV2);
                            no0Var.b((ko0) this.f12904f).a().h().f3623f.r();
                        }
                        gr.v("AppOpenAdLoader.onFailure", th2, x1VarV2.f31976b);
                        ((al0) this.f12901c).mo4h();
                        if (!((Boolean) vl.f11414c.r()).booleanValue() || (as0Var2 = (as0) this.f12902d) == null) {
                            bs0 bs0Var2 = no0Var.f8396h;
                            xr0 xr0Var2 = (xr0) this.f12903e;
                            xr0Var2.n(x1VarV2);
                            xr0Var2.g(th2);
                            xr0Var2.a(false);
                            bs0Var2.b(xr0Var2.p());
                        } else {
                            as0Var2.f(x1VarV2);
                            xr0 xr0Var3 = (xr0) this.f12903e;
                            xr0Var3.g(th2);
                            xr0Var3.a(false);
                            as0Var2.a(xr0Var3);
                            as0Var2.h();
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 7:
                wk wkVar2 = al.B6;
                q9.s sVar2 = q9.s.f31967e;
                if (((Boolean) sVar2.f31970c.a(wkVar2)).booleanValue()) {
                    t9.c0.n("Interstitial ad failed to load", th2);
                }
                w10 w10Var = (w10) this.f12904f;
                final q9.x1 x1VarV3 = vv.v(th2, ((b50) w10Var.f11583n.j()).f3628l);
                kp0 kp0Var = (kp0) this.f12905g;
                synchronized (kp0Var) {
                    try {
                        kp0Var.i = null;
                        ((k60) w10Var.f11579j.j()).K(x1VarV3);
                        if (((Boolean) sVar2.f31970c.a(al.f3125n9)).booleanValue()) {
                            final int i = 0;
                            kp0Var.f7278b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.jp0

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                public final /* synthetic */ z7 f6919c;

                                {
                                    this.f6919c = this;
                                }

                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    switch (i) {
                                        case 0:
                                            ((kp0) this.f6919c.f12905g).f7280d.K(x1VarV3);
                                            break;
                                        default:
                                            ((kp0) this.f6919c.f12905g).f7281e.K(x1VarV3);
                                            break;
                                    }
                                }
                            });
                            final int i10 = 1;
                            kp0Var.f7278b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.jp0

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                public final /* synthetic */ z7 f6919c;

                                {
                                    this.f6919c = this;
                                }

                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    switch (i10) {
                                        case 0:
                                            ((kp0) this.f6919c.f12905g).f7280d.K(x1VarV3);
                                            break;
                                        default:
                                            ((kp0) this.f6919c.f12905g).f7281e.K(x1VarV3);
                                            break;
                                    }
                                }
                            });
                        }
                        gr.v("InterstitialAdLoader.onFailure", th2, x1VarV3.f31976b);
                        ((al0) this.f12901c).mo4h();
                        if (!((Boolean) vl.f11414c.r()).booleanValue() || (as0Var3 = (as0) this.f12902d) == null) {
                            bs0 bs0Var3 = kp0Var.f7283g;
                            xr0 xr0Var4 = (xr0) this.f12903e;
                            xr0Var4.n(x1VarV3);
                            xr0Var4.g(th2);
                            xr0Var4.a(false);
                            bs0Var3.b(xr0Var4.p());
                        } else {
                            as0Var3.f(x1VarV3);
                            xr0 xr0Var5 = (xr0) this.f12903e;
                            xr0Var5.g(th2);
                            xr0Var5.a(false);
                            as0Var3.a(xr0Var5);
                            as0Var3.h();
                        }
                    } finally {
                    }
                    break;
                }
                return;
            default:
                if (((Boolean) q9.s.f31967e.f31970c.a(al.B6)).booleanValue()) {
                    t9.c0.n("Rewarded ad failed to load", th2);
                }
                rp0 rp0Var = (rp0) this.f12905g;
                z10 z10Var = (z10) rp0Var.f10013e.g();
                q9.x1 x1VarV4 = z10Var == null ? vv.v(th2, null) : vv.v(th2, z10Var.h().f3628l);
                synchronized (rp0Var) {
                    try {
                        if (z10Var != null) {
                            ((k60) z10Var.f12831n.j()).K(x1VarV4);
                            rp0Var.f10010b.execute(new th0(7, this, x1VarV4));
                        } else {
                            rp0Var.f10012d.K(x1VarV4);
                            rp0Var.b((qp0) this.f12904f).b().h().f3623f.r();
                        }
                        gr.v("RewardedAdLoader.onFailure", th2, x1VarV4.f31976b);
                        ((al0) this.f12901c).mo4h();
                        if (!((Boolean) vl.f11414c.r()).booleanValue() || (as0Var4 = (as0) this.f12902d) == null) {
                            bs0 bs0Var4 = rp0Var.f10015g;
                            xr0 xr0Var6 = (xr0) this.f12903e;
                            xr0Var6.n(x1VarV4);
                            xr0Var6.g(th2);
                            xr0Var6.a(false);
                            bs0Var4.b(xr0Var6.p());
                        } else {
                            as0Var4.f(x1VarV4);
                            xr0 xr0Var7 = (xr0) this.f12903e;
                            xr0Var7.g(th2);
                            xr0Var7.a(false);
                            as0Var4.a(xr0Var7);
                            as0Var4.h();
                        }
                    } finally {
                    }
                    break;
                }
                return;
        }
    }

    @Override // pa.b
    public void l0(int i) {
        try {
            ((LinkedBlockingQueue) this.f12904f).put(d());
        } catch (InterruptedException unused) {
        }
    }

    @Override // pa.b
    public void n0() {
        uv0 uv0Var;
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) this.f12904f;
        HandlerThread handlerThread = (HandlerThread) this.f12905g;
        try {
            uv0Var = (uv0) ((rv0) this.f12901c).n();
        } catch (DeadObjectException | IllegalStateException unused) {
            uv0Var = null;
        }
        if (uv0Var != null) {
            try {
                try {
                    sv0 sv0Var = new sv0(1, (String) this.f12902d, (String) this.f12903e);
                    Parcel parcelD0 = uv0Var.D0();
                    vg.c(parcelD0, sv0Var);
                    Parcel parcelP1 = uv0Var.p1(parcelD0, 1);
                    tv0 tv0Var = (tv0) vg.b(parcelP1, tv0.CREATOR);
                    parcelP1.recycle();
                    if (tv0Var.f10733c == null) {
                        try {
                            byte[] bArr = tv0Var.f10734d;
                            kn1 kn1Var = kn1.f7271a;
                            int i = tm1.f10663a;
                            tv0Var.f10733c = wd.A0(bArr, kn1.f7272b);
                            tv0Var.f10734d = null;
                        } catch (co1 | NullPointerException e3) {
                            throw new IllegalStateException(e3);
                        }
                    }
                    tv0Var.j();
                    linkedBlockingQueue.put(tv0Var.f10733c);
                } catch (InterruptedException unused2) {
                } catch (Throwable th2) {
                    j();
                    handlerThread.quit();
                    throw th2;
                }
            } catch (Throwable unused3) {
                linkedBlockingQueue.put(d());
            }
            j();
            handlerThread.quit();
        }
    }

    @Override // com.google.android.gms.internal.ads.x6
    public long u(int i) {
        return ((long[]) this.f12902d)[i];
    }

    @Override // p9.d
    public void z(View view) {
        cf cfVar = (cf) this.f12904f;
        ox0 ox0Var = (ox0) ((dk0) this.f12905g).f4588e;
        eq0 eq0Var = (eq0) this.f12902d;
        xp0 xp0Var = (xp0) this.f12903e;
        jx jxVar = (jx) this.f12901c;
        sc0 sc0Var = new sc0(new gk0(27, ox0Var, xp0Var), null, 1);
        oq0 oq0Var = new oq0(eq0Var, xp0Var, (String) null);
        w10 w10Var = (w10) ox0Var.f8851c;
        v10 v10Var = new v10(w10Var.f11572b, w10Var.f11573c, oq0Var, sc0Var);
        kx0 kx0Var = new kx0(23, ox0Var, v10Var);
        synchronized (cfVar) {
            cfVar.f4193c = kx0Var;
        }
        jxVar.b(v10Var.h0());
    }

    public /* synthetic */ z7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, boolean z5) {
        this.f12900b = i;
        this.f12901c = obj2;
        this.f12902d = obj3;
        this.f12903e = obj4;
        this.f12904f = obj5;
        this.f12905g = obj;
    }

    public z7(Context context, d00 d00Var, d00 d00Var2, sd0 sd0Var) {
        this.f12900b = 2;
        this.f12901c = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f12903e = d00Var;
        this.f12902d = d00Var2;
        this.f12905g = null;
        this.f12904f = sd0Var;
    }

    public z7(Context context, String str, String str2) {
        this.f12900b = 10;
        this.f12902d = str;
        this.f12903e = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f12905g = handlerThread;
        handlerThread.start();
        rv0 rv0Var = new rv0(context, handlerThread.getLooper(), this, this, 9200000);
        this.f12901c = rv0Var;
        this.f12904f = new LinkedBlockingQueue();
        rv0Var.d();
    }

    public z7(u7 u7Var, HashMap map, HashMap map2, HashMap map3) {
        this.f12900b = 0;
        this.f12901c = u7Var;
        this.f12904f = map2;
        this.f12905g = map3;
        this.f12903e = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        u7Var.f(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f12902d = jArr;
    }

    public z7(fo foVar) {
        en dnVar;
        this.f12900b = 1;
        this.f12902d = new ArrayList();
        this.f12904f = new k9.t();
        this.f12905g = new ArrayList();
        this.f12901c = foVar;
        fn fnVar = null;
        try {
            List listC = foVar.c();
            if (listC != null) {
                for (Object obj : listC) {
                    if (obj instanceof IBinder) {
                        IBinder iBinder = (IBinder) obj;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        dnVar = iInterfaceQueryLocalInterface instanceof en ? (en) iInterfaceQueryLocalInterface : new dn(iBinder);
                    } else {
                        dnVar = null;
                    }
                    if (dnVar != null) {
                        ((ArrayList) this.f12902d).add(new fn(dnVar));
                    }
                }
            }
        } catch (RemoteException e3) {
            u9.i.f("", e3);
        }
        try {
            List listT = ((fo) this.f12901c).T();
            if (listT != null) {
                for (Object obj2 : listT) {
                    q9.l1 l1VarL4 = obj2 instanceof IBinder ? q9.m2.l4((IBinder) obj2) : null;
                    if (l1VarL4 != null) {
                        ((ArrayList) this.f12905g).add(new d8.u(l1VarL4));
                    }
                }
            }
        } catch (RemoteException e7) {
            u9.i.f("", e7);
        }
        try {
            en enVarM = ((fo) this.f12901c).m();
            if (enVarM != null) {
                fnVar = new fn(enVarM);
            }
        } catch (RemoteException e10) {
            u9.i.f("", e10);
        }
        this.f12903e = fnVar;
        try {
            if (((fo) this.f12901c).o() != null) {
                new an(((fo) this.f12901c).o(), 0);
            }
        } catch (RemoteException e11) {
            u9.i.f("", e11);
        }
    }

    private final void c() {
    }

    @Override // p9.d
    /* JADX INFO: renamed from: l */
    public void mo5l() {
    }
}
