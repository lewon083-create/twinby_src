package aa;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.d51;
import com.google.android.gms.internal.ads.e51;
import com.google.android.gms.internal.ads.gm;
import com.google.android.gms.internal.measurement.d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApplicationInfo f564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u9.a f566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONObject f567e = new JSONObject();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f568f = new AtomicBoolean(false);

    public c0(Context context, ArrayList arrayList, u9.a aVar) {
        this.f563a = context;
        this.f564b = context.getApplicationInfo();
        this.f565c = arrayList;
        this.f566d = aVar;
    }

    public final void a(WebView webView) {
        if (this.f568f.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoD = null;
        ApplicationInfo applicationInfo = this.f564b;
        if (applicationInfo != null) {
            try {
                packageInfoD = wa.b.a(this.f563a).d(0, applicationInfo.packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        JSONObject jSONObject = this.f567e;
        if (packageInfoD != null) {
            try {
                jSONObject.put("vc", packageInfoD.versionCode);
                jSONObject.put("vnm", packageInfoD.versionName);
            } catch (JSONException e3) {
                p9.k.C.f31302h.d("PawAppSignalGenerator.initialize", e3);
            }
        }
        if (applicationInfo != null) {
            jSONObject.put("pn", applicationInfo.packageName);
        }
        ArrayList arrayList = this.f565c;
        ArrayList arrayList2 = new ArrayList();
        for (String str : ((String) q9.s.f31967e.f31970c.a(al.f2927ab)).split(StringUtils.COMMA, -1)) {
            if (arrayList.contains(str)) {
                arrayList2.add(str);
            }
        }
        jSONObject.put("eid", arrayList2);
        jSONObject.put("js", this.f566d.f34365b);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != null) {
                jSONObject.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
        if (((Boolean) gm.f5855b.r()).booleanValue() && d4.m("DOCUMENT_START_SCRIPT") && webView != null) {
            String str2 = String.format(Locale.getDefault(), (String) q9.s.f31967e.f31970c.a(al.Za), b());
            int i = d51.f4468d;
            e51 e51Var = new e51("*");
            WeakHashMap weakHashMap = z6.b.f46197a;
            if (!a7.p.f498e.b()) {
                throw a7.p.a();
            }
        }
    }

    public final JSONObject b() {
        if (!this.f568f.get()) {
            a(null);
        }
        return this.f567e;
    }
}
