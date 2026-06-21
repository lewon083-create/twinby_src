package com.google.android.gms.internal.ads;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tv implements wv {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final List f10721l = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gq1 f10722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f10723b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f10726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final uv f10728g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f10724c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f10725d = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f10729h = new Object();
    public final HashSet i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10730j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f10731k = false;

    public tv(Context context, u9.a aVar, uv uvVar, String str) {
        pa.c0.j(uvVar, "SafeBrowsing config is not present.");
        this.f10726e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f10723b = new LinkedHashMap();
        this.f10728g = uvVar;
        Iterator it = uvVar.f11109f.iterator();
        while (it.hasNext()) {
            this.i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.i.remove("cookie".toLowerCase(Locale.ENGLISH));
        gq1 gq1VarC = lr1.C();
        gq1VarC.b();
        ((lr1) gq1VarC.f9560c).N(9);
        if (str != null) {
            gq1VarC.b();
            ((lr1) gq1VarC.f9560c).D(str);
            gq1VarC.b();
            ((lr1) gq1VarC.f9560c).E(str);
        }
        hq1 hq1VarZ = iq1.z();
        String str2 = this.f10728g.f11105b;
        if (str2 != null) {
            hq1VarZ.b();
            ((iq1) hq1VarZ.f9560c).A(str2);
        }
        iq1 iq1Var = (iq1) hq1VarZ.d();
        gq1VarC.b();
        ((lr1) gq1VarC.f9560c).F(iq1Var);
        fr1 fr1VarZ = gr1.z();
        boolean zE = wa.b.a(this.f10726e).e();
        fr1VarZ.b();
        ((gr1) fr1VarZ.f9560c).C(zE);
        String str3 = aVar.f34365b;
        if (str3 != null) {
            fr1VarZ.b();
            ((gr1) fr1VarZ.f9560c).A(str3);
        }
        ma.g gVar = ma.g.f28775b;
        Context context2 = this.f10726e;
        gVar.getClass();
        long jA = ma.g.a(context2);
        if (jA > 0) {
            fr1VarZ.b();
            ((gr1) fr1VarZ.f9560c).B(jA);
        }
        gr1 gr1Var = (gr1) fr1VarZ.d();
        gq1VarC.b();
        ((lr1) gq1VarC.f9560c).K(gr1Var);
        this.f10722a = gq1VarC;
    }

    public final void a(String str) {
        synchronized (this.f10729h) {
            try {
                if (str == null) {
                    gq1 gq1Var = this.f10722a;
                    gq1Var.b();
                    ((lr1) gq1Var.f9560c).I();
                } else {
                    gq1 gq1Var2 = this.f10722a;
                    gq1Var2.b();
                    ((lr1) gq1Var2.f9560c).H(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(int i, String str, Map map) {
        synchronized (this.f10729h) {
            if (i == 3) {
                try {
                    this.f10731k = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            LinkedHashMap linkedHashMap = this.f10723b;
            if (linkedHashMap.containsKey(str)) {
                if (i == 3) {
                    dr1 dr1Var = (dr1) linkedHashMap.get(str);
                    dr1Var.b();
                    ((er1) dr1Var.f9560c).G(4);
                }
                return;
            }
            dr1 dr1VarB = er1.B();
            int i10 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 4 : 3 : 2 : 1;
            if (i10 != 0) {
                dr1VarB.b();
                ((er1) dr1VarB.f9560c).G(i10);
            }
            int size = linkedHashMap.size();
            dr1VarB.b();
            ((er1) dr1VarB.f9560c).C(size);
            dr1VarB.b();
            ((er1) dr1VarB.f9560c).D(str);
            qq1 qq1VarZ = sq1.z();
            if (!this.i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        oq1 oq1VarZ = pq1.z();
                        Charset charset = ao1.f3341a;
                        zm1 zm1Var = new zm1(str2.getBytes(charset));
                        oq1VarZ.b();
                        ((pq1) oq1VarZ.f9560c).A(zm1Var);
                        zm1 zm1Var2 = new zm1(str3.getBytes(charset));
                        oq1VarZ.b();
                        ((pq1) oq1VarZ.f9560c).B(zm1Var2);
                        pq1 pq1Var = (pq1) oq1VarZ.d();
                        qq1VarZ.b();
                        ((sq1) qq1VarZ.f9560c).A(pq1Var);
                    }
                }
            }
            sq1 sq1Var = (sq1) qq1VarZ.d();
            dr1VarB.b();
            ((er1) dr1VarB.f9560c).E(sq1Var);
            linkedHashMap.put(str, dr1VarB);
        }
    }
}
