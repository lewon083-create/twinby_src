package ob;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.oq;
import com.google.android.gms.internal.ads.ur;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends s1 {
    public static final Pair A = new Pair("", 0L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences f30579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f30580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public oq f30581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0 f30582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b7 f30583h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f30584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f30585k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0 f30586l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x0 f30587m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b7 f30588n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s7.g f30589o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x0 f30590p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y0 f30591q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y0 f30592r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f30593s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x0 f30594t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x0 f30595u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y0 f30596v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b7 f30597w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b7 f30598x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y0 f30599y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final s7.g f30600z;

    public z0(l1 l1Var) {
        super(l1Var);
        this.f30586l = new y0(this, "session_timeout", 1800000L);
        this.f30587m = new x0(this, "start_new_session", true);
        this.f30591q = new y0(this, "last_pause_time", 0L);
        this.f30592r = new y0(this, "session_id", 0L);
        this.f30588n = new b7(this, "non_personalized_ads");
        this.f30589o = new s7.g(this, "last_received_uri_timestamps_by_source");
        this.f30590p = new x0(this, "allow_remote_dynamite", false);
        this.f30582g = new y0(this, "first_open_time", 0L);
        pa.c0.f("app_install_time");
        this.f30583h = new b7(this, "app_instance_id");
        this.f30594t = new x0(this, "app_backgrounded", false);
        this.f30595u = new x0(this, "deep_link_retrieval_complete", false);
        this.f30596v = new y0(this, "deep_link_retrieval_attempts", 0L);
        this.f30597w = new b7(this, "firebase_feature_rollouts");
        this.f30598x = new b7(this, "deferred_attribution_cache");
        this.f30599y = new y0(this, "deferred_attribution_cache_timestamp", 0L);
        this.f30600z = new s7.g(this, "default_event_parameters");
    }

    @Override // ob.s1
    public final boolean D() {
        return true;
    }

    public final SharedPreferences G() {
        C();
        E();
        pa.c0.i(this.f30579d);
        return this.f30579d;
    }

    public final SharedPreferences H() {
        C();
        E();
        if (this.f30580e == null) {
            l1 l1Var = (l1) this.f15951b;
            String strValueOf = String.valueOf(l1Var.f30260b.getPackageName());
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            ur urVar = s0Var.f30418o;
            String strConcat = strValueOf.concat("_preferences");
            urVar.g(strConcat, "Default prefs file");
            this.f30580e = l1Var.f30260b.getSharedPreferences(strConcat, 0);
        }
        return this.f30580e;
    }

    public final SparseArray I() {
        Bundle bundleN = this.f30589o.N();
        int[] intArray = bundleN.getIntArray("uriSources");
        long[] longArray = bundleN.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            s0 s0Var = ((l1) this.f15951b).f30265g;
            l1.k(s0Var);
            s0Var.f30411g.f("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final x1 J() {
        C();
        return x1.c(G().getInt("consent_source", 100), G().getString("consent_settings", "G1"));
    }

    public final boolean K(l3 l3Var) {
        C();
        String string = G().getString("stored_tcf_param", "");
        String strA = l3Var.a();
        if (strA.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = G().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        return true;
    }

    public final void L(boolean z5) {
        C();
        s0 s0Var = ((l1) this.f15951b).f30265g;
        l1.k(s0Var);
        s0Var.f30418o.g(Boolean.valueOf(z5), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = G().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z5);
        editorEdit.apply();
    }

    public final boolean M(long j10) {
        return j10 - this.f30586l.f() > this.f30591q.f();
    }
}
