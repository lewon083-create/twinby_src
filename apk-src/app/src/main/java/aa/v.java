package aa;

import com.google.android.gms.internal.ads.gm;
import com.google.android.gms.internal.ads.ll;
import com.google.android.gms.internal.ads.ya;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends da.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f712a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f714c;

    public v(a aVar, String str) {
        this.f713b = str;
        this.f714c = aVar;
    }

    @Override // da.a
    public final void a(String str) {
        switch (this.f712a) {
            case 0:
                a aVar = (a) this.f714c;
                u9.i.h("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
                String strConcat = ((Boolean) gm.f5856c.r()).booleanValue() ? ",\"as\":".concat(aVar.f546k.b().toString()) : "";
                Locale locale = Locale.getDefault();
                ya yaVar = gm.f5858e;
                String str2 = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", this.f713b, str, Long.valueOf(((Boolean) yaVar.r()).booleanValue() ? ((Long) gm.f5861h.r()).longValue() : 0L), strConcat);
                if (((Boolean) yaVar.r()).booleanValue()) {
                    try {
                        aVar.f544h.execute(new ed.c(2, this, str2));
                    } catch (RuntimeException e3) {
                        p9.k.C.f31302h.e("TaggingLibraryJsInterface.getQueryInfo.onFailure", e3);
                    }
                } else {
                    aVar.f538b.evaluateJavascript(str2, null);
                }
                if (((Boolean) gm.f5856c.r()).booleanValue() && ((Boolean) gm.f5857d.r()).booleanValue()) {
                    f0 f0Var = aVar.f547l;
                    f0Var.getClass();
                    f0Var.f583c.execute(new e0(f0Var, 0));
                    break;
                }
                break;
            default:
                u9.i.h("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
                try {
                    ll llVar = (ll) this.f714c;
                    llVar.f7564g.v(llVar.b(this.f713b, str).toString());
                } catch (JSONException e7) {
                    u9.i.f("Error creating PACT Error Response JSON: ", e7);
                }
                break;
        }
    }

    @Override // da.a
    public final void b(v7.f fVar) {
        String str;
        switch (this.f712a) {
            case 0:
                String str2 = this.f713b;
                a aVar = (a) this.f714c;
                String str3 = ((d8.b) fVar.f34767c).f15582a;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("paw_id", str2);
                    if (((Boolean) gm.f5856c.r()).booleanValue()) {
                        jSONObject.put("as", aVar.f546k.b());
                    }
                    jSONObject.put("sdk_ttl_ms", ((Boolean) gm.f5858e.r()).booleanValue() ? ((Long) gm.f5861h.r()).longValue() : 0L);
                    jSONObject.put("signal", str3);
                    str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
                } catch (JSONException unused) {
                    str = String.format(Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, ((d8.b) fVar.f34767c).f15582a, Long.valueOf(((Boolean) gm.f5858e.r()).booleanValue() ? ((Long) gm.f5861h.r()).longValue() : 0L), ((Boolean) gm.f5856c.r()).booleanValue() ? ",\"as\":".concat(aVar.f546k.b().toString()) : "");
                }
                if (((Boolean) gm.f5858e.r()).booleanValue()) {
                    try {
                        aVar.f544h.execute(new k0.i(2, this, str));
                    } catch (RuntimeException e3) {
                        p9.k.C.f31302h.e("TaggingLibraryJsInterface.getQueryInfo.onSuccess", e3);
                    }
                } else {
                    aVar.f538b.evaluateJavascript(str, null);
                }
                if (((Boolean) gm.f5856c.r()).booleanValue() && ((Boolean) gm.f5857d.r()).booleanValue()) {
                    f0 f0Var = aVar.f547l;
                    f0Var.getClass();
                    f0Var.f583c.execute(new e0(f0Var, 0));
                    break;
                }
                break;
            default:
                String str4 = ((d8.b) fVar.f34767c).f15582a;
                try {
                    ll llVar = (ll) this.f714c;
                    llVar.f7564g.v(llVar.c(this.f713b, str4).toString());
                } catch (JSONException e7) {
                    u9.i.f("Error creating PACT Signal Response JSON: ", e7);
                }
                break;
        }
    }

    public v(ll llVar, String str) {
        this.f713b = str;
        Objects.requireNonNull(llVar);
        this.f714c = llVar;
    }
}
