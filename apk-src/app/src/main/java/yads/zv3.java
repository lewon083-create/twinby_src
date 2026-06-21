package yads;

import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia f45552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ha f45553b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public yv3 f45555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ka f45556e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f45559h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f45560j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gx3 f45554c = new gx3();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45557f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45558g = false;

    public zv3(ha haVar, ia iaVar, String str) {
        ka uv3Var;
        this.f45553b = haVar;
        this.f45552a = iaVar;
        this.f45559h = str;
        a();
        if (iaVar.a() == ja.f39791c || iaVar.a() == ja.f39793e) {
            uv3Var = new uv3(iaVar.d(), str);
        } else {
            uv3Var = new gw3(str, iaVar.c(), iaVar.b());
        }
        this.f45556e = uv3Var;
        this.f45556e.c();
        qw3.a().a(this);
        this.f45556e.a(haVar);
    }

    public final void a() {
        this.f45555d = new yv3(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        if (this.f45558g) {
            return;
        }
        this.f45555d.clear();
        if (!this.f45558g) {
            this.f45554c.f38939a.clear();
        }
        this.f45558g = true;
        ka kaVar = this.f45556e;
        lx3.f40715a.a((WebView) kaVar.f40127b.get(), "finishSession", kaVar.f40126a);
        qw3 qw3Var = qw3.f42411c;
        boolean z5 = qw3Var.f42413b.size() > 0;
        qw3Var.f42412a.remove(this);
        qw3Var.f42413b.remove(this);
        if (z5 && qw3Var.f42413b.size() <= 0) {
            mx3 mx3VarA = mx3.a();
            mx3VarA.getClass();
            a93 a93Var = a93.f36657g;
            a93Var.getClass();
            Handler handler = a93.i;
            if (handler != null) {
                handler.removeCallbacks(a93.f36660k);
                a93.i = null;
            }
            a93Var.f36661a.clear();
            a93.f36658h.post(new x83(a93Var));
            ew3 ew3Var = ew3.f38270d;
            ew3Var.f43801a = false;
            ew3Var.f43803c = null;
            yw3 yw3Var = mx3VarA.f41103d;
            yw3Var.f45179b.getContentResolver().unregisterContentObserver(yw3Var);
        }
        this.f45556e.b();
        this.f45556e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        if (this.f45557f || this.f45556e == null) {
            return;
        }
        this.f45557f = true;
        qw3 qw3Var = qw3.f42411c;
        boolean z5 = qw3Var.f42413b.size() > 0;
        qw3Var.f42413b.add(this);
        if (!z5) {
            mx3 mx3VarA = mx3.a();
            mx3VarA.getClass();
            ew3 ew3Var = ew3.f38270d;
            ew3Var.f43803c = mx3VarA;
            ew3Var.b();
            a93.f36657g.getClass();
            if (a93.i == null) {
                Handler handler = new Handler(Looper.getMainLooper());
                a93.i = handler;
                handler.post(a93.f36659j);
                a93.i.postDelayed(a93.f36660k, 200L);
            }
            yw3 yw3Var = mx3VarA.f41103d;
            yw3Var.f45185h.submit(new tw3(yw3Var));
            yw3Var.f45179b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, yw3Var);
        }
        float f10 = mx3.a().f41100a;
        ka kaVar = this.f45556e;
        lx3 lx3Var = lx3.f40715a;
        lx3Var.a((WebView) kaVar.f40127b.get(), "setDeviceVolume", Float.valueOf(f10), kaVar.f40126a);
        ka kaVar2 = this.f45556e;
        Date date = sv3.f43095f.f43097b;
        Date date2 = date != null ? (Date) date.clone() : null;
        kaVar2.getClass();
        if (date2 != null) {
            JSONObject jSONObject = new JSONObject();
            ow3.a(jSONObject, "timestamp", Long.valueOf(date2.getTime()));
            lx3Var.a((WebView) kaVar2.f40127b.get(), "setLastActivity", jSONObject);
        }
        this.f45556e.a(this, this.f45552a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view) {
        if (this.f45558g || ((View) this.f45555d.get()) == view) {
            return;
        }
        this.f45555d = new yv3(view);
        this.f45556e.a();
        Collection<zv3> collectionUnmodifiableCollection = Collections.unmodifiableCollection(qw3.f42411c.f42412a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (zv3 zv3Var : collectionUnmodifiableCollection) {
            if (zv3Var != this && ((View) zv3Var.f45555d.get()) == view) {
                zv3Var.f45555d.clear();
            }
        }
    }
}
