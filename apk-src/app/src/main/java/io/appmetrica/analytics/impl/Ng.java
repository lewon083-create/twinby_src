package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ng extends Qg {
    public Ng(Y4 y42) {
        super(y42);
    }

    @Override // io.appmetrica.analytics.impl.Qg
    public final boolean a(@NonNull Q5 q5) {
        String value = q5.getValue();
        if (TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            wo woVar = this.f22888a.f23300t;
            synchronized (woVar) {
                woVar.c(woVar.b() + 1);
            }
            if (!a(jSONObject.optString("link"))) {
                return false;
            }
            q5.f22872n = Boolean.TRUE;
            b();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void b() {
        wo woVar = this.f22888a.f23300t;
        synchronized (woVar) {
            woVar.a(woVar.a() + 1);
        }
        this.f22888a.z();
        N8 n82 = this.f22888a.f23292l;
        if (n82.f22726c == null) {
            n82.a();
        }
        P8 p82 = n82.f22726c;
        p82.getClass();
        p82.f22830b = new HashSet();
        p82.f22832d = 0;
        P8 p83 = n82.f22726c;
        p83.f22829a = true;
        S8 s82 = n82.f22725b;
        IBinaryDataHelper iBinaryDataHelper = s82.f22951c;
        R8 r8 = s82.f22950b;
        s82.f22949a.getClass();
        iBinaryDataHelper.insert("event_hashes", r8.toByteArray(Q8.a(p83)));
    }

    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C0349n2 c0349n2 = this.f22888a.t().f23808y;
                    for (String str2 : Uri.decode(queryParameter).split("&")) {
                        String strDecode = Uri.decode(str2);
                        int iIndexOf = strDecode.indexOf("=");
                        if (iIndexOf >= 0 && a(Uri.decode(strDecode.substring(0, iIndexOf)), Uri.decode(strDecode.substring(iIndexOf + 1)), c0349n2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean a(String str, String str2, C0349n2 c0349n2) {
        Object obj;
        if ("reattribution".equals(str) && "1".equals(str2)) {
            return true;
        }
        if (c0349n2 == null) {
            return false;
        }
        for (Pair pair : c0349n2.f24393a) {
            if (ko.a(pair.first, str) && ((obj = pair.second) == null || ((C0324m2) obj).f24329a.equals(str2))) {
                return true;
            }
        }
        return false;
    }
}
