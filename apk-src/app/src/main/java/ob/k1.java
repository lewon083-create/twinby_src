package ob;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k1 implements m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f30217b;

    public /* synthetic */ k1(l1 l1Var) {
        this.f30217b = l1Var;
    }

    public void a(Bundle bundle, String str) {
        String string;
        l1 l1Var = this.f30217b;
        i1 i1Var = l1Var.f30266h;
        z0 z0Var = l1Var.f30264f;
        l1.k(i1Var);
        i1Var.C();
        if (l1Var.a()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        l1.h(z0Var);
        z0Var.f30598x.e(string);
        y0 y0Var = z0Var.f30599y;
        l1Var.f30269l.getClass();
        y0Var.g(System.currentTimeMillis());
    }

    public boolean b() {
        if (!c()) {
            return false;
        }
        l1 l1Var = this.f30217b;
        l1Var.f30269l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        z0 z0Var = l1Var.f30264f;
        l1.h(z0Var);
        return jCurrentTimeMillis - z0Var.f30599y.f() > l1Var.f30263e.J(null, d0.f30022j0);
    }

    public boolean c() {
        z0 z0Var = this.f30217b.f30264f;
        l1.h(z0Var);
        return z0Var.f30599y.f() > 0;
    }

    @Override // ob.m2
    public void n(int i, Throwable th2, byte[] bArr) {
        int i10;
        s0 s0Var;
        s0 s0Var2;
        l1 l1Var = this.f30217b;
        s0 s0Var3 = l1Var.f30265g;
        if (i != 200 && i != 204) {
            i10 = 304;
            if (i != 304) {
                i10 = i;
            }
            l1.k(s0Var3);
            s0Var3.f30413j.h(Integer.valueOf(i10), "Network Request for Deferred Deep Link failed. response, exception", th2);
        }
        i10 = i;
        if (th2 == null) {
            z0 z0Var = l1Var.f30264f;
            l1.h(z0Var);
            z0Var.f30595u.b(true);
            if (bArr == null || bArr.length == 0) {
                l1.k(s0Var3);
                s0Var3.f30417n.f("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String strOptString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(strOptString)) {
                    l1.k(s0Var3);
                    s0Var3.f30417n.f("Deferred Deep Link is empty.");
                    return;
                }
                String strOptString2 = jSONObject.optString("gclid", "");
                String strOptString3 = jSONObject.optString("gbraid", "");
                String strOptString4 = jSONObject.optString("gad_source", "");
                double dOptDouble = jSONObject.optDouble("timestamp", ConfigValue.DOUBLE_DEFAULT_VALUE);
                Bundle bundle = new Bundle();
                e4 e4Var = l1Var.f30267j;
                l1.h(e4Var);
                l1 l1Var2 = (l1) e4Var.f15951b;
                if (TextUtils.isEmpty(strOptString)) {
                    s0Var2 = s0Var3;
                } else {
                    Context context = l1Var2.f30260b;
                    s0Var2 = s0Var3;
                    try {
                        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                        if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                            if (!TextUtils.isEmpty(strOptString3)) {
                                bundle.putString("gbraid", strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                bundle.putString("gad_source", strOptString4);
                            }
                            bundle.putString("gclid", strOptString2);
                            bundle.putString("_cis", "ddp");
                            l1Var.f30271n.J("auto", "_cmp", bundle);
                            if (TextUtils.isEmpty(strOptString)) {
                                return;
                            }
                            try {
                                SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                editorEdit.putString("deeplink", strOptString);
                                editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                if (editorEdit.commit()) {
                                    Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                    Context context2 = l1Var2.f30260b;
                                    if (Build.VERSION.SDK_INT < 34) {
                                        context2.sendBroadcast(intent);
                                        return;
                                    } else {
                                        context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                        return;
                                    }
                                }
                                return;
                            } catch (RuntimeException e3) {
                                s0 s0Var4 = ((l1) e4Var.f15951b).f30265g;
                                l1.k(s0Var4);
                                s0Var4.f30411g.g(e3, "Failed to persist Deferred Deep Link. exception");
                                return;
                            }
                        }
                    } catch (JSONException e7) {
                        e = e7;
                        s0Var = s0Var2;
                        l1.k(s0Var);
                        s0Var.f30411g.g(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                }
                l1.k(s0Var2);
                s0Var = s0Var2;
                try {
                    s0Var.f30413j.i("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                    return;
                } catch (JSONException e10) {
                    e = e10;
                    l1.k(s0Var);
                    s0Var.f30411g.g(e, "Failed to parse the Deferred Deep Link response. exception");
                    return;
                }
            } catch (JSONException e11) {
                e = e11;
                s0Var = s0Var3;
            }
        }
        l1.k(s0Var3);
        s0Var3.f30413j.h(Integer.valueOf(i10), "Network Request for Deferred Deep Link failed. response, exception", th2);
    }
}
