package yads;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rl1 implements tp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up3 f42624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc1 f42625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ol1 f42626c;

    public /* synthetic */ rl1() {
        this(new up3(), new uc1(), new ol1());
    }

    @Override // yads.tp3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ArrayList a(XmlPullParser xmlPullParser, kn knVar) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        this.f42624a.getClass();
        xmlPullParser.require(2, null, "MediaFiles");
        while (true) {
            this.f42624a.getClass();
            if (xmlPullParser.next() == 3) {
                return arrayList;
            }
            this.f42624a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (Intrinsics.a(name, "MediaFile")) {
                    arrayList.add(this.f42626c.a(xmlPullParser));
                } else if (Intrinsics.a(name, "InteractiveCreativeFile")) {
                    tc1 tc1VarA = this.f42625b.a(xmlPullParser);
                    if (tc1VarA != null) {
                        arrayList.add(tc1VarA);
                    }
                } else {
                    this.f42624a.getClass();
                    up3.b(xmlPullParser);
                }
            }
        }
    }

    public rl1(up3 up3Var, uc1 uc1Var, ol1 ol1Var) {
        this.f42624a = up3Var;
        this.f42625b = uc1Var;
        this.f42626c = ol1Var;
    }
}
