package yads;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class do2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f37869a;

    static {
        String string = "yandex";
        Intrinsics.checkNotNullParameter("yandex", "<this>");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        Intrinsics.checkNotNullParameter("yandex", "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        char cCharAt = "yandex".charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            StringBuilder sb2 = new StringBuilder();
            char titleCase = Character.toTitleCase(cCharAt);
            if (titleCase != Character.toUpperCase(cCharAt)) {
                sb2.append(titleCase);
            } else {
                Intrinsics.checkNotNullExpressionValue("y", "substring(...)");
                String upperCase = "y".toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                sb2.append(upperCase);
            }
            Intrinsics.checkNotNullExpressionValue("andex", "substring(...)");
            sb2.append("andex");
            string = sb2.toString();
        }
        f37869a = string;
    }
}
