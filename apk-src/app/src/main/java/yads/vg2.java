package yads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vg2 {
    public static Intent a(Context context, ug2 ug2Var) {
        String str = ug2Var.f43651b;
        String str2 = ug2Var.f43650a;
        String str3 = ug2Var.i;
        Map map = ug2Var.f43652c;
        Integer num = ug2Var.f43653d;
        Intent intent = new Intent("android.intent.action.VIEW");
        if (str3 != null) {
            intent.setClassName(str2, str3);
        } else {
            intent.setData(Uri.parse(str));
            intent.setPackage(str2);
        }
        if (num == null || !(context instanceof Activity)) {
            intent.addFlags((num != null ? num.intValue() : 0) | 1342177280);
        } else {
            intent.addFlags(num.intValue());
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str4 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    intent.putExtra(str4, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    intent.putExtra(str4, ((Number) value).intValue());
                } else if (value instanceof String) {
                    intent.putExtra(str4, (String) value);
                } else if (value instanceof uq0) {
                    try {
                        ij.k kVar = ij.m.f21341c;
                        intent.putExtra(str4, ((uq0) value).getValue());
                    } catch (Throwable th2) {
                        ij.k kVar2 = ij.m.f21341c;
                        com.google.android.gms.internal.measurement.h5.s(th2);
                    }
                }
            }
        }
        return intent;
    }
}
