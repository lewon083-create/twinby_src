package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import io.sentry.SentryBaseEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class oo implements vo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f8747b = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f8748c = Pattern.compile("^[0-9]*(,[0-9]*)*$");

    @Override // com.google.android.gms.internal.ads.vo
    public final void o(Object obj, Map map) {
        sz szVar = (sz) obj;
        String str = (String) map.get("action");
        boolean zEquals = "tick".equals(str);
        Pattern pattern = f8747b;
        if (!zEquals) {
            if ("experiment".equals(str)) {
                String str2 = (String) map.get("value");
                if (TextUtils.isEmpty(str2)) {
                    u9.i.h("No value given for CSI experiment.");
                    return;
                }
                if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3266x2)).booleanValue() || f8748c.matcher(str2).matches()) {
                    ((el) szVar.o().f11062d).c("e", str2);
                    return;
                } else {
                    u9.i.c("Invalid value given for CSI experiment. Should be a comma separated list of numbers.");
                    return;
                }
            }
            if (SentryBaseEvent.JsonKeys.EXTRA.equals(str)) {
                String str3 = (String) map.get("name");
                String str4 = (String) map.get("value");
                if (TextUtils.isEmpty(str4)) {
                    u9.i.h("No value given for CSI extra.");
                    return;
                }
                if (TextUtils.isEmpty(str3)) {
                    u9.i.h("No name given for CSI extra.");
                    return;
                }
                if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3266x2)).booleanValue() || pattern.matcher(str3).matches()) {
                    ((el) szVar.o().f11062d).c(str3, str4);
                    return;
                } else {
                    u9.i.c("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                    return;
                }
            }
            return;
        }
        String str5 = (String) map.get("label");
        String str6 = (String) map.get("start_label");
        String str7 = (String) map.get("timestamp");
        if (TextUtils.isEmpty(str5)) {
            u9.i.h("No label given for CSI tick.");
            return;
        }
        wk wkVar = al.f3266x2;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue() && !pattern.matcher(str5).matches()) {
            u9.i.c("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            return;
        }
        if (TextUtils.isEmpty(str7)) {
            u9.i.h("No timestamp given for CSI tick.");
            return;
        }
        try {
            long j10 = Long.parseLong(str7);
            p9.k kVar = p9.k.C;
            kVar.f31304k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            kVar.f31304k.getClass();
            long jElapsedRealtime = (j10 - jCurrentTimeMillis) + SystemClock.elapsedRealtime();
            if (true == TextUtils.isEmpty(str6)) {
                str6 = "native:view_load";
            }
            if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue() && !pattern.matcher(str6).matches()) {
                u9.i.c("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                return;
            }
            ut utVarO = szVar.o();
            HashMap map2 = (HashMap) utVarO.f11061c;
            cl clVar = (cl) map2.get(str6);
            String[] strArr = {str5};
            if (clVar != null) {
                ((el) utVarO.f11062d).a(clVar, jElapsedRealtime, strArr);
            }
            map2.put(str5, new cl(jElapsedRealtime, null, null));
        } catch (NumberFormatException e3) {
            u9.i.i("Malformed timestamp for CSI tick.", e3);
        }
    }
}
