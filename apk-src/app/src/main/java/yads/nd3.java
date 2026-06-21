package yads;

import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nd3 implements tp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up3 f41231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final de1 f41232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final md3 f41233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c83 f41234d;

    public /* synthetic */ nd3() {
        this(new up3(), new de1(), new md3(), new c83());
    }

    @Override // yads.tp3
    public final Object a(XmlPullParser xmlPullParser, kn knVar) throws XmlPullParserException, IOException {
        this.f41231a.getClass();
        xmlPullParser.require(2, null, "Verification");
        this.f41231a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "vendor");
        HashMap map = new HashMap();
        ce1 ce1Var = null;
        String strA = null;
        while (true) {
            this.f41231a.getClass();
            if (xmlPullParser.next() == 3) {
                break;
            }
            this.f41231a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("JavaScriptResource".equals(name)) {
                    de1 de1Var = this.f41232b;
                    de1Var.f37740a.getClass();
                    xmlPullParser.require(2, null, "JavaScriptResource");
                    de1Var.f37740a.getClass();
                    String attributeValue2 = xmlPullParser.getAttributeValue(null, "apiFramework");
                    de1Var.f37740a.getClass();
                    String attributeValue3 = xmlPullParser.getAttributeValue(null, "browserOptional");
                    Boolean boolValueOf = attributeValue3 != null ? Boolean.valueOf(Boolean.parseBoolean(attributeValue3)) : null;
                    de1Var.f37740a.getClass();
                    String strA2 = up3.a(xmlPullParser);
                    ce1Var = (attributeValue2 == null || attributeValue2.length() == 0 || boolValueOf == null || strA2.length() <= 0) ? null : new ce1(attributeValue2, strA2, boolValueOf.booleanValue());
                } else if ("VerificationParameters".equals(name)) {
                    md3 md3Var = this.f41233c;
                    md3Var.f40886a.getClass();
                    xmlPullParser.require(2, null, "VerificationParameters");
                    md3Var.f40886a.getClass();
                    strA = up3.a(xmlPullParser);
                    if (strA.length() == 0) {
                        strA = null;
                    }
                } else if ("TrackingEvents".equals(name)) {
                    map = this.f41234d.a(xmlPullParser);
                } else {
                    this.f41231a.getClass();
                    up3.b(xmlPullParser);
                }
            }
        }
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return new jd3(attributeValue, ce1Var, strA, map);
    }

    public nd3(up3 up3Var, de1 de1Var, md3 md3Var, c83 c83Var) {
        this.f41231a = up3Var;
        this.f41232b = de1Var;
        this.f41233c = md3Var;
        this.f41234d = c83Var;
    }
}
