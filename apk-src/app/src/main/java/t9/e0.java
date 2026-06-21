package t9;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.yw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ob.h4;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33565b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ed.d f33567d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f33569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences.Editor f33570g;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f33572j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f33564a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f33566c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ph f33568e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f33571h = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f33573k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f33574l = "-1";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f33575m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public yw f33576n = new yw("", 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f33577o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f33578p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f33579q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f33580r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Set f33581s = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public JSONObject f33582t = new JSONObject();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f33583u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f33584v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f33585w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f33586x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f33587y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f33588z = "";
    public String A = "{}";
    public int B = -1;
    public int C = -1;
    public long D = 0;
    public boolean E = false;

    public final void a(String str) {
        i();
        synchronized (this.f33564a) {
            try {
                this.f33574l = str;
                if (this.f33570g != null) {
                    if (str.equals("-1")) {
                        this.f33570g.remove("IABTCF_TCString");
                    } else {
                        this.f33570g.putString("IABTCF_TCString", str);
                    }
                    this.f33570g.apply();
                }
                j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(int i) {
        i();
        synchronized (this.f33564a) {
            try {
                this.f33575m = i;
                SharedPreferences.Editor editor = this.f33570g;
                if (editor != null) {
                    if (i == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i);
                    }
                    this.f33570g.apply();
                }
                j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(int i) {
        i();
        synchronized (this.f33564a) {
            try {
                if (this.C == i) {
                    return;
                }
                this.C = i;
                SharedPreferences.Editor editor = this.f33570g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i);
                    this.f33570g.apply();
                }
                j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(long j10) {
        i();
        synchronized (this.f33564a) {
            try {
                if (this.D == j10) {
                    return;
                }
                this.D = j10;
                SharedPreferences.Editor editor = this.f33570g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j10);
                    this.f33570g.apply();
                }
                j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(boolean z5) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3229ua)).booleanValue()) {
            i();
            synchronized (this.f33564a) {
                try {
                    if (this.f33587y == z5) {
                        return;
                    }
                    this.f33587y = z5;
                    SharedPreferences.Editor editor = this.f33570g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z5);
                        this.f33570g.apply();
                    }
                    j();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void f(String str) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3229ua)).booleanValue()) {
            i();
            synchronized (this.f33564a) {
                try {
                    if (this.f33588z.equals(str)) {
                        return;
                    }
                    this.f33588z = str;
                    SharedPreferences.Editor editor = this.f33570g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f33570g.apply();
                    }
                    j();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void g(String str) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Ia)).booleanValue()) {
            i();
            synchronized (this.f33564a) {
                try {
                    if (this.A.equals(str)) {
                        return;
                    }
                    this.A = str;
                    SharedPreferences.Editor editor = this.f33570g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.f33570g.apply();
                    }
                    j();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void h() {
        i();
        synchronized (this.f33564a) {
            try {
                if (this.E) {
                    return;
                }
                this.E = true;
                SharedPreferences.Editor editor = this.f33570g;
                if (editor != null) {
                    editor.putBoolean("is_install_referrer_reported", true);
                    this.f33570g.apply();
                }
                j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i() {
        ed.d dVar = this.f33567d;
        if (dVar == null || dVar.isDone()) {
            return;
        }
        try {
            this.f33567d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            u9.i.i("Interrupted while waiting for preferences loaded.", e3);
        } catch (CancellationException e7) {
            e = e7;
            u9.i.f("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e10) {
            e = e10;
            u9.i.f("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e11) {
            e = e11;
            u9.i.f("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    public final void j() {
        hx.f6279a.execute(new h4(13, this));
    }

    public final void k(Context context) {
        synchronized (this.f33564a) {
            try {
                if (this.f33569f != null) {
                    return;
                }
                this.f33567d = hx.f6279a.a(new s9.i(5, this, context));
                this.f33565b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean l() {
        boolean z5;
        i();
        synchronized (this.f33564a) {
            z5 = this.f33583u;
        }
        return z5;
    }

    public final boolean m() {
        boolean z5;
        i();
        synchronized (this.f33564a) {
            z5 = this.f33584v;
        }
        return z5;
    }

    public final yw n() {
        yw ywVar;
        i();
        synchronized (this.f33564a) {
            try {
                if (((Boolean) q9.s.f31967e.f31970c.a(al.Sc)).booleanValue() && this.f33576n.a()) {
                    Iterator it = this.f33566c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                ywVar = this.f33576n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ywVar;
    }

    public final void o(long j10) {
        i();
        synchronized (this.f33564a) {
            try {
                if (this.f33578p == j10) {
                    return;
                }
                this.f33578p = j10;
                SharedPreferences.Editor editor = this.f33570g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j10);
                    this.f33570g.apply();
                }
                j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r3 = new org.json.JSONObject();
        r3.put("template_id", r9);
        r3.put("uses_media_view", r10);
        p9.k.C.f31304k.getClass();
        r3.put("timestamp_ms", java.lang.System.currentTimeMillis());
        r1.put(r2, r3);
        r7.f33582t.put(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        u9.i.i("Could not update native advanced settings", r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            r7.i()
            java.lang.Object r0 = r7.f33564a
            monitor-enter(r0)
            org.json.JSONObject r1 = r7.f33582t     // Catch: java.lang.Throwable -> L14
            org.json.JSONArray r1 = r1.optJSONArray(r8)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L17
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r8 = move-exception
            goto L8f
        L17:
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L14
            r3 = 0
            r4 = r3
        L1d:
            int r5 = r1.length()     // Catch: java.lang.Throwable -> L14
            if (r4 >= r5) goto L48
            org.json.JSONObject r5 = r1.optJSONObject(r4)     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L2b:
            java.lang.String r6 = "template_id"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L14
            boolean r6 = r9.equals(r6)     // Catch: java.lang.Throwable -> L14
            if (r6 == 0) goto L45
            if (r10 == 0) goto L43
            java.lang.String r2 = "uses_media_view"
            boolean r2 = r5.optBoolean(r2, r3)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L43:
            r2 = r4
            goto L48
        L45:
            int r4 = r4 + 1
            goto L1d
        L48:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r3.<init>()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            java.lang.String r4 = "template_id"
            r3.put(r4, r9)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            java.lang.String r9 = "uses_media_view"
            r3.put(r9, r10)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            java.lang.String r9 = "timestamp_ms"
            p9.k r10 = p9.k.C     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            ua.a r10 = r10.f31304k     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r10.getClass()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r3.put(r9, r4)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            org.json.JSONObject r9 = r7.f33582t     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r9.put(r8, r1)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            goto L76
        L70:
            r8 = move-exception
            java.lang.String r9 = "Could not update native advanced settings"
            u9.i.i(r9, r8)     // Catch: java.lang.Throwable -> L14
        L76:
            android.content.SharedPreferences$Editor r8 = r7.f33570g     // Catch: java.lang.Throwable -> L14
            if (r8 == 0) goto L8a
            java.lang.String r9 = "native_advanced_settings"
            org.json.JSONObject r10 = r7.f33582t     // Catch: java.lang.Throwable -> L14
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L14
            r8.putString(r9, r10)     // Catch: java.lang.Throwable -> L14
            android.content.SharedPreferences$Editor r8 = r7.f33570g     // Catch: java.lang.Throwable -> L14
            r8.apply()     // Catch: java.lang.Throwable -> L14
        L8a:
            r7.j()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L8f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.e0.p(java.lang.String, java.lang.String, boolean):void");
    }

    public final String q() {
        String str;
        i();
        synchronized (this.f33564a) {
            str = this.f33585w;
        }
        return str;
    }

    public final void r(String str) {
        i();
        synchronized (this.f33564a) {
            try {
                if (TextUtils.equals(this.f33585w, str)) {
                    return;
                }
                this.f33585w = str;
                SharedPreferences.Editor editor = this.f33570g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f33570g.apply();
                }
                j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void s(boolean z5) {
        i();
        synchronized (this.f33564a) {
            try {
                if (z5 == this.f33573k) {
                    return;
                }
                this.f33573k = z5;
                SharedPreferences.Editor editor = this.f33570g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z5);
                    this.f33570g.apply();
                }
                j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean t() {
        boolean z5;
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.U0)).booleanValue()) {
            return false;
        }
        i();
        synchronized (this.f33564a) {
            z5 = this.f33573k;
        }
        return z5;
    }

    public final void u(boolean z5) {
        i();
        synchronized (this.f33564a) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((Long) q9.s.f31967e.f31970c.a(al.Ib)).longValue();
                SharedPreferences.Editor editor = this.f33570g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z5);
                    this.f33570g.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                    this.f33570g.apply();
                }
                j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
