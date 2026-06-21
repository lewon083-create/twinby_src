package p9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.di;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.pl;
import com.google.android.gms.internal.ads.uu;
import com.google.android.gms.internal.auth.m;
import java.util.TreeMap;
import pa.c0;
import q9.a1;
import q9.b0;
import q9.b2;
import q9.b3;
import q9.d3;
import q9.g3;
import q9.j3;
import q9.k0;
import q9.s1;
import q9.v;
import q9.v0;
import q9.y;
import q9.y0;
import q9.y1;
import t.x1;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u9.a f31288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3 f31289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f31290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x1 f31291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WebView f31292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y f31293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AsyncTask f31294h;

    public j(Context context, g3 g3Var, String str, u9.a aVar) {
        String strConcat;
        this.f31290d = context;
        this.f31288b = aVar;
        this.f31289c = g3Var;
        this.f31292f = new WebView(context);
        x1 x1Var = new x1();
        x1Var.f33317b = context.getApplicationContext();
        x1Var.f33318c = str;
        x1Var.f33319d = new TreeMap();
        String packageName = context.getPackageName();
        try {
            String str2 = wa.b.a(context).d(0, context.getPackageName()).versionName;
            StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str2).length());
            sb2.append(packageName);
            sb2.append("-");
            sb2.append(str2);
            strConcat = sb2.toString();
        } catch (PackageManager.NameNotFoundException e3) {
            u9.i.f("Unable to get package version name for reporting", e3);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        x1Var.f33322g = strConcat;
        this.f31291e = x1Var;
        l4(0);
        this.f31292f.setVerticalScrollBarEnabled(false);
        this.f31292f.getSettings().setJavaScriptEnabled(true);
        this.f31292f.setWebViewClient(new bj.h(3, this));
        this.f31292f.setOnTouchListener(new h(0));
    }

    @Override // q9.l0
    public final String A() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // q9.l0
    public final y1 B() {
        return null;
    }

    @Override // q9.l0
    public final b2 C() {
        return null;
    }

    @Override // q9.l0
    public final void C1(j3 j3Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q9.l0
    public final void F1() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q9.l0
    public final void I3(y0 y0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q9.l0
    public final boolean J() {
        return false;
    }

    @Override // q9.l0
    public final void J1(di diVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q9.l0
    public final void N() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q9.l0
    public final boolean P() {
        return false;
    }

    @Override // q9.l0
    public final void V3(v vVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q9.l0
    public final boolean X(d3 d3Var) {
        c0.j(this.f31292f, "This Search Ad has already been torn down");
        x1 x1Var = this.f31291e;
        TreeMap treeMap = (TreeMap) x1Var.f33319d;
        x1Var.f33320e = d3Var.f31809k.f31987b;
        Bundle bundle = d3Var.f31812n;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) pl.f9094c.r();
            for (String str2 : bundle2.keySet()) {
                if (str.equals(str2)) {
                    x1Var.f33321f = bundle2.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    treeMap.put(str2.substring(4), bundle2.getString(str2));
                }
            }
            treeMap.put("SDKVersion", this.f31288b.f34365b);
            if (((Boolean) pl.f9092a.r()).booleanValue()) {
                Bundle bundleE = m.E((Context) x1Var.f33317b, (String) pl.f9093b.r());
                for (String str3 : bundleE.keySet()) {
                    treeMap.put(str3, bundleE.get(str3).toString());
                }
            }
        }
        this.f31294h = new i(this).execute(new Void[0]);
        return true;
    }

    @Override // q9.l0
    public final void a2(b3 b3Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q9.l0
    public final y b0() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // q9.l0
    public final void b3(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q9.l0
    public final void c() {
        c0.e("pause must be called on the main UI thread.");
    }

    @Override // q9.l0
    public final void e() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q9.l0
    public final void f1(boolean z5) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q9.l0
    public final boolean g() {
        return false;
    }

    @Override // q9.l0
    public final long g0() {
        return 0L;
    }

    @Override // q9.l0
    public final void h() {
        c0.e("destroy must be called on the main UI thread.");
        this.f31294h.cancel(true);
        this.f31292f.destroy();
        this.f31292f = null;
    }

    @Override // q9.l0
    public final void i0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q9.l0
    public final xa.a j() {
        c0.e("getAdFrame must be called on the main UI thread.");
        return new xa.b(this.f31292f);
    }

    @Override // q9.l0
    public final void j3(y yVar) {
        this.f31293g = yVar;
    }

    @Override // q9.l0
    public final void j4(gl glVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q9.l0
    public final void k() {
        c0.e("resume must be called on the main UI thread.");
    }

    @Override // q9.l0
    public final void k2(uu uuVar) {
        throw new IllegalStateException("Unused method");
    }

    public final void l4(int i) {
        if (this.f31292f == null) {
            return;
        }
        this.f31292f.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    public final String m4() {
        String str = (String) this.f31291e.f33321f;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        String str2 = (String) pl.f9095d.r();
        return z.g(new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length()), "https://", str, str2);
    }

    @Override // q9.l0
    public final Bundle n() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q9.l0
    public final void o() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q9.l0
    public final void p() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q9.l0
    public final g3 q() {
        return this.f31289c;
    }

    @Override // q9.l0
    public final void s() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q9.l0
    public final v0 u() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // q9.l0
    public final String v() {
        return null;
    }

    @Override // q9.l0
    public final void v1(v0 v0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q9.l0
    public final String x() {
        return null;
    }

    @Override // q9.l0
    public final void y2(g3 g3Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // q9.l0
    public final void B2(s1 s1Var) {
    }

    @Override // q9.l0
    public final void C0(xa.a aVar) {
    }

    @Override // q9.l0
    public final void S2(boolean z5) {
    }

    @Override // q9.l0
    public final void e1(long j10) {
    }

    @Override // q9.l0
    public final void o3(a1 a1Var) {
    }

    @Override // q9.l0
    public final void R3(d3 d3Var, b0 b0Var) {
    }
}
