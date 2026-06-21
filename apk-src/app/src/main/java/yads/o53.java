package yads;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o53 implements hb3 {
    public final String a() {
        String property;
        String property2 = null;
        try {
            property = System.getProperty("http.agent");
        } catch (Exception unused) {
            property = null;
        }
        if (property != null && property.length() != 0) {
            return property;
        }
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("Dalvik/");
        try {
            property2 = System.getProperty("java.vm.version");
        } catch (Exception unused2) {
        }
        if (property2 == null || property2.length() == 0) {
            property2 = "1.0.0";
        }
        sb2.append(property2);
        sb2.append(" (Linux; U; Android ");
        String str = Build.VERSION.RELEASE;
        if (str.length() == 0) {
            str = "1.0";
        }
        sb2.append(str);
        if ("REL".equals(Build.VERSION.CODENAME)) {
            String str2 = Build.MODEL;
            if (str2.length() > 0) {
                sb2.append("; ");
                sb2.append(str2);
            }
        }
        String str3 = Build.ID;
        if (str3.length() > 0) {
            sb2.append(" Build/");
            sb2.append(str3);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
