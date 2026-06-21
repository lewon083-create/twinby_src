package yads;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l21 implements tp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up3 f40416a;

    public /* synthetic */ l21() {
        this(new up3());
    }

    @Override // yads.tp3
    public final Object a(XmlPullParser xmlPullParser, kn knVar) throws XmlPullParserException, IOException {
        int i;
        g21 g21Var;
        this.f40416a.getClass();
        int i10 = 2;
        j21 j21Var = null;
        xmlPullParser.require(2, null, "Icon");
        this.f40416a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "program");
        this.f40416a.getClass();
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
        this.f40416a.getClass();
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "width");
        this.f40416a.getClass();
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "xPosition");
        this.f40416a.getClass();
        String attributeValue5 = xmlPullParser.getAttributeValue(null, "yPosition");
        this.f40416a.getClass();
        xmlPullParser.getAttributeValue(null, "apiFramework");
        this.f40416a.getClass();
        String attributeValue6 = xmlPullParser.getAttributeValue(null, "offset");
        this.f40416a.getClass();
        String attributeValue7 = xmlPullParser.getAttributeValue(null, "duration");
        while (true) {
            this.f40416a.getClass();
            i = 0;
            if (xmlPullParser.next() == 3) {
                break;
            }
            this.f40416a.getClass();
            if (xmlPullParser.getEventType() == i10) {
                String name = xmlPullParser.getName();
                i21.f39410c.getClass();
                i21[] i21VarArrValues = i21.values();
                int length = i21VarArrValues.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        this.f40416a.getClass();
                        up3.b(xmlPullParser);
                        break;
                    }
                    if (Intrinsics.a(i21VarArrValues[i11].f39412b, name)) {
                        this.f40416a.getClass();
                        up3.a(xmlPullParser);
                        i21[] i21VarArrValues2 = i21.values();
                        int length2 = i21VarArrValues2.length;
                        while (i < length2 && !Intrinsics.a(i21VarArrValues2[i].f39412b, name)) {
                            i++;
                        }
                    } else {
                        i11++;
                    }
                }
                i10 = 2;
            }
        }
        ah3.b(attributeValue2);
        ah3.b(attributeValue3);
        g21[] g21VarArrValues = g21.values();
        int length3 = g21VarArrValues.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length3) {
                g21Var = null;
                break;
            }
            g21Var = g21VarArrValues[i12];
            if (Intrinsics.a(g21Var.f38622b, attributeValue4)) {
                break;
            }
            i12++;
        }
        if (g21Var == null) {
            g21Var = g21.f38620c;
        }
        if (g21Var == g21.f38620c) {
            ah3.b(attributeValue4);
        }
        j21[] j21VarArrValues = j21.values();
        int length4 = j21VarArrValues.length;
        while (true) {
            if (i >= length4) {
                break;
            }
            j21 j21Var2 = j21VarArrValues[i];
            if (Intrinsics.a(j21Var2.f39710b, attributeValue5)) {
                j21Var = j21Var2;
                break;
            }
            i++;
        }
        if (j21Var == null) {
            j21Var = j21.f39708c;
        }
        if (j21Var == j21.f39708c) {
            ah3.b(attributeValue5);
        }
        ah3.a(attributeValue6);
        ah3.a(attributeValue7);
        return new k21(attributeValue);
    }

    public l21(up3 up3Var) {
        this.f40416a = up3Var;
    }
}
