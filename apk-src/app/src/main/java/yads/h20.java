package yads;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h20 implements tp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up3 f38982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hf1 f38983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f20 f38984c;

    public /* synthetic */ h20(Context context, ko2 ko2Var) {
        this(new up3(), new hf1(), new f20(context, ko2Var));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.tp3
    public final Object a(XmlPullParser xmlPullParser, kn knVar) throws XmlPullParserException, JSONException, IOException {
        ArrayList arrayList;
        boolean z5;
        boolean z10;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        this.f38982a.getClass();
        int i = 2;
        String str = null;
        xmlPullParser2.require(2, null, "Creative");
        this.f38982a.getClass();
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        e20 e20Var = null;
        String str2 = null;
        q03 q03Var = 0;
        String strA = null;
        boolean z11 = false;
        int iLongValue = 0;
        while (true) {
            this.f38982a.getClass();
            if (xmlPullParser2.next() == 3) {
                ArrayList arrayList5 = arrayList2;
                if (!z11) {
                    return null;
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj : arrayList5) {
                    if (obj instanceof ml1) {
                        arrayList6.add(obj);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj2 : arrayList5) {
                    if (obj2 instanceof tc1) {
                        arrayList7.add(obj2);
                    }
                }
                return new b20(arrayList6, arrayList7, arrayList3, arrayList4, e20Var, str2, q03Var, attributeValue, iLongValue, strA);
            }
            this.f38982a.getClass();
            if (xmlPullParser2.getEventType() == i) {
                String name = xmlPullParser2.getName();
                if ("Linear".equals(name)) {
                    hf1 hf1Var = this.f38983b;
                    hf1Var.f39163a.getClass();
                    xmlPullParser2.require(i, str, "Linear");
                    hf1Var.f39166d.getClass();
                    String attributeValue2 = xmlPullParser2.getAttributeValue(str, "skipoffset");
                    if (attributeValue2 == null) {
                        attributeValue2 = "";
                    }
                    Object q03Var2 = attributeValue2.length() > 0 ? new q03(attributeValue2) : str;
                    while (true) {
                        hf1Var.f39163a.getClass();
                        if (xmlPullParser2.next() != 3) {
                            hf1Var.f39163a.getClass();
                            if (xmlPullParser2.getEventType() == i) {
                                String name2 = xmlPullParser2.getName();
                                if (name2 != null) {
                                    switch (name2.hashCode()) {
                                        case -2049897434:
                                            if (name2.equals("VideoClicks")) {
                                                fh3 fh3VarA = hf1Var.f39164b.a(xmlPullParser2);
                                                str2 = fh3VarA.f38447b;
                                                for (Iterator it = fh3VarA.f38446a.iterator(); it.hasNext(); it = it) {
                                                    arrayList4.add(new a83("clickTracking", (String) it.next(), null));
                                                }
                                                break;
                                            }
                                            break;
                                        case -1927368268:
                                            if (name2.equals("Duration")) {
                                                el0 el0Var = hf1Var.f39165c;
                                                el0Var.f38162a.getClass();
                                                xmlPullParser2.require(i, str, "Duration");
                                                el0Var.f38162a.getClass();
                                                Long lA = ah3.a(up3.a(xmlPullParser2));
                                                if (lA != null) {
                                                    iLongValue = (int) lA.longValue();
                                                } else {
                                                    iLongValue = 0;
                                                }
                                            }
                                            break;
                                        case -1348833651:
                                            if (name2.equals("AdParameters")) {
                                                hf1Var.f39163a.getClass();
                                                strA = up3.a(xmlPullParser2);
                                            }
                                            break;
                                        case -385055469:
                                            if (name2.equals("MediaFiles")) {
                                                arrayList2.addAll(hf1Var.f39167e.a(xmlPullParser2, knVar));
                                                break;
                                            }
                                            break;
                                        case 70476538:
                                            if (name2.equals("Icons")) {
                                                arrayList3.addAll(hf1Var.f39168f.a(xmlPullParser2, knVar));
                                                break;
                                            }
                                            break;
                                        case 611554000:
                                            if (name2.equals("TrackingEvents")) {
                                                Iterator it2 = hf1Var.f39169g.a(xmlPullParser2, knVar).iterator();
                                                while (it2.hasNext()) {
                                                    arrayList4.add((a83) it2.next());
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                }
                                hf1Var.f39163a.getClass();
                                up3.b(xmlPullParser2);
                            }
                            i = 2;
                            str = null;
                        } else {
                            z11 = true;
                            q03Var = q03Var2;
                            i = 2;
                            str = null;
                        }
                    }
                } else if ("CreativeExtensions".equals(name)) {
                    f20 f20Var = this.f38984c;
                    f20Var.f38334a.getClass();
                    xmlPullParser2.require(2, null, "CreativeExtensions");
                    er0 er0Var = null;
                    ArrayList arrayListA = null;
                    ff1 ff1Var = null;
                    while (true) {
                        f20Var.f38334a.getClass();
                        ArrayList arrayList8 = arrayList2;
                        if (xmlPullParser2.next() != 3) {
                            f20Var.f38334a.getClass();
                            if (xmlPullParser2.getEventType() != 2) {
                                z10 = z11;
                            } else if ("CreativeExtension".equals(xmlPullParser2.getName())) {
                                String attributeValue3 = xmlPullParser2.getAttributeValue(null, "type");
                                if ("false_click".equals(attributeValue3)) {
                                    er0Var = (er0) f20Var.f38336c.a(xmlPullParser2, knVar);
                                } else if (Intrinsics.a(f20.f38332e, attributeValue3)) {
                                    arrayListA = f20Var.f38337d.a(xmlPullParser2, knVar);
                                } else if (Intrinsics.a(f20.f38333f, attributeValue3)) {
                                    gf1 gf1Var = f20Var.f38335b;
                                    gf1Var.getClass();
                                    try {
                                        gf1Var.f38755b.getClass();
                                        JSONObject jSONObject = new JSONObject(up3.a(xmlPullParser2));
                                        Iterator<String> itKeys = jSONObject.keys();
                                        List listA = kotlin.collections.b0.f27475b;
                                        while (itKeys.hasNext()) {
                                            Iterator<String> it3 = itKeys;
                                            String next = itKeys.next();
                                            boolean z12 = z11;
                                            if ("assets".equals(next)) {
                                                listA = gf1Var.f38754a.a(jSONObject, knVar);
                                            } else if ("link".equals(next)) {
                                                gf1Var.f38756c.a(jSONObject.getJSONObject(next), knVar);
                                            }
                                            z11 = z12;
                                            itKeys = it3;
                                        }
                                        z10 = z11;
                                        ff1Var = new ff1(listA);
                                    } catch (Exception e3) {
                                        throw new JSONException(e3.getMessage());
                                    }
                                } else {
                                    z10 = z11;
                                    f20Var.f38334a.getClass();
                                    up3.b(xmlPullParser);
                                }
                                arrayList2 = arrayList8;
                            } else {
                                z10 = z11;
                                f20Var.f38334a.getClass();
                                up3.b(xmlPullParser);
                            }
                            xmlPullParser2 = xmlPullParser;
                            arrayList2 = arrayList8;
                            z11 = z10;
                        } else {
                            e20Var = new e20(er0Var, arrayListA, ff1Var);
                            arrayList2 = arrayList8;
                            i = 2;
                            str = null;
                            xmlPullParser2 = xmlPullParser;
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    z5 = z11;
                    this.f38982a.getClass();
                    up3.b(xmlPullParser);
                }
            } else {
                arrayList = arrayList2;
                z5 = z11;
            }
            xmlPullParser2 = xmlPullParser;
            arrayList2 = arrayList;
            z11 = z5;
            q03Var = q03Var;
            i = 2;
            str = null;
        }
    }

    public h20(up3 up3Var, hf1 hf1Var, f20 f20Var) {
        this.f38982a = up3Var;
        this.f38983b = hf1Var;
        this.f38984c = f20Var;
    }
}
