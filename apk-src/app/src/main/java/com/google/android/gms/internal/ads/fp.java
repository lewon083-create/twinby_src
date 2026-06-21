package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fp implements kx, lx, uq, vq, w9.b, y9.b, yt, d2, k81, e80 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ fp f5407c = new fp(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ fp f5408d = new fp(5);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ fp f5409e = new fp(21);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ fp f5410f = new fp(22);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ fp f5411g = new fp(26);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ fp f5412h = new fp(27);
    public static final /* synthetic */ fp i = new fp(28);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ fp f5413j = new fp(29);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5414b;

    public /* synthetic */ fp(int i10) {
        this.f5414b = i10;
    }

    public static final sz e(final Context context, final j0 j0Var, final String str, final boolean z5, final boolean z10, final xe xeVar, final nl nlVar, final u9.a aVar, final kx0 kx0Var, final l6.i iVar, final si siVar, final xp0 xp0Var, final zp0 zp0Var, final ph0 ph0Var, final jq0 jq0Var, final sd0 sd0Var) {
        al.a(context);
        try {
            o31 o31Var = new o31() { // from class: com.google.android.gms.internal.ads.xz
                @Override // com.google.android.gms.internal.ads.o31
                /* JADX INFO: renamed from: h */
                public final Object mo8h() {
                    j0 j0Var2 = j0Var;
                    String str2 = str;
                    boolean z11 = z5;
                    boolean z12 = z10;
                    ph0 ph0Var2 = ph0Var;
                    sd0 sd0Var2 = sd0Var;
                    p9.g gVar = kx0Var;
                    l6.i iVar2 = iVar;
                    si siVar2 = siVar;
                    xp0 xp0Var2 = xp0Var;
                    zp0 zp0Var2 = zp0Var;
                    jq0 jq0Var2 = jq0Var;
                    xe xeVar2 = xeVar;
                    nl nlVar2 = nlVar;
                    u9.a aVar2 = aVar;
                    Context context2 = context;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i10 = g00.f5560d0;
                        r00 r00Var = new r00(context2);
                        r00Var.setBaseContext(context2);
                        d00 d00Var = new d00(new g00(r00Var, j0Var2, str2, z11, xeVar2, nlVar2, aVar2, gVar, iVar2, siVar2, xp0Var2, zp0Var2, jq0Var2), sd0Var2);
                        d00Var.setWebViewClient(p9.k.C.f31300f.j(d00Var, siVar2, z12, ph0Var2));
                        d00Var.setWebChromeClient(new bj.i(d00Var));
                        return d00Var;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object objMo8h = o31Var.mo8h();
                StrictMode.setThreadPolicy(threadPolicy);
                return (sz) objMo8h;
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th2;
            }
        } catch (Throwable th3) {
            throw new b00("Webview initialization failed.", th3);
        }
    }

    public static final void f(String str, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i10));
            }
            Collections.unmodifiableList(arrayList);
        }
    }

    @Override // com.google.android.gms.internal.ads.lx, com.google.android.gms.internal.ads.e80
    /* JADX INFO: renamed from: a */
    public void mo7a(Object obj) {
        switch (this.f5414b) {
            case 2:
                t9.c0.m("Ending javascript session.");
                tq tqVar = (tq) ((sq) obj);
                HashSet<AbstractMap.SimpleEntry> hashSet = tqVar.f10694c;
                for (AbstractMap.SimpleEntry simpleEntry : hashSet) {
                    t9.c0.m("Unregistering eventhandler: ".concat(String.valueOf(((vo) simpleEntry.getValue()).toString())));
                    tqVar.f10693b.i((String) simpleEntry.getKey(), (vo) simpleEntry.getValue());
                }
                hashSet.clear();
                break;
            case 3:
                hx.f6284f.execute(new lq((hq) obj, 2));
                break;
            case 26:
                ((q9.a) obj).onAdClicked();
                break;
            case 27:
                ((m60) obj).i();
                break;
            case 28:
                ((p60) obj).j(vv.C(11, null, null));
                break;
            default:
                ((r60) obj).z();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.kx, com.google.android.gms.internal.ads.vm, com.google.android.gms.internal.ads.al0
    /* JADX INFO: renamed from: h */
    public void mo4h() {
        int i10 = this.f5414b;
    }

    @Override // com.google.android.gms.internal.ads.vq
    public /* bridge */ /* synthetic */ JSONObject i(Object obj) {
        return (JSONObject) obj;
    }

    @Override // com.google.android.gms.internal.ads.uq
    public /* synthetic */ Object x(JSONObject jSONObject) {
        switch (this.f5414b) {
            case 4:
                return jSONObject;
            default:
                return new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
        }
    }

    @Override // com.google.android.gms.internal.ads.d2
    public z1[] h() {
        switch (this.f5414b) {
            case 21:
                AtomicInteger atomicInteger = jz.f7008v;
                return new z1[]{new b6(), new b5()};
            default:
                AtomicInteger atomicInteger2 = jz.f7008v;
                return new z1[]{new b6(), new b5(), new x5(z6.A1, 32, r51.f9713f)};
        }
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i, reason: collision with other method in class */
    public /* synthetic */ void mo6i(Object obj) {
        ((r40) obj).p();
    }

    private final /* synthetic */ void g() {
    }

    private final void j() {
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.yt
    public void c(String str, Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.yt
    public void d(Throwable th2, String str, float f10) {
    }
}
