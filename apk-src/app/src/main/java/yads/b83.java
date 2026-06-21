package yads;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b83 implements tp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up3 f36961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l63 f36962b;

    public /* synthetic */ b83() {
        up3 up3Var = new up3();
        j63[] j63VarArrValues = j63.values();
        this(up3Var, new l63(new HashSet(kotlin.collections.s.f(Arrays.copyOf(j63VarArrValues, j63VarArrValues.length)))));
    }

    @Override // yads.tp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final a83 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f36961a.getClass();
        xmlPullParser.require(2, null, "Tracking");
        String attributeValue = xmlPullParser.getAttributeValue(null, "event");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "offset");
        this.f36961a.getClass();
        String strA = up3.a(xmlPullParser);
        if (attributeValue == null || attributeValue.length() == 0 || strA.length() <= 0) {
            return null;
        }
        return new a83(attributeValue, strA, attributeValue2 != null ? this.f36962b.a(attributeValue2) : null);
    }

    public b83(up3 up3Var, l63 l63Var) {
        this.f36961a = up3Var;
        this.f36962b = l63Var;
    }
}
