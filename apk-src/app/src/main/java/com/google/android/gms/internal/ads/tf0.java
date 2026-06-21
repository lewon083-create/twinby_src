package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u9.a f10594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f10595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f10596d = new AtomicReference("");

    public tf0(Context context, u9.a aVar, gx gxVar) {
        this.f10593a = context;
        this.f10594b = aVar;
        this.f10595c = gxVar;
    }

    public static final String c(String str) {
        return t9.g0.J(new String(Base64.decode(str, 0)), new String(Base64.decode((String) q9.s.f31967e.f31970c.a(al.Cf), 10), StandardCharsets.UTF_8));
    }

    public final String a() {
        wk wkVar = al.f3293yf;
        q9.s sVar = q9.s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        if (!((Boolean) ykVar.a(wkVar)).booleanValue() || ((String) ykVar2.a(al.Af)).isEmpty() || ((String) ykVar2.a(al.Bf)).isEmpty() || ((String) ykVar2.a(al.Cf)).isEmpty()) {
            return null;
        }
        String str = (String) this.f10596d.get();
        if (!str.isEmpty()) {
            return str;
        }
        this.f10595c.execute(new h30(12, this));
        return null;
    }

    public final String b() {
        String name;
        u9.a aVar = this.f10594b;
        String strC = null;
        if (aVar.f34368e) {
            name = k00.class.getName();
        } else {
            try {
                name = (String) new JSONObject(c((String) q9.s.f31967e.f31970c.a(al.Af))).get(Integer.toString(aVar.f34367d));
            } catch (ClassCastException | IllegalArgumentException | NullPointerException | JSONException e3) {
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3305zf)).booleanValue()) {
                    p9.k.C.f31302h.d("SdkIE", e3);
                }
                name = null;
            }
        }
        if (TextUtils.isEmpty(name)) {
            return "2";
        }
        try {
            strC = c((String) q9.s.f31967e.f31970c.a(al.Bf));
        } catch (IllegalArgumentException e7) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3305zf)).booleanValue()) {
                p9.k.C.f31302h.d("SdkIE", e7);
            }
        }
        if (TextUtils.isEmpty(strC)) {
            return "3";
        }
        try {
            for (Method method : this.f10593a.getClassLoader().loadClass(name).getDeclaredMethods()) {
                if (method.getName().matches(strC)) {
                    return "1";
                }
            }
            return CommonUrlParts.Values.FALSE_INTEGER;
        } catch (ClassNotFoundException unused) {
            return "4";
        } catch (NoClassDefFoundError unused2) {
            return "6";
        } catch (SecurityException unused3) {
            return "7";
        } catch (PatternSyntaxException unused4) {
            return "5";
        }
    }
}
