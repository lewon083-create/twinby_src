package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.om1;
import io.sentry.android.core.cache.AndroidEnvelopeCache;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Pf {
    public static final String a(C0153f9 c0153f9) {
        String string;
        StringBuilder sb2 = new StringBuilder("Event sent: ");
        int i = c0153f9.f23855c;
        String str = c0153f9.f23856d;
        byte[] bArr = c0153f9.f23857e;
        if (i == 1) {
            string = "Attribution";
        } else if (i == 2) {
            string = "Session start";
        } else if (i == 4) {
            if (str == null) {
                str = "null";
            }
            StringBuilder sb3 = new StringBuilder(str);
            if (bArr != null) {
                String str2 = new String(bArr, Charsets.UTF_8);
                if (!TextUtils.isEmpty(str2)) {
                    sb3.append(" with value ");
                    sb3.append(str2);
                }
            }
            string = sb3.toString();
        } else if (i == 5) {
            string = "Referrer";
        } else if (i == 7) {
            string = "Session heartbeat";
        } else if (i == 13) {
            string = "The very first event";
        } else if (i == 35) {
            string = "E-Commerce";
        } else if (i == 40) {
            string = "Ad revenue (ILRD)";
        } else if (i == 42) {
            string = "External attribution";
        } else if (i == 16) {
            string = "Open";
        } else if (i == 17) {
            string = "Update";
        } else if (i == 20) {
            string = "User profile update";
        } else if (i != 21) {
            switch (i) {
                case 25:
                    string = AndroidEnvelopeCache.LAST_ANR_MARKER_LABEL;
                    break;
                case 26:
                    string = om1.k("Crash: ", str);
                    break;
                case 27:
                    string = om1.k("Error: ", str);
                    break;
                default:
                    string = l7.o.i(i, "type=");
                    break;
            }
        } else {
            string = "Revenue";
        }
        sb2.append(string);
        return sb2.toString();
    }

    public static final String a(String str, EnumC0078cb enumC0078cb, String str2, String str3) {
        if (!AbstractC0605x9.f25013d.contains(EnumC0078cb.a(enumC0078cb.f23605a))) {
            return null;
        }
        StringBuilder sbK = pe.a.k(str, ": ");
        sbK.append(enumC0078cb.name());
        if (AbstractC0605x9.f25015f.contains(enumC0078cb) && !TextUtils.isEmpty(str2)) {
            sbK.append(" with name ");
            sbK.append(str2);
        }
        if (AbstractC0605x9.f25014e.contains(enumC0078cb) && !TextUtils.isEmpty(str3)) {
            sbK.append(" with value ");
            sbK.append(str3);
        }
        return sbK.toString();
    }
}
