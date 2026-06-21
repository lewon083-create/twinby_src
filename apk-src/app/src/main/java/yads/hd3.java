package yads;

import android.content.Context;
import android.util.Xml;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hd3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up3 f39134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gc3 f39135b;

    public /* synthetic */ hd3(Context context, ko2 ko2Var) {
        this(new up3(), new gc3(context, ko2Var));
    }

    public final cc3 a(String str, kn knVar) throws XmlPullParserException, IOException {
        xd3 xd3VarA;
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        boolean z5 = false;
        xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.nextTag();
        this.f39134a.getClass();
        xmlPullParserNewPullParser.require(2, null, "VAST");
        gc3 gc3Var = this.f39135b;
        gc3Var.f38703a.getClass();
        String attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "version");
        ArrayList arrayList = new ArrayList();
        while (true) {
            gc3Var.f38703a.getClass();
            int i = 3;
            if (xmlPullParserNewPullParser.next() == 3) {
                break;
            }
            gc3Var.f38703a.getClass();
            if (xmlPullParserNewPullParser.getEventType() == 2) {
                if ("Ad".equals(xmlPullParserNewPullParser.getName())) {
                    af3 af3Var = gc3Var.f38704b;
                    af3Var.f36701e.f41172a.getClass();
                    xmlPullParserNewPullParser.require(2, null, "Ad");
                    String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(null, "id");
                    if (attributeValue2 == null || attributeValue2.length() == 0) {
                        attributeValue2 = null;
                    }
                    af3Var.f36700d.f43124a.getClass();
                    xmlPullParserNewPullParser.require(2, null, "Ad");
                    Integer numB = ah3.b(xmlPullParserNewPullParser.getAttributeValue(null, "sequence"));
                    if (numB != null && numB.intValue() < 0) {
                        numB = null;
                    }
                    af3Var.f36697a.getClass();
                    xmlPullParserNewPullParser.require(2, null, "Ad");
                    while (true) {
                        xd3VarA = null;
                        while (true) {
                            af3Var.f36697a.getClass();
                            if (xmlPullParserNewPullParser.next() == i) {
                                break;
                            }
                            af3Var.f36697a.getClass();
                            if (xmlPullParserNewPullParser.getEventType() == 2) {
                                String name = xmlPullParserNewPullParser.getName();
                                if ("InLine".equals(name)) {
                                    wd3 wd3Var = new wd3(z5, new ng3(af3Var.f36702f));
                                    wd3Var.f44350k = attributeValue2;
                                    wd3Var.f44349j = numB;
                                    j61 j61Var = af3Var.f36698b;
                                    j61Var.f39733b.getClass();
                                    xmlPullParserNewPullParser.require(2, null, "InLine");
                                    while (true) {
                                        j61Var.f39733b.getClass();
                                        if (xmlPullParserNewPullParser.next() == 3) {
                                            break;
                                        }
                                        j61Var.f39733b.getClass();
                                        if (xmlPullParserNewPullParser.getEventType() == 2) {
                                            j61Var.f39732a.a(xmlPullParserNewPullParser, wd3Var, knVar);
                                        }
                                    }
                                    xd3VarA = wd3Var.a();
                                    if (xd3VarA.f44650b.isEmpty()) {
                                        break;
                                    }
                                    i = 3;
                                } else if ("Wrapper".equals(name)) {
                                    wd3 wd3Var2 = new wd3(true, new ng3(af3Var.f36702f));
                                    wd3Var2.f44350k = attributeValue2;
                                    wd3Var2.f44349j = numB;
                                    op3 op3Var = af3Var.f36699c;
                                    op3Var.f41678a.getClass();
                                    xmlPullParserNewPullParser.require(2, null, "Wrapper");
                                    op3Var.f41680c.getClass();
                                    wd3Var2.f44343c = new lp3(mp3.a(xmlPullParserNewPullParser, "allowMultipleAds", z5), mp3.a(xmlPullParserNewPullParser, "followAdditionalWrappers", true));
                                    while (true) {
                                        op3Var.f41678a.getClass();
                                        i = 3;
                                        if (xmlPullParserNewPullParser.next() == 3) {
                                            break;
                                        }
                                        op3Var.f41678a.getClass();
                                        if (xmlPullParserNewPullParser.getEventType() == 2) {
                                            if ("VASTAdTagURI".equals(xmlPullParserNewPullParser.getName())) {
                                                op3Var.f41678a.getClass();
                                                wd3Var2.f44348h = up3.a(xmlPullParserNewPullParser);
                                            } else {
                                                op3Var.f41679b.a(xmlPullParserNewPullParser, wd3Var2, knVar);
                                            }
                                        }
                                    }
                                    xd3VarA = wd3Var2.a();
                                } else {
                                    i = 3;
                                    af3Var.f36697a.getClass();
                                    up3.b(xmlPullParserNewPullParser);
                                }
                            }
                            z5 = false;
                        }
                        i = 3;
                    }
                    if (xd3VarA != null) {
                        arrayList.add(xd3VarA);
                    }
                } else {
                    gc3Var.f38703a.getClass();
                    up3.b(xmlPullParserNewPullParser);
                }
                z5 = false;
            }
        }
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return new cc3(attributeValue, arrayList);
    }

    public hd3(up3 up3Var, gc3 gc3Var) {
        this.f39134a = up3Var;
        this.f39135b = gc3Var;
    }
}
