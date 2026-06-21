package yads;

import java.io.IOException;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kr0 implements tp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up3 f40311a;

    public kr0(up3 up3Var) {
        this.f40311a = up3Var;
    }

    @Override // yads.tp3
    public final Object a(XmlPullParser xmlPullParser, kn knVar) throws XmlPullParserException, IOException {
        this.f40311a.getClass();
        xmlPullParser.require(2, null, "FalseClick");
        this.f40311a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "interval");
        Long lO = attributeValue != null ? StringsKt.O(attributeValue) : null;
        this.f40311a.getClass();
        String strA = up3.a(xmlPullParser);
        if (strA.length() <= 0 || lO == null) {
            return null;
        }
        return new er0(strA, lO.longValue());
    }
}
