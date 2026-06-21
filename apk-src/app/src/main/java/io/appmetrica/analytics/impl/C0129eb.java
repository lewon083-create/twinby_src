package io.appmetrica.analytics.impl;

import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.eb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0129eb {
    public static final B9 a(C0129eb c0129eb, K9 k92, JSONObject jSONObject) {
        int i;
        c0129eb.getClass();
        B9 b92 = new B9();
        switch (k92) {
            case UNKNOWN:
                i = 0;
                break;
            case APPSFLYER:
                i = 1;
                break;
            case ADJUST:
                i = 2;
                break;
            case KOCHAVA:
                i = 3;
                break;
            case TENJIN:
                i = 4;
                break;
            case AIRBRIDGE:
                i = 5;
                break;
            case SINGULAR:
                i = 6;
                break;
            default:
                throw new ij.j();
        }
        b92.f22136a = i;
        b92.f22137b = jSONObject.toString().getBytes(Charsets.UTF_8);
        return b92;
    }
}
