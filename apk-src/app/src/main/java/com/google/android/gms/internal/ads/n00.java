package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f8085a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f8086b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a(String str, String... strArr) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        Matcher matcher = f8085a.matcher(str);
        if (matcher.find()) {
            int iEnd = matcher.end();
            sb2.append(str.substring(0, iEnd));
            String str3 = strArr[0];
            if (str3 != null) {
                sb2.append(str3);
            }
            sb2.append(str.substring(iEnd));
        } else {
            if (!f8086b.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb2.append(str2);
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public static String b(xp0 xp0Var) {
        wk wkVar = al.f2969d6;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue() && xp0Var.T) {
            kx0 kx0Var = xp0Var.V;
            kx0Var.getClass();
            if (((JSONObject) kx0Var.f7326c).optBoolean((String) sVar.f31970c.a(al.f3000f6), true) && xp0Var.f12229b != 4) {
                int i = kx0Var.J() == 1 ? 3 : 1;
                String str = xp0Var.f12248l0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("creativeType", a0.u.d(i));
                    jSONObject.put("contentUrl", str);
                    return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                } catch (JSONException e3) {
                    u9.i.i("Unable to build OMID ENV JSON", e3);
                }
            }
        }
        return null;
    }
}
