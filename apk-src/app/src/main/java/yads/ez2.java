package yads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ez2 implements tp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up3 f38299a;

    public ez2(up3 up3Var) {
        this.f38299a = up3Var;
    }

    @Override // yads.tp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final iq0 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f38299a.getClass();
        xmlPullParser.require(2, null, "Extension");
        String attributeValue = xmlPullParser.getAttributeValue(null, "type");
        this.f38299a.getClass();
        String strA = up3.a(xmlPullParser);
        if (attributeValue == null || attributeValue.length() == 0 || strA.length() <= 0) {
            return null;
        }
        return new iq0(attributeValue, strA);
    }
}
