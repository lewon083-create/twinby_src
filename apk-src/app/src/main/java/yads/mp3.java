package yads;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mp3 {
    public static boolean a(XmlPullParser xmlPullParser, String str, boolean z5) {
        Boolean bool = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            String lowerCase = attributeValue.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase != null) {
                Intrinsics.checkNotNullParameter(lowerCase, "<this>");
                if (Intrinsics.a(lowerCase, "true")) {
                    bool = Boolean.TRUE;
                } else if (Intrinsics.a(lowerCase, "false")) {
                    bool = Boolean.FALSE;
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
            }
        }
        return z5;
    }
}
