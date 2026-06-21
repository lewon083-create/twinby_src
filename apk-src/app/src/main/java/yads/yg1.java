package yads;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yg1 {
    public static String a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb2 = new StringBuilder(language);
        String script = locale.getScript();
        if (script != null && script.length() != 0) {
            sb2.append('-');
            sb2.append(script);
        }
        if (country != null && country.length() != 0) {
            sb2.append('_');
            sb2.append(country);
        }
        return sb2.toString();
    }
}
