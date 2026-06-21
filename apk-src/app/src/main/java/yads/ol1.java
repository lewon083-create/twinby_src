package yads;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ol1 implements tp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up3 f41625a;

    public /* synthetic */ ol1() {
        this(new up3());
    }

    @Override // yads.tp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final ml1 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ll1 ll1Var;
        Integer intOrNull;
        Integer intOrNull2;
        Integer intOrNull3;
        this.f41625a.getClass();
        xmlPullParser.require(2, null, "MediaFile");
        this.f41625a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "delivery");
        this.f41625a.getClass();
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        this.f41625a.getClass();
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "height");
        this.f41625a.getClass();
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "width");
        this.f41625a.getClass();
        String attributeValue5 = xmlPullParser.getAttributeValue(null, "bitrate");
        this.f41625a.getClass();
        String attributeValue6 = xmlPullParser.getAttributeValue(null, "apiFramework");
        this.f41625a.getClass();
        String attributeValue7 = xmlPullParser.getAttributeValue(null, "id");
        this.f41625a.getClass();
        String attributeValue8 = xmlPullParser.getAttributeValue(null, "codec");
        this.f41625a.getClass();
        String attributeValue9 = xmlPullParser.getAttributeValue(null, "vmaf");
        this.f41625a.getClass();
        String strA = up3.a(xmlPullParser);
        ll1[] ll1VarArrValues = ll1.values();
        int length = ll1VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                ll1Var = null;
                break;
            }
            ll1Var = ll1VarArrValues[i];
            if (Intrinsics.a(ll1Var.f40584b, attributeValue)) {
                break;
            }
            i++;
        }
        return new ml1(strA, attributeValue7, ll1Var, attributeValue2, attributeValue8, attributeValue9 != null ? kotlin.text.z.e(attributeValue9) : null, (attributeValue3 == null || (intOrNull3 = StringsKt.toIntOrNull(attributeValue3)) == null) ? 0 : intOrNull3.intValue(), (attributeValue4 == null || (intOrNull2 = StringsKt.toIntOrNull(attributeValue4)) == null) ? 0 : intOrNull2.intValue(), (attributeValue5 == null || (intOrNull = StringsKt.toIntOrNull(attributeValue5)) == null) ? 0 : intOrNull.intValue(), attributeValue6);
    }

    public ol1(up3 up3Var) {
        this.f41625a = up3Var;
    }
}
