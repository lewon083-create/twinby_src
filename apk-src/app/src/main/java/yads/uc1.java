package yads;

import android.util.Base64;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class uc1 implements tp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up3 f43630a;

    public /* synthetic */ uc1() {
        this(new up3());
    }

    @Override // yads.tp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final tc1 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Integer intOrNull;
        Integer intOrNull2;
        this.f43630a.getClass();
        xmlPullParser.require(2, null, "InteractiveCreativeFile");
        this.f43630a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "type");
        if (attributeValue != null) {
            this.f43630a.getClass();
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
            if (attributeValue2 != null && (intOrNull = StringsKt.toIntOrNull(attributeValue2)) != null) {
                int iIntValue = intOrNull.intValue();
                this.f43630a.getClass();
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "width");
                if (attributeValue3 != null && (intOrNull2 = StringsKt.toIntOrNull(attributeValue3)) != null) {
                    int iIntValue2 = intOrNull2.intValue();
                    this.f43630a.getClass();
                    String strA = up3.a(xmlPullParser);
                    if (StringsKt.y(attributeValue, "html", false) != (strA.length() > 0)) {
                        strA = null;
                    }
                    String str = strA != null ? new String(Base64.decode(strA, 0), StandardCharsets.UTF_8) : null;
                    if (str != null) {
                        return new tc1(iIntValue, iIntValue2, str, attributeValue);
                    }
                }
            }
        }
        return null;
    }

    public uc1(up3 up3Var) {
        this.f43630a = up3Var;
    }
}
