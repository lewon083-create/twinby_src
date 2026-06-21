package yads;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class up3 {
    public static String a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String text;
        if (xmlPullParser.next() == 4) {
            text = xmlPullParser.getText();
            xmlPullParser.nextTag();
        } else {
            text = "";
        }
        int length = text.length() - 1;
        int i = 0;
        boolean z5 = false;
        while (i <= length) {
            boolean z10 = Intrinsics.d(text.charAt(!z5 ? i : length), 32) <= 0;
            if (z5) {
                if (!z10) {
                    break;
                }
                length--;
            } else if (z10) {
                i++;
            } else {
                z5 = true;
            }
        }
        return text.subSequence(i, length + 1).toString();
    }

    public static void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException("Check failed.");
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
