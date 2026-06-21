package yads;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sl3 implements tp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up3 f42970a;

    public /* synthetic */ sl3() {
        this(new up3());
    }

    @Override // yads.tp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final rl3 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f42970a.getClass();
        xmlPullParser.require(2, null, "ViewableImpression");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f42970a.getClass();
            if (xmlPullParser.next() == 3) {
                return new rl3(arrayList);
            }
            this.f42970a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if ("Viewable".equals(xmlPullParser.getName())) {
                    this.f42970a.getClass();
                    arrayList.add(up3.a(xmlPullParser));
                } else {
                    this.f42970a.getClass();
                    up3.b(xmlPullParser);
                }
            }
        }
    }

    public sl3(up3 up3Var) {
        this.f42970a = up3Var;
    }
}
