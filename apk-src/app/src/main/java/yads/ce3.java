package yads;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ce3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up3 f37357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sp3 f37358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sp3 f37359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sl3 f37360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final he3 f37361e;

    public /* synthetic */ ce3(Context context, ko2 ko2Var) {
        this(new up3(), new sp3(new h20(context, ko2Var), "Creatives", "Creative"), new sp3(new nd3(), "AdVerifications", "Verification"), new sl3(), new he3());
    }

    public final void a(XmlPullParser xmlPullParser, wd3 wd3Var, kn knVar) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if ("Impression".equals(name)) {
            this.f37357a.getClass();
            String strA = up3.a(xmlPullParser);
            LinkedHashMap linkedHashMap = wd3Var.f44353n;
            Object arrayList = linkedHashMap.get("impression");
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put("impression", arrayList);
            }
            ((List) arrayList).add(strA);
            return;
        }
        if ("ViewableImpression".equals(name)) {
            wd3Var.i = this.f37360d.a(xmlPullParser);
            return;
        }
        if ("Error".equals(name)) {
            this.f37357a.getClass();
            String strA2 = up3.a(xmlPullParser);
            LinkedHashMap linkedHashMap2 = wd3Var.f44353n;
            Object arrayList2 = linkedHashMap2.get("error");
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put("error", arrayList2);
            }
            ((List) arrayList2).add(strA2);
            return;
        }
        if ("Survey".equals(name)) {
            this.f37357a.getClass();
            wd3Var.f44347g = up3.a(xmlPullParser);
            return;
        }
        if ("Description".equals(name)) {
            this.f37357a.getClass();
            wd3Var.f44346f = up3.a(xmlPullParser);
            return;
        }
        if ("AdTitle".equals(name)) {
            this.f37357a.getClass();
            wd3Var.f44345e = up3.a(xmlPullParser);
            return;
        }
        if ("AdSystem".equals(name)) {
            this.f37357a.getClass();
            wd3Var.f44344d = up3.a(xmlPullParser);
            return;
        }
        if ("Creatives".equals(name)) {
            wd3Var.f44351l.addAll(this.f37358b.a(xmlPullParser, knVar));
            return;
        }
        if ("AdVerifications".equals(name)) {
            wd3Var.f44352m.addAll(this.f37359c.a(xmlPullParser, knVar));
            return;
        }
        if (!"Extensions".equals(name)) {
            this.f37357a.getClass();
            up3.b(xmlPullParser);
            return;
        }
        he3 he3Var = this.f37361e;
        he3Var.f39145a.getClass();
        xmlPullParser.require(2, null, "Extensions");
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        while (true) {
            he3Var.f39145a.getClass();
            if (xmlPullParser.next() == 3) {
                wd3Var.f44354o = new ge3(CollectionsKt.R(arrayList4), CollectionsKt.R(arrayList3));
                return;
            }
            he3Var.f39145a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if ("Extension".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(null, "type");
                    if (he3.f39144e.contains(attributeValue)) {
                        iq0 iq0VarA = he3Var.f39146b.a(xmlPullParser);
                        if (iq0VarA != null) {
                            arrayList4.add(iq0VarA);
                        }
                    } else if (Intrinsics.a(he3.f39143d, attributeValue)) {
                        arrayList3.addAll(he3Var.f39147c.a(xmlPullParser, knVar));
                    } else {
                        he3Var.f39145a.getClass();
                        up3.b(xmlPullParser);
                    }
                } else {
                    he3Var.f39145a.getClass();
                    up3.b(xmlPullParser);
                }
            }
        }
    }

    public ce3(up3 up3Var, sp3 sp3Var, sp3 sp3Var2, sl3 sl3Var, he3 he3Var) {
        this.f37357a = up3Var;
        this.f37358b = sp3Var;
        this.f37359c = sp3Var2;
        this.f37360d = sl3Var;
        this.f37361e = he3Var;
    }
}
