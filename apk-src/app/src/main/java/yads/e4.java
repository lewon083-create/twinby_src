package yads;

import android.util.Log;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zv3 f38002a;

    public e4(zv3 zv3Var) {
        this.f38002a = zv3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        zv3 zv3Var = this.f38002a;
        boolean z5 = zv3Var.f45558g;
        if (z5) {
            throw new IllegalStateException("AdSession is finished");
        }
        if (gb2.f38693c != zv3Var.f45553b.f39111a) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
        if (!zv3Var.f45557f || z5) {
            try {
                zv3Var.c();
            } catch (Exception unused) {
            }
        }
        zv3 zv3Var2 = this.f38002a;
        if (!zv3Var2.f45557f || zv3Var2.f45558g) {
            return;
        }
        if (zv3Var2.i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
        ka kaVar = zv3Var2.f45556e;
        lx3.f40715a.a((WebView) kaVar.f40127b.get(), "publishImpressionEvent", kaVar.f40126a);
        zv3Var2.i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(qc3 qc3Var) {
        hx3.a(this.f38002a);
        zv3 zv3Var = this.f38002a;
        if (gb2.f38693c == zv3Var.f45553b.f39111a) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("skippable", qc3Var.f42270a);
                if (qc3Var.f42270a) {
                    jSONObject.put("skipOffset", qc3Var.f42271b);
                }
                jSONObject.put("autoPlay", qc3Var.f42272c);
                jSONObject.put("position", qc3Var.f42273d);
            } catch (JSONException e3) {
                Log.e("OMIDLIB", "VastProperties: JSON error", e3);
            }
            if (!zv3Var.f45560j) {
                ka kaVar = zv3Var.f45556e;
                lx3.f40715a.a((WebView) kaVar.f40127b.get(), "publishLoadedEvent", jSONObject, kaVar.f40126a);
                zv3Var.f45560j = true;
                return;
            }
            throw new IllegalStateException("Loaded event can only be sent once");
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }
}
